package typings.reactNative.mod.Animated

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompositeAnimation extends js.Object {
  
  /**
    * Stops any running animation and resets the value to its original.
    */
  def reset(): Unit = js.native
  
  /**
    * Animations are started by calling start() on your animation.
    * start() takes a completion callback that will be called when the
    * animation is done or when the animation is done because stop() was
    * called on it before it could finish.
    *
    * @param callback - Optional function that will be called
    *      after the animation finished running normally or when the animation
    *      is done because stop() was called on it before it could finish
    *
    * @example
    *   Animated.timing({}).start(({ finished }) => {
    *    // completion callback
    *   });
    */
  def start(): Unit = js.native
  def start(callback: EndCallback): Unit = js.native
  
  /**
    * Stops any running animation.
    */
  def stop(): Unit = js.native
}
