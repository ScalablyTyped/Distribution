package typings.reactNativeGestureHandler.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseButtonProperties
  extends StObject
     with RawButtonProperties {
  
  var onActiveStateChange: js.UndefOr[js.Function1[/* active */ Boolean, Unit]] = js.undefined
  
  var onPress: js.UndefOr[js.Function1[/* pointerInside */ Boolean, Unit]] = js.undefined
  
  var rippleColor: js.UndefOr[String] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object BaseButtonProperties {
  
  @scala.inline
  def apply(): BaseButtonProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseButtonProperties]
  }
  
  @scala.inline
  implicit class BaseButtonPropertiesMutableBuilder[Self <: BaseButtonProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnActiveStateChange(value: /* active */ Boolean => Unit): Self = StObject.set(x, "onActiveStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnActiveStateChangeUndefined: Self = StObject.set(x, "onActiveStateChange", js.undefined)
    
    @scala.inline
    def setOnPress(value: /* pointerInside */ Boolean => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setRippleColor(value: String): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
