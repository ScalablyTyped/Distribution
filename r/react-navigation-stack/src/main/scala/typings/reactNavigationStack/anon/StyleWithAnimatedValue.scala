package typings.reactNavigationStack.anon

import typings.reactNative.mod.Animated.WithAnimatedValue
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleWithAnimatedValue extends StObject {
  
  var style: WithAnimatedValue[StyleProp[ViewStyle]]
}
object StyleWithAnimatedValue {
  
  inline def apply(): StyleWithAnimatedValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleWithAnimatedValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleWithAnimatedValue] (val x: Self) extends AnyVal {
    
    inline def setStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
