package typings.reactNavigationStack.vendorTypesMod

import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.WithAnimatedValue
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNavigationStack.anon.TintColorString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackHeaderLeftButtonProps extends StObject {
  
  /**
    * Accessibility label for the button for screen readers.
    */
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Whether label font should scale to respect Text Size accessibility settings.
    */
  var allowFontScaling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Function which returns a React Element to display custom image in header's back button.
    */
  var backImage: js.UndefOr[js.Function1[/* props */ TintColorString, ReactNode]] = js.undefined
  
  /**
    * Whether it's possible to navigate back in stack.
    */
  var canGoBack: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the button is disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Label text for the button. Usually the title of the previous screen.
    * By default, this is only shown on iOS.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * Style object for the label.
    */
  var labelStyle: js.UndefOr[WithAnimatedValue[StyleProp[TextStyle]]] = js.undefined
  
  /**
    * Whether the label text is visible.
    * Defaults to `true` on iOS and `false` on Android.
    */
  var labelVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Callback to trigger when the size of the label changes.
    */
  var onLabelLayout: js.UndefOr[js.Function1[/* e */ LayoutChangeEvent, Unit]] = js.undefined
  
  /**
    * Callback to call when the button is pressed.
    * By default, this triggers `goBack`.
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Color for material ripple (Android >= 5.0 only).
    */
  var pressColorAndroid: js.UndefOr[String] = js.undefined
  
  /**
    * Layout of the screen.
    */
  var screenLayout: js.UndefOr[Layout] = js.undefined
  
  /**
    * Style object for the button.
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Tint color for the header.
    */
  var tintColor: js.UndefOr[String] = js.undefined
  
  /**
    * Layout of the title element in the header.
    */
  var titleLayout: js.UndefOr[Layout] = js.undefined
  
  /**
    * Label text to show when there isn't enough space for the full label.
    */
  var truncatedLabel: js.UndefOr[String] = js.undefined
}
object StackHeaderLeftButtonProps {
  
  inline def apply(): StackHeaderLeftButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackHeaderLeftButtonProps]
  }
  
  extension [Self <: StackHeaderLeftButtonProps](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setAllowFontScaling(value: Boolean): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
    
    inline def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
    
    inline def setBackImage(value: /* props */ TintColorString => ReactNode): Self = StObject.set(x, "backImage", js.Any.fromFunction1(value))
    
    inline def setBackImageUndefined: Self = StObject.set(x, "backImage", js.undefined)
    
    inline def setCanGoBack(value: Boolean): Self = StObject.set(x, "canGoBack", value.asInstanceOf[js.Any])
    
    inline def setCanGoBackUndefined: Self = StObject.set(x, "canGoBack", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelStyle(value: WithAnimatedValue[StyleProp[TextStyle]]): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    inline def setLabelStyleNull: Self = StObject.set(x, "labelStyle", null)
    
    inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLabelVisible(value: Boolean): Self = StObject.set(x, "labelVisible", value.asInstanceOf[js.Any])
    
    inline def setLabelVisibleUndefined: Self = StObject.set(x, "labelVisible", js.undefined)
    
    inline def setOnLabelLayout(value: /* e */ LayoutChangeEvent => Unit): Self = StObject.set(x, "onLabelLayout", js.Any.fromFunction1(value))
    
    inline def setOnLabelLayoutUndefined: Self = StObject.set(x, "onLabelLayout", js.undefined)
    
    inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setPressColorAndroid(value: String): Self = StObject.set(x, "pressColorAndroid", value.asInstanceOf[js.Any])
    
    inline def setPressColorAndroidUndefined: Self = StObject.set(x, "pressColorAndroid", js.undefined)
    
    inline def setScreenLayout(value: Layout): Self = StObject.set(x, "screenLayout", value.asInstanceOf[js.Any])
    
    inline def setScreenLayoutUndefined: Self = StObject.set(x, "screenLayout", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    inline def setTitleLayout(value: Layout): Self = StObject.set(x, "titleLayout", value.asInstanceOf[js.Any])
    
    inline def setTitleLayoutUndefined: Self = StObject.set(x, "titleLayout", js.undefined)
    
    inline def setTruncatedLabel(value: String): Self = StObject.set(x, "truncatedLabel", value.asInstanceOf[js.Any])
    
    inline def setTruncatedLabelUndefined: Self = StObject.set(x, "truncatedLabel", js.undefined)
  }
}
