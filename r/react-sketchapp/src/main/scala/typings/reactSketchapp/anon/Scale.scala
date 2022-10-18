package typings.reactSketchapp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scale extends StObject {
  
  var fontScale: Double
  
  var height: Double
  
  var scale: Double
  
  var width: Double
}
object Scale {
  
  inline def apply(fontScale: Double, height: Double, scale: Double, width: Double): Scale = {
    val __obj = js.Dynamic.literal(fontScale = fontScale.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  extension [Self <: Scale](x: Self) {
    
    inline def setFontScale(value: Double): Self = StObject.set(x, "fontScale", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
