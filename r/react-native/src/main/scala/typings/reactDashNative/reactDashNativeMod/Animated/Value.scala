package typings.reactDashNative.reactDashNativeMod.Animated

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", "Animated.Value")
@js.native
class Value protected () extends AnimatedWithChildren {
  def this(value: Double) = this()
  /**
    * Adds an asynchronous listener to the value so you can observe updates from
    * animations.  This is useful because there is no way to
    * synchronously read the value because it might be driven natively.
    */
  def addListener(callback: ValueListenerCallback): String = js.native
  /**
    * Sets the offset value to the base value, and resets the base value to zero.
    * The final output of the value is unchanged.
    */
  def extractOffset(): Unit = js.native
  /**
    * Merges the offset value into the base value and resets the offset to zero.
    * The final output of the value is unchanged.
    */
  def flattenOffset(): Unit = js.native
  /**
    * Interpolates the value before updating the property, e.g. mapping 0-1 to
    * 0-10.
    */
  def interpolate(config: InterpolationConfigType): AnimatedInterpolation = js.native
  def removeAllListeners(): Unit = js.native
  def removeListener(id: String): Unit = js.native
  /**
    * Sets an offset that is applied on top of whatever value is set, whether via
    * `setValue`, an animation, or `Animated.event`.  Useful for compensating
    * things like the start of a pan gesture.
    */
  def setOffset(offset: Double): Unit = js.native
  /**
    * Directly set the value.  This will stop any animations running on the value
    * and update all the bound properties.
    */
  def setValue(value: Double): Unit = js.native
  /**
    * Stops any running animation or tracking.  `callback` is invoked with the
    * final value after stopping the animation, which is useful for updating
    * state to match the animation position with layout.
    */
  def stopAnimation(): Unit = js.native
  def stopAnimation(callback: js.Function1[/* value */ Double, Unit]): Unit = js.native
}

