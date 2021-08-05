package typings.reactNativeNavigation.anon

import org.scalablytyped.runtime.Instantiable0
import typings.reactNative.mod.TouchableWithoutFeedback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var touchableComponent: Instantiable0[TouchableWithoutFeedback]
}
object `0` {
  
  inline def apply(touchableComponent: Instantiable0[TouchableWithoutFeedback]): `0` = {
    val __obj = js.Dynamic.literal(touchableComponent = touchableComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setTouchableComponent(value: Instantiable0[TouchableWithoutFeedback]): Self = StObject.set(x, "touchableComponent", value.asInstanceOf[js.Any])
  }
}
