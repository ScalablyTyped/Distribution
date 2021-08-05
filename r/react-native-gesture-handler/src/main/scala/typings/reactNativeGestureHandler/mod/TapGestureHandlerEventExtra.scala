package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TapGestureHandlerEventExtra extends StObject {
  
  var absoluteX: Double
  
  var absoluteY: Double
  
  var x: Double
  
  var y: Double
}
object TapGestureHandlerEventExtra {
  
  inline def apply(absoluteX: Double, absoluteY: Double, x: Double, y: Double): TapGestureHandlerEventExtra = {
    val __obj = js.Dynamic.literal(absoluteX = absoluteX.asInstanceOf[js.Any], absoluteY = absoluteY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TapGestureHandlerEventExtra]
  }
  
  extension [Self <: TapGestureHandlerEventExtra](x: Self) {
    
    inline def setAbsoluteX(value: Double): Self = StObject.set(x, "absoluteX", value.asInstanceOf[js.Any])
    
    inline def setAbsoluteY(value: Double): Self = StObject.set(x, "absoluteY", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
