package typings.reactNativePaper

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.hoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.Switch
import typings.reactNativePaper.anon.ColorDisabled
import typings.reactNativePaper.anon.PickSwitchPropsRefAttribu
import typings.reactNativePaper.anon.SwitchPropsRefAttributesS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switchMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Switch", JSImport.Default)
  @js.native
  val default: ComponentType[PickSwitchPropsRefAttribu] & (NonReactStatics[
    ComponentType[SwitchPropsRefAttributesS] & (js.Function1[/* hasValueDisabledOnValueChangeColorThemeRest */ Props, Element]), 
    js.Object
  ]) = js.native
  
  type Props = ComponentPropsWithRef[Instantiable0[Switch]] & ColorDisabled
  
  type _To = ComponentType[PickSwitchPropsRefAttribu] & (NonReactStatics[
    ComponentType[SwitchPropsRefAttributesS] & (js.Function1[/* hasValueDisabledOnValueChangeColorThemeRest */ Props, Element]), 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `switchMod.foo` */
  override def _to: ComponentType[PickSwitchPropsRefAttribu] & (NonReactStatics[
    ComponentType[SwitchPropsRefAttributesS] & (js.Function1[/* hasValueDisabledOnValueChangeColorThemeRest */ Props, Element]), 
    js.Object
  ]) = default
}
