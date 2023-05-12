package typings.reactSpringCore.mod

import typings.reactSpringAnimated.mod.Animated
import typings.reactSpringCore.anon.Default
import typings.reactSpringCore.anon.FromTo
import typings.reactSpringShared.mod.FluidValue
import typings.std.Exclude
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Only numbers, strings, and arrays of numbers/strings are supported.
  * Non-animatable strings are also supported.
  */
@JSImport("@react-spring/core", "SpringValue")
@js.native
open class SpringValue[T] () extends FrameValue[T] {
  def this(from: Exclude[T, js.Object]) = this()
  def this(props: SpringUpdate[T]) = this()
  def this(from: Exclude[T, js.Object], props: SpringUpdate[T]) = this()
  
  /** Update the `animation.to` value, which might be a `FluidValue` */
  /* protected */ def _focus(value: T): Unit = js.native
  /* protected */ def _focus(value: FluidValue[T, scala.Any]): Unit = js.native
  
  /** The counter for tracking `scheduleProps` calls */
  /* protected */ var _lastCallId: Double = js.native
  
  /** The last `scheduleProps` call that changed the `to` prop */
  /* protected */ var _lastToId: Double = js.native
  
  /* protected */ var _memoizedDuration: Double = js.native
  
  /** Merge props into the current animation */
  /* protected */ def _merge(
    range: AnimationRange[T],
    props: RunAsyncProps[SpringValue[T]],
    resolve: AnimationResolver[SpringValue[T]]
  ): Unit = js.native
  
  /* protected */ def _onStart(): Unit = js.native
  
  /** The promise resolvers of pending `start` calls */
  /* protected */ var _pendingCalls: Set[AnimationResolver[this.type]] = js.native
  
  /**
    * Parse the `to` and `from` range from the given `props` object.
    *
    * This also ensures the initial value is available to animated components
    * during the render phase.
    */
  /* protected */ def _prepareNode(props: Default): FromTo = js.native
  
  /* protected */ def _resume(): Unit = js.native
  
  /**
    * Update the current value from outside the frameloop,
    * and return the `Animated` node.
    */
  /* protected */ def _set(arg: T): js.UndefOr[Animated[scala.Any]] = js.native
  /* protected */ def _set(arg: T, idle: Boolean): js.UndefOr[Animated[scala.Any]] = js.native
  /* protected */ def _set(arg: FluidValue[T, scala.Any]): js.UndefOr[Animated[scala.Any]] = js.native
  /* protected */ def _set(arg: FluidValue[T, scala.Any], idle: Boolean): js.UndefOr[Animated[scala.Any]] = js.native
  
  /* protected */ def _start(): Unit = js.native
  
  /** The state for `runAsync` calls */
  /* protected */ var _state: RunAsyncState[SpringValue[T]] = js.native
  
  /**
    * Exit the frameloop and notify `onRest` listeners.
    *
    * Always wrap `_stop` calls with `batchedUpdates`.
    */
  /* protected */ def _stop(): Unit = js.native
  /* protected */ def _stop(goal: scala.Any): Unit = js.native
  /* protected */ def _stop(goal: scala.Any, cancel: Boolean): Unit = js.native
  /* protected */ def _stop(goal: Unit, cancel: Boolean): Unit = js.native
  
  /** Every update is processed by this method before merging. */
  /* protected */ def _update(param0: SpringProps[T]): js.Promise[AnimationResult[SpringValue[T]]] = js.native
  /* protected */ def _update(param0: SpringProps[T], isLoop: Boolean): js.Promise[AnimationResult[SpringValue[T]]] = js.native
  
  /** The animation state */
  var animation: Animation[T] = js.native
  
  /** Some props have customizable default values */
  var defaultProps: DefaultSpringProps[T] = js.native
  
  /** Skip to the end of the current animation. */
  def finish(): this.type = js.native
  
  def goal: T = js.native
  
  /**
    * When true, this value has been animated at least once.
    */
  def hasAnimated: Boolean = js.native
  
  /**
    * When true, this value has an unfinished animation,
    * which is either active or paused.
    */
  def isAnimating: Boolean = js.native
  
  /**
    *
    *
    */
  def isDelayed: js.UndefOr[Boolean] = js.native
  
  /**
    * When true, all current and future animations are paused.
    */
  def isPaused: Boolean = js.native
  
  /**
    * Freeze the active animation in time, as well as any updates merged
    * before `resume` is called.
    */
  def pause(): Unit = js.native
  
  /** The queue of pending props */
  var queue: js.UndefOr[js.Array[SpringUpdate[T]]] = js.native
  
  /** Restart the animation. */
  def reset(): Unit = js.native
  
  /** Resume the animation if paused. */
  def resume(): Unit = js.native
  
  /** Set the current value, while stopping the current animation */
  def set(value: T): this.type = js.native
  def set(value: FluidValue[T, scala.Any]): this.type = js.native
  
  /**
    * Update this value's animation using the queue of pending props,
    * and unpause the current animation (if one is frozen).
    *
    * When arguments are passed, a new animation is created, and the
    * queued animations are left alone.
    */
  def start(): js.Promise[AnimationResult[this.type]] = js.native
  def start(props: SpringUpdate[T]): js.Promise[AnimationResult[this.type]] = js.native
  def start(to: T): js.Promise[AnimationResult[this.type]] = js.native
  def start(to: T, props: SpringProps[T]): js.Promise[AnimationResult[this.type]] = js.native
  
  /**
    * Stop the current animation, and cancel any delayed updates.
    *
    * Pass `true` to call `onRest` with `cancelled: true`.
    */
  def stop(): this.type = js.native
  def stop(cancel: Boolean): this.type = js.native
  
  /** Push props into the pending queue. */
  def update(props: SpringUpdate[T]): this.type = js.native
  
  def velocity: VelocityProp[T] = js.native
}
