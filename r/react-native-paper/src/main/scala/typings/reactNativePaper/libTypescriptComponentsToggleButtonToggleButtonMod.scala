package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativePaper.anon.IconPropscolorstring
import typings.reactNativePaper.anon.PickPropsstylecolorsizeon
import typings.reactNativePaper.libTypescriptComponentsIconMod.IconSource
import typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
import typings.reactNativePaper.reactNativePaperStrings.checked
import typings.reactNativePaper.reactNativePaperStrings.unchecked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsToggleButtonToggleButtonMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/ToggleButton/ToggleButton", JSImport.Default)
  @js.native
  val default: ComponentType[PickPropsstylecolorsizeon] & (NonReactStatics[
    ComponentType[Props] & (js.Function1[
      /* hasIconSizeThemeAccessibilityLabelDisabledStyleValueStatusOnPressRest */ Props, 
      Element
    ]), 
    js.Object
  ]) = js.native
  
  @JSImport("react-native-paper/lib/typescript/components/ToggleButton/ToggleButton", "ToggleButton")
  @js.native
  val ToggleButton: ComponentType[PickPropsstylecolorsizeon] & (NonReactStatics[
    ComponentType[Props] & (js.Function1[
      /* hasIconSizeThemeAccessibilityLabelDisabledStyleValueStatusOnPressRest */ Props, 
      Element
    ]), 
    js.Object
  ]) = js.native
  
  trait Props extends StObject {
    
    /**
      * Accessibility label for the `ToggleButton`. This is read by the screen reader when the user taps the button.
      */
    var accessibilityLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Custom text color for button.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the button is disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Icon to display for the `ToggleButton`.
      */
    var icon: IconSource
    
    /**
      * Function to execute on press.
      */
    var onPress: js.UndefOr[js.Function1[/* value */ js.UndefOr[GestureResponderEvent | String], Unit]] = js.undefined
    
    /**
      * Size of the icon.
      */
    var size: js.UndefOr[Double] = js.undefined
    
    /**
      * Status of button.
      */
    var status: js.UndefOr[checked | unchecked] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * @optional
      */
    var theme: Theme
    
    /**
      * Value of button.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object Props {
    
    inline def apply(icon: IconSource, theme: Theme): Props = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: IconSource): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconFunction1(value: /* props */ IconPropscolorstring => ReactNode): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      inline def setIconVarargs(value: ImageURISource*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setOnPress(value: /* value */ js.UndefOr[GestureResponderEvent | String] => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStatus(value: checked | unchecked): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = ComponentType[PickPropsstylecolorsizeon] & (NonReactStatics[
    ComponentType[Props] & (js.Function1[
      /* hasIconSizeThemeAccessibilityLabelDisabledStyleValueStatusOnPressRest */ Props, 
      Element
    ]), 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsToggleButtonToggleButtonMod.foo` */
  override def _to: ComponentType[PickPropsstylecolorsizeon] & (NonReactStatics[
    ComponentType[Props] & (js.Function1[
      /* hasIconSizeThemeAccessibilityLabelDisabledStyleValueStatusOnPressRest */ Props, 
      Element
    ]), 
    js.Object
  ]) = default
}
