package typings.reactSpringCore

import org.scalablytyped.runtime.StringDictionary
import typings.reactSpringCore.anon.Keys
import typings.reactSpringCore.anon.OnChange
import typings.reactSpringCore.distDeclarationsSrcFrameValueMod.FrameValue
import typings.reactSpringCore.distDeclarationsSrcFrameValueMod.FrameValue.Event
import typings.reactSpringCore.distDeclarationsSrcRunAsyncMod.RunAsyncState
import typings.reactSpringCore.distDeclarationsSrcSpringRefMod.SpringRef
import typings.reactSpringCore.distDeclarationsSrcSpringValueMod.SpringValue
import typings.reactSpringCore.distDeclarationsSrcTypesFunctionsMod.ControllerFlushFn
import typings.reactSpringCore.distDeclarationsSrcTypesObjectsMod.AnimationResult
import typings.reactSpringCore.distDeclarationsSrcTypesObjectsMod.SpringValues
import typings.reactSpringCore.distDeclarationsSrcTypesPropsMod.ControllerUpdate
import typings.reactSpringTypes.utilMod.Falsy
import typings.reactSpringTypes.utilMod.Lookup
import typings.reactSpringTypes.utilMod.OneOrMore
import typings.reactSpringTypes.utilMod.UnknownProps
import typings.std.Partial
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcControllerMod {
  
  @JSImport("@react-spring/core/dist/declarations/src/Controller", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-spring/core/dist/declarations/src/Controller", "Controller")
  @js.native
  open class Controller[State /* <: Lookup[Any] */] () extends StObject {
    def this(props: ControllerUpdate[State, Unit]) = this()
    def this(props: Null, flush: ControllerFlushFn[Any]) = this()
    def this(props: Unit, flush: ControllerFlushFn[Any]) = this()
    def this(props: ControllerUpdate[State, Unit], flush: ControllerFlushFn[Any]) = this()
    
    /** The values currently being animated */
    /* protected */ var _active: Set[FrameValue[Any]] = js.native
    
    /** The values that changed recently */
    /* protected */ var _changed: Set[FrameValue[Any]] = js.native
    
    /** The event queues that are flushed once per frame maximum */
    /* protected */ var _events: OnChange[State] = js.native
    
    /** Custom handler for flushing update queues */
    /* protected */ var _flush: js.UndefOr[ControllerFlushFn[this.type]] = js.native
    
    /** These props are used by all future spring values */
    /* protected */ var _initialProps: js.UndefOr[Lookup[Any]] = js.native
    
    /* private */ var _item: Any = js.native
    
    /** The counter for tracking `scheduleProps` calls */
    /* protected */ var _lastAsyncId: Double = js.native
    
    /** @internal Called at the end of every animation frame */
    /* protected */ def _onFrame(): Unit = js.native
    
    /** Equals false when `onStart` listeners can be called */
    /* protected */ var _started: Boolean = js.native
    
    /** State used by the `runAsync` function */
    /* protected */ var _state: RunAsyncState[this.type] = js.native
    
    /** Call a function once per spring value */
    def each(iterator: js.Function2[/* spring */ SpringValue[Any], /* key */ String, Unit]): Unit = js.native
    
    /** @internal */
    def eventObserved(event: Event[Any]): Unit = js.native
    
    /** Get the current values of our springs */
    def get(): State & UnknownProps = js.native
    
    val id: Double = js.native
    
    /**
      * Equals `true` when no spring values are in the frameloop, and
      * no async animation is currently active.
      */
    def idle: Boolean = js.native
    
    def item: Any = js.native
    def item_=(item: Any): Unit = js.native
    
    /** Freeze the active animation in time */
    def pause(): this.type = js.native
    def pause(keys: OneOrMore[String]): this.type = js.native
    
    /** The queue of props passed to the `update` method. */
    var queue: ControllerQueue[State] = js.native
    
    /**
      * The injected ref. When defined, render-based updates are pushed
      * onto the `queue` instead of being auto-started.
      */
    var ref: js.UndefOr[SpringRef[State]] = js.native
    
    /** Resume the animation if paused. */
    def resume(): this.type = js.native
    def resume(keys: OneOrMore[String]): this.type = js.native
    
    /** Set the current values without animating. */
    def set(values: Partial[State]): Unit = js.native
    
    /** The animated values */
    var springs: SpringValues[State] = js.native
    
    /**
      * Start the queued animations for every spring, and resolve the returned
      * promise once all queued animations have finished or been cancelled.
      *
      * When you pass a queue (instead of nothing), that queue is used instead of
      * the queued animations added with the `update` method, which are left alone.
      */
    def start(): js.Promise[AnimationResult[this.type]] = js.native
    def start(props: OneOrMore[ControllerUpdate[State, Unit]]): js.Promise[AnimationResult[this.type]] = js.native
    
    /** Stop all animations. */
    def stop(): this.type = js.native
    /** Cancel all animations. */
    def stop(cancel: Boolean): this.type = js.native
    /** Cancel animations for the given keys. */
    def stop(cancel: Boolean, keys: OneOrMore[String]): this.type = js.native
    /** Stop animations for the given keys. */
    def stop(keys: OneOrMore[String]): this.type = js.native
    
    /** Push an update onto the queue of each value. */
    def update(props: (ControllerUpdate[State, Unit]) | Falsy): this.type = js.native
  }
  
  inline def flushUpdate(
    ctrl: Controller[Any],
    props: /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/Controller.ControllerQueue<@react-spring/types.@react-spring/types/util.Lookup<any>>[number] */ js.Any
  ): js.Promise[AnimationResult[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flushUpdate")(ctrl.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AnimationResult[Any]]]
  inline def flushUpdate(
    ctrl: Controller[Any],
    props: /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/core.@react-spring/core/dist/declarations/src/Controller.ControllerQueue<@react-spring/types.@react-spring/types/util.Lookup<any>>[number] */ js.Any,
    isLoop: Boolean
  ): js.Promise[AnimationResult[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flushUpdate")(ctrl.asInstanceOf[js.Any], props.asInstanceOf[js.Any], isLoop.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AnimationResult[Any]]]
  
  inline def flushUpdateQueue(ctrl: Controller[Any], queue: ControllerQueue[Lookup[Any]]): js.Promise[AnimationResult[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flushUpdateQueue")(ctrl.asInstanceOf[js.Any], queue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AnimationResult[Any]]]
  
  inline def getSprings[State /* <: Lookup[Any] */](ctrl: Controller[Lookup[Any]]): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSprings")(ctrl.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def getSprings[State /* <: Lookup[Any] */](ctrl: Controller[Lookup[Any]], props: OneOrMore[ControllerUpdate[State, Unit]]): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSprings")(ctrl.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  inline def setSprings(ctrl: Controller[Lookup[Any]], springs: SpringValues[UnknownProps]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSprings")(ctrl.asInstanceOf[js.Any], springs.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type ControllerQueue[State /* <: Lookup[Any] */] = js.Array[(ControllerUpdate[State, Any]) & Keys]
}
