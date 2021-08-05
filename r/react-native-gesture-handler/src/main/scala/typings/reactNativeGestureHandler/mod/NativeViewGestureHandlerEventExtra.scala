package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeViewGestureHandlerEventExtra extends StObject {
  
  var pointerInside: Boolean
}
object NativeViewGestureHandlerEventExtra {
  
  inline def apply(pointerInside: Boolean): NativeViewGestureHandlerEventExtra = {
    val __obj = js.Dynamic.literal(pointerInside = pointerInside.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeViewGestureHandlerEventExtra]
  }
  
  extension [Self <: NativeViewGestureHandlerEventExtra](x: Self) {
    
    inline def setPointerInside(value: Boolean): Self = StObject.set(x, "pointerInside", value.asInstanceOf[js.Any])
  }
}
