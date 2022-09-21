package typings.reactNativePaper.anon

import typings.react.mod.ReactNode
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativePaper.iconMod.IconSource
import typings.reactNativePaper.reactNativePaperStrings.contained
import typings.reactNativePaper.reactNativePaperStrings.outlined
import typings.reactNativePaper.reactNativePaperStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessibilityHint extends StObject {
  
  /**
    * Accessibility hint for the button. This is read by the screen reader when the user taps the button.
    */
  var accessibilityHint: js.UndefOr[String] = js.undefined
  
  /**
    * Accessibility label for the button. This is read by the screen reader when the user taps the button.
    */
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Label text of the button.
    */
  var children: ReactNode
  
  /**
    * Custom text color for flat button, or background color for contained button.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Use a compact look, useful for `text` buttons in a row.
    */
  var compact: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Style of button's inner content.
    * Use this prop to apply custom height and width and to set the icon on the right with `flexDirection: 'row-reverse'`.
    */
  var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Whether the color is a dark color. A dark button will render light text and vice-versa. Only applicable for `contained` mode.
    */
  var dark: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the button is disabled. A disabled button is greyed out and `onPress` is not called on touch.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Icon to display for the `Button`.
    */
  var icon: js.UndefOr[IconSource] = js.undefined
  
  /**
    * Style for the button text.
    */
  var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * Whether to show a loading indicator.
    */
  var loading: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Mode of the button. You can change the mode to adjust the styling to give it desired emphasis.
    * - `text` - flat button without background or outline (low emphasis)
    * - `outlined` - button with an outline (medium emphasis)
    * - `contained` - button with a background color and elevation shadow (high emphasis)
    */
  var mode: js.UndefOr[text | outlined | contained] = js.undefined
  
  /**
    * Function to execute on long press.
    */
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Function to execute on press.
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * testID to be used on tests.
    */
  var testID: js.UndefOr[String] = js.undefined
  
  /**
    * @optional
    */
  var theme: typings.reactNativePaper.typescriptTypesMod.global.ReactNativePaper.Theme
  
  /**
    * Make the label text uppercased. Note that this won't work if you pass React elements as children.
    */
  var uppercase: js.UndefOr[Boolean] = js.undefined
}
object AccessibilityHint {
  
  inline def apply(theme: typings.reactNativePaper.typescriptTypesMod.global.ReactNativePaper.Theme): AccessibilityHint = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityHint]
  }
  
  extension [Self <: AccessibilityHint](x: Self) {
    
    inline def setAccessibilityHint(value: String): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
    
    inline def setContentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    inline def setContentStyleNull: Self = StObject.set(x, "contentStyle", null)
    
    inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    inline def setDark(value: Boolean): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setIcon(value: IconSource): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconFunction1(value: /* props */ IconPropscolorstring => ReactNode): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIconVarargs(value: ImageURISource*): Self = StObject.set(x, "icon", js.Array(value*))
    
    inline def setLabelStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    inline def setLabelStyleNull: Self = StObject.set(x, "labelStyle", null)
    
    inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setMode(value: text | outlined | contained): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOnLongPress(value: () => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction0(value))
    
    inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setTheme(value: typings.reactNativePaper.typescriptTypesMod.global.ReactNativePaper.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setUppercase(value: Boolean): Self = StObject.set(x, "uppercase", value.asInstanceOf[js.Any])
    
    inline def setUppercaseUndefined: Self = StObject.set(x, "uppercase", js.undefined)
  }
}
