package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.hoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNativePaper.anon.AccessibilityHint
import typings.reactNativePaper.anon.PickViewPropsRefAttributeAccessibilityIgnoresInvertColors
import typings.reactNativePaper.anon.PickthemeDeepPartialThemeAccessibilityLanguage
import typings.reactNativePaper.anon.PickthemeDeepPartialThemeAccessibilityLiveRegion
import typings.reactNativePaper.anon.ViewPropsRefAttributesVieAccessibilityIgnoresInvertColors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Button", JSImport.Default)
  @js.native
  val default: (ComponentType[
    PickthemeDeepPartialThemeAccessibilityLanguage | PickthemeDeepPartialThemeAccessibilityLiveRegion
  ]) & (NonReactStatics[
    ComponentType[Props] & (js.Function1[
      /* hasDisabledCompactModeDarkLoadingIconButtonColorChildrenUppercaseAccessibilityLabelAccessibilityHintOnPressOnLongPressStyleThemeContentStyleLabelStyleTestIDAccessibleRest */ Props, 
      Element
    ]), 
    js.Object
  ]) = js.native
  
  type Props = (ComponentProps[
    ComponentType[PickViewPropsRefAttributeAccessibilityIgnoresInvertColors] & (NonReactStatics[
      ComponentType[ViewPropsRefAttributesVieAccessibilityIgnoresInvertColors] & (js.Function1[/* hasStyleThemeRest */ typings.reactNativePaper.surfaceMod.Props, Element]), 
      js.Object
    ])
  ]) & AccessibilityHint
  
  type _To = (ComponentType[
    PickthemeDeepPartialThemeAccessibilityLanguage | PickthemeDeepPartialThemeAccessibilityLiveRegion
  ]) & (NonReactStatics[
    ComponentType[Props] & (js.Function1[
      /* hasDisabledCompactModeDarkLoadingIconButtonColorChildrenUppercaseAccessibilityLabelAccessibilityHintOnPressOnLongPressStyleThemeContentStyleLabelStyleTestIDAccessibleRest */ Props, 
      Element
    ]), 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `buttonMod.foo` */
  override def _to: (ComponentType[
    PickthemeDeepPartialThemeAccessibilityLanguage | PickthemeDeepPartialThemeAccessibilityLiveRegion
  ]) & (NonReactStatics[
    ComponentType[Props] & (js.Function1[
      /* hasDisabledCompactModeDarkLoadingIconButtonColorChildrenUppercaseAccessibilityLabelAccessibilityHintOnPressOnLongPressStyleThemeContentStyleLabelStyleTestIDAccessibleRest */ Props, 
      Element
    ]), 
    js.Object
  ]) = default
}
