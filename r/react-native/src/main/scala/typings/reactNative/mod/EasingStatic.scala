package typings.reactNative.mod

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
  def back(s: Double): EasingFunction
  def bezier(x1: Double, y1: Double, x2: Double, y2: Double): EasingFunction
  def elastic(bounciness: Double): EasingFunction
  def in(easing: EasingFunction): EasingFunction
  def inOut(easing: EasingFunction): EasingFunction
  def out(easing: EasingFunction): EasingFunction
  def poly(n: Double): EasingFunction
}

object EasingStatic {
  @scala.inline
  def apply(
    back: Double => EasingFunction,
    bezier: (Double, Double, Double, Double) => EasingFunction,
    bounce: /* value */ Double => Double,
    circle: /* value */ Double => Double,
    cubic: /* value */ Double => Double,
    ease: /* value */ Double => Double,
    elastic: Double => EasingFunction,
    exp: /* value */ Double => Double,
    in: EasingFunction => EasingFunction,
    inOut: EasingFunction => EasingFunction,
    linear: /* value */ Double => Double,
    out: EasingFunction => EasingFunction,
    poly: Double => EasingFunction,
    quad: /* value */ Double => Double,
    sin: /* value */ Double => Double,
    step0: /* value */ Double => Double,
    step1: /* value */ Double => Double
  ): EasingStatic = {
    val __obj = js.Dynamic.literal(back = js.Any.fromFunction1(back), bezier = js.Any.fromFunction4(bezier), bounce = js.Any.fromFunction1(bounce), circle = js.Any.fromFunction1(circle), cubic = js.Any.fromFunction1(cubic), ease = js.Any.fromFunction1(ease), elastic = js.Any.fromFunction1(elastic), exp = js.Any.fromFunction1(exp), in = js.Any.fromFunction1(in), inOut = js.Any.fromFunction1(inOut), linear = js.Any.fromFunction1(linear), out = js.Any.fromFunction1(out), poly = js.Any.fromFunction1(poly), quad = js.Any.fromFunction1(quad), sin = js.Any.fromFunction1(sin), step0 = js.Any.fromFunction1(step0), step1 = js.Any.fromFunction1(step1))
    __obj.asInstanceOf[EasingStatic]
  }
}

