package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ComponentType
import typings.reactNativePaper.anon.DisplayNameString
import typings.reactNativePaper.anon.Icon
import typings.reactNativePaper.anon.PickViewPropsRefAttributeAccessibilityActions
import typings.reactNativePaper.anon.TypeofView
import typings.reactNativePaper.anon.ViewPropsRefAttributesVieAccessibilityActions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsAvatarAvatarIconMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Avatar/AvatarIcon", JSImport.Default)
  @js.native
  val default: ComponentType[PickViewPropsRefAttributeAccessibilityActions] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessibilityActions] & DisplayNameString, 
    js.Object
  ]) = js.native
  
  type Props = ComponentPropsWithRef[TypeofView] & Icon
  
  type _To = ComponentType[PickViewPropsRefAttributeAccessibilityActions] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessibilityActions] & DisplayNameString, 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsAvatarAvatarIconMod.foo` */
  override def _to: ComponentType[PickViewPropsRefAttributeAccessibilityActions] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessibilityActions] & DisplayNameString, 
    js.Object
  ]) = default
}
