package typings.sketchapp

import typings.sketchapp.sketchappStrings.styleBorderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSStyleBorderOptions extends js.Object {
  
  var _class: styleBorderOptions = js.native
  
  var dashPattern: js.Array[_] = js.native
  
  var isEnabled: Double = js.native
  
  var lineCapStyle: Double = js.native
  
  var lineJoinStyle: Double = js.native
}
object SketchMSStyleBorderOptions {
  
  @scala.inline
  def apply(
    _class: styleBorderOptions,
    dashPattern: js.Array[_],
    isEnabled: Double,
    lineCapStyle: Double,
    lineJoinStyle: Double
  ): SketchMSStyleBorderOptions = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], dashPattern = dashPattern.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], lineCapStyle = lineCapStyle.asInstanceOf[js.Any], lineJoinStyle = lineJoinStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSStyleBorderOptions]
  }
  
  @scala.inline
  implicit class SketchMSStyleBorderOptionsOps[Self <: SketchMSStyleBorderOptions] (val x: Self) extends AnyVal {
    
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
    def set_class(value: styleBorderOptions): Self = this.set("_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashPatternVarargs(value: js.Any*): Self = this.set("dashPattern", js.Array(value :_*))
    
    @scala.inline
    def setDashPattern(value: js.Array[_]): Self = this.set("dashPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Double): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCapStyle(value: Double): Self = this.set("lineCapStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineJoinStyle(value: Double): Self = this.set("lineJoinStyle", value.asInstanceOf[js.Any])
  }
}
