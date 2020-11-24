package typings.reactStackGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait easingProps extends js.Object {
  
  var backIn: String = js.native
  
  var backInOut: String = js.native
  
  var backOut: String = js.native
  
  var circIn: String = js.native
  
  var circInOut: String = js.native
  
  var circOut: String = js.native
  
  var cubicIn: String = js.native
  
  var cubicInOut: String = js.native
  
  var cubicOut: String = js.native
  
  var easeIn: String = js.native
  
  var easeInOut: String = js.native
  
  var easeOut: String = js.native
  
  var expoIn: String = js.native
  
  var expoInOut: String = js.native
  
  var expoOut: String = js.native
  
  var linear: String = js.native
  
  var quadIn: String = js.native
  
  var quadInOut: String = js.native
  
  var quadOut: String = js.native
  
  var quartIn: String = js.native
  
  var quartInOut: String = js.native
  
  var quartOut: String = js.native
  
  var quintIn: String = js.native
  
  var quintInOut: String = js.native
  
  var quintOut: String = js.native
  
  var sineIn: String = js.native
  
  var sineInOut: String = js.native
  
  var sineOut: String = js.native
}
object easingProps {
  
  @scala.inline
  def apply(
    backIn: String,
    backInOut: String,
    backOut: String,
    circIn: String,
    circInOut: String,
    circOut: String,
    cubicIn: String,
    cubicInOut: String,
    cubicOut: String,
    easeIn: String,
    easeInOut: String,
    easeOut: String,
    expoIn: String,
    expoInOut: String,
    expoOut: String,
    linear: String,
    quadIn: String,
    quadInOut: String,
    quadOut: String,
    quartIn: String,
    quartInOut: String,
    quartOut: String,
    quintIn: String,
    quintInOut: String,
    quintOut: String,
    sineIn: String,
    sineInOut: String,
    sineOut: String
  ): easingProps = {
    val __obj = js.Dynamic.literal(backIn = backIn.asInstanceOf[js.Any], backInOut = backInOut.asInstanceOf[js.Any], backOut = backOut.asInstanceOf[js.Any], circIn = circIn.asInstanceOf[js.Any], circInOut = circInOut.asInstanceOf[js.Any], circOut = circOut.asInstanceOf[js.Any], cubicIn = cubicIn.asInstanceOf[js.Any], cubicInOut = cubicInOut.asInstanceOf[js.Any], cubicOut = cubicOut.asInstanceOf[js.Any], easeIn = easeIn.asInstanceOf[js.Any], easeInOut = easeInOut.asInstanceOf[js.Any], easeOut = easeOut.asInstanceOf[js.Any], expoIn = expoIn.asInstanceOf[js.Any], expoInOut = expoInOut.asInstanceOf[js.Any], expoOut = expoOut.asInstanceOf[js.Any], linear = linear.asInstanceOf[js.Any], quadIn = quadIn.asInstanceOf[js.Any], quadInOut = quadInOut.asInstanceOf[js.Any], quadOut = quadOut.asInstanceOf[js.Any], quartIn = quartIn.asInstanceOf[js.Any], quartInOut = quartInOut.asInstanceOf[js.Any], quartOut = quartOut.asInstanceOf[js.Any], quintIn = quintIn.asInstanceOf[js.Any], quintInOut = quintInOut.asInstanceOf[js.Any], quintOut = quintOut.asInstanceOf[js.Any], sineIn = sineIn.asInstanceOf[js.Any], sineInOut = sineInOut.asInstanceOf[js.Any], sineOut = sineOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[easingProps]
  }
  
  @scala.inline
  implicit class easingPropsOps[Self <: easingProps] (val x: Self) extends AnyVal {
    
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
    def setBackIn(value: String): Self = this.set("backIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackInOut(value: String): Self = this.set("backInOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackOut(value: String): Self = this.set("backOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircIn(value: String): Self = this.set("circIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircInOut(value: String): Self = this.set("circInOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircOut(value: String): Self = this.set("circOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCubicIn(value: String): Self = this.set("cubicIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCubicInOut(value: String): Self = this.set("cubicInOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCubicOut(value: String): Self = this.set("cubicOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseIn(value: String): Self = this.set("easeIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseInOut(value: String): Self = this.set("easeInOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseOut(value: String): Self = this.set("easeOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpoIn(value: String): Self = this.set("expoIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpoInOut(value: String): Self = this.set("expoInOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpoOut(value: String): Self = this.set("expoOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinear(value: String): Self = this.set("linear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuadIn(value: String): Self = this.set("quadIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuadInOut(value: String): Self = this.set("quadInOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuadOut(value: String): Self = this.set("quadOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuartIn(value: String): Self = this.set("quartIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuartInOut(value: String): Self = this.set("quartInOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuartOut(value: String): Self = this.set("quartOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuintIn(value: String): Self = this.set("quintIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuintInOut(value: String): Self = this.set("quintInOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuintOut(value: String): Self = this.set("quintOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSineIn(value: String): Self = this.set("sineIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSineInOut(value: String): Self = this.set("sineInOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSineOut(value: String): Self = this.set("sineOut", value.asInstanceOf[js.Any])
  }
}
