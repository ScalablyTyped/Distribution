package typings.reactNativePaper.anon

import typings.react.mod.ReactNode
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativePaper.libTypescriptComponentsFabAnimatedFABAnimatedFABMod.AnimatedFABAnimateFrom
import typings.reactNativePaper.libTypescriptComponentsFabAnimatedFABAnimatedFABMod.AnimatedFABIconMode
import typings.reactNativePaper.libTypescriptComponentsIconMod.IconSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessibilityState extends StObject {
  
  /**
    * Accessibility label for the FAB. This is read by the screen reader when the user taps the FAB.
    * Uses `label` by default if specified.
    */
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Accessibility state for the FAB. This is read by the screen reader when the user taps the FAB.
    */
  var accessibilityState: js.UndefOr[typings.reactNative.mod.AccessibilityState] = js.undefined
  
  /**
    * Indicates from which direction animation should be performed. The default value is `right`.
    */
  var animateFrom: js.UndefOr[AnimatedFABAnimateFrom] = js.undefined
  
  /**
    * Custom color for the icon and label of the `FAB`.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Whether `FAB` is disabled. A disabled button is greyed out and `onPress` is not called on touch.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether `FAB` should start animation to extend.
    */
  var extended: Boolean
  
  /**
    * Icon to display for the `FAB`.
    */
  var icon: IconSource
  
  /**
    * Whether icon should be translated to the end of extended `FAB` or be static and stay in the same place. The default value is `dynamic`.
    */
  var iconMode: js.UndefOr[AnimatedFABIconMode] = js.undefined
  
  /**
    * Label for extended `FAB`.
    */
  var label: String
  
  /**
    * Function to execute on long press.
    */
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Function to execute on press.
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var testID: js.UndefOr[String] = js.undefined
  
  /**
    * @optional
    */
  var theme: typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
  
  /**
    * Make the label text uppercased.
    */
  var uppercase: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether `FAB` is currently visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object AccessibilityState {
  
  inline def apply(
    extended: Boolean,
    icon: IconSource,
    label: String,
    theme: typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
  ): AccessibilityState = {
    val __obj = js.Dynamic.literal(extended = extended.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessibilityState] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setAccessibilityState(value: typings.reactNative.mod.AccessibilityState): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
    
    inline def setAnimateFrom(value: AnimatedFABAnimateFrom): Self = StObject.set(x, "animateFrom", value.asInstanceOf[js.Any])
    
    inline def setAnimateFromUndefined: Self = StObject.set(x, "animateFrom", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setExtended(value: Boolean): Self = StObject.set(x, "extended", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: IconSource): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconFunction1(value: /* props */ IconPropscolorstring => ReactNode): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
    
    inline def setIconMode(value: AnimatedFABIconMode): Self = StObject.set(x, "iconMode", value.asInstanceOf[js.Any])
    
    inline def setIconModeUndefined: Self = StObject.set(x, "iconMode", js.undefined)
    
    inline def setIconVarargs(value: ImageURISource*): Self = StObject.set(x, "icon", js.Array(value*))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOnLongPress(value: () => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction0(value))
    
    inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setTheme(value: typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setUppercase(value: Boolean): Self = StObject.set(x, "uppercase", value.asInstanceOf[js.Any])
    
    inline def setUppercaseUndefined: Self = StObject.set(x, "uppercase", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
