package typings.reactNativePaper.anon

import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TouchableWithoutFeedback
import typings.reactNative.mod.ViewStyle
import typings.reactNativePaper.libTypescriptComponentsIconMod.IconSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessibilityLabel extends StObject {
  
  /**
    * Accessibility label for the button. This is read by the screen reader when the user taps the button.
    */
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Whether an icon change is animated.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Color of the icon.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the button is disabled. A disabled button is greyed out and `onPress` is not called on touch.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Icon to display.
    */
  var icon: IconSource
  
  /**
    * Function to execute on press.
    */
  var onPress: js.UndefOr[js.Function1[/* e */ GestureResponderEvent, Unit]] = js.undefined
  
  var ref: js.UndefOr[RefObject[TouchableWithoutFeedback]] = js.undefined
  
  /**
    * Size of the icon.
    */
  var size: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @optional
    */
  var theme: typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
}
object AccessibilityLabel {
  
  inline def apply(
    icon: IconSource,
    theme: typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
  ): AccessibilityLabel = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityLabel]
  }
  
  extension [Self <: AccessibilityLabel](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setIcon(value: IconSource): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconFunction1(value: /* props */ IconPropscolorstring => ReactNode): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
    
    inline def setIconVarargs(value: ImageURISource*): Self = StObject.set(x, "icon", js.Array(value*))
    
    inline def setOnPress(value: /* e */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setRef(value: RefObject[TouchableWithoutFeedback]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTheme(value: typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
