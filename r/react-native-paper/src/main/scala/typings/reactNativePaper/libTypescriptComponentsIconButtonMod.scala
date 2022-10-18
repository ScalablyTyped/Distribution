package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNativePaper.anon.AccessibilityLabel
import typings.reactNativePaper.anon.Call
import typings.reactNativePaper.anon.PickRemoveChildrenCompone
import typings.reactNativePaper.anon.PickTouchableWithoutFeedb
import typings.reactNativePaper.anon.TouchableWithoutFeedbackP
import typings.reactNativePaper.libTypescriptTypesMod.RemoveChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsIconButtonMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/IconButton", JSImport.Default)
  @js.native
  val default: ComponentType[PickRemoveChildrenCompone] & (NonReactStatics[
    (ComponentType[
      (RemoveChildren[
        ComponentType[PickTouchableWithoutFeedb] & (NonReactStatics[ComponentType[TouchableWithoutFeedbackP] & Call, js.Object])
      ]) & AccessibilityLabel
    ]) & (js.Function1[
      /* hasIconCustomColorSizeAccessibilityLabelDisabledOnPressAnimatedThemeStyleRest */ Props, 
      Element
    ]), 
    js.Object
  ]) = js.native
  
  type Props = (RemoveChildren[
    ComponentType[PickTouchableWithoutFeedb] & (NonReactStatics[ComponentType[TouchableWithoutFeedbackP] & Call, js.Object])
  ]) & AccessibilityLabel
  
  type _To = ComponentType[PickRemoveChildrenCompone] & (NonReactStatics[
    (ComponentType[
      (RemoveChildren[
        ComponentType[PickTouchableWithoutFeedb] & (NonReactStatics[ComponentType[TouchableWithoutFeedbackP] & Call, js.Object])
      ]) & AccessibilityLabel
    ]) & (js.Function1[
      /* hasIconCustomColorSizeAccessibilityLabelDisabledOnPressAnimatedThemeStyleRest */ Props, 
      Element
    ]), 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsIconButtonMod.foo` */
  override def _to: ComponentType[PickRemoveChildrenCompone] & (NonReactStatics[
    (ComponentType[
      (RemoveChildren[
        ComponentType[PickTouchableWithoutFeedb] & (NonReactStatics[ComponentType[TouchableWithoutFeedbackP] & Call, js.Object])
      ]) & AccessibilityLabel
    ]) & (js.Function1[
      /* hasIconCustomColorSizeAccessibilityLabelDisabledOnPressAnimatedThemeStyleRest */ Props, 
      Element
    ]), 
    js.Object
  ]) = default
}
