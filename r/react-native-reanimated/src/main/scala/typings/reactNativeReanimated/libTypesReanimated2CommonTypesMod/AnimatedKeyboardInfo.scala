package typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimatedKeyboardInfo extends StObject {
  
  var height: SharedValue[Double]
  
  var state: SharedValue[KeyboardState]
}
object AnimatedKeyboardInfo {
  
  inline def apply(height: SharedValue[Double], state: SharedValue[KeyboardState]): AnimatedKeyboardInfo = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedKeyboardInfo]
  }
  
  extension [Self <: AnimatedKeyboardInfo](x: Self) {
    
    inline def setHeight(value: SharedValue[Double]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setState(value: SharedValue[KeyboardState]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
