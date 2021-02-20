package typings.sketchapp

import typings.sketchapp.sketchappStrings.borderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSBorderOptions extends StObject {
  
  var _class: borderOptions = js.native
  
  var dashPattern: js.Array[Double] = js.native
  
  var isEnabled: Boolean = js.native
  
  var lineCapStyle: SketchMSBorderLineCapStyle = js.native
  
  var lineJoinStyle: SketchMSBorderLineJoinStyle = js.native
}
object SketchMSBorderOptions {
  
  @scala.inline
  def apply(
    _class: borderOptions,
    dashPattern: js.Array[Double],
    isEnabled: Boolean,
    lineCapStyle: SketchMSBorderLineCapStyle,
    lineJoinStyle: SketchMSBorderLineJoinStyle
  ): SketchMSBorderOptions = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], dashPattern = dashPattern.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], lineCapStyle = lineCapStyle.asInstanceOf[js.Any], lineJoinStyle = lineJoinStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSBorderOptions]
  }
  
  @scala.inline
  implicit class SketchMSBorderOptionsMutableBuilder[Self <: SketchMSBorderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashPattern(value: js.Array[Double]): Self = StObject.set(x, "dashPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashPatternVarargs(value: Double*): Self = StObject.set(x, "dashPattern", js.Array(value :_*))
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCapStyle(value: SketchMSBorderLineCapStyle): Self = StObject.set(x, "lineCapStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineJoinStyle(value: SketchMSBorderLineJoinStyle): Self = StObject.set(x, "lineJoinStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_class(value: borderOptions): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
