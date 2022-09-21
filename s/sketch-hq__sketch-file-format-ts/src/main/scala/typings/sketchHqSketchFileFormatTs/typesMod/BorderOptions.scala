package typings.sketchHqSketchFileFormatTs.typesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.borderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderOptions
  extends StObject
     with AnyObject {
  
  var _class: borderOptions
  
  var dashPattern: js.Array[Double]
  
  var isEnabled: Boolean
  
  var lineCapStyle: LineCapStyle
  
  var lineJoinStyle: LineJoinStyle
}
object BorderOptions {
  
  inline def apply(
    dashPattern: js.Array[Double],
    isEnabled: Boolean,
    lineCapStyle: LineCapStyle,
    lineJoinStyle: LineJoinStyle
  ): BorderOptions = {
    val __obj = js.Dynamic.literal(_class = "borderOptions", dashPattern = dashPattern.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], lineCapStyle = lineCapStyle.asInstanceOf[js.Any], lineJoinStyle = lineJoinStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderOptions]
  }
  
  extension [Self <: BorderOptions](x: Self) {
    
    inline def setDashPattern(value: js.Array[Double]): Self = StObject.set(x, "dashPattern", value.asInstanceOf[js.Any])
    
    inline def setDashPatternVarargs(value: Double*): Self = StObject.set(x, "dashPattern", js.Array(value*))
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setLineCapStyle(value: LineCapStyle): Self = StObject.set(x, "lineCapStyle", value.asInstanceOf[js.Any])
    
    inline def setLineJoinStyle(value: LineJoinStyle): Self = StObject.set(x, "lineJoinStyle", value.asInstanceOf[js.Any])
    
    inline def set_class(value: borderOptions): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
