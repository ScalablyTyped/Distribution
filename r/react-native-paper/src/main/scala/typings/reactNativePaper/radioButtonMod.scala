package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.hoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNativePaper.anon.IOS
import typings.reactNativePaper.anon.PickPropscoloronPresstestColor
import typings.reactNativePaper.radioButtonRadioButtonMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioButtonMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/RadioButton", JSImport.Default)
  @js.native
  val default: ComponentType[PickPropscoloronPresstestColor] & (NonReactStatics[ComponentType[Props] & (js.Function1[/* props */ Props, Element]), js.Object]) & IOS = js.native
  
  type _To = ComponentType[PickPropscoloronPresstestColor] & (NonReactStatics[ComponentType[Props] & (js.Function1[/* props */ Props, Element]), js.Object]) & IOS
  
  /* This means you don't have to write `default`, but can instead just say `radioButtonMod.foo` */
  override def _to: ComponentType[PickPropscoloronPresstestColor] & (NonReactStatics[ComponentType[Props] & (js.Function1[/* props */ Props, Element]), js.Object]) & IOS = default
}
