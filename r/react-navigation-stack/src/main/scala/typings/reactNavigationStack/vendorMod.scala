package typings.reactNavigationStack

import typings.react.mod.Context
import typings.react.mod.NamedExoticComponent
import typings.react.mod.Ref
import typings.react.mod.global.JSX.Element
import typings.reactNativeGestureHandler.mod.PanGestureHandler
import typings.reactNavigationStack.anon.ClosingRouteKeys
import typings.reactNavigationStack.anon.Descriptors
import typings.reactNavigationStack.anon.ReadonlyProps
import typings.reactNavigationStack.anon.ReadonlyState
import typings.reactNavigationStack.headerBackButtonMod.Props
import typings.reactNavigationStack.stackViewMod.default
import typings.reactNavigationStack.vendorTypesMod.StackCardInterpolatedStyle
import typings.reactNavigationStack.vendorTypesMod.StackCardInterpolationProps
import typings.reactNavigationStack.vendorTypesMod.StackHeaderInterpolatedStyle
import typings.reactNavigationStack.vendorTypesMod.StackHeaderInterpolationProps
import typings.reactNavigationStack.vendorTypesMod.StackHeaderProps
import typings.reactNavigationStack.vendorTypesMod.TransitionPreset
import typings.reactNavigationStack.vendorTypesMod.TransitionSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vendorMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor", "Assets")
  @js.native
  val Assets: js.Array[js.Any] = js.native
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor", "CardAnimationContext")
  @js.native
  val CardAnimationContext: Context[js.UndefOr[StackCardInterpolationProps]] = js.native
  
  object CardStyleInterpolators {
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "CardStyleInterpolators")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def forFadeFromBottomAndroid(hasCurrentInvertedHasScreenClosing: StackCardInterpolationProps): StackCardInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forFadeFromBottomAndroid")(hasCurrentInvertedHasScreenClosing.asInstanceOf[js.Any]).asInstanceOf[StackCardInterpolatedStyle]
    
    @scala.inline
    def forHorizontalIOS(hasCurrentNextInvertedHasScreen: StackCardInterpolationProps): StackCardInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forHorizontalIOS")(hasCurrentNextInvertedHasScreen.asInstanceOf[js.Any]).asInstanceOf[StackCardInterpolatedStyle]
    
    @scala.inline
    def forModalPresentationIOS(hasIndexCurrentNextInvertedHasScreenInsets: StackCardInterpolationProps): StackCardInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forModalPresentationIOS")(hasIndexCurrentNextInvertedHasScreenInsets.asInstanceOf[js.Any]).asInstanceOf[StackCardInterpolatedStyle]
    
    @scala.inline
    def forNoAnimation(): StackCardInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forNoAnimation")().asInstanceOf[StackCardInterpolatedStyle]
    
    @scala.inline
    def forRevealFromBottomAndroid(hasCurrentNextInvertedHasScreen: StackCardInterpolationProps): StackCardInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forRevealFromBottomAndroid")(hasCurrentNextInvertedHasScreen.asInstanceOf[js.Any]).asInstanceOf[StackCardInterpolatedStyle]
    
    @scala.inline
    def forScaleFromCenterAndroid(hasCurrentNextClosing: StackCardInterpolationProps): StackCardInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forScaleFromCenterAndroid")(hasCurrentNextClosing.asInstanceOf[js.Any]).asInstanceOf[StackCardInterpolatedStyle]
    
    @scala.inline
    def forVerticalIOS(hasCurrentInvertedHasScreen: StackCardInterpolationProps): StackCardInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forVerticalIOS")(hasCurrentInvertedHasScreen.asInstanceOf[js.Any]).asInstanceOf[StackCardInterpolatedStyle]
  }
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor", "GestureHandlerRefContext")
  @js.native
  val GestureHandlerRefContext: Context[Ref[PanGestureHandler]] = js.native
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor", "Header")
  @js.native
  val Header: NamedExoticComponent[StackHeaderProps] = js.native
  
  @scala.inline
  def HeaderBackButton(
    hasDisabledAllowFontScalingBackImageLabelLabelStyleLabelVisibleOnLabelLayoutOnPressCustomPressColorAndroidScreenLayoutCustomTintColorTitleLayoutTruncatedLabelAccessibilityLabelStyle: Props
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HeaderBackButton")(hasDisabledAllowFontScalingBackImageLabelLabelStyleLabelVisibleOnLabelLayoutOnPressCustomPressColorAndroidScreenLayoutCustomTintColorTitleLayoutTruncatedLabelAccessibilityLabelStyle.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def HeaderBackground(hasStyleRest: typings.reactNavigationStack.headerBackgroundMod.Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HeaderBackground")(hasStyleRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor", "HeaderHeightContext")
  @js.native
  val HeaderHeightContext: Context[js.UndefOr[Double]] = js.native
  
  object HeaderStyleInterpolators {
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "HeaderStyleInterpolators")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def forFade(hasCurrentNext: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forFade")(hasCurrentNext.asInstanceOf[js.Any]).asInstanceOf[StackHeaderInterpolatedStyle]
    
    @scala.inline
    def forNoAnimation(): StackHeaderInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forNoAnimation")().asInstanceOf[StackHeaderInterpolatedStyle]
    
    @scala.inline
    def forSlideLeft(hasCurrentNextHasScreen: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forSlideLeft")(hasCurrentNextHasScreen.asInstanceOf[js.Any]).asInstanceOf[StackHeaderInterpolatedStyle]
    
    @scala.inline
    def forSlideRight(hasCurrentNextHasScreen: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forSlideRight")(hasCurrentNextHasScreen.asInstanceOf[js.Any]).asInstanceOf[StackHeaderInterpolatedStyle]
    
    @scala.inline
    def forSlideUp(hasCurrentNextHasHeader: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forSlideUp")(hasCurrentNextHasHeader.asInstanceOf[js.Any]).asInstanceOf[StackHeaderInterpolatedStyle]
    
    @scala.inline
    def forUIKit(hasCurrentNextLayouts: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forUIKit")(hasCurrentNextLayouts.asInstanceOf[js.Any]).asInstanceOf[StackHeaderInterpolatedStyle]
  }
  
  @scala.inline
  def HeaderTitle(hasTintColorStyleRest: typings.reactNavigationStack.headerTitleMod.Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HeaderTitle")(hasTintColorStyleRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor", "StackView")
  @js.native
  class StackView () extends default
  /* static members */
  object StackView {
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "StackView")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getDerivedStateFromProps(props: ReadonlyProps, state: ReadonlyState): ClosingRouteKeys | Descriptors = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ClosingRouteKeys | Descriptors]
  }
  
  object TransitionPresets {
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "TransitionPresets.DefaultTransition")
    @js.native
    val DefaultTransition: TransitionPreset = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "TransitionPresets.FadeFromBottomAndroid")
    @js.native
    val FadeFromBottomAndroid: TransitionPreset = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "TransitionPresets.ModalPresentationIOS")
    @js.native
    val ModalPresentationIOS: TransitionPreset = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "TransitionPresets.ModalSlideFromBottomIOS")
    @js.native
    val ModalSlideFromBottomIOS: TransitionPreset = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "TransitionPresets.ModalTransition")
    @js.native
    val ModalTransition: TransitionPreset = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "TransitionPresets.RevealFromBottomAndroid")
    @js.native
    val RevealFromBottomAndroid: TransitionPreset = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "TransitionPresets.ScaleFromCenterAndroid")
    @js.native
    val ScaleFromCenterAndroid: TransitionPreset = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "TransitionPresets.SlideFromRightIOS")
    @js.native
    val SlideFromRightIOS: TransitionPreset = js.native
  }
  
  object TransitionSpecs {
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "TransitionSpecs.FadeInFromBottomAndroidSpec")
    @js.native
    val FadeInFromBottomAndroidSpec: TransitionSpec = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "TransitionSpecs.FadeOutToBottomAndroidSpec")
    @js.native
    val FadeOutToBottomAndroidSpec: TransitionSpec = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "TransitionSpecs.RevealFromBottomAndroidSpec")
    @js.native
    val RevealFromBottomAndroidSpec: TransitionSpec = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "TransitionSpecs.ScaleFromCenterAndroidSpec")
    @js.native
    val ScaleFromCenterAndroidSpec: TransitionSpec = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "TransitionSpecs.TransitionIOSSpec")
    @js.native
    val TransitionIOSSpec: TransitionSpec = js.native
  }
  
  @scala.inline
  def useCardAnimation(): StackCardInterpolationProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useCardAnimation")().asInstanceOf[StackCardInterpolationProps]
  
  @scala.inline
  def useGestureHandlerRef(): Ref[PanGestureHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("useGestureHandlerRef")().asInstanceOf[Ref[PanGestureHandler]]
  
  @scala.inline
  def useHeaderHeight(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useHeaderHeight")().asInstanceOf[Double]
}
