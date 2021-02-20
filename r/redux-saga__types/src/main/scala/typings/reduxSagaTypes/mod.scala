package typings.reduxSagaTypes

import org.scalablytyped.runtime.StringDictionary
import typings.redux.mod.Action
import typings.reduxSagaTypes.reduxSagaTypesBooleans.`false`
import typings.reduxSagaTypes.reduxSagaTypesBooleans.`true`
import typings.reduxSagaTypes.reduxSagaTypesStrings.`@@redux-sagaSlashCHANNEL_END`
import typings.std.IterableIterator
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type ActionMatchingPattern[P /* <: ActionPattern[Action[_]] */] = ActionMatchingSubPattern[
    (/* import warning: importer.ImportType#apply Failed type conversion: P[number] */ js.Any) | P
  ]
  
  type ActionMatchingSubPattern[P /* <: ActionSubPattern[Action[_]] */] = Action[js.Any]
  
  type ActionPattern[Guard /* <: Action[_] */] = ActionSubPattern[Guard] | js.Array[ActionSubPattern[Guard]]
  
  type ActionSubPattern[Guard /* <: Action[_] */] = (GuardPredicate[Guard, Action[js.Any]]) | StringableActionCreator[Guard] | Predicate[Action[js.Any]] | ActionType
  
  type ActionType = String | Double | js.Symbol
  
  @js.native
  trait Buffer[T] extends StObject {
    
    def flush(): js.Array[T] = js.native
    
    /**
      * Returns true if there are no messages on the buffer. A channel calls this
      * method whenever a new taker is registered
      */
    def isEmpty(): Boolean = js.native
    
    /**
      * Used to put new message in the buffer. Note the Buffer can choose to not
      * store the message (e.g. a dropping buffer can drop any new message
      * exceeding a given limit)
      */
    def put(message: T): Unit = js.native
    
    /**
      * used to retrieve any buffered message. Note the behavior of this method has
      * to be consistent with `isEmpty`
      */
    def take(): js.UndefOr[T] = js.native
  }
  object Buffer {
    
    @scala.inline
    def apply[T](flush: () => js.Array[T], isEmpty: () => Boolean, put: T => Unit, take: () => js.UndefOr[T]): Buffer[T] = {
      val __obj = js.Dynamic.literal(flush = js.Any.fromFunction0(flush), isEmpty = js.Any.fromFunction0(isEmpty), put = js.Any.fromFunction1(put), take = js.Any.fromFunction0(take))
      __obj.asInstanceOf[Buffer[T]]
    }
    
    @scala.inline
    implicit class BufferMutableBuilder[Self <: Buffer[_], T] (val x: Self with Buffer[T]) extends AnyVal {
      
      @scala.inline
      def setFlush(value: () => js.Array[T]): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPut(value: T => Unit): Self = StObject.set(x, "put", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTake(value: () => js.UndefOr[T]): Self = StObject.set(x, "take", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Channel[T] extends StObject {
    
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
  
  @js.native
  trait CombinatorEffect[T, E] extends StObject {
    
    @JSName("@@redux-saga/IO")
    var `@@redux-sagaSlashIO`: `true` = js.native
    
    var combinator: `true` = js.native
    
    var payload: CombinatorEffectDescriptor[E] = js.native
    
    var `type`: T = js.native
  }
  object CombinatorEffect {
    
    @scala.inline
    def apply[T, E](
      `@@redux-sagaSlashIO`: `true`,
      combinator: `true`,
      payload: CombinatorEffectDescriptor[E],
      `type`: T
    ): CombinatorEffect[T, E] = {
      val __obj = js.Dynamic.literal(combinator = combinator.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("@@redux-saga/IO")(`@@redux-sagaSlashIO`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CombinatorEffect[T, E]]
    }
    
    @scala.inline
    implicit class CombinatorEffectMutableBuilder[Self <: CombinatorEffect[_, _], T, E] (val x: Self with (CombinatorEffect[T, E])) extends AnyVal {
      
      @scala.inline
      def `set@@redux-sagaSlashIO`(value: `true`): Self = StObject.set(x, "@@redux-saga/IO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCombinator(value: `true`): Self = StObject.set(x, "combinator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: CombinatorEffectDescriptor[E]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadVarargs(value: E*): Self = StObject.set(x, "payload", js.Array(value :_*))
      
      @scala.inline
      def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type CombinatorEffectDescriptor[E] = StringDictionary[E] | js.Array[E]
  
  @js.native
  trait END extends StObject {
    
    var `type`: `@@redux-sagaSlashCHANNEL_END` = js.native
  }
  object END {
    
    @scala.inline
    def apply(`type`: `@@redux-sagaSlashCHANNEL_END`): END = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[END]
    }
    
    @scala.inline
    implicit class ENDMutableBuilder[Self <: END] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: `@@redux-sagaSlashCHANNEL_END`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Effect[T] = (SimpleEffect[T, js.Any]) | (CombinatorEffect[T, js.Any])
  
  type GuardPredicate[G /* <: T */, T] = js.Function1[/* arg */ T, /* is G */ Boolean]
  
  type Pattern[T] = SubPattern[T] | js.Array[SubPattern[T]]
  
  type Predicate[T] = js.Function1[/* arg */ T, Boolean]
  
  type Saga[Args /* <: js.Array[_] */] = js.Function1[/* args */ Args, IterableIterator[js.Any]]
  
  type SagaIterator = IterableIterator[StrictEffect[js.Any]]
  
  @js.native
  trait SimpleEffect[T, P] extends StObject {
    
    @JSName("@@redux-saga/IO")
    var `@@redux-sagaSlashIO`: `true` = js.native
    
    var combinator: `false` = js.native
    
    var payload: P = js.native
    
    var `type`: T = js.native
  }
  object SimpleEffect {
    
    @scala.inline
    def apply[T, P](`@@redux-sagaSlashIO`: `true`, combinator: `false`, payload: P, `type`: T): SimpleEffect[T, P] = {
      val __obj = js.Dynamic.literal(combinator = combinator.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("@@redux-saga/IO")(`@@redux-sagaSlashIO`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleEffect[T, P]]
    }
    
    @scala.inline
    implicit class SimpleEffectMutableBuilder[Self <: SimpleEffect[_, _], T, P] (val x: Self with (SimpleEffect[T, P])) extends AnyVal {
      
      @scala.inline
      def `set@@redux-sagaSlashIO`(value: `true`): Self = StObject.set(x, "@@redux-saga/IO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCombinator(value: `false`): Self = StObject.set(x, "combinator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: P): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StrictCombinatorEffect[T] extends CombinatorEffect[T, StrictEffect[T]]
  object StrictCombinatorEffect {
    
    @scala.inline
    def apply[T](
      `@@redux-sagaSlashIO`: `true`,
      combinator: `true`,
      payload: CombinatorEffectDescriptor[StrictEffect[T]],
      `type`: T
    ): StrictCombinatorEffect[T] = {
      val __obj = js.Dynamic.literal(combinator = combinator.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("@@redux-saga/IO")(`@@redux-sagaSlashIO`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrictCombinatorEffect[T]]
    }
  }
  
  type StrictEffect[T] = (SimpleEffect[T, js.Any]) | StrictCombinatorEffect[T]
  
  @js.native
  trait StringableActionCreator[A /* <: Action[_] */] extends StObject {
    
    def apply(args: js.Any*): A = js.native
  }
  
  type SubPattern[T] = Predicate[T] | StringableActionCreator[Action[js.Any]] | ActionType
  
  @js.native
  trait Task extends StObject {
    
    /**
      * Cancels the task (If it is still running)
      */
    def cancel(): Unit = js.native
    
    /**
      * Returns task thrown error. `undefined` if task is still running
      */
    def error(): js.UndefOr[js.Any] = js.native
    
    /**
      * Returns true if the task has been cancelled
      */
    def isCancelled(): Boolean = js.native
    
    /**
      * Returns true if the task hasn't yet returned or thrown an error
      */
    def isRunning(): Boolean = js.native
    
    /**
      * Returns task return value. `undefined` if task is still running
      */
    def result[T](): js.UndefOr[T] = js.native
    
    def setContext[C /* <: js.Object */](props: Partial[C]): Unit = js.native
    
    /**
      * Returns a Promise which is either:
      * - resolved with task's return value
      * - rejected with task's thrown error
      */
    def toPromise[T](): js.Promise[T] = js.native
  }
  object Task {
    
    @scala.inline
    def apply(
      cancel: () => Unit,
      error: () => js.UndefOr[js.Any],
      isCancelled: () => Boolean,
      isRunning: () => Boolean,
      result: () => js.UndefOr[js.Any],
      setContext: Partial[js.Any] => Unit,
      toPromise: () => js.Promise[js.Any]
    ): Task = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), error = js.Any.fromFunction0(error), isCancelled = js.Any.fromFunction0(isCancelled), isRunning = js.Any.fromFunction0(isRunning), result = js.Any.fromFunction0(result), setContext = js.Any.fromFunction1(setContext), toPromise = js.Any.fromFunction0(toPromise))
      __obj.asInstanceOf[Task]
    }
    
    @scala.inline
    implicit class TaskMutableBuilder[Self <: Task] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setError(value: () => js.UndefOr[js.Any]): Self = StObject.set(x, "error", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsCancelled(value: () => Boolean): Self = StObject.set(x, "isCancelled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsRunning(value: () => Boolean): Self = StObject.set(x, "isRunning", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResult(value: () => js.UndefOr[js.Any]): Self = StObject.set(x, "result", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetContext(value: Partial[js.Any] => Unit): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToPromise(value: () => js.Promise[js.Any]): Self = StObject.set(x, "toPromise", js.Any.fromFunction0(value))
    }
  }
}
