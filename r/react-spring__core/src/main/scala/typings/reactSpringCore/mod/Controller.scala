package typings.reactSpringCore.mod

import typings.reactSpringCore.mod.FrameValue.Event
import typings.reactSpringTypes.mod.Falsy
import typings.reactSpringTypes.mod.Lookup
import typings.reactSpringTypes.mod.OneOrMore
import typings.reactSpringTypes.mod.Partial
import typings.reactSpringTypes.mod.UnknownProps
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-spring/core", "Controller")
@js.native
open class Controller[State /* <: Lookup[scala.Any] */] () extends StObject {
  def this(props: ControllerUpdate[State, Unit]) = this()
  def this(props: Null, flush: ControllerFlushFn[scala.Any]) = this()
  def this(props: Unit, flush: ControllerFlushFn[scala.Any]) = this()
  def this(props: ControllerUpdate[State, Unit], flush: ControllerFlushFn[scala.Any]) = this()
  
  /** The values currently being animated */
  /* protected */ var _active: Set[FrameValue[scala.Any]] = js.native
  
  /** The values that changed recently */
  /* protected */ var _changed: Set[FrameValue[scala.Any]] = js.native
  
  /** The event queues that are flushed once per frame maximum */
  /* protected */ var _events: typings.reactSpringCore.anon.OnChange[State] = js.native
  
  /** Custom handler for flushing update queues */
  /* protected */ var _flush: js.UndefOr[ControllerFlushFn[this.type]] = js.native
  
  /** These props are used by all future spring values */
  /* protected */ var _initialProps: js.UndefOr[Lookup[scala.Any]] = js.native
  
  /* private */ var _item: scala.Any = js.native
  
  /** The counter for tracking `scheduleProps` calls */
  /* protected */ var _lastAsyncId: Double = js.native
  
  /** @internal Called at the end of every animation frame */
  /* protected */ def _onFrame(): Unit = js.native
  
  /** Equals false when `onStart` listeners can be called */
  /* protected */ var _started: Boolean = js.native
  
  /** State used by the `runAsync` function */
  /* protected */ var _state: RunAsyncState[this.type] = js.native
  
  /** Call a function once per spring value */
  def each(iterator: js.Function2[/* spring */ SpringValue[scala.Any], /* key */ String, Unit]): Unit = js.native
  
  /** @internal */
  def eventObserved(event: Event[scala.Any]): Unit = js.native
  
  /** Get the current values of our springs */
  def get(): State & UnknownProps = js.native
  
  val id: Double = js.native
  
  /**
    * Equals `true` when no spring values are in the frameloop, and
    * no async animation is currently active.
    */
  def idle: Boolean = js.native
  
  def item: scala.Any = js.native
  def item_=(item: scala.Any): Unit = js.native
  
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
