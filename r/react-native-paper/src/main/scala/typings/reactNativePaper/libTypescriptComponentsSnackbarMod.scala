package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNativePaper.anon.DURATIONLONG
import typings.reactNativePaper.anon.Duration
import typings.reactNativePaper.anon.PickViewPropsRefAttributeAccessibilityIgnoresInvertColors
import typings.reactNativePaper.anon.PickthemeDeepPartialThemeAction
import typings.reactNativePaper.anon.PickthemeDeepPartialThemeChildren
import typings.reactNativePaper.anon.ViewPropsRefAttributesVieAccessibilityIgnoresInvertColors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsSnackbarMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Snackbar", JSImport.Default)
  @js.native
  val default: (ComponentType[PickthemeDeepPartialThemeAction | PickthemeDeepPartialThemeChildren]) & (NonReactStatics[ComponentType[Props] & DURATIONLONG, js.Object]) = js.native
  
  type Props = (ComponentProps[
    ComponentType[PickViewPropsRefAttributeAccessibilityIgnoresInvertColors] & (NonReactStatics[
      ComponentType[ViewPropsRefAttributesVieAccessibilityIgnoresInvertColors] & (js.Function1[
        /* hasStyleThemeRest */ typings.reactNativePaper.libTypescriptComponentsSurfaceMod.Props, 
        Element
      ]), 
      js.Object
    ])
  ]) & Duration
  
  type _To = (ComponentType[PickthemeDeepPartialThemeAction | PickthemeDeepPartialThemeChildren]) & (NonReactStatics[ComponentType[Props] & DURATIONLONG, js.Object])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsSnackbarMod.foo` */
  override def _to: (ComponentType[PickthemeDeepPartialThemeAction | PickthemeDeepPartialThemeChildren]) & (NonReactStatics[ComponentType[Props] & DURATIONLONG, js.Object]) = default
}
