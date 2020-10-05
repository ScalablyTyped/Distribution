package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EasingStatic extends js.Object {
  var bounce: EasingFunction = js.native
  var circle: EasingFunction = js.native
  var cubic: EasingFunction = js.native
  var ease: EasingFunction = js.native
  var exp: EasingFunction = js.native
  var linear: EasingFunction = js.native
  var quad: EasingFunction = js.native
  var sin: EasingFunction = js.native
  var step0: EasingFunction = js.native
  var step1: EasingFunction = js.native
  def back(s: Double): EasingFunction = js.native
  def bezier(x1: Double, y1: Double, x2: Double, y2: Double): EasingFunction = js.native
  def elastic(bounciness: Double): EasingFunction = js.native
  def in(easing: EasingFunction): EasingFunction = js.native
  def inOut(easing: EasingFunction): EasingFunction = js.native
  def out(easing: EasingFunction): EasingFunction = js.native
  def poly(n: Double): EasingFunction = js.native
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
  @scala.inline
  implicit class EasingStaticOps[Self <: EasingStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBack(value: Double => EasingFunction): Self = this.set("back", js.Any.fromFunction1(value))
    @scala.inline
    def setBezier(value: (Double, Double, Double, Double) => EasingFunction): Self = this.set("bezier", js.Any.fromFunction4(value))
    @scala.inline
    def setBounce(value: /* value */ Double => Double): Self = this.set("bounce", js.Any.fromFunction1(value))
    @scala.inline
    def setCircle(value: /* value */ Double => Double): Self = this.set("circle", js.Any.fromFunction1(value))
    @scala.inline
    def setCubic(value: /* value */ Double => Double): Self = this.set("cubic", js.Any.fromFunction1(value))
    @scala.inline
    def setEase(value: /* value */ Double => Double): Self = this.set("ease", js.Any.fromFunction1(value))
    @scala.inline
    def setElastic(value: Double => EasingFunction): Self = this.set("elastic", js.Any.fromFunction1(value))
    @scala.inline
    def setExp(value: /* value */ Double => Double): Self = this.set("exp", js.Any.fromFunction1(value))
    @scala.inline
    def setIn(value: EasingFunction => EasingFunction): Self = this.set("in", js.Any.fromFunction1(value))
    @scala.inline
    def setInOut(value: EasingFunction => EasingFunction): Self = this.set("inOut", js.Any.fromFunction1(value))
    @scala.inline
    def setLinear(value: /* value */ Double => Double): Self = this.set("linear", js.Any.fromFunction1(value))
    @scala.inline
    def setOut(value: EasingFunction => EasingFunction): Self = this.set("out", js.Any.fromFunction1(value))
    @scala.inline
    def setPoly(value: Double => EasingFunction): Self = this.set("poly", js.Any.fromFunction1(value))
    @scala.inline
    def setQuad(value: /* value */ Double => Double): Self = this.set("quad", js.Any.fromFunction1(value))
    @scala.inline
    def setSin(value: /* value */ Double => Double): Self = this.set("sin", js.Any.fromFunction1(value))
    @scala.inline
    def setStep0(value: /* value */ Double => Double): Self = this.set("step0", js.Any.fromFunction1(value))
    @scala.inline
    def setStep1(value: /* value */ Double => Double): Self = this.set("step1", js.Any.fromFunction1(value))
  }
  
}

