package typings.reactNavigationStack

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.AnimatedInterpolation
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewProps
import typings.reactNative.mod.ViewStyle
import typings.reactNativeSafeAreaContext.safeAreaTypesMod.EdgeInsets
import typings.reactNavigationStack.anon.Close
import typings.reactNavigationStack.anon.Gesture
import typings.reactNavigationStack.anon.GestureEnabled
import typings.reactNavigationStack.anon.Horizontal
import typings.reactNavigationStack.anon.StyleWithAnimatedValue
import typings.reactNavigationStack.vendorTypesMod.GestureDirection
import typings.reactNavigationStack.vendorTypesMod.Layout
import typings.reactNavigationStack.vendorTypesMod.StackCardInterpolatedStyle
import typings.reactNavigationStack.vendorTypesMod.StackCardInterpolationProps
import typings.reactNavigationStack.vendorTypesMod.StackCardStyleInterpolator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Stack/Card", JSImport.Default)
  @js.native
  open class default () extends Card
  /* static members */
  object default {
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Stack/Card", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Stack/Card", "default.defaultProps")
    @js.native
    def defaultProps: GestureEnabled = js.native
    inline def defaultProps_=(x: GestureEnabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Card
    extends Component[Props, js.Object, Any] {
    
    /* private */ var animate: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MCard(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MCard(prevProps: Props): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MCard(): Unit = js.native
    
    /* private */ var contentRef: Any = js.native
    
    /* private */ var gestureActivationCriteria: Any = js.native
    
    /* private */ var getAnimateToValue: Any = js.native
    
    /* private */ var getCardAnimationContext: Any = js.native
    
    /* private */ var getInterpolatedStyle: Any = js.native
    
    /* private */ var handleEndInteraction: Any = js.native
    
    /* private */ var handleGestureStateChange: Any = js.native
    
    /* private */ var handleStartInteraction: Any = js.native
    
    /* private */ var interactionHandle: Any = js.native
    
    /* private */ var inverted: Any = js.native
    
    /* private */ var isClosing: Any = js.native
    
    /* private */ var isCurrentlyMounted: Any = js.native
    
    /* private */ var isSwiping: Any = js.native
    
    /* private */ var lastToValue: Any = js.native
    
    /* private */ var layout: Any = js.native
    
    /* private */ var pendingGestureCallback: Any = js.native
    
    /* private */ var setPointerEventsEnabled: Any = js.native
  }
  
  trait Props
    extends StObject
       with ViewProps {
    
    @JSName("children")
    var children_Props: ReactNode
    
    var closing: Boolean
    
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var current: AnimatedInterpolation[Double | String]
    
    var gesture: Value
    
    var gestureDirection: GestureDirection
    
    var gestureEnabled: Boolean
    
    var gestureResponseDistance: js.UndefOr[Horizontal] = js.undefined
    
    var gestureVelocityImpact: Double
    
    var index: Double
    
    var insets: EdgeInsets
    
    var layout: Layout
    
    var next: js.UndefOr[AnimatedInterpolation[Double | String]] = js.undefined
    
    def onClose(): Unit
    
    var onGestureBegin: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onGestureCanceled: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onGestureEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    def onOpen(): Unit
    
    var onTransition: js.UndefOr[js.Function1[/* props */ Gesture, Unit]] = js.undefined
    
    def overlay(props: StyleWithAnimatedValue): ReactNode
    
    var overlayEnabled: Boolean
    
    var pageOverflowEnabled: Boolean
    
    var shadowEnabled: Boolean
    
    var styleInterpolator: StackCardStyleInterpolator
    
    var transitionSpec: Close
  }
  object Props {
    
    inline def apply(
      closing: Boolean,
      current: AnimatedInterpolation[Double | String],
      gesture: Value,
      gestureDirection: GestureDirection,
      gestureEnabled: Boolean,
      gestureVelocityImpact: Double,
      index: Double,
      insets: EdgeInsets,
      layout: Layout,
      onClose: () => Unit,
      onOpen: () => Unit,
      overlay: StyleWithAnimatedValue => ReactNode,
      overlayEnabled: Boolean,
      pageOverflowEnabled: Boolean,
      shadowEnabled: Boolean,
      styleInterpolator: /* props */ StackCardInterpolationProps => StackCardInterpolatedStyle,
      transitionSpec: Close
    ): Props = {
      val __obj = js.Dynamic.literal(closing = closing.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], gesture = gesture.asInstanceOf[js.Any], gestureDirection = gestureDirection.asInstanceOf[js.Any], gestureEnabled = gestureEnabled.asInstanceOf[js.Any], gestureVelocityImpact = gestureVelocityImpact.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], insets = insets.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose), onOpen = js.Any.fromFunction0(onOpen), overlay = js.Any.fromFunction1(overlay), overlayEnabled = overlayEnabled.asInstanceOf[js.Any], pageOverflowEnabled = pageOverflowEnabled.asInstanceOf[js.Any], shadowEnabled = shadowEnabled.asInstanceOf[js.Any], styleInterpolator = js.Any.fromFunction1(styleInterpolator), transitionSpec = transitionSpec.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClosing(value: Boolean): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
      
      inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setContentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      inline def setContentStyleNull: Self = StObject.set(x, "contentStyle", null)
      
      inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      inline def setCurrent(value: AnimatedInterpolation[Double | String]): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setGesture(value: Value): Self = StObject.set(x, "gesture", value.asInstanceOf[js.Any])
      
      inline def setGestureDirection(value: GestureDirection): Self = StObject.set(x, "gestureDirection", value.asInstanceOf[js.Any])
      
      inline def setGestureEnabled(value: Boolean): Self = StObject.set(x, "gestureEnabled", value.asInstanceOf[js.Any])
      
      inline def setGestureResponseDistance(value: Horizontal): Self = StObject.set(x, "gestureResponseDistance", value.asInstanceOf[js.Any])
      
      inline def setGestureResponseDistanceUndefined: Self = StObject.set(x, "gestureResponseDistance", js.undefined)
      
      inline def setGestureVelocityImpact(value: Double): Self = StObject.set(x, "gestureVelocityImpact", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setInsets(value: EdgeInsets): Self = StObject.set(x, "insets", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setNext(value: AnimatedInterpolation[Double | String]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnGestureBegin(value: () => Unit): Self = StObject.set(x, "onGestureBegin", js.Any.fromFunction0(value))
      
      inline def setOnGestureBeginUndefined: Self = StObject.set(x, "onGestureBegin", js.undefined)
      
      inline def setOnGestureCanceled(value: () => Unit): Self = StObject.set(x, "onGestureCanceled", js.Any.fromFunction0(value))
      
      inline def setOnGestureCanceledUndefined: Self = StObject.set(x, "onGestureCanceled", js.undefined)
      
      inline def setOnGestureEnd(value: () => Unit): Self = StObject.set(x, "onGestureEnd", js.Any.fromFunction0(value))
      
      inline def setOnGestureEndUndefined: Self = StObject.set(x, "onGestureEnd", js.undefined)
      
      inline def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
      
      inline def setOnTransition(value: /* props */ Gesture => Unit): Self = StObject.set(x, "onTransition", js.Any.fromFunction1(value))
      
      inline def setOnTransitionUndefined: Self = StObject.set(x, "onTransition", js.undefined)
      
      inline def setOverlay(value: StyleWithAnimatedValue => ReactNode): Self = StObject.set(x, "overlay", js.Any.fromFunction1(value))
      
      inline def setOverlayEnabled(value: Boolean): Self = StObject.set(x, "overlayEnabled", value.asInstanceOf[js.Any])
      
      inline def setPageOverflowEnabled(value: Boolean): Self = StObject.set(x, "pageOverflowEnabled", value.asInstanceOf[js.Any])
      
      inline def setShadowEnabled(value: Boolean): Self = StObject.set(x, "shadowEnabled", value.asInstanceOf[js.Any])
      
      inline def setStyleInterpolator(value: /* props */ StackCardInterpolationProps => StackCardInterpolatedStyle): Self = StObject.set(x, "styleInterpolator", js.Any.fromFunction1(value))
      
      inline def setTransitionSpec(value: Close): Self = StObject.set(x, "transitionSpec", value.asInstanceOf[js.Any])
    }
  }
}
