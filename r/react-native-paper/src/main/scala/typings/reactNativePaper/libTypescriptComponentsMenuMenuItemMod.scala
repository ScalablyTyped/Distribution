package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativePaper.anon.IconPropscolorstring
import typings.reactNativePaper.anon.PickPropsstyletitleonPresAccessibilityLabel
import typings.reactNativePaper.anon.`23`
import typings.reactNativePaper.libTypescriptComponentsIconMod.IconSource
import typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsMenuMenuItemMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Menu/MenuItem", JSImport.Default)
  @js.native
  val default: ComponentType[PickPropsstyletitleonPresAccessibilityLabel] & (NonReactStatics[ComponentType[Props] & `23`, js.Object]) = js.native
  
  trait Props extends StObject {
    
    /**
      * Accessibility label for the Touchable. This is read by the screen reader when the user taps the component.
      */
    var accessibilityLabel: js.UndefOr[String] = js.undefined
    
    var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * Whether the 'item' is disabled. A disabled 'item' is greyed out and `onPress` is not called on touch.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Icon to display for the `MenuItem`.
      */
    var icon: js.UndefOr[IconSource] = js.undefined
    
    /**
      * Function to execute on press.
      */
    var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * @optional
      */
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * TestID used for testing purposes
      */
    var testID: js.UndefOr[String] = js.undefined
    
    /**
      * @optional
      */
    var theme: Theme
    
    /**
      * Title text for the `MenuItem`.
      */
    var title: ReactNode
    
    var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  }
  object Props {
    
    inline def apply(theme: Theme): Props = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
      
      inline def setContentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      inline def setContentStyleNull: Self = StObject.set(x, "contentStyle", null)
      
      inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: IconSource): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconFunction1(value: /* props */ IconPropscolorstring => ReactNode): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: ImageURISource*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
      
      inline def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
      
      inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type _To = ComponentType[PickPropsstyletitleonPresAccessibilityLabel] & (NonReactStatics[ComponentType[Props] & `23`, js.Object])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsMenuMenuItemMod.foo` */
  override def _to: ComponentType[PickPropsstyletitleonPresAccessibilityLabel] & (NonReactStatics[ComponentType[Props] & `23`, js.Object]) = default
}
