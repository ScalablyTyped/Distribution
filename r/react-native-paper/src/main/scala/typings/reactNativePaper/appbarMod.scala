package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.hoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNativePaper.anon.Action
import typings.reactNativePaper.anon.PartialViewPropsRefAttrib
import typings.reactNativePaper.anon.PickPartialViewPropsRefAt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appbarMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Appbar", JSImport.Default)
  @js.native
  val default: ComponentType[PickPartialViewPropsRefAt] & (NonReactStatics[
    ComponentType[PartialViewPropsRefAttrib] & (js.Function1[/* hasChildrenDarkStyleThemeRest */ PartialViewPropsRefAttrib, Element]), 
    js.Object
  ]) & Action = js.native
  
  type _To = ComponentType[PickPartialViewPropsRefAt] & (NonReactStatics[
    ComponentType[PartialViewPropsRefAttrib] & (js.Function1[/* hasChildrenDarkStyleThemeRest */ PartialViewPropsRefAttrib, Element]), 
    js.Object
  ]) & Action
  
  /* This means you don't have to write `default`, but can instead just say `appbarMod.foo` */
  override def _to: ComponentType[PickPartialViewPropsRefAt] & (NonReactStatics[
    ComponentType[PartialViewPropsRefAttrib] & (js.Function1[/* hasChildrenDarkStyleThemeRest */ PartialViewPropsRefAttrib, Element]), 
    js.Object
  ]) & Action = default
}
