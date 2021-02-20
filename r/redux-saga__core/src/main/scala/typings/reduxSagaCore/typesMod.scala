package typings.reduxSagaCore

import typings.node.Buffer
import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.reduxSagaCore.anon.Args
import typings.reduxSagaCore.anon.Effect
import typings.reduxSagaCore.effectsMod.ForkEffect
import typings.std.Error
import typings.std.Parameters
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("@redux-saga/core/types", JSImport.Default)
  @js.native
  def default[C /* <: js.Object */](): SagaMiddleware[C] = js.native
  @JSImport("@redux-saga/core/types", JSImport.Default)
  @js.native
  def default[C /* <: js.Object */](options: SagaMiddlewareOptions[C]): SagaMiddleware[C] = js.native
  
  @JSImport("@redux-saga/core/types", "CANCEL")
  @js.native
  val CANCEL: String = js.native
  
  @JSImport("@redux-saga/core/types", "END")
  @js.native
  val END: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EndType */ js.Any = js.native
  type END = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EndType */ js.Any
  
  object buffers {
    
    /**
      * Same as `fixed` but Overflow will silently drop the messages.
      */
    @JSImport("@redux-saga/core/types", "buffers.dropping")
    @js.native
    def dropping[T](): Buffer = js.native
    @JSImport("@redux-saga/core/types", "buffers.dropping")
    @js.native
    def dropping[T](limit: Double): Buffer = js.native
    
    /**
      * Like `fixed` but Overflow will cause the buffer to expand dynamically.
      */
    @JSImport("@redux-saga/core/types", "buffers.expanding")
    @js.native
    def expanding[T](): Buffer = js.native
    @JSImport("@redux-saga/core/types", "buffers.expanding")
    @js.native
    def expanding[T](limit: Double): Buffer = js.native
    
    /**
      * New messages will be buffered up to `limit`. Overflow will raise an Error.
      * Omitting a `limit` value will result in a limit of 10.
      */
    @JSImport("@redux-saga/core/types", "buffers.fixed")
    @js.native
    def fixed[T](): Buffer = js.native
    @JSImport("@redux-saga/core/types", "buffers.fixed")
    @js.native
    def fixed[T](limit: Double): Buffer = js.native
    
    /**
      * No buffering, new messages will be lost if there are no pending takers
      */
    @JSImport("@redux-saga/core/types", "buffers.none")
    @js.native
    def none[T](): Buffer = js.native
    
    /**
      * Same as `fixed` but Overflow will insert the new message at the end and
      * drop the oldest message in the buffer.
      */
    @JSImport("@redux-saga/core/types", "buffers.sliding")
    @js.native
    def sliding[T](): Buffer = js.native
    @JSImport("@redux-saga/core/types", "buffers.sliding")
    @js.native
    def sliding[T](limit: Double): Buffer = js.native
  }
  
  @JSImport("@redux-saga/core/types", "channel")
  @js.native
  def channel[T](): js.Any = js.native
  @JSImport("@redux-saga/core/types", "channel")
  @js.native
  def channel[T](buffer: Buffer): js.Any = js.native
  
  @JSImport("@redux-saga/core/types", "detach")
  @js.native
  def detach(forkEffect: ForkEffect): ForkEffect = js.native
  
  @JSImport("@redux-saga/core/types", "eventChannel")
  @js.native
  def eventChannel[T](subscribe: Subscribe[T]): EventChannel_[T] = js.native
  @JSImport("@redux-saga/core/types", "eventChannel")
  @js.native
  def eventChannel[T](subscribe: Subscribe[T], buffer: Buffer): EventChannel_[T] = js.native
  
  @JSImport("@redux-saga/core/types", "multicastChannel")
  @js.native
  def multicastChannel[T](): MulticastChannel_[T] = js.native
  
  @JSImport("@redux-saga/core/types", "runSaga")
  @js.native
  def runSaga[Action, State, S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Saga */ js.Any */](
    options: RunSagaOptions[Action, State],
    saga: S,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<S> is not an array type */ args: Parameters[S]
  ): js.Any = js.native
  
  @JSImport("@redux-saga/core/types", "stdChannel")
  @js.native
  def stdChannel[T](): MulticastChannel_[T] = js.native
  
  type EffectMiddleware = js.Function1[
    /* next */ js.Function1[/* effect */ js.Any, Unit], 
    js.Function1[/* effect */ js.Any, Unit]
  ]
  
  @js.native
  trait ErrorInfo extends StObject {
    
    var sagaStack: String = js.native
  }
  object ErrorInfo {
    
    @scala.inline
    def apply(sagaStack: String): ErrorInfo = {
      val __obj = js.Dynamic.literal(sagaStack = sagaStack.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorInfo]
    }
    
    @scala.inline
    implicit class ErrorInfoMutableBuilder[Self <: ErrorInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSagaStack(value: String): Self = StObject.set(x, "sagaStack", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EventChannel_[T] extends StObject {
    
    def close(): Unit = js.native
    
    def flush(cb: js.Function1[/* items */ js.Array[T] | typings.reduxSagaCore.typesMod.END, Unit]): Unit = js.native
    
    def take(cb: js.Function1[/* message */ T | typings.reduxSagaCore.typesMod.END, Unit]): Unit = js.native
  }
  object EventChannel_ {
    
    @scala.inline
    def apply[T](
      close: () => Unit,
      flush: js.Function1[/* items */ js.Array[T] | typings.reduxSagaCore.typesMod.END, Unit] => Unit,
      take: js.Function1[/* message */ T | typings.reduxSagaCore.typesMod.END, Unit] => Unit
    ): EventChannel_[T] = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), flush = js.Any.fromFunction1(flush), take = js.Any.fromFunction1(take))
      __obj.asInstanceOf[EventChannel_[T]]
    }
    
    @scala.inline
    implicit class EventChannel_MutableBuilder[Self <: EventChannel_[_], T] (val x: Self with EventChannel_[T]) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFlush(value: js.Function1[/* items */ js.Array[T] | typings.reduxSagaCore.typesMod.END, Unit] => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTake(value: js.Function1[/* message */ T | typings.reduxSagaCore.typesMod.END, Unit] => Unit): Self = StObject.set(x, "take", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait FlushableChannel[T] extends StObject {
    
    def flush(cb: js.Function1[/* items */ js.Array[T] | typings.reduxSagaCore.typesMod.END, Unit]): Unit = js.native
  }
  object FlushableChannel {
    
    @scala.inline
    def apply[T](flush: js.Function1[/* items */ js.Array[T] | typings.reduxSagaCore.typesMod.END, Unit] => Unit): FlushableChannel[T] = {
      val __obj = js.Dynamic.literal(flush = js.Any.fromFunction1(flush))
      __obj.asInstanceOf[FlushableChannel[T]]
    }
    
    @scala.inline
    implicit class FlushableChannelMutableBuilder[Self <: FlushableChannel[_], T] (val x: Self with FlushableChannel[T]) extends AnyVal {
      
      @scala.inline
      def setFlush(value: js.Function1[/* items */ js.Array[T] | typings.reduxSagaCore.typesMod.END, Unit] => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait MulticastChannel_[T] extends StObject {
    
    def close(): Unit = js.native
    
    def put(message: T): Unit = js.native
    def put(message: typings.reduxSagaCore.typesMod.END): Unit = js.native
    
    def take(cb: js.Function1[/* message */ T | typings.reduxSagaCore.typesMod.END, Unit]): Unit = js.native
    def take(
      cb: js.Function1[/* message */ T | typings.reduxSagaCore.typesMod.END, Unit],
      matcher: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Predicate<T> */ js.Any
    ): Unit = js.native
  }
  
  @js.native
  trait PredicateTakeableChannel[T] extends StObject {
    
    def take(cb: js.Function1[/* message */ T | typings.reduxSagaCore.typesMod.END, Unit]): Unit = js.native
    def take(
      cb: js.Function1[/* message */ T | typings.reduxSagaCore.typesMod.END, Unit],
      matcher: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Predicate<T> */ js.Any
    ): Unit = js.native
  }
  
  @js.native
  trait PuttableChannel[T] extends StObject {
    
    def put(message: T): Unit = js.native
    def put(message: typings.reduxSagaCore.typesMod.END): Unit = js.native
  }
  
  @js.native
  trait RunSagaOptions[A, S] extends StObject {
    
    /**
      * See docs for `channel`
      */
    var channel: js.UndefOr[PredicateTakeableChannel[A]] = js.native
    
    /**
      * See docs for `createSagaMiddleware(options)`
      */
    var context: js.UndefOr[js.Object] = js.native
    
    /**
      * Used to fulfill `put` effects.
      *
      * @param output argument provided by the Saga to the `put` Effect
      */
    var dispatch: js.UndefOr[js.Function1[/* output */ A, _]] = js.native
    
    /**
      * See docs for `createSagaMiddleware(options)`
      */
    var effectMiddlewares: js.UndefOr[js.Array[EffectMiddleware]] = js.native
    
    /**
      * Used to fulfill `select` and `getState` effects
      */
    var getState: js.UndefOr[js.Function0[S]] = js.native
    
    /**
      * See docs for `createSagaMiddleware(options)`
      */
    var onError: js.UndefOr[js.Function2[/* error */ Error, /* errorInfo */ ErrorInfo, Unit]] = js.native
    
    /**
      * See docs for `createSagaMiddleware(options)`
      */
    var sagaMonitor: js.UndefOr[SagaMonitor] = js.native
  }
  object RunSagaOptions {
    
    @scala.inline
    def apply[A, S](): RunSagaOptions[A, S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RunSagaOptions[A, S]]
    }
    
    @scala.inline
    implicit class RunSagaOptionsMutableBuilder[Self <: RunSagaOptions[_, _], A, S] (val x: Self with (RunSagaOptions[A, S])) extends AnyVal {
      
      @scala.inline
      def setChannel(value: PredicateTakeableChannel[A]): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      @scala.inline
      def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setDispatch(value: /* output */ A => _): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDispatchUndefined: Self = StObject.set(x, "dispatch", js.undefined)
      
      @scala.inline
      def setEffectMiddlewares(value: js.Array[EffectMiddleware]): Self = StObject.set(x, "effectMiddlewares", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectMiddlewaresUndefined: Self = StObject.set(x, "effectMiddlewares", js.undefined)
      
      @scala.inline
      def setEffectMiddlewaresVarargs(value: EffectMiddleware*): Self = StObject.set(x, "effectMiddlewares", js.Array(value :_*))
      
      @scala.inline
      def setGetState(value: () => S): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStateUndefined: Self = StObject.set(x, "getState", js.undefined)
      
      @scala.inline
      def setOnError(value: (/* error */ Error, /* errorInfo */ ErrorInfo) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setSagaMonitor(value: SagaMonitor): Self = StObject.set(x, "sagaMonitor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSagaMonitorUndefined: Self = StObject.set(x, "sagaMonitor", js.undefined)
    }
  }
  
  @js.native
  trait SagaMiddleware[C /* <: js.Object */]
    extends Middleware[js.Object, js.Any, Dispatch[AnyAction]] {
    
    /**
      * Dynamically run `saga`. Can be used to run Sagas **only after** the
      * `applyMiddleware` phase.
      *
      * The method returns a `Task` descriptor.
      *
      * #### Notes
      *
      * `saga` must be a function which returns a [Generator
      * Object](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Generator).
      * The middleware will then iterate over the Generator and execute all yielded
      * Effects.
      *
      * `saga` may also start other sagas using the various Effects provided by the
      * library. The iteration process described below is also applied to all child
      * sagas.
      *
      * In the first iteration, the middleware invokes the `next()` method to
      * retrieve the next Effect. The middleware then executes the yielded Effect
      * as specified by the Effects API below. Meanwhile, the Generator will be
      * suspended until the effect execution terminates. Upon receiving the result
      * of the execution, the middleware calls `next(result)` on the Generator
      * passing it the retrieved result as an argument. This process is repeated
      * until the Generator terminates normally or by throwing some error.
      *
      * If the execution results in an error (as specified by each Effect creator)
      * then the `throw(error)` method of the Generator is called instead. If the
      * Generator function defines a `try/catch` surrounding the current yield
      * instruction, then the `catch` block will be invoked by the underlying
      * Generator runtime. The runtime will also invoke any corresponding finally
      * block.
      *
      * In the case a Saga is cancelled (either manually or using the provided
      * Effects), the middleware will invoke `return()` method of the Generator.
      * This will cause the Generator to skip directly to the finally block.
      *
      * @param saga a Generator function
      * @param args arguments to be provided to `saga`
      */
    def run[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Saga */ js.Any */](
      saga: S,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<S> is not an array type */ args: Parameters[S]
    ): js.Any = js.native
    
    def setContext(props: Partial[C]): Unit = js.native
  }
  
  @js.native
  trait SagaMiddlewareOptions[C /* <: js.Object */] extends StObject {
    
    /**
      * Initial value of the saga's context.
      */
    var context: js.UndefOr[C] = js.native
    
    /**
      * Allows you to intercept any effect, resolve it on your own and pass to the
      * next middleware.
      */
    var effectMiddlewares: js.UndefOr[js.Array[EffectMiddleware]] = js.native
    
    /**
      * If provided, the middleware will call it with uncaught errors from Sagas.
      * useful for sending uncaught exceptions to error tracking services.
      */
    var onError: js.UndefOr[js.Function2[/* error */ Error, /* errorInfo */ ErrorInfo, Unit]] = js.native
    
    /**
      * If a Saga Monitor is provided, the middleware will deliver monitoring
      * events to the monitor.
      */
    var sagaMonitor: js.UndefOr[SagaMonitor] = js.native
  }
  object SagaMiddlewareOptions {
    
    @scala.inline
    def apply[C /* <: js.Object */](): SagaMiddlewareOptions[C] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SagaMiddlewareOptions[C]]
    }
    
    @scala.inline
    implicit class SagaMiddlewareOptionsMutableBuilder[Self <: SagaMiddlewareOptions[_], C /* <: js.Object */] (val x: Self with SagaMiddlewareOptions[C]) extends AnyVal {
      
      @scala.inline
      def setContext(value: C): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setEffectMiddlewares(value: js.Array[EffectMiddleware]): Self = StObject.set(x, "effectMiddlewares", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectMiddlewaresUndefined: Self = StObject.set(x, "effectMiddlewares", js.undefined)
      
      @scala.inline
      def setEffectMiddlewaresVarargs(value: EffectMiddleware*): Self = StObject.set(x, "effectMiddlewares", js.Array(value :_*))
      
      @scala.inline
      def setOnError(value: (/* error */ Error, /* errorInfo */ ErrorInfo) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setSagaMonitor(value: SagaMonitor): Self = StObject.set(x, "sagaMonitor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSagaMonitorUndefined: Self = StObject.set(x, "sagaMonitor", js.undefined)
    }
  }
  
  @js.native
  trait SagaMonitor extends StObject {
    
    /**
      * @param action The dispatched Redux action. If the action was dispatched by
      * a Saga then the action will have a property `SAGA_ACTION` set to true
      * (`SAGA_ACTION` can be imported from `@redux-saga/symbols`).
      */
    var actionDispatched: js.UndefOr[js.Function1[/* action */ Action[_], Unit]] = js.native
    
    /**
      * @param effectId The ID of the yielded effect
      */
    var effectCancelled: js.UndefOr[js.Function1[/* effectId */ Double, Unit]] = js.native
    
    /**
      * @param effectId The ID of the yielded effect
      * @param error Error raised with the rejection of the effect
      */
    var effectRejected: js.UndefOr[js.Function2[/* effectId */ Double, /* error */ js.Any, Unit]] = js.native
    
    /**
      * @param effectId The ID of the yielded effect
      * @param result The result of the successful resolution of the effect. In
      *   case of `fork` or `spawn` effects, the result will be a `Task` object.
      */
    var effectResolved: js.UndefOr[js.Function2[/* effectId */ Double, /* result */ js.Any, Unit]] = js.native
    
    /**
      * @param effectId Unique ID assigned to the yielded effect
      * @param parentEffectId ID of the parent Effect. In the case of a `race` or
      *   `parallel` effect, all effects yielded inside will have the direct
      *   race/parallel effect as a parent. In case of a top-level effect, the
      *   parent will be the containing Saga
      * @param label In case of a `race`/`all` effect, all child effects will be
      *   assigned as label the corresponding keys of the object passed to
      *   `race`/`all`
      * @param effect The yielded effect itself
      */
    var effectTriggered: js.UndefOr[js.Function1[/* options */ Effect, Unit]] = js.native
    
    /**
      * @param effectId Unique ID assigned to this root saga execution
      * @param saga The generator function that starts to run
      * @param args The arguments passed to the generator function
      */
    var rootSagaStarted: js.UndefOr[js.Function1[/* options */ Args, Unit]] = js.native
  }
  object SagaMonitor {
    
    @scala.inline
    def apply(): SagaMonitor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SagaMonitor]
    }
    
    @scala.inline
    implicit class SagaMonitorMutableBuilder[Self <: SagaMonitor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionDispatched(value: /* action */ Action[_] => Unit): Self = StObject.set(x, "actionDispatched", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActionDispatchedUndefined: Self = StObject.set(x, "actionDispatched", js.undefined)
      
      @scala.inline
      def setEffectCancelled(value: /* effectId */ Double => Unit): Self = StObject.set(x, "effectCancelled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEffectCancelledUndefined: Self = StObject.set(x, "effectCancelled", js.undefined)
      
      @scala.inline
      def setEffectRejected(value: (/* effectId */ Double, /* error */ js.Any) => Unit): Self = StObject.set(x, "effectRejected", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEffectRejectedUndefined: Self = StObject.set(x, "effectRejected", js.undefined)
      
      @scala.inline
      def setEffectResolved(value: (/* effectId */ Double, /* result */ js.Any) => Unit): Self = StObject.set(x, "effectResolved", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEffectResolvedUndefined: Self = StObject.set(x, "effectResolved", js.undefined)
      
      @scala.inline
      def setEffectTriggered(value: /* options */ Effect => Unit): Self = StObject.set(x, "effectTriggered", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEffectTriggeredUndefined: Self = StObject.set(x, "effectTriggered", js.undefined)
      
      @scala.inline
      def setRootSagaStarted(value: /* options */ Args => Unit): Self = StObject.set(x, "rootSagaStarted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRootSagaStartedUndefined: Self = StObject.set(x, "rootSagaStarted", js.undefined)
    }
  }
  
  type Subscribe[T] = js.Function1[
    /* cb */ js.Function1[/* input */ T | typings.reduxSagaCore.typesMod.END, Unit], 
    Unsubscribe
  ]
  
  @js.native
  trait TakeableChannel[T] extends StObject {
    
    def take(cb: js.Function1[/* message */ T | typings.reduxSagaCore.typesMod.END, Unit]): Unit = js.native
  }
  object TakeableChannel {
    
    @scala.inline
    def apply[T](take: js.Function1[/* message */ T | typings.reduxSagaCore.typesMod.END, Unit] => Unit): TakeableChannel[T] = {
      val __obj = js.Dynamic.literal(take = js.Any.fromFunction1(take))
      __obj.asInstanceOf[TakeableChannel[T]]
    }
    
    @scala.inline
    implicit class TakeableChannelMutableBuilder[Self <: TakeableChannel[_], T] (val x: Self with TakeableChannel[T]) extends AnyVal {
      
      @scala.inline
      def setTake(value: js.Function1[/* message */ T | typings.reduxSagaCore.typesMod.END, Unit] => Unit): Self = StObject.set(x, "take", js.Any.fromFunction1(value))
    }
  }
  
  type Unsubscribe = js.Function0[Unit]
}
