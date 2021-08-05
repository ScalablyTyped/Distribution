package typings.reactNavigationStack

import typings.reactNavigationStack.vendorTypesMod.StackCardInterpolatedStyle
import typings.reactNavigationStack.vendorTypesMod.StackCardInterpolationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardStyleInterpolatorsMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/TransitionConfigs/CardStyleInterpolators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def forFadeFromBottomAndroid(hasCurrentInvertedHasScreenClosing: StackCardInterpolationProps): StackCardInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forFadeFromBottomAndroid")(hasCurrentInvertedHasScreenClosing.asInstanceOf[js.Any]).asInstanceOf[StackCardInterpolatedStyle]
  
  inline def forHorizontalIOS(hasCurrentNextInvertedHasScreen: StackCardInterpolationProps): StackCardInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forHorizontalIOS")(hasCurrentNextInvertedHasScreen.asInstanceOf[js.Any]).asInstanceOf[StackCardInterpolatedStyle]
  
  inline def forModalPresentationIOS(hasIndexCurrentNextInvertedHasScreenInsets: StackCardInterpolationProps): StackCardInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forModalPresentationIOS")(hasIndexCurrentNextInvertedHasScreenInsets.asInstanceOf[js.Any]).asInstanceOf[StackCardInterpolatedStyle]
  
  inline def forNoAnimation(): StackCardInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forNoAnimation")().asInstanceOf[StackCardInterpolatedStyle]
  
  inline def forRevealFromBottomAndroid(hasCurrentNextInvertedHasScreen: StackCardInterpolationProps): StackCardInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forRevealFromBottomAndroid")(hasCurrentNextInvertedHasScreen.asInstanceOf[js.Any]).asInstanceOf[StackCardInterpolatedStyle]
  
  inline def forScaleFromCenterAndroid(hasCurrentNextClosing: StackCardInterpolationProps): StackCardInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forScaleFromCenterAndroid")(hasCurrentNextClosing.asInstanceOf[js.Any]).asInstanceOf[StackCardInterpolatedStyle]
  
  inline def forVerticalIOS(hasCurrentInvertedHasScreen: StackCardInterpolationProps): StackCardInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forVerticalIOS")(hasCurrentInvertedHasScreen.asInstanceOf[js.Any]).asInstanceOf[StackCardInterpolatedStyle]
}
