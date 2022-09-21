package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.hoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNativePaper.anon.PickPropscoloronPresstestColor
import typings.reactNativePaper.reactNativePaperStrings.checked
import typings.reactNativePaper.reactNativePaperStrings.unchecked
import typings.reactNativePaper.typescriptTypesMod.global.ReactNativePaper.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioButtonRadioButtonMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/RadioButton/RadioButton", JSImport.Default)
  @js.native
  val default: ComponentType[PickPropscoloronPresstestColor] & (NonReactStatics[ComponentType[Props] & (js.Function1[/* props */ Props, Element]), js.Object]) = js.native
  
  @JSImport("react-native-paper/lib/typescript/components/RadioButton/RadioButton", "RadioButton")
  @js.native
  val RadioButton: ComponentType[PickPropscoloronPresstestColor] & (NonReactStatics[ComponentType[Props] & (js.Function1[/* props */ Props, Element]), js.Object]) = js.native
  
  trait Props extends StObject {
    
    /**
      * Custom color for radio.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Whether radio is disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Function to execute on press.
      */
    var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Status of radio button.
      */
    var status: js.UndefOr[checked | unchecked] = js.undefined
    
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
      * Value of the radio button
      */
    var value: String
  }
  object Props {
    
    inline def apply(theme: Theme, value: String): Props = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setStatus(value: checked | unchecked): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setUncheckedColor(value: String): Self = StObject.set(x, "uncheckedColor", value.asInstanceOf[js.Any])
      
      inline def setUncheckedColorUndefined: Self = StObject.set(x, "uncheckedColor", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ComponentType[PickPropscoloronPresstestColor] & (NonReactStatics[ComponentType[Props] & (js.Function1[/* props */ Props, Element]), js.Object])
  
  /* This means you don't have to write `default`, but can instead just say `radioButtonRadioButtonMod.foo` */
  override def _to: ComponentType[PickPropscoloronPresstestColor] & (NonReactStatics[ComponentType[Props] & (js.Function1[/* props */ Props, Element]), js.Object]) = default
}
