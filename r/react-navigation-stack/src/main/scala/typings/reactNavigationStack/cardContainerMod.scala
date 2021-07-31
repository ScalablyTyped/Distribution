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
import typings.reactNavigationStack.vendorTypesMod.GestureDirection
import typings.reactNavigationStack.vendorTypesMod.Layout
import typings.reactNavigationStack.vendorTypesMod.Route
import typings.reactNavigationStack.vendorTypesMod.Scene
import typings.reactNavigationStack.vendorTypesMod.StackCardInterpolatedStyle
import typings.reactNavigationStack.vendorTypesMod.StackCardInterpolationProps
import typings.reactNavigationStack.vendorTypesMod.StackCardMode
import typings.reactNavigationStack.vendorTypesMod.StackHeaderInterpolatedStyle
import typings.reactNavigationStack.vendorTypesMod.StackHeaderInterpolationProps
import typings.reactNavigationStack.vendorTypesMod.StackHeaderMode
import typings.reactNavigationStack.vendorTypesMod.TransitionPreset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardContainerMod extends Shortcut {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Stack/CardContainer", JSImport.Default)
  @js.native
  val default: MemoExoticComponent[
    js.Function1[
      /* hasActiveCardOverlayCardOverlayEnabledCardShadowEnabledCardStyleCardStyleInterpolatorClosingGestureFocusedGestureDirectionGestureEnabledGestureResponseDistanceGestureVelocityImpactGetPreviousSceneGetFocusedRouteModeHeaderModeHeaderShownHeaderStyleInterpolatorHasAbsoluteHeaderHeaderHeightOnHeaderHeightChangeIsParentHeaderShownIndexLayoutOnCloseRouteOnOpenRouteOnPageChangeCancelOnPageChangeConfirmOnPageChangeStartOnGestureCancelOnGestureEndOnGestureStartOnTransitionEndOnTransitionStartRenderHeaderRenderSceneSafeAreaInsetBottomSafeAreaInsetLeftSafeAreaInsetRightSafeAreaInsetTopSceneTransitionSpec */ Props, 
      Element
    ]
  ] = js.native
  
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
    
    def renderHeader(props: typings.reactNavigationStack.headerContainerMod.Props): ReactNode
    
    def renderScene(props: typings.reactNavigationStack.anon.Route): ReactNode
    
    var safeAreaInsetBottom: Double
    
    var safeAreaInsetLeft: Double
    
    var safeAreaInsetRight: Double
    
    var safeAreaInsetTop: Double
    
    var scene: Scene[Route[String]]
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
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardOverlay(value: /* props */ StyleWithAnimatedValue => ReactNode): Self = StObject.set(x, "cardOverlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCardOverlayEnabled(value: Boolean): Self = StObject.set(x, "cardOverlayEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardOverlayEnabledUndefined: Self = StObject.set(x, "cardOverlayEnabled", js.undefined)
      
      @scala.inline
      def setCardOverlayUndefined: Self = StObject.set(x, "cardOverlay", js.undefined)
      
      @scala.inline
      def setCardShadowEnabled(value: Boolean): Self = StObject.set(x, "cardShadowEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardShadowEnabledUndefined: Self = StObject.set(x, "cardShadowEnabled", js.undefined)
      
      @scala.inline
      def setCardStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "cardStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardStyleNull: Self = StObject.set(x, "cardStyle", null)
      
      @scala.inline
      def setCardStyleUndefined: Self = StObject.set(x, "cardStyle", js.undefined)
      
      @scala.inline
      def setClosing(value: Boolean): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGesture(value: Value): Self = StObject.set(x, "gesture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGestureEnabled(value: Boolean): Self = StObject.set(x, "gestureEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGestureEnabledUndefined: Self = StObject.set(x, "gestureEnabled", js.undefined)
      
      @scala.inline
      def setGestureResponseDistance(value: Horizontal): Self = StObject.set(x, "gestureResponseDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGestureResponseDistanceUndefined: Self = StObject.set(x, "gestureResponseDistance", js.undefined)
      
      @scala.inline
      def setGestureVelocityImpact(value: Double): Self = StObject.set(x, "gestureVelocityImpact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGestureVelocityImpactUndefined: Self = StObject.set(x, "gestureVelocityImpact", js.undefined)
      
      @scala.inline
      def setGetFocusedRoute(value: () => Route[String]): Self = StObject.set(x, "getFocusedRoute", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPreviousScene(value: typings.reactNavigationStack.anon.Route => js.UndefOr[Scene[Route[String]]]): Self = StObject.set(x, "getPreviousScene", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasAbsoluteHeader(value: Boolean): Self = StObject.set(x, "hasAbsoluteHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderHeight(value: Double): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderMode(value: StackHeaderMode): Self = StObject.set(x, "headerMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderShown(value: Boolean): Self = StObject.set(x, "headerShown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsParentHeaderShown(value: Boolean): Self = StObject.set(x, "isParentHeaderShown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: StackCardMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCloseRoute(value: typings.reactNavigationStack.anon.Route => Unit): Self = StObject.set(x, "onCloseRoute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnGestureCancel(value: /* props */ typings.reactNavigationStack.anon.Route => Unit): Self = StObject.set(x, "onGestureCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnGestureCancelUndefined: Self = StObject.set(x, "onGestureCancel", js.undefined)
      
      @scala.inline
      def setOnGestureEnd(value: /* props */ typings.reactNavigationStack.anon.Route => Unit): Self = StObject.set(x, "onGestureEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnGestureEndUndefined: Self = StObject.set(x, "onGestureEnd", js.undefined)
      
      @scala.inline
      def setOnGestureStart(value: /* props */ typings.reactNavigationStack.anon.Route => Unit): Self = StObject.set(x, "onGestureStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnGestureStartUndefined: Self = StObject.set(x, "onGestureStart", js.undefined)
      
      @scala.inline
      def setOnHeaderHeightChange(value: Height => Unit): Self = StObject.set(x, "onHeaderHeightChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenRoute(value: typings.reactNavigationStack.anon.Route => Unit): Self = StObject.set(x, "onOpenRoute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPageChangeCancel(value: () => Unit): Self = StObject.set(x, "onPageChangeCancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPageChangeCancelUndefined: Self = StObject.set(x, "onPageChangeCancel", js.undefined)
      
      @scala.inline
      def setOnPageChangeConfirm(value: /* force */ Boolean => Unit): Self = StObject.set(x, "onPageChangeConfirm", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPageChangeConfirmUndefined: Self = StObject.set(x, "onPageChangeConfirm", js.undefined)
      
      @scala.inline
      def setOnPageChangeStart(value: () => Unit): Self = StObject.set(x, "onPageChangeStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPageChangeStartUndefined: Self = StObject.set(x, "onPageChangeStart", js.undefined)
      
      @scala.inline
      def setOnTransitionEnd(value: (/* props */ typings.reactNavigationStack.anon.Route, /* closing */ Boolean) => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      @scala.inline
      def setOnTransitionStart(value: (/* props */ typings.reactNavigationStack.anon.Route, /* closing */ Boolean) => Unit): Self = StObject.set(x, "onTransitionStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnTransitionStartUndefined: Self = StObject.set(x, "onTransitionStart", js.undefined)
      
      @scala.inline
      def setRenderHeader(value: typings.reactNavigationStack.headerContainerMod.Props => ReactNode): Self = StObject.set(x, "renderHeader", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderScene(value: typings.reactNavigationStack.anon.Route => ReactNode): Self = StObject.set(x, "renderScene", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSafeAreaInsetBottom(value: Double): Self = StObject.set(x, "safeAreaInsetBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafeAreaInsetLeft(value: Double): Self = StObject.set(x, "safeAreaInsetLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafeAreaInsetRight(value: Double): Self = StObject.set(x, "safeAreaInsetRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafeAreaInsetTop(value: Double): Self = StObject.set(x, "safeAreaInsetTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScene(value: Scene[Route[String]]): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = MemoExoticComponent[
    js.Function1[
      /* hasActiveCardOverlayCardOverlayEnabledCardShadowEnabledCardStyleCardStyleInterpolatorClosingGestureFocusedGestureDirectionGestureEnabledGestureResponseDistanceGestureVelocityImpactGetPreviousSceneGetFocusedRouteModeHeaderModeHeaderShownHeaderStyleInterpolatorHasAbsoluteHeaderHeaderHeightOnHeaderHeightChangeIsParentHeaderShownIndexLayoutOnCloseRouteOnOpenRouteOnPageChangeCancelOnPageChangeConfirmOnPageChangeStartOnGestureCancelOnGestureEndOnGestureStartOnTransitionEndOnTransitionStartRenderHeaderRenderSceneSafeAreaInsetBottomSafeAreaInsetLeftSafeAreaInsetRightSafeAreaInsetTopSceneTransitionSpec */ Props, 
      Element
    ]
  ]
  
  /* This means you don't have to write `default`, but can instead just say `cardContainerMod.foo` */
  override def _to: MemoExoticComponent[
    js.Function1[
      /* hasActiveCardOverlayCardOverlayEnabledCardShadowEnabledCardStyleCardStyleInterpolatorClosingGestureFocusedGestureDirectionGestureEnabledGestureResponseDistanceGestureVelocityImpactGetPreviousSceneGetFocusedRouteModeHeaderModeHeaderShownHeaderStyleInterpolatorHasAbsoluteHeaderHeaderHeightOnHeaderHeightChangeIsParentHeaderShownIndexLayoutOnCloseRouteOnOpenRouteOnPageChangeCancelOnPageChangeConfirmOnPageChangeStartOnGestureCancelOnGestureEndOnGestureStartOnTransitionEndOnTransitionStartRenderHeaderRenderSceneSafeAreaInsetBottomSafeAreaInsetLeftSafeAreaInsetRightSafeAreaInsetTopSceneTransitionSpec */ Props, 
      Element
    ]
  ] = default
}
