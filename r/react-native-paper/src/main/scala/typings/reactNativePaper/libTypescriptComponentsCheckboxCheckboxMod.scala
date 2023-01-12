package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNativePaper.anon.PickPropscoloronPresstest
import typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
import typings.reactNativePaper.reactNativePaperStrings.checked
import typings.reactNativePaper.reactNativePaperStrings.indeterminate
import typings.reactNativePaper.reactNativePaperStrings.unchecked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsCheckboxCheckboxMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Checkbox/Checkbox", JSImport.Default)
  @js.native
  val default: ComponentType[PickPropscoloronPresstest] & (NonReactStatics[ComponentType[Props] & (js.Function1[/* props */ Props, Element]), js.Object]) = js.native
  
  @JSImport("react-native-paper/lib/typescript/components/Checkbox/Checkbox", "Checkbox")
  @js.native
  val Checkbox: ComponentType[PickPropscoloronPresstest] & (NonReactStatics[ComponentType[Props] & (js.Function1[/* props */ Props, Element]), js.Object]) = js.native
  
  trait Props extends StObject {
    
    /**
      * Custom color for checkbox.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Whether checkbox is disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Function to execute on press.
      */
    var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Status of checkbox.
      */
    var status: checked | unchecked | indeterminate
    
    /**
      * testID to be used on tests.
      */
    var testID: js.UndefOr[String] = js.undefined
    
    /**
      * @optional
      */
    var theme: Theme
    
    /**
      * Custom color for unchecked checkbox.
      */
    var uncheckedColor: js.UndefOr[String] = js.undefined
  }
  object Props {
    
    inline def apply(status: checked | unchecked | indeterminate, theme: Theme): Props = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setStatus(value: checked | unchecked | indeterminate): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setUncheckedColor(value: String): Self = StObject.set(x, "uncheckedColor", value.asInstanceOf[js.Any])
      
      inline def setUncheckedColorUndefined: Self = StObject.set(x, "uncheckedColor", js.undefined)
    }
  }
  
  type _To = ComponentType[PickPropscoloronPresstest] & (NonReactStatics[ComponentType[Props] & (js.Function1[/* props */ Props, Element]), js.Object])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsCheckboxCheckboxMod.foo` */
  override def _to: ComponentType[PickPropscoloronPresstest] & (NonReactStatics[ComponentType[Props] & (js.Function1[/* props */ Props, Element]), js.Object]) = default
}
