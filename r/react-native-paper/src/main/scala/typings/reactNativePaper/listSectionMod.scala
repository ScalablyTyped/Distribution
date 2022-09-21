package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.hoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ComponentType
import typings.reactNativePaper.anon.CallHasChildrenTitleTitleStyleStyleRest
import typings.reactNativePaper.anon.PickViewPropsRefAttributeAccessibilityValue
import typings.reactNativePaper.anon.TitleStyle
import typings.reactNativePaper.anon.TypeofView
import typings.reactNativePaper.anon.ViewPropsRefAttributesVieAccessibilityViewIsModal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listSectionMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/List/ListSection", JSImport.Default)
  @js.native
  val default: ComponentType[PickViewPropsRefAttributeAccessibilityValue] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessibilityViewIsModal] & CallHasChildrenTitleTitleStyleStyleRest, 
    js.Object
  ]) = js.native
  
  type Props = ComponentPropsWithRef[TypeofView] & TitleStyle
  
  type _To = ComponentType[PickViewPropsRefAttributeAccessibilityValue] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessibilityViewIsModal] & CallHasChildrenTitleTitleStyleStyleRest, 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `listSectionMod.foo` */
  override def _to: ComponentType[PickViewPropsRefAttributeAccessibilityValue] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessibilityViewIsModal] & CallHasChildrenTitleTitleStyleStyleRest, 
    js.Object
  ]) = default
}
