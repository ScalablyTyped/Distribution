package typings.reactNavigationStack

import typings.react.mod.Context
import typings.react.mod.NamedExoticComponent
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.react.mod._Global_.JSX.Element
import typings.reactNativeGestureHandler.mod.PanGestureHandler
import typings.reactNavigationStack.headerBackButtonMod.Props
import typings.reactNavigationStack.stackViewMod.default
import typings.reactNavigationStack.vendorTypesMod.StackCardInterpolatedStyle
import typings.reactNavigationStack.vendorTypesMod.StackCardInterpolationProps
import typings.reactNavigationStack.vendorTypesMod.StackHeaderInterpolatedStyle
import typings.reactNavigationStack.vendorTypesMod.StackHeaderInterpolationProps
import typings.reactNavigationStack.vendorTypesMod.StackHeaderProps
import typings.reactNavigationStack.vendorTypesMod.TransitionPreset
import typings.reactNavigationStack.vendorTypesMod.TransitionSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/src/vendor", JSImport.Namespace)
@js.native
object vendorMod extends js.Object {
  @js.native
  class StackView () extends default
  
  val Assets: js.Array[js.Any] = js.native
  val CardAnimationContext: Context[js.UndefOr[StackCardInterpolationProps]] = js.native
  val GestureHandlerRefContext: Context[
    js.UndefOr[
      (js.Function1[/* instance */ PanGestureHandler | Null, Unit]) | RefObject[PanGestureHandler] | Null
    ]
  ] = js.native
  val Header: NamedExoticComponent[StackHeaderProps] = js.native
  val HeaderHeightContext: Context[js.UndefOr[Double]] = js.native
  def HeaderBackButton(
    hasDisabledAllowFontScalingBackImageLabelLabelStyleLabelVisibleOnLabelLayoutOnPressPressColorAndroidScreenLayoutTintColorTitleLayoutTruncatedLabelAccessibilityLabel: Props
  ): Element = js.native
  def HeaderBackground(hasStyleRest: typings.reactNavigationStack.headerBackgroundMod.Props): Element = js.native
  def HeaderTitle(hasTintColorStyleRest: typings.reactNavigationStack.headerTitleMod.Props): Element = js.native
  def useCardAnimation(): StackCardInterpolationProps = js.native
  def useGestureHandlerRef(): Ref[PanGestureHandler] = js.native
  def useHeaderHeight(): Double = js.native
  @js.native
  object CardStyleInterpolators extends js.Object {
    def forFadeFromBottomAndroid(hasCurrentInvertedLayoutsClosing: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    def forHorizontalIOS(hasCurrentNextInvertedLayouts: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    def forModalPresentationIOS(hasIndexCurrentNextInvertedLayoutsInsets: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    def forNoAnimation(): StackCardInterpolatedStyle = js.native
    def forRevealFromBottomAndroid(hasCurrentNextInvertedLayouts: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    def forScaleFromCenterAndroid(hasCurrentNextClosing: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    def forVerticalIOS(hasCurrentInvertedLayouts: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
  }
  
  @js.native
  object HeaderStyleInterpolators extends js.Object {
    def forFade(hasCurrentNext: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
    def forNoAnimation(): StackHeaderInterpolatedStyle = js.native
    def forSlideLeft(hasCurrentNextLayouts: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
    def forSlideRight(hasCurrentNextLayouts: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
    def forSlideUp(hasCurrentNextLayouts: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
    def forUIKit(hasCurrentNextLayouts: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
  }
  
  /* static members */
  @js.native
  object StackView extends js.Object {
    def getDerivedStateFromProps(props: ReadonlyProps, state: ReadonlyState): AnonClosingRouteKeys | AnonDescriptors = js.native
  }
  
  @js.native
  object TransitionPresets extends js.Object {
    val DefaultTransition: TransitionPreset = js.native
    val FadeFromBottomAndroid: TransitionPreset = js.native
    val ModalPresentationIOS: TransitionPreset = js.native
    val ModalSlideFromBottomIOS: TransitionPreset = js.native
    val ModalTransition: TransitionPreset = js.native
    val RevealFromBottomAndroid: TransitionPreset = js.native
    val ScaleFromCenterAndroid: TransitionPreset = js.native
    val SlideFromRightIOS: TransitionPreset = js.native
  }
  
  @js.native
  object TransitionSpecs extends js.Object {
    val FadeInFromBottomAndroidSpec: TransitionSpec = js.native
    val FadeOutToBottomAndroidSpec: TransitionSpec = js.native
    val RevealFromBottomAndroidSpec: TransitionSpec = js.native
    val ScaleFromCenterAndroidSpec: TransitionSpec = js.native
    val TransitionIOSSpec: TransitionSpec = js.native
  }
  
}

