package typings.reactSpringAnimated.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An animated number or a native attribute value */
@JSImport("@react-spring/animated", "AnimatedValue")
@js.native
class AnimatedValue[T] protected ()
  extends Animated[js.Any] {
  def this(_value: T) = this()
  
  var _value: T = js.native
  
  var done: Boolean = js.native
  
  var elapsedTime: Double = js.native
  
  var lastPosition: Double = js.native
  
  var lastVelocity: js.UndefOr[Double | Null] = js.native
  
  /**
    * Set the current value and optionally round it.
    *
    * The `step` argument does nothing whenever it equals `undefined` or `0`.
    * It works with fractions and whole numbers. The best use case is (probably)
    * rounding to the pixel grid with a step of:
    *
    *      1 / window.devicePixelRatio
    */
  def setValue(value: T): Boolean = js.native
  def setValue(value: T, step: Double): Boolean = js.native
  
  var v0: js.UndefOr[Double | Null] = js.native
}
/* static members */
@JSImport("@react-spring/animated", "AnimatedValue")
@js.native
object AnimatedValue extends js.Object {
  
  def create[T](from: T): AnimatedValue[T] = js.native
  def create[T](from: T, _to: T): AnimatedValue[T] = js.native
}
