package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.border
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Border
  extends StObject
     with AnyObject {
  
  var _class: border
  
  var color: Color
  
  var contextSettings: GraphicsContextSettings
  
  var fillType: FillType
  
  var gradient: Gradient
  
  var isEnabled: Boolean
  
  var position: BorderPosition
  
  var thickness: Double
}
object Border {
  
  inline def apply(
    color: Color,
    contextSettings: GraphicsContextSettings,
    fillType: FillType,
    gradient: Gradient,
    isEnabled: Boolean,
    position: BorderPosition,
    thickness: Double
  ): Border = {
    val __obj = js.Dynamic.literal(_class = "border", color = color.asInstanceOf[js.Any], contextSettings = contextSettings.asInstanceOf[js.Any], fillType = fillType.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Border] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setContextSettings(value: GraphicsContextSettings): Self = StObject.set(x, "contextSettings", value.asInstanceOf[js.Any])
    
    inline def setFillType(value: FillType): Self = StObject.set(x, "fillType", value.asInstanceOf[js.Any])
    
    inline def setGradient(value: Gradient): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: BorderPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def set_class(value: border): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
