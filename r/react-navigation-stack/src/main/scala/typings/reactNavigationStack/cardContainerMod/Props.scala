package typings.reactNavigationStack.cardContainerMod

import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNavigationStack.AnonClose
import typings.reactNavigationStack.AnonHeight
import typings.reactNavigationStack.AnonHorizontal
import typings.reactNavigationStack.AnonRoute
import typings.reactNavigationStack.AnonStyle
import typings.reactNavigationStack.vendorTypesMod.GestureDirection
import typings.reactNavigationStack.vendorTypesMod.Layout
import typings.reactNavigationStack.vendorTypesMod.Route
import typings.reactNavigationStack.vendorTypesMod.Scene
import typings.reactNavigationStack.vendorTypesMod.StackCardInterpolatedStyle
import typings.reactNavigationStack.vendorTypesMod.StackCardInterpolationProps
import typings.reactNavigationStack.vendorTypesMod.StackCardStyleInterpolator
import typings.reactNavigationStack.vendorTypesMod.StackHeaderInterpolatedStyle
import typings.reactNavigationStack.vendorTypesMod.StackHeaderInterpolationProps
import typings.reactNavigationStack.vendorTypesMod.StackHeaderMode
import typings.reactNavigationStack.vendorTypesMod.StackHeaderStyleInterpolator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.TransitionPreset & {  index  :number,   active  :boolean,   focused  :boolean,   closing  :boolean,   layout  :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Layout,   gesture  :react-native.react-native.Animated.Value,   previousScene ? :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Scene<react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>>,   scene  :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Scene<react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>>,   safeAreaInsetTop  :number,   safeAreaInsetRight  :number,   safeAreaInsetBottom  :number,   safeAreaInsetLeft  :number, cardOverlay ? (props : {  style  :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>}): react.react.ReactNode,   cardOverlayEnabled ? :boolean,   cardShadowEnabled ? :boolean,   cardStyle ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>, getPreviousRoute (props : {  route  :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>}): react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string> | undefined, getFocusedRoute (): react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>, renderHeader (props : react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/views/Header/HeaderContainer.Props): react.react.ReactNode, renderScene (props : {  route  :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>}): react.react.ReactNode, onOpenRoute (props : {  route  :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>}): void, onCloseRoute (props : {  route  :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>}): void, onTransitionStart ? (props : {  route  :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>}, closing : boolean): void, onTransitionEnd ? (props : {  route  :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>}, closing : boolean): void, onTransitionComplete (props : {  route  :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>}): void, onPageChangeStart ? (): void, onPageChangeConfirm ? (): void, onPageChangeCancel ? (): void,   gestureEnabled ? :boolean,   gestureResponseDistance ? :{  vertical ? :number,   horizontal ? :number},   gestureVelocityImpact ? :number,   headerMode  :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.StackHeaderMode,   headerShown ? :boolean,   headerTransparent ? :boolean,   headerHeight  :number, onHeaderHeightChange (props : {  route  :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>,   height  :number}): void} */
trait Props extends js.Object {
  var active: Boolean
  var cardOverlay: js.UndefOr[js.Function1[/* props */ AnonStyle, ReactNode]] = js.undefined
  var cardOverlayEnabled: js.UndefOr[Boolean] = js.undefined
  var cardShadowEnabled: js.UndefOr[Boolean] = js.undefined
  var cardStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Function which specifies interpolated styles for various parts of the card, e.g. the overlay, shadow etc.
    */
  var cardStyleInterpolator: StackCardStyleInterpolator
  var closing: Boolean
  var focused: Boolean
  var gesture: Value
  /**
    * The direction of swipe gestures, `horizontal` or `vertical`.
    */
  var gestureDirection: GestureDirection
  var gestureEnabled: js.UndefOr[Boolean] = js.undefined
  var gestureResponseDistance: js.UndefOr[AnonHorizontal] = js.undefined
  var gestureVelocityImpact: js.UndefOr[Double] = js.undefined
  var headerHeight: Double
  var headerMode: StackHeaderMode
  var headerShown: js.UndefOr[Boolean] = js.undefined
  /**
    * Function which specifies interpolated styles for various parts of the header, e.g. the title, left button etc.
    */
  var headerStyleInterpolator: StackHeaderStyleInterpolator
  var headerTransparent: js.UndefOr[Boolean] = js.undefined
  var index: Double
  var layout: Layout
  var onPageChangeCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPageChangeConfirm: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPageChangeStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onTransitionEnd: js.UndefOr[js.Function2[/* props */ AnonRoute, /* closing */ Boolean, Unit]] = js.undefined
  var onTransitionStart: js.UndefOr[js.Function2[/* props */ AnonRoute, /* closing */ Boolean, Unit]] = js.undefined
  var previousScene: js.UndefOr[Scene[Route[String]]] = js.undefined
  var safeAreaInsetBottom: Double
  var safeAreaInsetLeft: Double
  var safeAreaInsetRight: Double
  var safeAreaInsetTop: Double
  var scene: Scene[Route[String]]
  /**
    * Object which specifies the animation type (timing or spring) and their options (such as duration for timing).
    */
  var transitionSpec: AnonClose
  def getFocusedRoute(): Route[String]
  def getPreviousRoute(props: AnonRoute): js.UndefOr[Route[String]]
  def onCloseRoute(props: AnonRoute): Unit
  def onHeaderHeightChange(props: AnonHeight): Unit
  def onOpenRoute(props: AnonRoute): Unit
  def onTransitionComplete(props: AnonRoute): Unit
  def renderHeader(props: typings.reactNavigationStack.headerContainerMod.Props): ReactNode
  def renderScene(props: AnonRoute): ReactNode
}

object Props {
  @scala.inline
  def apply(
    active: Boolean,
    cardStyleInterpolator: /* props */ StackCardInterpolationProps => StackCardInterpolatedStyle,
    closing: Boolean,
    focused: Boolean,
    gesture: Value,
    gestureDirection: GestureDirection,
    getFocusedRoute: () => Route[String],
    getPreviousRoute: AnonRoute => js.UndefOr[Route[String]],
    headerHeight: Double,
    headerMode: StackHeaderMode,
    headerStyleInterpolator: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle,
    index: Double,
    layout: Layout,
    onCloseRoute: AnonRoute => Unit,
    onHeaderHeightChange: AnonHeight => Unit,
    onOpenRoute: AnonRoute => Unit,
    onTransitionComplete: AnonRoute => Unit,
    renderHeader: typings.reactNavigationStack.headerContainerMod.Props => ReactNode,
    renderScene: AnonRoute => ReactNode,
    safeAreaInsetBottom: Double,
    safeAreaInsetLeft: Double,
    safeAreaInsetRight: Double,
    safeAreaInsetTop: Double,
    scene: Scene[Route[String]],
    transitionSpec: AnonClose,
    cardOverlay: /* props */ AnonStyle => ReactNode = null,
    cardOverlayEnabled: js.UndefOr[Boolean] = js.undefined,
    cardShadowEnabled: js.UndefOr[Boolean] = js.undefined,
    cardStyle: StyleProp[ViewStyle] = null,
    gestureEnabled: js.UndefOr[Boolean] = js.undefined,
    gestureResponseDistance: AnonHorizontal = null,
    gestureVelocityImpact: Int | Double = null,
    headerShown: js.UndefOr[Boolean] = js.undefined,
    headerTransparent: js.UndefOr[Boolean] = js.undefined,
    onPageChangeCancel: () => Unit = null,
    onPageChangeConfirm: () => Unit = null,
    onPageChangeStart: () => Unit = null,
    onTransitionEnd: (/* props */ AnonRoute, /* closing */ Boolean) => Unit = null,
    onTransitionStart: (/* props */ AnonRoute, /* closing */ Boolean) => Unit = null,
    previousScene: Scene[Route[String]] = null
  ): Props = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], cardStyleInterpolator = js.Any.fromFunction1(cardStyleInterpolator), closing = closing.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], gesture = gesture.asInstanceOf[js.Any], gestureDirection = gestureDirection.asInstanceOf[js.Any], getFocusedRoute = js.Any.fromFunction0(getFocusedRoute), getPreviousRoute = js.Any.fromFunction1(getPreviousRoute), headerHeight = headerHeight.asInstanceOf[js.Any], headerMode = headerMode.asInstanceOf[js.Any], headerStyleInterpolator = js.Any.fromFunction1(headerStyleInterpolator), index = index.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], onCloseRoute = js.Any.fromFunction1(onCloseRoute), onHeaderHeightChange = js.Any.fromFunction1(onHeaderHeightChange), onOpenRoute = js.Any.fromFunction1(onOpenRoute), onTransitionComplete = js.Any.fromFunction1(onTransitionComplete), renderHeader = js.Any.fromFunction1(renderHeader), renderScene = js.Any.fromFunction1(renderScene), safeAreaInsetBottom = safeAreaInsetBottom.asInstanceOf[js.Any], safeAreaInsetLeft = safeAreaInsetLeft.asInstanceOf[js.Any], safeAreaInsetRight = safeAreaInsetRight.asInstanceOf[js.Any], safeAreaInsetTop = safeAreaInsetTop.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], transitionSpec = transitionSpec.asInstanceOf[js.Any])
    if (cardOverlay != null) __obj.updateDynamic("cardOverlay")(js.Any.fromFunction1(cardOverlay))
    if (!js.isUndefined(cardOverlayEnabled)) __obj.updateDynamic("cardOverlayEnabled")(cardOverlayEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(cardShadowEnabled)) __obj.updateDynamic("cardShadowEnabled")(cardShadowEnabled.asInstanceOf[js.Any])
    if (cardStyle != null) __obj.updateDynamic("cardStyle")(cardStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(gestureEnabled)) __obj.updateDynamic("gestureEnabled")(gestureEnabled.asInstanceOf[js.Any])
    if (gestureResponseDistance != null) __obj.updateDynamic("gestureResponseDistance")(gestureResponseDistance.asInstanceOf[js.Any])
    if (gestureVelocityImpact != null) __obj.updateDynamic("gestureVelocityImpact")(gestureVelocityImpact.asInstanceOf[js.Any])
    if (!js.isUndefined(headerShown)) __obj.updateDynamic("headerShown")(headerShown.asInstanceOf[js.Any])
    if (!js.isUndefined(headerTransparent)) __obj.updateDynamic("headerTransparent")(headerTransparent.asInstanceOf[js.Any])
    if (onPageChangeCancel != null) __obj.updateDynamic("onPageChangeCancel")(js.Any.fromFunction0(onPageChangeCancel))
    if (onPageChangeConfirm != null) __obj.updateDynamic("onPageChangeConfirm")(js.Any.fromFunction0(onPageChangeConfirm))
    if (onPageChangeStart != null) __obj.updateDynamic("onPageChangeStart")(js.Any.fromFunction0(onPageChangeStart))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction2(onTransitionEnd))
    if (onTransitionStart != null) __obj.updateDynamic("onTransitionStart")(js.Any.fromFunction2(onTransitionStart))
    if (previousScene != null) __obj.updateDynamic("previousScene")(previousScene.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

