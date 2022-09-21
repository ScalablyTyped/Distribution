package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.hoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNativePaper.anon.Indeterminate
import typings.reactNativePaper.anon.PickViewPropsRefAttributeAccessibilityViewIsModal
import typings.reactNativePaper.anon.TypeofView
import typings.reactNativePaper.anon.ViewPropsRefAttributesVieAccessible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressBarMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/ProgressBar", JSImport.Default)
  @js.native
  val default: ComponentType[PickViewPropsRefAttributeAccessibilityViewIsModal] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessible] & (js.Function1[/* hasColorIndeterminateStyleProgressVisibleThemeRest */ Props, Element]), 
    js.Object
  ]) = js.native
  
  type Props = ComponentPropsWithRef[TypeofView] & Indeterminate
  
  type _To = ComponentType[PickViewPropsRefAttributeAccessibilityViewIsModal] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessible] & (js.Function1[/* hasColorIndeterminateStyleProgressVisibleThemeRest */ Props, Element]), 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `progressBarMod.foo` */
  override def _to: ComponentType[PickViewPropsRefAttributeAccessibilityViewIsModal] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessible] & (js.Function1[/* hasColorIndeterminateStyleProgressVisibleThemeRest */ Props, Element]), 
    js.Object
  ]) = default
}
