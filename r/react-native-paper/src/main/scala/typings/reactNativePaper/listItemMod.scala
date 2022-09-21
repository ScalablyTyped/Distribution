package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.hoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactNativePaper.anon.Call
import typings.reactNativePaper.anon.CallHasLeftRightTitleDescriptionOnPressThemeStyleTitleStyleTitleNumberOfLinesDescriptionNumberOfLinesTitleEllipsizeModeDescriptionEllipsizeModeDescriptionStyleRest
import typings.reactNativePaper.anon.EllipsizeMode
import typings.reactNativePaper.anon.PickRemoveChildrenComponeAccessibilityViewIsModal
import typings.reactNativePaper.anon.PickTouchableWithoutFeedb
import typings.reactNativePaper.anon.Supported
import typings.reactNativePaper.anon.TouchableWithoutFeedbackP
import typings.reactNativePaper.typescriptTypesMod.RemoveChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/List/ListItem", JSImport.Default)
  @js.native
  val default: ComponentType[PickRemoveChildrenComponeAccessibilityViewIsModal] & (NonReactStatics[
    (ComponentType[
      (RemoveChildren[
        ComponentType[PickTouchableWithoutFeedb] & (NonReactStatics[ComponentType[TouchableWithoutFeedbackP] & Call, js.Object])
      ]) & typings.reactNativePaper.anon.Description
    ]) & CallHasLeftRightTitleDescriptionOnPressThemeStyleTitleStyleTitleNumberOfLinesDescriptionNumberOfLinesTitleEllipsizeModeDescriptionEllipsizeModeDescriptionStyleRest, 
    js.Object
  ]) = js.native
  
  type Description = ReactNode | (js.Function1[/* props */ EllipsizeMode, ReactNode])
  
  type Props = (RemoveChildren[
    ComponentType[PickTouchableWithoutFeedb] & (NonReactStatics[ComponentType[TouchableWithoutFeedbackP] & Supported, js.Object])
  ]) & typings.reactNativePaper.anon.Description
  
  type Title = ReactNode | (js.Function1[/* props */ EllipsizeMode, ReactNode])
  
  type _To = ComponentType[PickRemoveChildrenComponeAccessibilityViewIsModal] & (NonReactStatics[
    (ComponentType[
      (RemoveChildren[
        ComponentType[PickTouchableWithoutFeedb] & (NonReactStatics[ComponentType[TouchableWithoutFeedbackP] & Call, js.Object])
      ]) & typings.reactNativePaper.anon.Description
    ]) & CallHasLeftRightTitleDescriptionOnPressThemeStyleTitleStyleTitleNumberOfLinesDescriptionNumberOfLinesTitleEllipsizeModeDescriptionEllipsizeModeDescriptionStyleRest, 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `listItemMod.foo` */
  override def _to: ComponentType[PickRemoveChildrenComponeAccessibilityViewIsModal] & (NonReactStatics[
    (ComponentType[
      (RemoveChildren[
        ComponentType[PickTouchableWithoutFeedb] & (NonReactStatics[ComponentType[TouchableWithoutFeedbackP] & Call, js.Object])
      ]) & typings.reactNativePaper.anon.Description
    ]) & CallHasLeftRightTitleDescriptionOnPressThemeStyleTitleStyleTitleNumberOfLinesDescriptionNumberOfLinesTitleEllipsizeModeDescriptionEllipsizeModeDescriptionStyleRest, 
    js.Object
  ]) = default
}
