package typings.reduxSagaTypes

import org.scalablytyped.runtime.StringDictionary
import typings.reduxSagaTypes.reduxSagaTypesBooleans.`false`
import typings.reduxSagaTypes.reduxSagaTypesBooleans.`true`
import typings.reduxSagaTypes.reduxSagaTypesStrings.`@@redux-sagaSlashCHANNEL_END`
import typings.std.IterableIterator
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait Action[T /* <: String */] extends StObject {
    
    var `type`: T
  }
  object Action {
    
    inline def apply[T /* <: String */](`type`: T): Action[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Action[?], T /* <: String */] (val x: Self & Action[T]) extends AnyVal {
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    P extends @redux-saga/types.@redux-saga/types/types.ActionSubPattern<@redux-saga/types.@redux-saga/types/types.Action<string>> ? @redux-saga/types.@redux-saga/types/types.ActionMatchingSubPattern<P> : P extends std.Array<@redux-saga/types.@redux-saga/types/types.ActionSubPattern<@redux-saga/types.@redux-saga/types/types.Action<string>>> ? @redux-saga/types.@redux-saga/types/types.ActionMatchingSubPattern<P[number]> : never
    }}}
    */
  type ActionMatchingPattern[P /* <: ActionPattern[Action[String]] */] = Action[String]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    P extends @redux-saga/types.@redux-saga/types/types.GuardPredicate<infer A, @redux-saga/types.@redux-saga/types/types.Action<string>> ? A : P extends @redux-saga/types.@redux-saga/types/types.StringableActionCreator<infer A> ? A : @redux-saga/types.@redux-saga/types/types.Action<string>
    }}}
    */
  type ActionMatchingSubPattern[P /* <: ActionSubPattern[Action[String]] */] = Action[String]
  
  type ActionPattern[Guard /* <: Action[String] */] = ActionSubPattern[Guard] | js.Array[ActionSubPattern[Guard]]
  
  type ActionSubPattern[Guard /* <: Action[String] */] = (GuardPredicate[Guard, Action[String]]) | StringableActionCreator[Guard] | Predicate[Action[String]] | ActionType
  
  type ActionType = String | Double | js.Symbol
  
  trait Buffer[T] extends StObject {
    
    def flush(): js.Array[T]
    
    /**
      * Returns true if there are no messages on the buffer. A channel calls this
      * method whenever a new taker is registered
      */
    def isEmpty(): Boolean
    
    /**
      * Used to put new message in the buffer. Note the Buffer can choose to not
      * store the message (e.g. a dropping buffer can drop any new message
      * exceeding a given limit)
      */
    def put(message: T): Unit
    
    /**
      * used to retrieve any buffered message. Note the behavior of this method has
      * to be consistent with `isEmpty`
      */
    def take(): js.UndefOr[T]
  }
  object Buffer {
    
    inline def apply[T](flush: () => js.Array[T], isEmpty: () => Boolean, put: T => Unit, take: () => js.UndefOr[T]): Buffer[T] = {
      val __obj = js.Dynamic.literal(flush = js.Any.fromFunction0(flush), isEmpty = js.Any.fromFunction0(isEmpty), put = js.Any.fromFunction1(put), take = js.Any.fromFunction0(take))
      __obj.asInstanceOf[Buffer[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Buffer[?], T] (val x: Self & Buffer[T]) extends AnyVal {
      
      inline def setFlush(value: () => js.Array[T]): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
      
      inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      inline def setPut(value: T => Unit): Self = StObject.set(x, "put", js.Any.fromFunction1(value))
      
      inline def setTake(value: () => js.UndefOr[T]): Self = StObject.set(x, "take", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Channel[T /* <: NotUndefined */] extends StObject {
    
    /**
      * Closes the channel which means no more puts will be allowed. All pending
      * takers will be invoked with `END`.
      */
    def close(): Unit = js.native
    
    /**
      * Used to extract all buffered messages from the channel. The flush is
      * resolved using the following rules
      *
      * - If the channel is closed and there are no buffered messages, then
      *   `callback` is invoked with `END`
      * - Otherwise `callback` is invoked with all buffered messages.
      */
    def flush(cb: js.Function1[/* items */ js.Array[T] | END, Unit]): Unit = js.native
    
    /**
      * Used to put message on the buffer. The put will be handled using the
      * following rules
      *
      * - If the channel is closed, then the put will have no effect.
      * - If there are pending takers, then invoke the oldest taker with the
      *   message.
      * - Otherwise put the message on the underlying buffer
      */
    def put(message: T): Unit = js.native
    def put(message: END): Unit = js.native
    
    /**
      * Used to register a taker. The take is resolved using the following rules
      *
      * - If the channel has buffered messages, then `callback` will be invoked
      *   with the next message from the underlying buffer (using `buffer.take()`)
      * - If the channel is closed and there are no buffered messages, then
      *   `callback` is invoked with `END`
      * - Otherwise`callback` will be queued until a message is put into the
      *   channel
      */
    def take(cb: js.Function1[/* message */ T | END, Unit]): Unit = js.native
  }
  
  trait CombinatorEffect[T, E] extends StObject {
    
    @JSName("@@redux-saga/IO")
    var `@@redux-sagaSlashIO`: `true`
    
    var combinator: `true`
    
    var payload: CombinatorEffectDescriptor[E]
    
    var `type`: T
  }
  object CombinatorEffect {
    
    inline def apply[T, E](payload: CombinatorEffectDescriptor[E], `type`: T): CombinatorEffect[T, E] = {
      val __obj = js.Dynamic.literal(combinator = true, payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("@@redux-saga/IO")(true)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CombinatorEffect[T, E]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CombinatorEffect[?, ?], T, E] (val x: Self & (CombinatorEffect[T, E])) extends AnyVal {
      
      inline def `set@@redux-sagaSlashIO`(value: `true`): Self = StObject.set(x, "@@redux-saga/IO", value.asInstanceOf[js.Any])
      
      inline def setCombinator(value: `true`): Self = StObject.set(x, "combinator", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: CombinatorEffectDescriptor[E]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadVarargs(value: E*): Self = StObject.set(x, "payload", js.Array(value*))
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type CombinatorEffectDescriptor[E] = StringDictionary[E] | js.Array[E]
  
  trait END extends StObject {
    
    var `type`: `@@redux-sagaSlashCHANNEL_END`
  }
  object END {
    
    inline def apply(): END = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("@@redux-saga/CHANNEL_END")
      __obj.asInstanceOf[END]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: END] (val x: Self) extends AnyVal {
      
      inline def setType(value: `@@redux-sagaSlashCHANNEL_END`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Effect[T] = (SimpleEffect[T, Any]) | (CombinatorEffect[T, Any])
  
  type GuardPredicate[G /* <: T */, T] = js.Function1[/* arg */ T, /* is G */ Boolean]
  
  type NotUndefined = js.Object | Null
  
  type Pattern[T] = SubPattern[T] | js.Array[SubPattern[T]]
  
  type Predicate[T] = js.Function1[/* arg */ T, Boolean]
  
  type Saga[Args /* <: js.Array[Any] */] = js.Function1[/* args */ Args, IterableIterator[Any]]
  
  type SagaIterator = IterableIterator[StrictEffect[Any]]
  
  trait SimpleEffect[T, P] extends StObject {
    
    @JSName("@@redux-saga/IO")
    var `@@redux-sagaSlashIO`: `true`
    
    var combinator: `false`
    
    var payload: P
    
    var `type`: T
  }
  object SimpleEffect {
    
    inline def apply[T, P](payload: P, `type`: T): SimpleEffect[T, P] = {
      val __obj = js.Dynamic.literal(combinator = false, payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("@@redux-saga/IO")(true)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleEffect[T, P]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimpleEffect[?, ?], T, P] (val x: Self & (SimpleEffect[T, P])) extends AnyVal {
      
      inline def `set@@redux-sagaSlashIO`(value: `true`): Self = StObject.set(x, "@@redux-saga/IO", value.asInstanceOf[js.Any])
      
      inline def setCombinator(value: `false`): Self = StObject.set(x, "combinator", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: P): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type StrictCombinatorEffect[T] = CombinatorEffect[T, StrictEffect[T]]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type StrictEffect = @redux-saga/types.@redux-saga/types/types.SimpleEffect<T, any> | @redux-saga/types.@redux-saga/types/types.StrictCombinatorEffect<T>
  }}}
  to avoid circular code involving: 
  - @redux-saga/types.@redux-saga/types/types.SagaIterator
  - @redux-saga/types.@redux-saga/types/types.StrictCombinatorEffect
  - @redux-saga/types.@redux-saga/types/types.StrictEffect
  */
  type StrictEffect[T] = (SimpleEffect[T, Any]) | Any
  
  @js.native
  trait StringableActionCreator[A /* <: Action[String] */] extends StObject {
    
    def apply(args: Any*): A = js.native
  }
  
  type SubPattern[T] = Predicate[T] | StringableActionCreator[Action[String]] | ActionType
  
  trait Task[T] extends StObject {
    
    /**
      * Cancels the task (If it is still running)
      */
    def cancel(): Unit
    
    /**
      * Returns task thrown error. `undefined` if task is still running
      */
    def error(): js.UndefOr[Any]
    
    /**
      * Returns true if the task has been cancelled
      */
    def isCancelled(): Boolean
    
    /**
      * Returns true if the task hasn't yet returned or thrown an error
      */
    def isRunning(): Boolean
    
    /**
      * Returns task return value. `undefined` if task is still running
      */
    def result[R](): js.UndefOr[R]
    
    def setContext[C /* <: js.Object */](props: Partial[C]): Unit
    
    /**
      * Returns a Promise which is either:
      * - resolved with task's return value
      * - rejected with task's thrown error
      */
    def toPromise[R](): js.Promise[R]
  }
  object Task {
    
    inline def apply[T](
      cancel: () => Unit,
      error: () => js.UndefOr[Any],
      isCancelled: () => Boolean,
      isRunning: () => Boolean,
      result: () => js.UndefOr[Any],
      setContext: Partial[Any] => Unit,
      toPromise: () => js.Promise[Any]
    ): Task[T] = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), error = js.Any.fromFunction0(error), isCancelled = js.Any.fromFunction0(isCancelled), isRunning = js.Any.fromFunction0(isRunning), result = js.Any.fromFunction0(result), setContext = js.Any.fromFunction1(setContext), toPromise = js.Any.fromFunction0(toPromise))
      __obj.asInstanceOf[Task[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Task[?], T] (val x: Self & Task[T]) extends AnyVal {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setError(value: () => js.UndefOr[Any]): Self = StObject.set(x, "error", js.Any.fromFunction0(value))
      
      inline def setIsCancelled(value: () => Boolean): Self = StObject.set(x, "isCancelled", js.Any.fromFunction0(value))
      
      inline def setIsRunning(value: () => Boolean): Self = StObject.set(x, "isRunning", js.Any.fromFunction0(value))
      
      inline def setResult(value: () => js.UndefOr[Any]): Self = StObject.set(x, "result", js.Any.fromFunction0(value))
      
      inline def setSetContext(value: Partial[Any] => Unit): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
      
      inline def setToPromise(value: () => js.Promise[Any]): Self = StObject.set(x, "toPromise", js.Any.fromFunction0(value))
    }
  }
}
