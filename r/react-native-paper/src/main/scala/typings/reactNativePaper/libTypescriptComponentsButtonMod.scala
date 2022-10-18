package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNativePaper.anon.AccessibilityHint
import typings.reactNativePaper.anon.PickViewPropsRefAttributeAccessibilityIgnoresInvertColors
import typings.reactNativePaper.anon.PickthemeDeepPartialThemeAccessibilityLabelledBy
import typings.reactNativePaper.anon.PickthemeDeepPartialThemeAccessibilityLanguage
import typings.reactNativePaper.anon.ViewPropsRefAttributesVieAccessibilityIgnoresInvertColors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsButtonMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Button", JSImport.Default)
  @js.native
  val default: (ComponentType[
    PickthemeDeepPartialThemeAccessibilityLabelledBy | PickthemeDeepPartialThemeAccessibilityLanguage
  ]) & (NonReactStatics[
    ComponentType[Props] & (js.Function1[
      /* hasDisabledCompactModeDarkLoadingIconButtonColorChildrenUppercaseAccessibilityLabelAccessibilityHintOnPressOnLongPressStyleThemeContentStyleLabelStyleTestIDAccessibleRest */ Props, 
      Element
    ]), 
    js.Object
  ]) = js.native
  
  type Props = (ComponentProps[
    ComponentType[PickViewPropsRefAttributeAccessibilityIgnoresInvertColors] & (NonReactStatics[
      ComponentType[ViewPropsRefAttributesVieAccessibilityIgnoresInvertColors] & (js.Function1[
        /* hasStyleThemeRest */ typings.reactNativePaper.libTypescriptComponentsSurfaceMod.Props, 
        Element
      ]), 
      js.Object
    ])
  ]) & AccessibilityHint
  
  type _To = (ComponentType[
    PickthemeDeepPartialThemeAccessibilityLabelledBy | PickthemeDeepPartialThemeAccessibilityLanguage
  ]) & (NonReactStatics[
    ComponentType[Props] & (js.Function1[
      /* hasDisabledCompactModeDarkLoadingIconButtonColorChildrenUppercaseAccessibilityLabelAccessibilityHintOnPressOnLongPressStyleThemeContentStyleLabelStyleTestIDAccessibleRest */ Props, 
      Element
    ]), 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsButtonMod.foo` */
  override def _to: (ComponentType[
    PickthemeDeepPartialThemeAccessibilityLabelledBy | PickthemeDeepPartialThemeAccessibilityLanguage
  ]) & (NonReactStatics[
    ComponentType[Props] & (js.Function1[
      /* hasDisabledCompactModeDarkLoadingIconButtonColorChildrenUppercaseAccessibilityLabelAccessibilityHintOnPressOnLongPressStyleThemeContentStyleLabelStyleTestIDAccessibleRest */ Props, 
      Element
    ]), 
    js.Object
  ]) = default
}
