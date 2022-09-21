package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.hoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNativePaper.anon.Avatar
import typings.reactNativePaper.anon.PickViewPropsRefAttributeAccessibilityIgnoresInvertColors
import typings.reactNativePaper.anon.PickthemeDeepPartialThemeAccessible
import typings.reactNativePaper.anon.PickthemeDeepPartialThemeAvatar
import typings.reactNativePaper.anon.ViewPropsRefAttributesVieAccessibilityIgnoresInvertColors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Chip", JSImport.Default)
  @js.native
  val default: (ComponentType[PickthemeDeepPartialThemeAccessible | PickthemeDeepPartialThemeAvatar]) & (NonReactStatics[
    ComponentType[Props] & (js.Function1[
      /* hasModeChildrenIconAvatarSelectedDisabledAccessibilityLabelCloseIconAccessibilityLabelOnPressOnLongPressOnCloseCloseIconTextStyleStyleThemeTestIDSelectedColorEllipsizeModeRest */ Props, 
      Element
    ]), 
    js.Object
  ]) = js.native
  
  type Props = (ComponentProps[
    ComponentType[PickViewPropsRefAttributeAccessibilityIgnoresInvertColors] & (NonReactStatics[
      ComponentType[ViewPropsRefAttributesVieAccessibilityIgnoresInvertColors] & (js.Function1[/* hasStyleThemeRest */ typings.reactNativePaper.surfaceMod.Props, Element]), 
      js.Object
    ])
  ]) & Avatar
  
  type _To = (ComponentType[PickthemeDeepPartialThemeAccessible | PickthemeDeepPartialThemeAvatar]) & (NonReactStatics[
    ComponentType[Props] & (js.Function1[
      /* hasModeChildrenIconAvatarSelectedDisabledAccessibilityLabelCloseIconAccessibilityLabelOnPressOnLongPressOnCloseCloseIconTextStyleStyleThemeTestIDSelectedColorEllipsizeModeRest */ Props, 
      Element
    ]), 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `chipMod.foo` */
  override def _to: (ComponentType[PickthemeDeepPartialThemeAccessible | PickthemeDeepPartialThemeAvatar]) & (NonReactStatics[
    ComponentType[Props] & (js.Function1[
      /* hasModeChildrenIconAvatarSelectedDisabledAccessibilityLabelCloseIconAccessibilityLabelOnPressOnLongPressOnCloseCloseIconTextStyleStyleThemeTestIDSelectedColorEllipsizeModeRest */ Props, 
      Element
    ]), 
    js.Object
  ]) = default
}
