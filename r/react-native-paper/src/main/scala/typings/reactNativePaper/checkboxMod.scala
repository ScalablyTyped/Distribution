package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.hoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNativePaper.anon.Android
import typings.reactNativePaper.anon.Pickstatuscheckedunchecke
import typings.reactNativePaper.anon.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Checkbox", JSImport.Default)
  @js.native
  val default: ComponentType[Pickstatuscheckedunchecke] & (NonReactStatics[ComponentType[Status] & (js.Function1[/* props */ Status, Element]), js.Object]) & Android = js.native
  
  type _To = ComponentType[Pickstatuscheckedunchecke] & (NonReactStatics[ComponentType[Status] & (js.Function1[/* props */ Status, Element]), js.Object]) & Android
  
  /* This means you don't have to write `default`, but can instead just say `checkboxMod.foo` */
  override def _to: ComponentType[Pickstatuscheckedunchecke] & (NonReactStatics[ComponentType[Status] & (js.Function1[/* props */ Status, Element]), js.Object]) & Android = default
}
