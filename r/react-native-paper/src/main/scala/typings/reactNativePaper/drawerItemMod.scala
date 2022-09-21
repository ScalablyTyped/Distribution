package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.hoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ComponentType
import typings.reactNativePaper.anon.Active
import typings.reactNativePaper.anon.CallHasIconLabelActiveThemeStyleOnPressAccessibilityLabelRightRest
import typings.reactNativePaper.anon.PickViewPropsRefAttributeAccessibilityRole
import typings.reactNativePaper.anon.TypeofView
import typings.reactNativePaper.anon.ViewPropsRefAttributesVieAccessibilityState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerItemMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Drawer/DrawerItem", JSImport.Default)
  @js.native
  val default: ComponentType[PickViewPropsRefAttributeAccessibilityRole] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessibilityState] & CallHasIconLabelActiveThemeStyleOnPressAccessibilityLabelRightRest, 
    js.Object
  ]) = js.native
  
  type Props = ComponentPropsWithRef[TypeofView] & Active
  
  type _To = ComponentType[PickViewPropsRefAttributeAccessibilityRole] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessibilityState] & CallHasIconLabelActiveThemeStyleOnPressAccessibilityLabelRightRest, 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `drawerItemMod.foo` */
  override def _to: ComponentType[PickViewPropsRefAttributeAccessibilityRole] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessibilityState] & CallHasIconLabelActiveThemeStyleOnPressAccessibilityLabelRightRest, 
    js.Object
  ]) = default
}
