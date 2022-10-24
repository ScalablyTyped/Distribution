package typings.reactNativePaper

import typings.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNativePaper.anon.AccessibilityState
import typings.reactNativePaper.anon.PickRemoveChildrenComponeAccessibilityState
import typings.reactNativePaper.anon.PickViewPropsRefAttributeAccessibilityIgnoresInvertColors
import typings.reactNativePaper.anon.ViewPropsRefAttributesVieAccessibilityIgnoresInvertColors
import typings.reactNativePaper.libTypescriptComponentsFabAnimatedFABUtilsMod.CombinedStyles
import typings.reactNativePaper.libTypescriptComponentsFabAnimatedFABUtilsMod.GetCombinedStylesProps
import typings.reactNativePaper.libTypescriptComponentsSurfaceMod.Props
import typings.reactNativePaper.libTypescriptTypesMod.RemoveChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsFabAnimatedFABMod {
  
  @JSImport("react-native-paper/lib/typescript/components/FAB/AnimatedFAB", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-paper/lib/typescript/components/FAB/AnimatedFAB", JSImport.Default)
  @js.native
  val default: ComponentType[PickRemoveChildrenComponeAccessibilityState] & (NonReactStatics[
    (ComponentType[
      (RemoveChildren[
        ComponentType[PickViewPropsRefAttributeAccessibilityIgnoresInvertColors] & (NonReactStatics[
          ComponentType[ViewPropsRefAttributesVieAccessibilityIgnoresInvertColors] & (js.Function1[/* param0 */ Props, Element]), 
          js.Object
        ])
      ]) & AccessibilityState
    ]) & (js.Function1[
      /* param0 */ typings.reactNativePaper.libTypescriptComponentsFabAnimatedFABAnimatedFABMod.Props, 
      Element
    ]), 
    js.Object
  ]) = js.native
  
  inline def getCombinedStyles(param0: GetCombinedStylesProps): CombinedStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getCombinedStyles")(param0.asInstanceOf[js.Any]).asInstanceOf[CombinedStyles]
}
