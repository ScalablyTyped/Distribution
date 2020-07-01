package typings.reactNavigationStack.cardContainerMod

import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNavigationStack.anon.Close
import typings.reactNavigationStack.anon.Height
import typings.reactNavigationStack.anon.Horizontal
import typings.reactNavigationStack.anon.Route
import typings.reactNavigationStack.anon.Style
import typings.reactNavigationStack.vendorTypesMod.GestureDirection
import typings.reactNavigationStack.vendorTypesMod.Layout
import typings.reactNavigationStack.vendorTypesMod.Scene
import typings.reactNavigationStack.vendorTypesMod.StackCardInterpolatedStyle
import typings.reactNavigationStack.vendorTypesMod.StackCardInterpolationProps
import typings.reactNavigationStack.vendorTypesMod.StackCardMode
import typings.reactNavigationStack.vendorTypesMod.StackCardStyleInterpolator
import typings.reactNavigationStack.vendorTypesMod.StackHeaderInterpolatedStyle
import typings.reactNavigationStack.vendorTypesMod.StackHeaderInterpolationProps
import typings.reactNavigationStack.vendorTypesMod.StackHeaderMode
import typings.reactNavigationStack.vendorTypesMod.StackHeaderStyleInterpolator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.TransitionPreset & {  index  :number,   active  :boolean,   focused  :boolean,   closing  :boolean,   layout  :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Layout,   gesture  :react-native.react-native.Animated.Value,   scene  :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Scene<react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>>,   safeAreaInsetTop  :number,   safeAreaInsetRight  :number,   safeAreaInsetBottom  :number,   safeAreaInsetLeft  :number, cardOverlay ? (props : {  style  :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>}): react.react.ReactNode,   cardOverlayEnabled ? :boolean,   cardShadowEnabled ? :boolean,   cardStyle ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>, getPreviousScene (props : {  route  :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>}): react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Scene<react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>> | undefined, getFocusedRoute (): react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>, renderHeader (props : react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/views/Header/HeaderContainer.Props): react.react.ReactNode, renderScene (props : {  route  :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>}): react.react.ReactNode, onOpenRoute (props : {  route  :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>}): void, onCloseRoute (props : {  route  :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>}): void, onTransitionStart ? (props : {  route  :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>}, closing : boolean): void, onTransitionEnd ? (props : {  route  :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>}, closing : boolean): void, onPageChangeStart ? (): void, onPageChangeConfirm ? (): void, onPageChangeCancel ? (): void,   gestureEnabled ? :boolean,   gestureResponseDistance ? :{  vertical ? :number,   horizontal ? :number},   gestureVelocityImpact ? :number,   mode  :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.StackCardMode,   headerMode  :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.StackHeaderMode,   headerShown  :boolean,   hasAbsoluteHeader  :boolean,   headerHeight  :number, onHeaderHeightChange (props : {  route  :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>,   height  :number}): void} */
trait Props extends js.Object {
  var active: Boolean
  var cardOverlay: js.UndefOr[js.Function1[/* props */ Style, ReactNode]] = js.undefined
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
  var gestureResponseDistance: js.UndefOr[Horizontal] = js.undefined
  var gestureVelocityImpact: js.UndefOr[Double] = js.undefined
  var hasAbsoluteHeader: Boolean
  var headerHeight: Double
  var headerMode: StackHeaderMode
  var headerShown: Boolean
  /**
    * Function which specifies interpolated styles for various parts of the header, e.g. the title, left button etc.
    */
  var headerStyleInterpolator: StackHeaderStyleInterpolator
  var index: Double
  var layout: Layout
  var mode: StackCardMode
  var onPageChangeCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPageChangeConfirm: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPageChangeStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onTransitionEnd: js.UndefOr[js.Function2[/* props */ Route, /* closing */ Boolean, Unit]] = js.undefined
  var onTransitionStart: js.UndefOr[js.Function2[/* props */ Route, /* closing */ Boolean, Unit]] = js.undefined
  var safeAreaInsetBottom: Double
  var safeAreaInsetLeft: Double
  var safeAreaInsetRight: Double
  var safeAreaInsetTop: Double
  var scene: Scene[typings.reactNavigationStack.vendorTypesMod.Route[String]]
  /**
    * Object which specifies the animation type (timing or spring) and their options (such as duration for timing).
    */
  var transitionSpec: Close
  def getFocusedRoute(): typings.reactNavigationStack.vendorTypesMod.Route[String]
  def getPreviousScene(props: Route): js.UndefOr[Scene[typings.reactNavigationStack.vendorTypesMod.Route[String]]]
  def onCloseRoute(props: Route): Unit
  def onHeaderHeightChange(props: Height): Unit
  def onOpenRoute(props: Route): Unit
  def renderHeader(props: typings.reactNavigationStack.headerContainerMod.Props): ReactNode
  def renderScene(props: Route): ReactNode
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
    getFocusedRoute: () => typings.reactNavigationStack.vendorTypesMod.Route[String],
    getPreviousScene: Route => js.UndefOr[Scene[typings.reactNavigationStack.vendorTypesMod.Route[String]]],
    hasAbsoluteHeader: Boolean,
    headerHeight: Double,
    headerMode: StackHeaderMode,
    headerShown: Boolean,
    headerStyleInterpolator: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle,
    index: Double,
    layout: Layout,
    mode: StackCardMode,
    onCloseRoute: Route => Unit,
    onHeaderHeightChange: Height => Unit,
    onOpenRoute: Route => Unit,
    renderHeader: typings.reactNavigationStack.headerContainerMod.Props => ReactNode,
    renderScene: Route => ReactNode,
    safeAreaInsetBottom: Double,
    safeAreaInsetLeft: Double,
    safeAreaInsetRight: Double,
    safeAreaInsetTop: Double,
    scene: Scene[typings.reactNavigationStack.vendorTypesMod.Route[String]],
    transitionSpec: Close,
    cardOverlay: /* props */ Style => ReactNode = null,
    cardOverlayEnabled: js.UndefOr[Boolean] = js.undefined,
    cardShadowEnabled: js.UndefOr[Boolean] = js.undefined,
    cardStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    gestureEnabled: js.UndefOr[Boolean] = js.undefined,
    gestureResponseDistance: Horizontal = null,
    gestureVelocityImpact: js.UndefOr[Double] = js.undefined,
    onPageChangeCancel: () => Unit = null,
    onPageChangeConfirm: () => Unit = null,
    onPageChangeStart: () => Unit = null,
    onTransitionEnd: (/* props */ Route, /* closing */ Boolean) => Unit = null,
    onTransitionStart: (/* props */ Route, /* closing */ Boolean) => Unit = null
  ): Props = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], cardStyleInterpolator = js.Any.fromFunction1(cardStyleInterpolator), closing = closing.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], gesture = gesture.asInstanceOf[js.Any], gestureDirection = gestureDirection.asInstanceOf[js.Any], getFocusedRoute = js.Any.fromFunction0(getFocusedRoute), getPreviousScene = js.Any.fromFunction1(getPreviousScene), hasAbsoluteHeader = hasAbsoluteHeader.asInstanceOf[js.Any], headerHeight = headerHeight.asInstanceOf[js.Any], headerMode = headerMode.asInstanceOf[js.Any], headerShown = headerShown.asInstanceOf[js.Any], headerStyleInterpolator = js.Any.fromFunction1(headerStyleInterpolator), index = index.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onCloseRoute = js.Any.fromFunction1(onCloseRoute), onHeaderHeightChange = js.Any.fromFunction1(onHeaderHeightChange), onOpenRoute = js.Any.fromFunction1(onOpenRoute), renderHeader = js.Any.fromFunction1(renderHeader), renderScene = js.Any.fromFunction1(renderScene), safeAreaInsetBottom = safeAreaInsetBottom.asInstanceOf[js.Any], safeAreaInsetLeft = safeAreaInsetLeft.asInstanceOf[js.Any], safeAreaInsetRight = safeAreaInsetRight.asInstanceOf[js.Any], safeAreaInsetTop = safeAreaInsetTop.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], transitionSpec = transitionSpec.asInstanceOf[js.Any])
    if (cardOverlay != null) __obj.updateDynamic("cardOverlay")(js.Any.fromFunction1(cardOverlay))
    if (!js.isUndefined(cardOverlayEnabled)) __obj.updateDynamic("cardOverlayEnabled")(cardOverlayEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cardShadowEnabled)) __obj.updateDynamic("cardShadowEnabled")(cardShadowEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cardStyle)) __obj.updateDynamic("cardStyle")(cardStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(gestureEnabled)) __obj.updateDynamic("gestureEnabled")(gestureEnabled.get.asInstanceOf[js.Any])
    if (gestureResponseDistance != null) __obj.updateDynamic("gestureResponseDistance")(gestureResponseDistance.asInstanceOf[js.Any])
    if (!js.isUndefined(gestureVelocityImpact)) __obj.updateDynamic("gestureVelocityImpact")(gestureVelocityImpact.get.asInstanceOf[js.Any])
    if (onPageChangeCancel != null) __obj.updateDynamic("onPageChangeCancel")(js.Any.fromFunction0(onPageChangeCancel))
    if (onPageChangeConfirm != null) __obj.updateDynamic("onPageChangeConfirm")(js.Any.fromFunction0(onPageChangeConfirm))
    if (onPageChangeStart != null) __obj.updateDynamic("onPageChangeStart")(js.Any.fromFunction0(onPageChangeStart))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction2(onTransitionEnd))
    if (onTransitionStart != null) __obj.updateDynamic("onTransitionStart")(js.Any.fromFunction2(onTransitionStart))
    __obj.asInstanceOf[Props]
  }
}

