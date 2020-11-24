package typings.reactStonecutter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Easings_ extends js.Object {
  
  var backIn: Easing = js.native
  
  var backInOut: Easing = js.native
  
  var backOut: Easing = js.native
  
  var circIn: Easing = js.native
  
  var circInOut: Easing = js.native
  
  var circOut: Easing = js.native
  
  var cubicIn: Easing = js.native
  
  var cubicInOut: Easing = js.native
  
  var cubicOut: Easing = js.native
  
  var expoIn: Easing = js.native
  
  var expoInOut: Easing = js.native
  
  var expoOut: Easing = js.native
  
  var quadIn: Easing = js.native
  
  var quadInOut: Easing = js.native
  
  var quadOut: Easing = js.native
  
  var quartIn: Easing = js.native
  
  var quartInOut: Easing = js.native
  
  var quartOut: Easing = js.native
  
  var quintIn: Easing = js.native
  
  var quintInOut: Easing = js.native
  
  var quintOut: Easing = js.native
  
  var sineIn: Easing = js.native
  
  var sineInOut: Easing = js.native
  
  var sineOut: Easing = js.native
}
object Easings_ {
  
  @scala.inline
  def apply(
    backIn: Easing,
    backInOut: Easing,
    backOut: Easing,
    circIn: Easing,
    circInOut: Easing,
    circOut: Easing,
    cubicIn: Easing,
    cubicInOut: Easing,
    cubicOut: Easing,
    expoIn: Easing,
    expoInOut: Easing,
    expoOut: Easing,
    quadIn: Easing,
    quadInOut: Easing,
    quadOut: Easing,
    quartIn: Easing,
    quartInOut: Easing,
    quartOut: Easing,
    quintIn: Easing,
    quintInOut: Easing,
    quintOut: Easing,
    sineIn: Easing,
    sineInOut: Easing,
    sineOut: Easing
  ): Easings_ = {
    val __obj = js.Dynamic.literal(backIn = backIn.asInstanceOf[js.Any], backInOut = backInOut.asInstanceOf[js.Any], backOut = backOut.asInstanceOf[js.Any], circIn = circIn.asInstanceOf[js.Any], circInOut = circInOut.asInstanceOf[js.Any], circOut = circOut.asInstanceOf[js.Any], cubicIn = cubicIn.asInstanceOf[js.Any], cubicInOut = cubicInOut.asInstanceOf[js.Any], cubicOut = cubicOut.asInstanceOf[js.Any], expoIn = expoIn.asInstanceOf[js.Any], expoInOut = expoInOut.asInstanceOf[js.Any], expoOut = expoOut.asInstanceOf[js.Any], quadIn = quadIn.asInstanceOf[js.Any], quadInOut = quadInOut.asInstanceOf[js.Any], quadOut = quadOut.asInstanceOf[js.Any], quartIn = quartIn.asInstanceOf[js.Any], quartInOut = quartInOut.asInstanceOf[js.Any], quartOut = quartOut.asInstanceOf[js.Any], quintIn = quintIn.asInstanceOf[js.Any], quintInOut = quintInOut.asInstanceOf[js.Any], quintOut = quintOut.asInstanceOf[js.Any], sineIn = sineIn.asInstanceOf[js.Any], sineInOut = sineInOut.asInstanceOf[js.Any], sineOut = sineOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[Easings_]
  }
  
  @scala.inline
  implicit class Easings_Ops[Self <: Easings_] (val x: Self) extends AnyVal {
    
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
    def setBackIn(value: Easing): Self = this.set("backIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackInOut(value: Easing): Self = this.set("backInOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackOut(value: Easing): Self = this.set("backOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircIn(value: Easing): Self = this.set("circIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircInOut(value: Easing): Self = this.set("circInOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircOut(value: Easing): Self = this.set("circOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCubicIn(value: Easing): Self = this.set("cubicIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCubicInOut(value: Easing): Self = this.set("cubicInOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCubicOut(value: Easing): Self = this.set("cubicOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpoIn(value: Easing): Self = this.set("expoIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpoInOut(value: Easing): Self = this.set("expoInOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpoOut(value: Easing): Self = this.set("expoOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuadIn(value: Easing): Self = this.set("quadIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuadInOut(value: Easing): Self = this.set("quadInOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuadOut(value: Easing): Self = this.set("quadOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuartIn(value: Easing): Self = this.set("quartIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuartInOut(value: Easing): Self = this.set("quartInOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuartOut(value: Easing): Self = this.set("quartOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuintIn(value: Easing): Self = this.set("quintIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuintInOut(value: Easing): Self = this.set("quintInOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuintOut(value: Easing): Self = this.set("quintOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSineIn(value: Easing): Self = this.set("sineIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSineInOut(value: Easing): Self = this.set("sineInOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSineOut(value: Easing): Self = this.set("sineOut", value.asInstanceOf[js.Any])
  }
}
