package typings.reactNavigationStack

import typings.react.mod.ComponentType
import typings.react.mod._Global_.JSX.Element
import typings.reactNavigationStack.borderlessButtonMod.default
import typings.reactNavigationStack.cardContainerMod.Props
import typings.reactNavigationStack.mod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactNavigationStackComponents extends reactNavigationStackProps {
  @scala.inline
  def BorderlessButton: ComponentType[BorderlessButtonProps] = js.constructorOf[default].asInstanceOf[ComponentType[BorderlessButtonProps]]
  @scala.inline
  def Card: ComponentType[CardProps] = js.constructorOf[typings.reactNavigationStack.cardMod.default].asInstanceOf[ComponentType[CardProps]]
  @scala.inline
  def CardContainer: ComponentType[
    CardContainerProps[
      /* hasActiveCardOverlayCardOverlayEnabledCardShadowEnabledCardStyleCardStyleInterpolatorClosingGestureFocusedGestureDirectionGestureEnabledGestureResponseDistanceGestureVelocityImpactGetPreviousRouteGetFocusedRouteHeaderModeHeaderShownHeaderStyleInterpolatorHeaderTransparentHeaderHeightOnHeaderHeightChangeIndexLayoutOnCloseRouteOnOpenRouteOnPageChangeCancelOnPageChangeConfirmOnPageChangeStartOnTransitionEndOnTransitionStartPreviousSceneRenderHeaderRenderSceneSafeAreaInsetBottomSafeAreaInsetLeftSafeAreaInsetRightSafeAreaInsetTopSceneTransitionSpec */ Props, 
      Element
    ]
  ] = typings.reactNavigationStack.cardContainerMod.default.asInstanceOf[ComponentType[
    CardContainerProps[
      /* hasActiveCardOverlayCardOverlayEnabledCardShadowEnabledCardStyleCardStyleInterpolatorClosingGestureFocusedGestureDirectionGestureEnabledGestureResponseDistanceGestureVelocityImpactGetPreviousRouteGetFocusedRouteHeaderModeHeaderShownHeaderStyleInterpolatorHeaderTransparentHeaderHeightOnHeaderHeightChangeIndexLayoutOnCloseRouteOnOpenRouteOnPageChangeCancelOnPageChangeConfirmOnPageChangeStartOnTransitionEndOnTransitionStartPreviousSceneRenderHeaderRenderSceneSafeAreaInsetBottomSafeAreaInsetLeftSafeAreaInsetRightSafeAreaInsetTopSceneTransitionSpec */ Props, 
      Element
    ]
  ]]
  @scala.inline
  def CardStack: ComponentType[CardStackProps] = js.constructorOf[typings.reactNavigationStack.cardStackMod.default].asInstanceOf[ComponentType[CardStackProps]]
  @scala.inline
  def Header: ComponentType[HeaderProps] = typings.reactNavigationStack.headerMod.default.asInstanceOf[ComponentType[HeaderProps]]
  @scala.inline
  def HeaderBackButton: ComponentType[HeaderBackButtonProps] = mod.asInstanceOf[js.Dynamic].selectDynamic("HeaderBackButton").asInstanceOf[ComponentType[HeaderBackButtonProps]]
  @scala.inline
  def HeaderBackground: ComponentType[HeaderBackgroundProps] = typings.reactNavigationStack.headerBackgroundMod.default.asInstanceOf[ComponentType[HeaderBackgroundProps]]
  @scala.inline
  def HeaderContainer: ComponentType[HeaderContainerProps] = typings.reactNavigationStack.headerContainerMod.default.asInstanceOf[ComponentType[HeaderContainerProps]]
  @scala.inline
  def HeaderSegment: ComponentType[HeaderSegmentProps] = js.constructorOf[typings.reactNavigationStack.headerSegmentMod.default].asInstanceOf[ComponentType[HeaderSegmentProps]]
  @scala.inline
  def HeaderTitle: ComponentType[HeaderTitleProps] = mod.asInstanceOf[js.Dynamic].selectDynamic("HeaderTitle").asInstanceOf[ComponentType[HeaderTitleProps]]
  @scala.inline
  def KeyboardManager: ComponentType[KeyboardManagerProps] = js.constructorOf[typings.reactNavigationStack.keyboardManagerMod.default].asInstanceOf[ComponentType[KeyboardManagerProps]]
  @scala.inline
  def MaskedView: ComponentType[MaskedViewProps] = typings.reactNavigationStack.maskedViewMod.default.asInstanceOf[ComponentType[MaskedViewProps]]
  @scala.inline
  def SafeAreaProviderCompat: ComponentType[SafeAreaProviderCompatProps] = typings.reactNavigationStack.safeAreaProviderCompatMod.default.asInstanceOf[ComponentType[SafeAreaProviderCompatProps]]
  @scala.inline
  def StackView: ComponentType[StackViewProps] = typings.reactNavigationStack.viewsStackViewMod.default.asInstanceOf[ComponentType[StackViewProps]]
  @scala.inline
  def TouchableItem: ComponentType[TouchableItemProps] = js.constructorOf[typings.reactNavigationStack.touchableItemMod.default].asInstanceOf[ComponentType[TouchableItemProps]]
}

