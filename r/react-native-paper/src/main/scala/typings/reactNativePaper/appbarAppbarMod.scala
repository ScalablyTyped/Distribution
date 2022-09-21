package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.hoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNativePaper.anon.Children
import typings.reactNativePaper.anon.PartialViewPropsRefAttrib
import typings.reactNativePaper.anon.PickPartialViewPropsRefAt
import typings.reactNativePaper.anon.TypeofView
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appbarAppbarMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Appbar/Appbar", JSImport.Default)
  @js.native
  val default: ComponentType[PickPartialViewPropsRefAt] & (NonReactStatics[
    ComponentType[PartialViewPropsRefAttrib] & (js.Function1[/* hasChildrenDarkStyleThemeRest */ Props, Element]), 
    js.Object
  ]) = js.native
  
  @JSImport("react-native-paper/lib/typescript/components/Appbar/Appbar", "Appbar")
  @js.native
  val Appbar: ComponentType[PickPartialViewPropsRefAt] & (NonReactStatics[
    ComponentType[PartialViewPropsRefAttrib] & (js.Function1[/* hasChildrenDarkStyleThemeRest */ Props, Element]), 
    js.Object
  ]) = js.native
  
  @JSImport("react-native-paper/lib/typescript/components/Appbar/Appbar", "DEFAULT_APPBAR_HEIGHT")
  @js.native
  val DEFAULT_APPBAR_HEIGHT: /* 56 */ Double = js.native
  
  type Props = Partial[ComponentPropsWithRef[TypeofView]] & Children
  
  type _To = ComponentType[PickPartialViewPropsRefAt] & (NonReactStatics[
    ComponentType[PartialViewPropsRefAttrib] & (js.Function1[/* hasChildrenDarkStyleThemeRest */ Props, Element]), 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `appbarAppbarMod.foo` */
  override def _to: ComponentType[PickPartialViewPropsRefAt] & (NonReactStatics[
    ComponentType[PartialViewPropsRefAttrib] & (js.Function1[/* hasChildrenDarkStyleThemeRest */ Props, Element]), 
    js.Object
  ]) = default
}
