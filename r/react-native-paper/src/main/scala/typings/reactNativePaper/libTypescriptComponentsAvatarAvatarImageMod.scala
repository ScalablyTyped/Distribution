package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNativePaper.anon.CallHasSizeSourceStyleOnErrorOnLayoutOnLoadOnLoadEndOnLoadStartOnProgressThemeRest
import typings.reactNativePaper.anon.OnError
import typings.reactNativePaper.anon.PickViewPropsRefAttributeAccessibilityElementsHidden
import typings.reactNativePaper.anon.SizeNumber
import typings.reactNativePaper.anon.TypeofView
import typings.reactNativePaper.anon.ViewPropsRefAttributesVieAccessibilityElementsHidden
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsAvatarAvatarImageMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Avatar/AvatarImage", JSImport.Default)
  @js.native
  val default: ComponentType[PickViewPropsRefAttributeAccessibilityElementsHidden] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessibilityElementsHidden] & CallHasSizeSourceStyleOnErrorOnLayoutOnLoadOnLoadEndOnLoadStartOnProgressThemeRest, 
    js.Object
  ]) = js.native
  
  type AvatarImageSource = ImageSourcePropType | (js.Function1[/* props */ SizeNumber, ReactNode])
  
  type Props = ComponentPropsWithRef[TypeofView] & OnError
  
  type _To = ComponentType[PickViewPropsRefAttributeAccessibilityElementsHidden] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessibilityElementsHidden] & CallHasSizeSourceStyleOnErrorOnLayoutOnLoadOnLoadEndOnLoadStartOnProgressThemeRest, 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsAvatarAvatarImageMod.foo` */
  override def _to: ComponentType[PickViewPropsRefAttributeAccessibilityElementsHidden] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessibilityElementsHidden] & CallHasSizeSourceStyleOnErrorOnLayoutOnLoadOnLoadEndOnLoadStartOnProgressThemeRest, 
    js.Object
  ]) = default
}
