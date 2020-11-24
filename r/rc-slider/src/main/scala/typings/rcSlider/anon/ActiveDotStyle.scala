package typings.rcSlider.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveDotStyle extends js.Object {
  
  var activeDotStyle: js.Any = js.native
  
  var dotStyle: js.Any = js.native
  
  var dots: js.Any = js.native
  
  var included: js.Any = js.native
  
  var lowerBound: js.Any = js.native
  
  var marks: js.Any = js.native
  
  var max: js.Any = js.native
  
  var min: js.Any = js.native
  
  var prefixCls: js.Any = js.native
  
  var reverse: js.Any = js.native
  
  var step: js.Any = js.native
  
  var upperBound: js.Any = js.native
  
  var vertical: js.Any = js.native
}
object ActiveDotStyle {
  
  @scala.inline
  def apply(
    activeDotStyle: js.Any,
    dotStyle: js.Any,
    dots: js.Any,
    included: js.Any,
    lowerBound: js.Any,
    marks: js.Any,
    max: js.Any,
    min: js.Any,
    prefixCls: js.Any,
    reverse: js.Any,
    step: js.Any,
    upperBound: js.Any,
    vertical: js.Any
  ): ActiveDotStyle = {
    val __obj = js.Dynamic.literal(activeDotStyle = activeDotStyle.asInstanceOf[js.Any], dotStyle = dotStyle.asInstanceOf[js.Any], dots = dots.asInstanceOf[js.Any], included = included.asInstanceOf[js.Any], lowerBound = lowerBound.asInstanceOf[js.Any], marks = marks.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], upperBound = upperBound.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveDotStyle]
  }
  
  @scala.inline
  implicit class ActiveDotStyleOps[Self <: ActiveDotStyle] (val x: Self) extends AnyVal {
    
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
    def setActiveDotStyle(value: js.Any): Self = this.set("activeDotStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotStyle(value: js.Any): Self = this.set("dotStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDots(value: js.Any): Self = this.set("dots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncluded(value: js.Any): Self = this.set("included", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerBound(value: js.Any): Self = this.set("lowerBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarks(value: js.Any): Self = this.set("marks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: js.Any): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: js.Any): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: js.Any): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverse(value: js.Any): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: js.Any): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpperBound(value: js.Any): Self = this.set("upperBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertical(value: js.Any): Self = this.set("vertical", value.asInstanceOf[js.Any])
  }
}
