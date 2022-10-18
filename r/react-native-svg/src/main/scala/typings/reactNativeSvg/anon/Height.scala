package typings.reactNativeSvg.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Height extends StObject {
  
  var height: String
  
  var width: String
  
  var x: String
  
  var y: String
}
object Height {
  
  inline def apply(height: String, width: String, x: String, y: String): Height = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
  
  extension [Self <: Height](x: Self) {
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
