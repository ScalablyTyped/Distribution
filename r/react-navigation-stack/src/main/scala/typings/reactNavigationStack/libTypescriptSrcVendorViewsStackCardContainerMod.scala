package typings.reactNavigationStack

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.MemoExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNavigationStack.anon.Close
import typings.reactNavigationStack.anon.Height
import typings.reactNavigationStack.anon.Horizontal
import typings.reactNavigationStack.anon.StyleWithAnimatedValue
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.GestureDirection
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.Layout
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.Route
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.Scene
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackCardInterpolatedStyle
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackCardInterpolationProps
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackCardMode
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackHeaderInterpolatedStyle
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackHeaderInterpolationProps
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackHeaderMode
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.TransitionPreset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcVendorViewsStackCardContainerMod extends Shortcut {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Stack/CardContainer", JSImport.Default)
  @js.native
  val default: MemoExoticComponent[js.Function1[/* param0 */ Props, Element]] = js.native
  
  trait Props
    extends StObject
       with TransitionPreset {
    
    var active: Boolean
    
    var cardOverlay: js.UndefOr[js.Function1[/* props */ StyleWithAnimatedValue, ReactNode]] = js.undefined
    
    var cardOverlayEnabled: js.UndefOr[Boolean] = js.undefined
    
    var cardShadowEnabled: js.UndefOr[Boolean] = js.undefined
    
    var cardStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var closing: Boolean
    
    var focused: Boolean
    
    var gesture: Value
    
    var gestureEnabled: js.UndefOr[Boolean] = js.undefined
    
    var gestureResponseDistance: js.UndefOr[Horizontal] = js.undefined
    
    var gestureVelocityImpact: js.UndefOr[Double] = js.undefined
    
    def getFocusedRoute(): Route[String]
    
    def getPreviousScene(props: typings.reactNavigationStack.anon.Route): js.UndefOr[Scene[Route[String]]]
    
    var hasAbsoluteHeader: Boolean
    
    var headerHeight: Double
    
    var headerMode: StackHeaderMode
    
    var headerShown: Boolean
    
    var index: Double
    
    var isParentHeaderShown: Boolean
    
    var layout: Layout
    
    var mode: StackCardMode
    
    def onCloseRoute(props: typings.reactNavigationStack.anon.Route): Unit
    
    var onGestureCancel: js.UndefOr[js.Function1[/* props */ typings.reactNavigationStack.anon.Route, Unit]] = js.undefined
    
    var onGestureEnd: js.UndefOr[js.Function1[/* props */ typings.reactNavigationStack.anon.Route, Unit]] = js.undefined
    
    var onGestureStart: js.UndefOr[js.Function1[/* props */ typings.reactNavigationStack.anon.Route, Unit]] = js.undefined
    
    def onHeaderHeightChange(props: Height): Unit
    
    def onOpenRoute(props: typings.reactNavigationStack.anon.Route): Unit
    
    var onPageChangeCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPageChangeConfirm: js.UndefOr[js.Function1[/* force */ Boolean, Unit]] = js.undefined
    
    var onPageChangeStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onTransitionEnd: js.UndefOr[
        js.Function2[/* props */ typings.reactNavigationStack.anon.Route, /* closing */ Boolean, Unit]
      ] = js.undefined
    
    var onTransitionStart: js.UndefOr[
        js.Function2[/* props */ typings.reactNavigationStack.anon.Route, /* closing */ Boolean, Unit]
      ] = js.undefined
    
    def renderHeader(props: typings.reactNavigationStack.libTypescriptSrcVendorViewsHeaderHeaderContainerMod.Props): ReactNode
    
    def renderScene(props: typings.reactNavigationStack.anon.Route): ReactNode
    
    var safeAreaInsetBottom: Double
    
    var safeAreaInsetLeft: Double
    
    var safeAreaInsetRight: Double
    
    var safeAreaInsetTop: Double
    
    var scene: Scene[Route[String]]
  }
  object Props {
    
    inline def apply(
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
      renderHeader: typings.reactNavigationStack.libTypescriptSrcVendorViewsHeaderHeaderContainerMod.Props => ReactNode,
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
    
    extension [Self <: Props](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setCardOverlay(value: /* props */ StyleWithAnimatedValue => ReactNode): Self = StObject.set(x, "cardOverlay", js.Any.fromFunction1(value))
      
      inline def setCardOverlayEnabled(value: Boolean): Self = StObject.set(x, "cardOverlayEnabled", value.asInstanceOf[js.Any])
      
      inline def setCardOverlayEnabledUndefined: Self = StObject.set(x, "cardOverlayEnabled", js.undefined)
      
      inline def setCardOverlayUndefined: Self = StObject.set(x, "cardOverlay", js.undefined)
      
      inline def setCardShadowEnabled(value: Boolean): Self = StObject.set(x, "cardShadowEnabled", value.asInstanceOf[js.Any])
      
      inline def setCardShadowEnabledUndefined: Self = StObject.set(x, "cardShadowEnabled", js.undefined)
      
      inline def setCardStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "cardStyle", value.asInstanceOf[js.Any])
      
      inline def setCardStyleNull: Self = StObject.set(x, "cardStyle", null)
      
      inline def setCardStyleUndefined: Self = StObject.set(x, "cardStyle", js.undefined)
      
      inline def setClosing(value: Boolean): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setGesture(value: Value): Self = StObject.set(x, "gesture", value.asInstanceOf[js.Any])
      
      inline def setGestureEnabled(value: Boolean): Self = StObject.set(x, "gestureEnabled", value.asInstanceOf[js.Any])
      
      inline def setGestureEnabledUndefined: Self = StObject.set(x, "gestureEnabled", js.undefined)
      
      inline def setGestureResponseDistance(value: Horizontal): Self = StObject.set(x, "gestureResponseDistance", value.asInstanceOf[js.Any])
      
      inline def setGestureResponseDistanceUndefined: Self = StObject.set(x, "gestureResponseDistance", js.undefined)
      
      inline def setGestureVelocityImpact(value: Double): Self = StObject.set(x, "gestureVelocityImpact", value.asInstanceOf[js.Any])
      
      inline def setGestureVelocityImpactUndefined: Self = StObject.set(x, "gestureVelocityImpact", js.undefined)
      
      inline def setGetFocusedRoute(value: () => Route[String]): Self = StObject.set(x, "getFocusedRoute", js.Any.fromFunction0(value))
      
      inline def setGetPreviousScene(value: typings.reactNavigationStack.anon.Route => js.UndefOr[Scene[Route[String]]]): Self = StObject.set(x, "getPreviousScene", js.Any.fromFunction1(value))
      
      inline def setHasAbsoluteHeader(value: Boolean): Self = StObject.set(x, "hasAbsoluteHeader", value.asInstanceOf[js.Any])
      
      inline def setHeaderHeight(value: Double): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
      
      inline def setHeaderMode(value: StackHeaderMode): Self = StObject.set(x, "headerMode", value.asInstanceOf[js.Any])
      
      inline def setHeaderShown(value: Boolean): Self = StObject.set(x, "headerShown", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIsParentHeaderShown(value: Boolean): Self = StObject.set(x, "isParentHeaderShown", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setMode(value: StackCardMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setOnCloseRoute(value: typings.reactNavigationStack.anon.Route => Unit): Self = StObject.set(x, "onCloseRoute", js.Any.fromFunction1(value))
      
      inline def setOnGestureCancel(value: /* props */ typings.reactNavigationStack.anon.Route => Unit): Self = StObject.set(x, "onGestureCancel", js.Any.fromFunction1(value))
      
      inline def setOnGestureCancelUndefined: Self = StObject.set(x, "onGestureCancel", js.undefined)
      
      inline def setOnGestureEnd(value: /* props */ typings.reactNavigationStack.anon.Route => Unit): Self = StObject.set(x, "onGestureEnd", js.Any.fromFunction1(value))
      
      inline def setOnGestureEndUndefined: Self = StObject.set(x, "onGestureEnd", js.undefined)
      
      inline def setOnGestureStart(value: /* props */ typings.reactNavigationStack.anon.Route => Unit): Self = StObject.set(x, "onGestureStart", js.Any.fromFunction1(value))
      
      inline def setOnGestureStartUndefined: Self = StObject.set(x, "onGestureStart", js.undefined)
      
      inline def setOnHeaderHeightChange(value: Height => Unit): Self = StObject.set(x, "onHeaderHeightChange", js.Any.fromFunction1(value))
      
      inline def setOnOpenRoute(value: typings.reactNavigationStack.anon.Route => Unit): Self = StObject.set(x, "onOpenRoute", js.Any.fromFunction1(value))
      
      inline def setOnPageChangeCancel(value: () => Unit): Self = StObject.set(x, "onPageChangeCancel", js.Any.fromFunction0(value))
      
      inline def setOnPageChangeCancelUndefined: Self = StObject.set(x, "onPageChangeCancel", js.undefined)
      
      inline def setOnPageChangeConfirm(value: /* force */ Boolean => Unit): Self = StObject.set(x, "onPageChangeConfirm", js.Any.fromFunction1(value))
      
      inline def setOnPageChangeConfirmUndefined: Self = StObject.set(x, "onPageChangeConfirm", js.undefined)
      
      inline def setOnPageChangeStart(value: () => Unit): Self = StObject.set(x, "onPageChangeStart", js.Any.fromFunction0(value))
      
      inline def setOnPageChangeStartUndefined: Self = StObject.set(x, "onPageChangeStart", js.undefined)
      
      inline def setOnTransitionEnd(value: (/* props */ typings.reactNavigationStack.anon.Route, /* closing */ Boolean) => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction2(value))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOnTransitionStart(value: (/* props */ typings.reactNavigationStack.anon.Route, /* closing */ Boolean) => Unit): Self = StObject.set(x, "onTransitionStart", js.Any.fromFunction2(value))
      
      inline def setOnTransitionStartUndefined: Self = StObject.set(x, "onTransitionStart", js.undefined)
      
      inline def setRenderHeader(
        value: typings.reactNavigationStack.libTypescriptSrcVendorViewsHeaderHeaderContainerMod.Props => ReactNode
      ): Self = StObject.set(x, "renderHeader", js.Any.fromFunction1(value))
      
      inline def setRenderScene(value: typings.reactNavigationStack.anon.Route => ReactNode): Self = StObject.set(x, "renderScene", js.Any.fromFunction1(value))
      
      inline def setSafeAreaInsetBottom(value: Double): Self = StObject.set(x, "safeAreaInsetBottom", value.asInstanceOf[js.Any])
      
      inline def setSafeAreaInsetLeft(value: Double): Self = StObject.set(x, "safeAreaInsetLeft", value.asInstanceOf[js.Any])
      
      inline def setSafeAreaInsetRight(value: Double): Self = StObject.set(x, "safeAreaInsetRight", value.asInstanceOf[js.Any])
      
      inline def setSafeAreaInsetTop(value: Double): Self = StObject.set(x, "safeAreaInsetTop", value.asInstanceOf[js.Any])
      
      inline def setScene(value: Scene[Route[String]]): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = MemoExoticComponent[js.Function1[/* param0 */ Props, Element]]
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptSrcVendorViewsStackCardContainerMod.foo` */
  override def _to: MemoExoticComponent[js.Function1[/* param0 */ Props, Element]] = default
}
