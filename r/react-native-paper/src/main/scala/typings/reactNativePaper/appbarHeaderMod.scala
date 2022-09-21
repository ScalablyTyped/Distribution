package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.hoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNativePaper.anon.CallProps
import typings.reactNativePaper.anon.Dark
import typings.reactNativePaper.anon.PartialViewPropsRefAttrib
import typings.reactNativePaper.anon.PickPartialViewPropsRefAt
import typings.reactNativePaper.anon.PickthemeDeepPartialTheme
import typings.reactNativePaper.anon.PickthemeDeepPartialThemeAccessibilityActions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appbarHeaderMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Appbar/AppbarHeader", JSImport.Default)
  @js.native
  val default: (ComponentType[PickthemeDeepPartialTheme | PickthemeDeepPartialThemeAccessibilityActions]) & (NonReactStatics[ComponentType[Props] & CallProps, js.Object]) = js.native
  
  @JSImport("react-native-paper/lib/typescript/components/Appbar/AppbarHeader", "AppbarHeader")
  @js.native
  val AppbarHeader: (ComponentType[PickthemeDeepPartialTheme | PickthemeDeepPartialThemeAccessibilityActions]) & (NonReactStatics[ComponentType[Props] & CallProps, js.Object]) = js.native
  
  type Props = (ComponentProps[
    ComponentType[PickPartialViewPropsRefAt] & (NonReactStatics[
      ComponentType[PartialViewPropsRefAttrib] & (js.Function1[
        /* hasChildrenDarkStyleThemeRest */ typings.reactNativePaper.appbarAppbarMod.Props, 
        Element
      ]), 
      js.Object
    ])
  ]) & Dark
  
  type _To = (ComponentType[PickthemeDeepPartialTheme | PickthemeDeepPartialThemeAccessibilityActions]) & (NonReactStatics[ComponentType[Props] & CallProps, js.Object])
  
  /* This means you don't have to write `default`, but can instead just say `appbarHeaderMod.foo` */
  override def _to: (ComponentType[PickthemeDeepPartialTheme | PickthemeDeepPartialThemeAccessibilityActions]) & (NonReactStatics[ComponentType[Props] & CallProps, js.Object]) = default
}
