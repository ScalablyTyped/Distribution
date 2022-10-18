package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color
  extends StObject
     with AnyObject {
  
  var _class: color
  
  var alpha: UnitInterval
  
  var blue: UnitInterval
  
  var green: UnitInterval
  
  var red: UnitInterval
  
  var swatchID: js.UndefOr[Uuid] = js.undefined
}
object Color {
  
  inline def apply(alpha: UnitInterval, blue: UnitInterval, green: UnitInterval, red: UnitInterval): Color = {
    val __obj = js.Dynamic.literal(_class = "color", alpha = alpha.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  extension [Self <: Color](x: Self) {
    
    inline def setAlpha(value: UnitInterval): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setBlue(value: UnitInterval): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    inline def setGreen(value: UnitInterval): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    inline def setRed(value: UnitInterval): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    
    inline def setSwatchID(value: Uuid): Self = StObject.set(x, "swatchID", value.asInstanceOf[js.Any])
    
    inline def setSwatchIDUndefined: Self = StObject.set(x, "swatchID", js.undefined)
    
    inline def set_class(value: color): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
