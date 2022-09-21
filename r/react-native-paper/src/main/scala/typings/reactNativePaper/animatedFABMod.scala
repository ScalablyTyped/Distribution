package typings.reactNativePaper

import typings.callstackReactThemeProvider.hoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNativePaper.animatedFABAnimatedFABMod.Props
import typings.reactNativePaper.anon.AccessibilityState
import typings.reactNativePaper.anon.PickRemoveChildrenComponeAccessibilityState
import typings.reactNativePaper.anon.PickViewPropsRefAttributeAccessibilityIgnoresInvertColors
import typings.reactNativePaper.anon.ViewPropsRefAttributesVieAccessibilityIgnoresInvertColors
import typings.reactNativePaper.typescriptTypesMod.RemoveChildren
import typings.reactNativePaper.utilsMod.CombinedStyles
import typings.reactNativePaper.utilsMod.GetCombinedStylesProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animatedFABMod {
  
  @JSImport("react-native-paper/lib/typescript/components/FAB/AnimatedFAB", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-paper/lib/typescript/components/FAB/AnimatedFAB", JSImport.Default)
  @js.native
  val default: ComponentType[PickRemoveChildrenComponeAccessibilityState] & (NonReactStatics[
    (ComponentType[
      (RemoveChildren[
        ComponentType[PickViewPropsRefAttributeAccessibilityIgnoresInvertColors] & (NonReactStatics[
          ComponentType[ViewPropsRefAttributesVieAccessibilityIgnoresInvertColors] & (js.Function1[
            /* hasStyleThemeRest */ ViewPropsRefAttributesVieAccessibilityIgnoresInvertColors, 
            Element
          ]), 
          js.Object
        ])
      ]) & AccessibilityState
    ]) & (js.Function1[
      /* hasIconLabelAccessibilityLabelAccessibilityStateCustomColorDisabledOnPressOnLongPressThemeStyleVisibleUppercaseTestIDAnimateFromExtendedIconModeRest */ Props, 
      Element
    ]), 
    js.Object
  ]) = js.native
  
  inline def getCombinedStyles(hasIsAnimatedFromRightIsIconStaticDistanceAnimFAB: GetCombinedStylesProps): CombinedStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getCombinedStyles")(hasIsAnimatedFromRightIsIconStaticDistanceAnimFAB.asInstanceOf[js.Any]).asInstanceOf[CombinedStyles]
}
