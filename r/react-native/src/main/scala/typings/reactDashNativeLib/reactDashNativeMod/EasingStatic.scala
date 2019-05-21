package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EasingStatic extends js.Object {
  var bounce: EasingFunction
  var circle: EasingFunction
  var cubic: EasingFunction
  var ease: EasingFunction
  var exp: EasingFunction
  var linear: EasingFunction
  var quad: EasingFunction
  var sin: EasingFunction
  var step0: EasingFunction
  var step1: EasingFunction
  def back(s: scala.Double): EasingFunction
  def bezier(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): EasingFunction
  def elastic(bounciness: scala.Double): EasingFunction
  def in(easing: EasingFunction): EasingFunction
  def inOut(easing: EasingFunction): EasingFunction
  def out(easing: EasingFunction): EasingFunction
  def poly(n: scala.Double): EasingFunction
}

object EasingStatic {
  @scala.inline
  def apply(
    back: scala.Double => EasingFunction,
    bezier: (scala.Double, scala.Double, scala.Double, scala.Double) => EasingFunction,
    bounce: EasingFunction,
    circle: EasingFunction,
    cubic: EasingFunction,
    ease: EasingFunction,
    elastic: scala.Double => EasingFunction,
    exp: EasingFunction,
    in: EasingFunction => EasingFunction,
    inOut: EasingFunction => EasingFunction,
    linear: EasingFunction,
    out: EasingFunction => EasingFunction,
    poly: scala.Double => EasingFunction,
    quad: EasingFunction,
    sin: EasingFunction,
    step0: EasingFunction,
    step1: EasingFunction
  ): EasingStatic = {
    val __obj = js.Dynamic.literal(back = js.Any.fromFunction1(back), bezier = js.Any.fromFunction4(bezier), bounce = bounce, circle = circle, cubic = cubic, ease = ease, elastic = js.Any.fromFunction1(elastic), exp = exp, in = js.Any.fromFunction1(in), inOut = js.Any.fromFunction1(inOut), linear = linear, out = js.Any.fromFunction1(out), poly = js.Any.fromFunction1(poly), quad = quad, sin = sin, step0 = step0, step1 = step1)
  
    __obj.asInstanceOf[EasingStatic]
  }
}

