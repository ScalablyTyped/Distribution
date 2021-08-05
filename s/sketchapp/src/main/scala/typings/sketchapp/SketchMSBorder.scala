package typings.sketchapp

import typings.sketchapp.sketchappStrings.border
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSBorder extends StObject {
  
  var _class: border
  
  var color: SketchMSColor
  
  var fillType: SketchMSFillTypeEnum
  
  var isEnabled: Boolean
  
  var position: SketchMSBorderPositionEnum
  
  var thickness: Double
}
object SketchMSBorder {
  
  inline def apply(
    color: SketchMSColor,
    fillType: SketchMSFillTypeEnum,
    isEnabled: Boolean,
    position: SketchMSBorderPositionEnum,
    thickness: Double
  ): SketchMSBorder = {
    val __obj = js.Dynamic.literal(_class = "border", color = color.asInstanceOf[js.Any], fillType = fillType.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSBorder]
  }
  
  extension [Self <: SketchMSBorder](x: Self) {
    
    inline def setColor(value: SketchMSColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setFillType(value: SketchMSFillTypeEnum): Self = StObject.set(x, "fillType", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: SketchMSBorderPositionEnum): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def set_class(value: border): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
