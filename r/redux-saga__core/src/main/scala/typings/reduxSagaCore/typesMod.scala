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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("@redux-saga/core/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[C /* <: js.Object */](): SagaMiddleware[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[SagaMiddleware[C]]
  inline def default[C /* <: js.Object */](options: SagaMiddlewareOptions[C]): SagaMiddleware[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[SagaMiddleware[C]]
  
  @JSImport("@redux-saga/core/types", "CANCEL")
  @js.native
  val CANCEL: String = js.native
  
  @JSImport("@redux-saga/core/types", "END")
  @js.native
  val END: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EndType */ js.Any = js.native
  type END = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EndType */ js.Any
  
  object buffers {
    
    @JSImport("@redux-saga/core/types", "buffers")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Same as `fixed` but Overflow will silently drop the messages.
      */
    inline def dropping[T](): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("dropping")().asInstanceOf[Buffer]
    inline def dropping[T](limit: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("dropping")(limit.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    /**
      * Like `fixed` but Overflow will cause the buffer to expand dynamically.
      */
    inline def expanding[T](): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("expanding")().asInstanceOf[Buffer]
    inline def expanding[T](limit: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("expanding")(limit.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    /**
      * New messages will be buffered up to `limit`. Overflow will raise an Error.
      * Omitting a `limit` value will result in a limit of 10.
      */
    inline def fixed[T](): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("fixed")().asInstanceOf[Buffer]
    inline def fixed[T](limit: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("fixed")(limit.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    /**
      * No buffering, new messages will be lost if there are no pending takers
      */
    inline def none[T](): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("none")().asInstanceOf[Buffer]
    
    /**
      * Same as `fixed` but Overflow will insert the new message at the end and
      * drop the oldest message in the buffer.
      */
    inline def sliding[T](): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sliding")().asInstanceOf[Buffer]
    inline def sliding[T](limit: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sliding")(limit.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  }
  
  inline def channel[T](): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("channel")().asInstanceOf[js.Any]
  inline def channel[T](buffer: Buffer): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("channel")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def detach(forkEffect: ForkEffect): ForkEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("detach")(forkEffect.asInstanceOf[js.Any]).asInstanceOf[ForkEffect]
  
  inline def eventChannel[T](subscribe: Subscribe[T]): EventChannel_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventChannel")(subscribe.asInstanceOf[js.Any]).asInstanceOf[EventChannel_[T]]
  inline def eventChannel[T](subscribe: Subscribe[T], buffer: Buffer): EventChannel_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventChannel")(subscribe.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[EventChannel_[T]]
  
  inline def multicastChannel[T](): MulticastChannel_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("multicastChannel")().asInstanceOf[MulticastChannel_[T]]
  
  inline def runSaga[Action, State, S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Saga */ js.Any */](
    options: RunSagaOptions[Action, State],
    saga: S,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<S> is not an array type */ args: Parameters[S]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runSaga")(options.asInstanceOf[js.Any], saga.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def stdChannel[T](): MulticastChannel_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("stdChannel")().asInstanceOf[MulticastChannel_[T]]
  
  type EffectMiddleware = js.Function1[
    /* next */ js.Function1[/* effect */ js.Any, Unit], 
    js.Function1[/* effect */ js.Any, Unit]
  ]
  
  trait ErrorInfo extends StObject {
    
    var sagaStack: String
  }
  object ErrorInfo {
    
    inline def apply(sagaStack: String): ErrorInfo = {
      val __obj = js.Dynamic.literal(sagaStack = sagaStack.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorInfo]
    }
    
    extension [Self <: ErrorInfo](x: Self) {
      
      inline def setSagaStack(value: String): Self = StObject.set(x, "sagaStack", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventChannel_[T] extends StObject {
    
    def close(): Unit
    
    def flush(cb: js.Function1[/* items */ js.Array[T] | typings.reduxSagaCore.typesMod.END, Unit]): Unit
    
    def take(cb: js.Function1[/* message */ T | typings.reduxSagaCore.typesMod.END, Unit]): Unit
  }
  object EventChannel_ {
    
    inline def apply[T](
      close: () => Unit,
      flush: js.Function1[/* items */ js.Array[T] | typings.reduxSagaCore.typesMod.END, Unit] => Unit,
      take: js.Function1[/* message */ T | typings.reduxSagaCore.typesMod.END, Unit] => Unit
    ): EventChannel_[T] = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), flush = js.Any.fromFunction1(flush), take = js.Any.fromFunction1(take))
      __obj.asInstanceOf[EventChannel_[T]]
    }
    
    extension [Self <: EventChannel_[?], T](x: Self & EventChannel_[T]) {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setFlush(value: js.Function1[/* items */ js.Array[T] | typings.reduxSagaCore.typesMod.END, Unit] => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction1(value))
      
      inline def setTake(value: js.Function1[/* message */ T | typings.reduxSagaCore.typesMod.END, Unit] => Unit): Self = StObject.set(x, "take", js.Any.fromFunction1(value))
    }
  }
  
  trait FlushableChannel[T] extends StObject {
    
    def flush(cb: js.Function1[/* items */ js.Array[T] | typings.reduxSagaCore.typesMod.END, Unit]): Unit
  }
  object FlushableChannel {
    
    inline def apply[T](flush: js.Function1[/* items */ js.Array[T] | typings.reduxSagaCore.typesMod.END, Unit] => Unit): FlushableChannel[T] = {
      val __obj = js.Dynamic.literal(flush = js.Any.fromFunction1(flush))
      __obj.asInstanceOf[FlushableChannel[T]]
    }
    
    extension [Self <: FlushableChannel[?], T](x: Self & FlushableChannel[T]) {
      
      inline def setFlush(value: js.Function1[/* items */ js.Array[T] | typings.reduxSagaCore.typesMod.END, Unit] => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction1(value))
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
  
  trait RunSagaOptions[A, S] extends StObject {
    
    /**
      * See docs for `channel`
      */
    var channel: js.UndefOr[PredicateTakeableChannel[A]] = js.undefined
    
    /**
      * See docs for `createSagaMiddleware(options)`
      */
    var context: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Used to fulfill `put` effects.
      *
      * @param output argument provided by the Saga to the `put` Effect
      */
    var dispatch: js.UndefOr[js.Function1[/* output */ A, js.Any]] = js.undefined
    
    /**
      * See docs for `createSagaMiddleware(options)`
      */
    var effectMiddlewares: js.UndefOr[js.Array[EffectMiddleware]] = js.undefined
    
    /**
      * Used to fulfill `select` and `getState` effects
      */
    var getState: js.UndefOr[js.Function0[S]] = js.undefined
    
    /**
      * See docs for `createSagaMiddleware(options)`
      */
    var onError: js.UndefOr[js.Function2[/* error */ Error, /* errorInfo */ ErrorInfo, Unit]] = js.undefined
    
    /**
      * See docs for `createSagaMiddleware(options)`
      */
    var sagaMonitor: js.UndefOr[SagaMonitor] = js.undefined
  }
  object RunSagaOptions {
    
    inline def apply[A, S](): RunSagaOptions[A, S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RunSagaOptions[A, S]]
    }
    
    extension [Self <: RunSagaOptions[?, ?], A, S](x: Self & (RunSagaOptions[A, S])) {
      
      inline def setChannel(value: PredicateTakeableChannel[A]): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setDispatch(value: /* output */ A => js.Any): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setDispatchUndefined: Self = StObject.set(x, "dispatch", js.undefined)
      
      inline def setEffectMiddlewares(value: js.Array[EffectMiddleware]): Self = StObject.set(x, "effectMiddlewares", value.asInstanceOf[js.Any])
      
      inline def setEffectMiddlewaresUndefined: Self = StObject.set(x, "effectMiddlewares", js.undefined)
      
      inline def setEffectMiddlewaresVarargs(value: EffectMiddleware*): Self = StObject.set(x, "effectMiddlewares", js.Array(value :_*))
      
      inline def setGetState(value: () => S): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      inline def setGetStateUndefined: Self = StObject.set(x, "getState", js.undefined)
      
      inline def setOnError(value: (/* error */ Error, /* errorInfo */ ErrorInfo) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setSagaMonitor(value: SagaMonitor): Self = StObject.set(x, "sagaMonitor", value.asInstanceOf[js.Any])
      
      inline def setSagaMonitorUndefined: Self = StObject.set(x, "sagaMonitor", js.undefined)
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
  
  trait SagaMiddlewareOptions[C /* <: js.Object */] extends StObject {
    
    /**
      * Initial value of the saga's context.
      */
    var context: js.UndefOr[C] = js.undefined
    
    /**
      * Allows you to intercept any effect, resolve it on your own and pass to the
      * next middleware.
      */
    var effectMiddlewares: js.UndefOr[js.Array[EffectMiddleware]] = js.undefined
    
    /**
      * If provided, the middleware will call it with uncaught errors from Sagas.
      * useful for sending uncaught exceptions to error tracking services.
      */
    var onError: js.UndefOr[js.Function2[/* error */ Error, /* errorInfo */ ErrorInfo, Unit]] = js.undefined
    
    /**
      * If a Saga Monitor is provided, the middleware will deliver monitoring
      * events to the monitor.
      */
    var sagaMonitor: js.UndefOr[SagaMonitor] = js.undefined
  }
  object SagaMiddlewareOptions {
    
    inline def apply[C /* <: js.Object */](): SagaMiddlewareOptions[C] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SagaMiddlewareOptions[C]]
    }
    
    extension [Self <: SagaMiddlewareOptions[?], C /* <: js.Object */](x: Self & SagaMiddlewareOptions[C]) {
      
      inline def setContext(value: C): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setEffectMiddlewares(value: js.Array[EffectMiddleware]): Self = StObject.set(x, "effectMiddlewares", value.asInstanceOf[js.Any])
      
      inline def setEffectMiddlewaresUndefined: Self = StObject.set(x, "effectMiddlewares", js.undefined)
      
      inline def setEffectMiddlewaresVarargs(value: EffectMiddleware*): Self = StObject.set(x, "effectMiddlewares", js.Array(value :_*))
      
      inline def setOnError(value: (/* error */ Error, /* errorInfo */ ErrorInfo) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setSagaMonitor(value: SagaMonitor): Self = StObject.set(x, "sagaMonitor", value.asInstanceOf[js.Any])
      
      inline def setSagaMonitorUndefined: Self = StObject.set(x, "sagaMonitor", js.undefined)
    }
  }
  
  trait SagaMonitor extends StObject {
    
    /**
      * @param action The dispatched Redux action. If the action was dispatched by
      * a Saga then the action will have a property `SAGA_ACTION` set to true
      * (`SAGA_ACTION` can be imported from `@redux-saga/symbols`).
      */
    var actionDispatched: js.UndefOr[js.Function1[/* action */ Action[js.Any], Unit]] = js.undefined
    
    /**
      * @param effectId The ID of the yielded effect
      */
    var effectCancelled: js.UndefOr[js.Function1[/* effectId */ Double, Unit]] = js.undefined
    
    /**
      * @param effectId The ID of the yielded effect
      * @param error Error raised with the rejection of the effect
      */
    var effectRejected: js.UndefOr[js.Function2[/* effectId */ Double, /* error */ js.Any, Unit]] = js.undefined
    
    /**
      * @param effectId The ID of the yielded effect
      * @param result The result of the successful resolution of the effect. In
      *   case of `fork` or `spawn` effects, the result will be a `Task` object.
      */
    var effectResolved: js.UndefOr[js.Function2[/* effectId */ Double, /* result */ js.Any, Unit]] = js.undefined
    
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
    var effectTriggered: js.UndefOr[js.Function1[/* options */ Effect, Unit]] = js.undefined
    
    /**
      * @param effectId Unique ID assigned to this root saga execution
      * @param saga The generator function that starts to run
      * @param args The arguments passed to the generator function
      */
    var rootSagaStarted: js.UndefOr[js.Function1[/* options */ Args, Unit]] = js.undefined
  }
  object SagaMonitor {
    
    inline def apply(): SagaMonitor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SagaMonitor]
    }
    
    extension [Self <: SagaMonitor](x: Self) {
      
      inline def setActionDispatched(value: /* action */ Action[js.Any] => Unit): Self = StObject.set(x, "actionDispatched", js.Any.fromFunction1(value))
      
      inline def setActionDispatchedUndefined: Self = StObject.set(x, "actionDispatched", js.undefined)
      
      inline def setEffectCancelled(value: /* effectId */ Double => Unit): Self = StObject.set(x, "effectCancelled", js.Any.fromFunction1(value))
      
      inline def setEffectCancelledUndefined: Self = StObject.set(x, "effectCancelled", js.undefined)
      
      inline def setEffectRejected(value: (/* effectId */ Double, /* error */ js.Any) => Unit): Self = StObject.set(x, "effectRejected", js.Any.fromFunction2(value))
      
      inline def setEffectRejectedUndefined: Self = StObject.set(x, "effectRejected", js.undefined)
      
      inline def setEffectResolved(value: (/* effectId */ Double, /* result */ js.Any) => Unit): Self = StObject.set(x, "effectResolved", js.Any.fromFunction2(value))
      
      inline def setEffectResolvedUndefined: Self = StObject.set(x, "effectResolved", js.undefined)
      
      inline def setEffectTriggered(value: /* options */ Effect => Unit): Self = StObject.set(x, "effectTriggered", js.Any.fromFunction1(value))
      
      inline def setEffectTriggeredUndefined: Self = StObject.set(x, "effectTriggered", js.undefined)
      
      inline def setRootSagaStarted(value: /* options */ Args => Unit): Self = StObject.set(x, "rootSagaStarted", js.Any.fromFunction1(value))
      
      inline def setRootSagaStartedUndefined: Self = StObject.set(x, "rootSagaStarted", js.undefined)
    }
  }
  
  type Subscribe[T] = js.Function1[
    /* cb */ js.Function1[/* input */ T | typings.reduxSagaCore.typesMod.END, Unit], 
    Unsubscribe
  ]
  
  trait TakeableChannel[T] extends StObject {
    
    def take(cb: js.Function1[/* message */ T | typings.reduxSagaCore.typesMod.END, Unit]): Unit
  }
  object TakeableChannel {
    
    inline def apply[T](take: js.Function1[/* message */ T | typings.reduxSagaCore.typesMod.END, Unit] => Unit): TakeableChannel[T] = {
      val __obj = js.Dynamic.literal(take = js.Any.fromFunction1(take))
      __obj.asInstanceOf[TakeableChannel[T]]
    }
    
    extension [Self <: TakeableChannel[?], T](x: Self & TakeableChannel[T]) {
      
      inline def setTake(value: js.Function1[/* message */ T | typings.reduxSagaCore.typesMod.END, Unit] => Unit): Self = StObject.set(x, "take", js.Any.fromFunction1(value))
    }
  }
  
  type Unsubscribe = js.Function0[Unit]
}
