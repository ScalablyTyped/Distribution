package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNativePaper.anon.Inset
import typings.reactNativePaper.anon.PickRemoveChildrenforceToAccessibilityElementsHidden
import typings.reactNativePaper.anon.TypeofView
import typings.reactNativePaper.libTypescriptTypesMod.RemoveChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsDividerMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Divider", JSImport.Default)
  @js.native
  val default: ComponentType[PickRemoveChildrenforceToAccessibilityElementsHidden] & (NonReactStatics[
    (ComponentType[RemoveChildren[TypeofView] & Inset]) & (js.Function1[/* param0 */ Props, Element]), 
    js.Object
  ]) = js.native
  
  type Props = RemoveChildren[TypeofView] & Inset
  
  type _To = ComponentType[PickRemoveChildrenforceToAccessibilityElementsHidden] & (NonReactStatics[
    (ComponentType[RemoveChildren[TypeofView] & Inset]) & (js.Function1[/* param0 */ Props, Element]), 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsDividerMod.foo` */
  override def _to: ComponentType[PickRemoveChildrenforceToAccessibilityElementsHidden] & (NonReactStatics[
    (ComponentType[RemoveChildren[TypeofView] & Inset]) & (js.Function1[/* param0 */ Props, Element]), 
    js.Object
  ]) = default
}
