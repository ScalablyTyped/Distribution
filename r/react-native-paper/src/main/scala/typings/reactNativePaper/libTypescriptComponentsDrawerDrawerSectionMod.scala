package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ComponentType
import typings.reactNativePaper.anon.CallHasChildrenTitleThemeStyleRest
import typings.reactNativePaper.anon.PickViewPropsRefAttributeAccessibilityState
import typings.reactNativePaper.anon.Title
import typings.reactNativePaper.anon.TypeofView
import typings.reactNativePaper.anon.ViewPropsRefAttributesVieAccessibilityRole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsDrawerDrawerSectionMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Drawer/DrawerSection", JSImport.Default)
  @js.native
  val default: ComponentType[PickViewPropsRefAttributeAccessibilityState] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessibilityRole] & CallHasChildrenTitleThemeStyleRest, 
    js.Object
  ]) = js.native
  
  type Props = ComponentPropsWithRef[TypeofView] & Title
  
  type _To = ComponentType[PickViewPropsRefAttributeAccessibilityState] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessibilityRole] & CallHasChildrenTitleThemeStyleRest, 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsDrawerDrawerSectionMod.foo` */
  override def _to: ComponentType[PickViewPropsRefAttributeAccessibilityState] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessibilityRole] & CallHasChildrenTitleThemeStyleRest, 
    js.Object
  ]) = default
}
