package typings.reactNativePaper.anon

import typings.react.mod.ReactNode
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativePaper.libTypescriptComponentsIconMod.IconSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearAccessibilityLabel extends StObject {
  
  /**
    * Accessibility label for the button. This is read by the screen reader when the user taps the button.
    */
  var clearAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Custom icon for clear button, default will be icon close
    */
  var clearIcon: js.UndefOr[IconSource] = js.undefined
  
  /**
    * Icon name for the left icon button (see `onIconPress`).
    */
  var icon: js.UndefOr[IconSource] = js.undefined
  
  /**
    * Custom color for icon, default will be derived from theme
    */
  var iconColor: js.UndefOr[String] = js.undefined
  
  /**
    * Set style of the TextInput component inside the searchbar
    */
  var inputStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * Callback that is called when the text input's text changes.
    */
  var onChangeText: js.UndefOr[js.Function1[/* query */ String, Unit]] = js.undefined
  
  /**
    * Callback to execute if we want the left icon to act as button.
    */
  var onIconPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Hint text shown when the input is empty.
    */
  var placeholder: js.UndefOr[String] = js.undefined
  
  /**
    * Accessibility label for the button. This is read by the screen reader when the user taps the button.
    */
  var searchAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @optional
    */
  var theme: typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
  
  /**
    * The value of the text input.
    */
  var value: String
}
object ClearAccessibilityLabel {
  
  inline def apply(theme: typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme, value: String): ClearAccessibilityLabel = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearAccessibilityLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClearAccessibilityLabel] (val x: Self) extends AnyVal {
    
    inline def setClearAccessibilityLabel(value: String): Self = StObject.set(x, "clearAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setClearAccessibilityLabelUndefined: Self = StObject.set(x, "clearAccessibilityLabel", js.undefined)
    
    inline def setClearIcon(value: IconSource): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
    
    inline def setClearIconFunction1(value: /* props */ IconPropscolorstring => ReactNode): Self = StObject.set(x, "clearIcon", js.Any.fromFunction1(value))
    
    inline def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
    
    inline def setClearIconVarargs(value: ImageURISource*): Self = StObject.set(x, "clearIcon", js.Array(value*))
    
    inline def setIcon(value: IconSource): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
    
    inline def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
    
    inline def setIconFunction1(value: /* props */ IconPropscolorstring => ReactNode): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIconVarargs(value: ImageURISource*): Self = StObject.set(x, "icon", js.Array(value*))
    
    inline def setInputStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
    
    inline def setInputStyleNull: Self = StObject.set(x, "inputStyle", null)
    
    inline def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
    
    inline def setOnChangeText(value: /* query */ String => Unit): Self = StObject.set(x, "onChangeText", js.Any.fromFunction1(value))
    
    inline def setOnChangeTextUndefined: Self = StObject.set(x, "onChangeText", js.undefined)
    
    inline def setOnIconPress(value: () => Unit): Self = StObject.set(x, "onIconPress", js.Any.fromFunction0(value))
    
    inline def setOnIconPressUndefined: Self = StObject.set(x, "onIconPress", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setSearchAccessibilityLabel(value: String): Self = StObject.set(x, "searchAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setSearchAccessibilityLabelUndefined: Self = StObject.set(x, "searchAccessibilityLabel", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTheme(value: typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
