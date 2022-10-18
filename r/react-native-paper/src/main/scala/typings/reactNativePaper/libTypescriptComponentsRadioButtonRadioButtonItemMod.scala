package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentType
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativePaper.anon.CallHasValueLabelStyleLabelStyleOnPressDisabledColorUncheckedColorStatusHasColorsAccessibilityLabelTestIDModePosition
import typings.reactNativePaper.anon.PickPropslabelstylecoloroAccessibilityLabel
import typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
import typings.reactNativePaper.reactNativePaperStrings.android
import typings.reactNativePaper.reactNativePaperStrings.checked
import typings.reactNativePaper.reactNativePaperStrings.ios
import typings.reactNativePaper.reactNativePaperStrings.leading
import typings.reactNativePaper.reactNativePaperStrings.trailing
import typings.reactNativePaper.reactNativePaperStrings.unchecked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsRadioButtonRadioButtonItemMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/RadioButton/RadioButtonItem", JSImport.Default)
  @js.native
  val default: ComponentType[PickPropslabelstylecoloroAccessibilityLabel] & (NonReactStatics[
    ComponentType[Props] & CallHasValueLabelStyleLabelStyleOnPressDisabledColorUncheckedColorStatusHasColorsAccessibilityLabelTestIDModePosition, 
    js.Object
  ]) = js.native
  
  @JSImport("react-native-paper/lib/typescript/components/RadioButton/RadioButtonItem", "RadioButtonItem")
  @js.native
  val RadioButtonItem: ComponentType[PickPropslabelstylecoloroAccessibilityLabel] & (NonReactStatics[
    ComponentType[Props] & CallHasValueLabelStyleLabelStyleOnPressDisabledColorUncheckedColorStatusHasColorsAccessibilityLabelTestIDModePosition, 
    js.Object
  ]) = js.native
  
  trait Props extends StObject {
    
    /**
      * Accessibility label for the touchable. This is read by the screen reader when the user taps the touchable.
      */
    var accessibilityLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Custom color for radio.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Whether radio is disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Label to be displayed on the item.
      */
    var label: String
    
    /**
      * Style that is passed to Label element.
      */
    var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    /**
      * Whether `<RadioButton.Android />` or `<RadioButton.IOS />` should be used.
      * Left undefined `<RadioButton />` will be used.
      */
    var mode: js.UndefOr[android | ios] = js.undefined
    
    /**
      * Function to execute on press.
      */
    var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Radio button control position.
      */
    var position: js.UndefOr[leading | trailing] = js.undefined
    
    /**
      * Status of radio button.
      */
    var status: js.UndefOr[checked | unchecked] = js.undefined
    
    /**
      * Additional styles for container View.
      */
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * testID to be used on tests.
      */
    var testID: js.UndefOr[String] = js.undefined
    
    /**
      * @optional
      */
    var theme: Theme
    
    /**
      * Custom color for unchecked radio.
      */
    var uncheckedColor: js.UndefOr[String] = js.undefined
    
    /**
      * Value of the radio button.
      */
    var value: String
  }
  object Props {
    
    inline def apply(label: String, theme: Theme, value: String): Props = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelStyleNull: Self = StObject.set(x, "labelStyle", null)
      
      inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      inline def setMode(value: android | ios): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setPosition(value: leading | trailing): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setStatus(value: checked | unchecked): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setUncheckedColor(value: String): Self = StObject.set(x, "uncheckedColor", value.asInstanceOf[js.Any])
      
      inline def setUncheckedColorUndefined: Self = StObject.set(x, "uncheckedColor", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ComponentType[PickPropslabelstylecoloroAccessibilityLabel] & (NonReactStatics[
    ComponentType[Props] & CallHasValueLabelStyleLabelStyleOnPressDisabledColorUncheckedColorStatusHasColorsAccessibilityLabelTestIDModePosition, 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsRadioButtonRadioButtonItemMod.foo` */
  override def _to: ComponentType[PickPropslabelstylecoloroAccessibilityLabel] & (NonReactStatics[
    ComponentType[Props] & CallHasValueLabelStyleLabelStyleOnPressDisabledColorUncheckedColorStatusHasColorsAccessibilityLabelTestIDModePosition, 
    js.Object
  ]) = default
}
