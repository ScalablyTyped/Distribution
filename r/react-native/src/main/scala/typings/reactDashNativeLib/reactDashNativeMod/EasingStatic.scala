package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EasingStatic extends js.Object {
  @JSName("bounce")
  var bounce_Original: EasingFunction = js.native
  @JSName("circle")
  var circle_Original: EasingFunction = js.native
  @JSName("cubic")
  var cubic_Original: EasingFunction = js.native
  @JSName("ease")
  var ease_Original: EasingFunction = js.native
  @JSName("exp")
  var exp_Original: EasingFunction = js.native
  @JSName("linear")
  var linear_Original: EasingFunction = js.native
  @JSName("quad")
  var quad_Original: EasingFunction = js.native
  @JSName("sin")
  var sin_Original: EasingFunction = js.native
  @JSName("step0")
  var step0_Original: EasingFunction = js.native
  @JSName("step1")
  var step1_Original: EasingFunction = js.native
  def back(s: scala.Double): EasingFunction = js.native
  def bezier(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): EasingFunction = js.native
  def bounce(value: scala.Double): scala.Double = js.native
  def circle(value: scala.Double): scala.Double = js.native
  def cubic(value: scala.Double): scala.Double = js.native
  def ease(value: scala.Double): scala.Double = js.native
  def elastic(bounciness: scala.Double): EasingFunction = js.native
  def exp(value: scala.Double): scala.Double = js.native
  def in(easing: EasingFunction): EasingFunction = js.native
  def inOut(easing: EasingFunction): EasingFunction = js.native
  def linear(value: scala.Double): scala.Double = js.native
  def out(easing: EasingFunction): EasingFunction = js.native
  def poly(n: scala.Double): EasingFunction = js.native
  def quad(value: scala.Double): scala.Double = js.native
  def sin(value: scala.Double): scala.Double = js.native
  def step0(value: scala.Double): scala.Double = js.native
  def step1(value: scala.Double): scala.Double = js.native
}

