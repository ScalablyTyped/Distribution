package typings.reactNavigationStack.cardContainerMod

import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNavigationStack.anon.Close
import typings.reactNavigationStack.anon.Height
import typings.reactNavigationStack.anon.Horizontal
import typings.reactNavigationStack.anon.StyleWithAnimatedValue
import typings.reactNavigationStack.vendorTypesMod.GestureDirection
import typings.reactNavigationStack.vendorTypesMod.Layout
import typings.reactNavigationStack.vendorTypesMod.Route
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.TransitionPreset & {  index :number,   active :boolean,   focused :boolean,   closing :boolean,   layout :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Layout,   gesture :react-native.react-native.Animated.Value,   scene :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Scene<react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>>,   safeAreaInsetTop :number,   safeAreaInsetRight :number,   safeAreaInsetBottom :number,   safeAreaInsetLeft :number,   cardOverlay :(props : {  style :react-native.react-native.Animated.WithAnimatedValue<react-native.react-native.StyleProp<react-native.react-native.ViewStyle>>}): react.react.ReactNode | undefined,   cardOverlayEnabled :boolean | undefined,   cardShadowEnabled :boolean | undefined,   cardStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined, getPreviousScene (props : {  route :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>}): react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Scene<react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>> | undefined, getFocusedRoute (): react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>, renderHeader (props : react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/views/Header/HeaderContainer.Props): react.react.ReactNode, renderScene (props : {  route :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>}): react.react.ReactNode, onOpenRoute (props : {  route :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>}): void, onCloseRoute (props : {  route :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>}): void,   onTransitionStart :(props : {  route :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>}, closing : boolean): void | undefined,   onTransitionEnd :(props : {  route :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>}, closing : boolean): void | undefined,   onPageChangeStart :(): void | undefined,   onPageChangeConfirm :(force : boolean): void | undefined,   onPageChangeCancel :(): void | undefined,   onGestureStart :(props : {  route :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>}): void | undefined,   onGestureEnd :(props : {  route :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>}): void | undefined,   onGestureCancel :(props : {  route :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>}): void | undefined,   gestureEnabled :boolean | undefined,   gestureResponseDistance :{  vertical :number | undefined,   horizontal :number | undefined} | undefined,   gestureVelocityImpact :number | undefined,   mode :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.StackCardMode,   headerMode :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.StackHeaderMode,   headerShown :boolean,   hasAbsoluteHeader :boolean,   headerHeight :number, onHeaderHeightChange (props : {  route :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>,   height :number}): void,   isParentHeaderShown :boolean} */
@js.native
trait Props extends js.Object {
  
  var active: Boolean = js.native
  
  var cardOverlay: js.UndefOr[js.Function1[/* props */ StyleWithAnimatedValue, ReactNode]] = js.native
  
  var cardOverlayEnabled: js.UndefOr[Boolean] = js.native
  
  var cardShadowEnabled: js.UndefOr[Boolean] = js.native
  
  var cardStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Function which specifies interpolated styles for various parts of the card, e.g. the overlay, shadow etc.
    */
  var cardStyleInterpolator: StackCardStyleInterpolator = js.native
  
  var closing: Boolean = js.native
  
  var focused: Boolean = js.native
  
  var gesture: Value = js.native
  
  /**
    * The direction of swipe gestures, `horizontal` or `vertical`.
    */
  var gestureDirection: GestureDirection = js.native
  
  var gestureEnabled: js.UndefOr[Boolean] = js.native
  
  var gestureResponseDistance: js.UndefOr[Horizontal] = js.native
  
  var gestureVelocityImpact: js.UndefOr[Double] = js.native
  
  def getFocusedRoute(): Route[String] = js.native
  
  def getPreviousScene(props: typings.reactNavigationStack.anon.Route): js.UndefOr[Scene[Route[String]]] = js.native
  
  var hasAbsoluteHeader: Boolean = js.native
  
  var headerHeight: Double = js.native
  
  var headerMode: StackHeaderMode = js.native
  
  var headerShown: Boolean = js.native
  
  /**
    * Function which specifies interpolated styles for various parts of the header, e.g. the title, left button etc.
    */
  var headerStyleInterpolator: StackHeaderStyleInterpolator = js.native
  
  var index: Double = js.native
  
  var isParentHeaderShown: Boolean = js.native
  
  var layout: Layout = js.native
  
  var mode: StackCardMode = js.native
  
  def onCloseRoute(props: typings.reactNavigationStack.anon.Route): Unit = js.native
  
  var onGestureCancel: js.UndefOr[js.Function1[/* props */ typings.reactNavigationStack.anon.Route, Unit]] = js.native
  
  var onGestureEnd: js.UndefOr[js.Function1[/* props */ typings.reactNavigationStack.anon.Route, Unit]] = js.native
  
  var onGestureStart: js.UndefOr[js.Function1[/* props */ typings.reactNavigationStack.anon.Route, Unit]] = js.native
  
  def onHeaderHeightChange(props: Height): Unit = js.native
  
  def onOpenRoute(props: typings.reactNavigationStack.anon.Route): Unit = js.native
  
  var onPageChangeCancel: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPageChangeConfirm: js.UndefOr[js.Function1[/* force */ Boolean, Unit]] = js.native
  
  var onPageChangeStart: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onTransitionEnd: js.UndefOr[
    js.Function2[/* props */ typings.reactNavigationStack.anon.Route, /* closing */ Boolean, Unit]
  ] = js.native
  
  var onTransitionStart: js.UndefOr[
    js.Function2[/* props */ typings.reactNavigationStack.anon.Route, /* closing */ Boolean, Unit]
  ] = js.native
  
  def renderHeader(props: typings.reactNavigationStack.headerContainerMod.Props): ReactNode = js.native
  
  def renderScene(props: typings.reactNavigationStack.anon.Route): ReactNode = js.native
  
  var safeAreaInsetBottom: Double = js.native
  
  var safeAreaInsetLeft: Double = js.native
  
  var safeAreaInsetRight: Double = js.native
  
  var safeAreaInsetTop: Double = js.native
  
  var scene: Scene[Route[String]] = js.native
  
  /**
    * Object which specifies the animation type (timing or spring) and their options (such as duration for timing).
    */
  var transitionSpec: Close = js.native
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
    getPreviousScene: typings.reactNavigationStack.anon.Route => js.UndefOr[Scene[Route[String]]],
    hasAbsoluteHeader: Boolean,
    headerHeight: Double,
    headerMode: StackHeaderMode,
    headerShown: Boolean,
    headerStyleInterpolator: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle,
    index: Double,
    isParentHeaderShown: Boolean,
    layout: Layout,
    mode: StackCardMode,
    onCloseRoute: typings.reactNavigationStack.anon.Route => Unit,
    onHeaderHeightChange: Height => Unit,
    onOpenRoute: typings.reactNavigationStack.anon.Route => Unit,
    renderHeader: typings.reactNavigationStack.headerContainerMod.Props => ReactNode,
    renderScene: typings.reactNavigationStack.anon.Route => ReactNode,
    safeAreaInsetBottom: Double,
    safeAreaInsetLeft: Double,
    safeAreaInsetRight: Double,
    safeAreaInsetTop: Double,
    scene: Scene[Route[String]],
    transitionSpec: Close
  ): Props = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], cardStyleInterpolator = js.Any.fromFunction1(cardStyleInterpolator), closing = closing.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], gesture = gesture.asInstanceOf[js.Any], gestureDirection = gestureDirection.asInstanceOf[js.Any], getFocusedRoute = js.Any.fromFunction0(getFocusedRoute), getPreviousScene = js.Any.fromFunction1(getPreviousScene), hasAbsoluteHeader = hasAbsoluteHeader.asInstanceOf[js.Any], headerHeight = headerHeight.asInstanceOf[js.Any], headerMode = headerMode.asInstanceOf[js.Any], headerShown = headerShown.asInstanceOf[js.Any], headerStyleInterpolator = js.Any.fromFunction1(headerStyleInterpolator), index = index.asInstanceOf[js.Any], isParentHeaderShown = isParentHeaderShown.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onCloseRoute = js.Any.fromFunction1(onCloseRoute), onHeaderHeightChange = js.Any.fromFunction1(onHeaderHeightChange), onOpenRoute = js.Any.fromFunction1(onOpenRoute), renderHeader = js.Any.fromFunction1(renderHeader), renderScene = js.Any.fromFunction1(renderScene), safeAreaInsetBottom = safeAreaInsetBottom.asInstanceOf[js.Any], safeAreaInsetLeft = safeAreaInsetLeft.asInstanceOf[js.Any], safeAreaInsetRight = safeAreaInsetRight.asInstanceOf[js.Any], safeAreaInsetTop = safeAreaInsetTop.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], transitionSpec = transitionSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardStyleInterpolator(value: /* props */ StackCardInterpolationProps => StackCardInterpolatedStyle): Self = this.set("cardStyleInterpolator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClosing(value: Boolean): Self = this.set("closing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGesture(value: Value): Self = this.set("gesture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGestureDirection(value: GestureDirection): Self = this.set("gestureDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFocusedRoute(value: () => Route[String]): Self = this.set("getFocusedRoute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPreviousScene(value: typings.reactNavigationStack.anon.Route => js.UndefOr[Scene[Route[String]]]): Self = this.set("getPreviousScene", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasAbsoluteHeader(value: Boolean): Self = this.set("hasAbsoluteHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderHeight(value: Double): Self = this.set("headerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderMode(value: StackHeaderMode): Self = this.set("headerMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderShown(value: Boolean): Self = this.set("headerShown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderStyleInterpolator(value: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle): Self = this.set("headerStyleInterpolator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsParentHeaderShown(value: Boolean): Self = this.set("isParentHeaderShown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout(value: Layout): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: StackCardMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCloseRoute(value: typings.reactNavigationStack.anon.Route => Unit): Self = this.set("onCloseRoute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnHeaderHeightChange(value: Height => Unit): Self = this.set("onHeaderHeightChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOpenRoute(value: typings.reactNavigationStack.anon.Route => Unit): Self = this.set("onOpenRoute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderHeader(value: typings.reactNavigationStack.headerContainerMod.Props => ReactNode): Self = this.set("renderHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderScene(value: typings.reactNavigationStack.anon.Route => ReactNode): Self = this.set("renderScene", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSafeAreaInsetBottom(value: Double): Self = this.set("safeAreaInsetBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeAreaInsetLeft(value: Double): Self = this.set("safeAreaInsetLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeAreaInsetRight(value: Double): Self = this.set("safeAreaInsetRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeAreaInsetTop(value: Double): Self = this.set("safeAreaInsetTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScene(value: Scene[Route[String]]): Self = this.set("scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionSpec(value: Close): Self = this.set("transitionSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardOverlay(value: /* props */ StyleWithAnimatedValue => ReactNode): Self = this.set("cardOverlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCardOverlay: Self = this.set("cardOverlay", js.undefined)
    
    @scala.inline
    def setCardOverlayEnabled(value: Boolean): Self = this.set("cardOverlayEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardOverlayEnabled: Self = this.set("cardOverlayEnabled", js.undefined)
    
    @scala.inline
    def setCardShadowEnabled(value: Boolean): Self = this.set("cardShadowEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardShadowEnabled: Self = this.set("cardShadowEnabled", js.undefined)
    
    @scala.inline
    def setCardStyle(value: StyleProp[ViewStyle]): Self = this.set("cardStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardStyle: Self = this.set("cardStyle", js.undefined)
    
    @scala.inline
    def setCardStyleNull: Self = this.set("cardStyle", null)
    
    @scala.inline
    def setGestureEnabled(value: Boolean): Self = this.set("gestureEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGestureEnabled: Self = this.set("gestureEnabled", js.undefined)
    
    @scala.inline
    def setGestureResponseDistance(value: Horizontal): Self = this.set("gestureResponseDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGestureResponseDistance: Self = this.set("gestureResponseDistance", js.undefined)
    
    @scala.inline
    def setGestureVelocityImpact(value: Double): Self = this.set("gestureVelocityImpact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGestureVelocityImpact: Self = this.set("gestureVelocityImpact", js.undefined)
    
    @scala.inline
    def setOnGestureCancel(value: /* props */ typings.reactNavigationStack.anon.Route => Unit): Self = this.set("onGestureCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnGestureCancel: Self = this.set("onGestureCancel", js.undefined)
    
    @scala.inline
    def setOnGestureEnd(value: /* props */ typings.reactNavigationStack.anon.Route => Unit): Self = this.set("onGestureEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnGestureEnd: Self = this.set("onGestureEnd", js.undefined)
    
    @scala.inline
    def setOnGestureStart(value: /* props */ typings.reactNavigationStack.anon.Route => Unit): Self = this.set("onGestureStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnGestureStart: Self = this.set("onGestureStart", js.undefined)
    
    @scala.inline
    def setOnPageChangeCancel(value: () => Unit): Self = this.set("onPageChangeCancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPageChangeCancel: Self = this.set("onPageChangeCancel", js.undefined)
    
    @scala.inline
    def setOnPageChangeConfirm(value: /* force */ Boolean => Unit): Self = this.set("onPageChangeConfirm", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPageChangeConfirm: Self = this.set("onPageChangeConfirm", js.undefined)
    
    @scala.inline
    def setOnPageChangeStart(value: () => Unit): Self = this.set("onPageChangeStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPageChangeStart: Self = this.set("onPageChangeStart", js.undefined)
    
    @scala.inline
    def setOnTransitionEnd(value: (/* props */ typings.reactNavigationStack.anon.Route, /* closing */ Boolean) => Unit): Self = this.set("onTransitionEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnTransitionEnd: Self = this.set("onTransitionEnd", js.undefined)
    
    @scala.inline
    def setOnTransitionStart(value: (/* props */ typings.reactNavigationStack.anon.Route, /* closing */ Boolean) => Unit): Self = this.set("onTransitionStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnTransitionStart: Self = this.set("onTransitionStart", js.undefined)
  }
}
