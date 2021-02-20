package typings.sketchapp

import typings.sketchapp.sketchappStrings.styleBorderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSStyleBorderOptions extends StObject {
  
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
  implicit class SketchMSStyleBorderOptionsMutableBuilder[Self <: SketchMSStyleBorderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashPattern(value: js.Array[_]): Self = StObject.set(x, "dashPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashPatternVarargs(value: js.Any*): Self = StObject.set(x, "dashPattern", js.Array(value :_*))
    
    @scala.inline
    def setIsEnabled(value: Double): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCapStyle(value: Double): Self = StObject.set(x, "lineCapStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineJoinStyle(value: Double): Self = StObject.set(x, "lineJoinStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_class(value: styleBorderOptions): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
