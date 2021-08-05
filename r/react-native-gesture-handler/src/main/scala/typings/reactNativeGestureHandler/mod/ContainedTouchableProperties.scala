package typings.reactNativeGestureHandler.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainedTouchableProperties extends StObject {
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object ContainedTouchableProperties {
  
  inline def apply(): ContainedTouchableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainedTouchableProperties]
  }
  
  extension [Self <: ContainedTouchableProperties](x: Self) {
    
    inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
  }
}
