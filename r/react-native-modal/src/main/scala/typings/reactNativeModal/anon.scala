package typings.reactNativeModal

import org.scalablytyped.runtime.StringDictionary
import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.ReactNode
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.Insets
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.PanResponderGestureState
import typings.reactNative.mod.PointerEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TVParallaxProperties
import typings.reactNative.mod.ViewStyle
import typings.reactNativeModal.distModalMod.OnSwipeCompleteParams
import typings.reactNativeModal.distTypesMod.Direction
import typings.reactNativeModal.distTypesMod.GestureResponderEvent
import typings.reactNativeModal.distTypesMod.OnOrientationChange
import typings.reactNativeModal.distTypesMod.OrNull
import typings.reactNativeModal.distTypesMod.PresentationStyle
import typings.reactNativeModal.reactNativeModalStrings.`box-none`
import typings.reactNativeModal.reactNativeModalStrings.`box-only`
import typings.reactNativeModal.reactNativeModalStrings.`landscape-left`
import typings.reactNativeModal.reactNativeModalStrings.`landscape-right`
import typings.reactNativeModal.reactNativeModalStrings.`no-hide-descendants`
import typings.reactNativeModal.reactNativeModalStrings.`portrait-upside-down`
import typings.reactNativeModal.reactNativeModalStrings.absolute
import typings.reactNativeModal.reactNativeModalStrings.assertive
import typings.reactNativeModal.reactNativeModalStrings.auto
import typings.reactNativeModal.reactNativeModalStrings.center
import typings.reactNativeModal.reactNativeModalStrings.landscape
import typings.reactNativeModal.reactNativeModalStrings.no
import typings.reactNativeModal.reactNativeModalStrings.none
import typings.reactNativeModal.reactNativeModalStrings.polite
import typings.reactNativeModal.reactNativeModalStrings.portrait
import typings.reactNativeModal.reactNativeModalStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AnimationIn extends StObject {
    
    var animationIn: Requireable[String | js.Object]
    
    var animationInTiming: Requireable[Double]
    
    var animationOut: Requireable[String | js.Object]
    
    var animationOutTiming: Requireable[Double]
    
    var avoidKeyboard: Requireable[Boolean]
    
    var backdropColor: Requireable[String]
    
    var backdropOpacity: Requireable[Double]
    
    var backdropTransitionInTiming: Requireable[Double]
    
    var backdropTransitionOutTiming: Requireable[Double]
    
    var children: Validator[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray]
    
    var coverScreen: Requireable[Boolean]
    
    var customBackdrop: Requireable[ReactNodeLike]
    
    var deviceHeight: Requireable[Double]
    
    var deviceWidth: Requireable[Double]
    
    var hasBackdrop: Requireable[Boolean]
    
    var hideModalContentWhileAnimating: Requireable[Boolean]
    
    var isVisible: Validator[Boolean]
    
    var onBackButtonPress: Requireable[js.Function1[/* repeated */ Any, Any]]
    
    var onBackdropPress: Requireable[js.Function1[/* repeated */ Any, Any]]
    
    var onModalHide: Requireable[js.Function1[/* repeated */ Any, Any]]
    
    var onModalShow: Requireable[js.Function1[/* repeated */ Any, Any]]
    
    var onModalWillHide: Requireable[js.Function1[/* repeated */ Any, Any]]
    
    var onModalWillShow: Requireable[js.Function1[/* repeated */ Any, Any]]
    
    var onSwipeCancel: Requireable[js.Function1[/* repeated */ Any, Any]]
    
    var onSwipeComplete: Requireable[js.Function1[/* repeated */ Any, Any]]
    
    var onSwipeMove: Requireable[js.Function1[/* repeated */ Any, Any]]
    
    var onSwipeStart: Requireable[js.Function1[/* repeated */ Any, Any]]
    
    var panResponderThreshold: Requireable[Double]
    
    var propagateSwipe: Requireable[Boolean | (js.Function1[/* repeated */ Any, Any])]
    
    var scrollHorizontal: Requireable[Boolean]
    
    var scrollOffset: Requireable[Double]
    
    var scrollOffsetMax: Requireable[Double]
    
    var scrollTo: Requireable[js.Function1[/* repeated */ Any, Any]]
    
    var style: Requireable[Any]
    
    var supportedOrientations: Requireable[js.Array[js.UndefOr[String | Null]]]
    
    var swipeDirection: Requireable[String | (js.Array[js.UndefOr[String | Null]])]
    
    var swipeThreshold: Requireable[Double]
    
    var useNativeDriver: Requireable[Boolean]
    
    var useNativeDriverForBackdrop: Requireable[Boolean]
  }
  object AnimationIn {
    
    inline def apply(
      animationIn: Requireable[String | js.Object],
      animationInTiming: Requireable[Double],
      animationOut: Requireable[String | js.Object],
      animationOutTiming: Requireable[Double],
      avoidKeyboard: Requireable[Boolean],
      backdropColor: Requireable[String],
      backdropOpacity: Requireable[Double],
      backdropTransitionInTiming: Requireable[Double],
      backdropTransitionOutTiming: Requireable[Double],
      children: Validator[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray],
      coverScreen: Requireable[Boolean],
      customBackdrop: Requireable[ReactNodeLike],
      deviceHeight: Requireable[Double],
      deviceWidth: Requireable[Double],
      hasBackdrop: Requireable[Boolean],
      hideModalContentWhileAnimating: Requireable[Boolean],
      isVisible: Validator[Boolean],
      onBackButtonPress: Requireable[js.Function1[/* repeated */ Any, Any]],
      onBackdropPress: Requireable[js.Function1[/* repeated */ Any, Any]],
      onModalHide: Requireable[js.Function1[/* repeated */ Any, Any]],
      onModalShow: Requireable[js.Function1[/* repeated */ Any, Any]],
      onModalWillHide: Requireable[js.Function1[/* repeated */ Any, Any]],
      onModalWillShow: Requireable[js.Function1[/* repeated */ Any, Any]],
      onSwipeCancel: Requireable[js.Function1[/* repeated */ Any, Any]],
      onSwipeComplete: Requireable[js.Function1[/* repeated */ Any, Any]],
      onSwipeMove: Requireable[js.Function1[/* repeated */ Any, Any]],
      onSwipeStart: Requireable[js.Function1[/* repeated */ Any, Any]],
      panResponderThreshold: Requireable[Double],
      propagateSwipe: Requireable[Boolean | (js.Function1[/* repeated */ Any, Any])],
      scrollHorizontal: Requireable[Boolean],
      scrollOffset: Requireable[Double],
      scrollOffsetMax: Requireable[Double],
      scrollTo: Requireable[js.Function1[/* repeated */ Any, Any]],
      style: Requireable[Any],
      supportedOrientations: Requireable[js.Array[js.UndefOr[String | Null]]],
      swipeDirection: Requireable[String | (js.Array[js.UndefOr[String | Null]])],
      swipeThreshold: Requireable[Double],
      useNativeDriver: Requireable[Boolean],
      useNativeDriverForBackdrop: Requireable[Boolean]
    ): AnimationIn = {
      val __obj = js.Dynamic.literal(animationIn = animationIn.asInstanceOf[js.Any], animationInTiming = animationInTiming.asInstanceOf[js.Any], animationOut = animationOut.asInstanceOf[js.Any], animationOutTiming = animationOutTiming.asInstanceOf[js.Any], avoidKeyboard = avoidKeyboard.asInstanceOf[js.Any], backdropColor = backdropColor.asInstanceOf[js.Any], backdropOpacity = backdropOpacity.asInstanceOf[js.Any], backdropTransitionInTiming = backdropTransitionInTiming.asInstanceOf[js.Any], backdropTransitionOutTiming = backdropTransitionOutTiming.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], coverScreen = coverScreen.asInstanceOf[js.Any], customBackdrop = customBackdrop.asInstanceOf[js.Any], deviceHeight = deviceHeight.asInstanceOf[js.Any], deviceWidth = deviceWidth.asInstanceOf[js.Any], hasBackdrop = hasBackdrop.asInstanceOf[js.Any], hideModalContentWhileAnimating = hideModalContentWhileAnimating.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], onBackButtonPress = onBackButtonPress.asInstanceOf[js.Any], onBackdropPress = onBackdropPress.asInstanceOf[js.Any], onModalHide = onModalHide.asInstanceOf[js.Any], onModalShow = onModalShow.asInstanceOf[js.Any], onModalWillHide = onModalWillHide.asInstanceOf[js.Any], onModalWillShow = onModalWillShow.asInstanceOf[js.Any], onSwipeCancel = onSwipeCancel.asInstanceOf[js.Any], onSwipeComplete = onSwipeComplete.asInstanceOf[js.Any], onSwipeMove = onSwipeMove.asInstanceOf[js.Any], onSwipeStart = onSwipeStart.asInstanceOf[js.Any], panResponderThreshold = panResponderThreshold.asInstanceOf[js.Any], propagateSwipe = propagateSwipe.asInstanceOf[js.Any], scrollHorizontal = scrollHorizontal.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], scrollOffsetMax = scrollOffsetMax.asInstanceOf[js.Any], scrollTo = scrollTo.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], supportedOrientations = supportedOrientations.asInstanceOf[js.Any], swipeDirection = swipeDirection.asInstanceOf[js.Any], swipeThreshold = swipeThreshold.asInstanceOf[js.Any], useNativeDriver = useNativeDriver.asInstanceOf[js.Any], useNativeDriverForBackdrop = useNativeDriverForBackdrop.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimationIn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnimationIn] (val x: Self) extends AnyVal {
      
      inline def setAnimationIn(value: Requireable[String | js.Object]): Self = StObject.set(x, "animationIn", value.asInstanceOf[js.Any])
      
      inline def setAnimationInTiming(value: Requireable[Double]): Self = StObject.set(x, "animationInTiming", value.asInstanceOf[js.Any])
      
      inline def setAnimationOut(value: Requireable[String | js.Object]): Self = StObject.set(x, "animationOut", value.asInstanceOf[js.Any])
      
      inline def setAnimationOutTiming(value: Requireable[Double]): Self = StObject.set(x, "animationOutTiming", value.asInstanceOf[js.Any])
      
      inline def setAvoidKeyboard(value: Requireable[Boolean]): Self = StObject.set(x, "avoidKeyboard", value.asInstanceOf[js.Any])
      
      inline def setBackdropColor(value: Requireable[String]): Self = StObject.set(x, "backdropColor", value.asInstanceOf[js.Any])
      
      inline def setBackdropOpacity(value: Requireable[Double]): Self = StObject.set(x, "backdropOpacity", value.asInstanceOf[js.Any])
      
      inline def setBackdropTransitionInTiming(value: Requireable[Double]): Self = StObject.set(x, "backdropTransitionInTiming", value.asInstanceOf[js.Any])
      
      inline def setBackdropTransitionOutTiming(value: Requireable[Double]): Self = StObject.set(x, "backdropTransitionOutTiming", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: Validator[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setCoverScreen(value: Requireable[Boolean]): Self = StObject.set(x, "coverScreen", value.asInstanceOf[js.Any])
      
      inline def setCustomBackdrop(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "customBackdrop", value.asInstanceOf[js.Any])
      
      inline def setDeviceHeight(value: Requireable[Double]): Self = StObject.set(x, "deviceHeight", value.asInstanceOf[js.Any])
      
      inline def setDeviceWidth(value: Requireable[Double]): Self = StObject.set(x, "deviceWidth", value.asInstanceOf[js.Any])
      
      inline def setHasBackdrop(value: Requireable[Boolean]): Self = StObject.set(x, "hasBackdrop", value.asInstanceOf[js.Any])
      
      inline def setHideModalContentWhileAnimating(value: Requireable[Boolean]): Self = StObject.set(x, "hideModalContentWhileAnimating", value.asInstanceOf[js.Any])
      
      inline def setIsVisible(value: Validator[Boolean]): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setOnBackButtonPress(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onBackButtonPress", value.asInstanceOf[js.Any])
      
      inline def setOnBackdropPress(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onBackdropPress", value.asInstanceOf[js.Any])
      
      inline def setOnModalHide(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onModalHide", value.asInstanceOf[js.Any])
      
      inline def setOnModalShow(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onModalShow", value.asInstanceOf[js.Any])
      
      inline def setOnModalWillHide(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onModalWillHide", value.asInstanceOf[js.Any])
      
      inline def setOnModalWillShow(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onModalWillShow", value.asInstanceOf[js.Any])
      
      inline def setOnSwipeCancel(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onSwipeCancel", value.asInstanceOf[js.Any])
      
      inline def setOnSwipeComplete(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onSwipeComplete", value.asInstanceOf[js.Any])
      
      inline def setOnSwipeMove(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onSwipeMove", value.asInstanceOf[js.Any])
      
      inline def setOnSwipeStart(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onSwipeStart", value.asInstanceOf[js.Any])
      
      inline def setPanResponderThreshold(value: Requireable[Double]): Self = StObject.set(x, "panResponderThreshold", value.asInstanceOf[js.Any])
      
      inline def setPropagateSwipe(value: Requireable[Boolean | (js.Function1[/* repeated */ Any, Any])]): Self = StObject.set(x, "propagateSwipe", value.asInstanceOf[js.Any])
      
      inline def setScrollHorizontal(value: Requireable[Boolean]): Self = StObject.set(x, "scrollHorizontal", value.asInstanceOf[js.Any])
      
      inline def setScrollOffset(value: Requireable[Double]): Self = StObject.set(x, "scrollOffset", value.asInstanceOf[js.Any])
      
      inline def setScrollOffsetMax(value: Requireable[Double]): Self = StObject.set(x, "scrollOffsetMax", value.asInstanceOf[js.Any])
      
      inline def setScrollTo(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "scrollTo", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: Requireable[Any]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setSupportedOrientations(value: Requireable[js.Array[js.UndefOr[String | Null]]]): Self = StObject.set(x, "supportedOrientations", value.asInstanceOf[js.Any])
      
      inline def setSwipeDirection(value: Requireable[String | (js.Array[js.UndefOr[String | Null]])]): Self = StObject.set(x, "swipeDirection", value.asInstanceOf[js.Any])
      
      inline def setSwipeThreshold(value: Requireable[Double]): Self = StObject.set(x, "swipeThreshold", value.asInstanceOf[js.Any])
      
      inline def setUseNativeDriver(value: Requireable[Boolean]): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
      
      inline def setUseNativeDriverForBackdrop(value: Requireable[Boolean]): Self = StObject.set(x, "useNativeDriverForBackdrop", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnimationInTiming extends StObject {
    
    var animationIn: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typings.reactNativeModal.reactNativeModalStrings.bounce, typings.reactNativeModal.reactNativeModalStrings.flash, typings.reactNativeModal.reactNativeModalStrings.jello */ Any
    
    var animationInTiming: Double
    
    var animationOut: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typings.reactNativeModal.reactNativeModalStrings.bounce, typings.reactNativeModal.reactNativeModalStrings.flash, typings.reactNativeModal.reactNativeModalStrings.jello */ Any
    
    var animationOutTiming: Double
    
    var avoidKeyboard: Boolean
    
    var backdropColor: String
    
    var backdropOpacity: Double
    
    var backdropTransitionInTiming: Double
    
    var backdropTransitionOutTiming: Double
    
    var coverScreen: Boolean
    
    var customBackdrop: ReactNode
    
    var deviceHeight: Double | Null
    
    var deviceWidth: Double | Null
    
    var hasBackdrop: Boolean
    
    var hideModalContentWhileAnimating: Boolean
    
    var isVisible: Boolean
    
    def onBackButtonPress(): Unit
    
    def onBackdropPress(): Unit
    
    def onModalHide(): Unit
    
    def onModalShow(): Unit
    
    def onModalWillHide(): Unit
    
    def onModalWillShow(): Unit
    
    var panResponderThreshold: Double
    
    var propagateSwipe: Boolean | (js.Function2[
        /* event */ GestureResponderEvent, 
        /* gestureState */ PanResponderGestureState, 
        Boolean
      ])
    
    var scrollHorizontal: Boolean
    
    var scrollOffset: Double
    
    var scrollOffsetMax: Double
    
    var scrollTo: OrNull[js.Function1[/* e */ Any, Unit]]
    
    var statusBarTranslucent: Boolean
    
    var supportedOrientations: js.Array[
        landscape | portrait | `portrait-upside-down` | `landscape-left` | `landscape-right`
      ]
    
    var swipeThreshold: Double
    
    var useNativeDriver: Boolean
  }
  object AnimationInTiming {
    
    inline def apply(
      animationIn: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typings.reactNativeModal.reactNativeModalStrings.bounce, typings.reactNativeModal.reactNativeModalStrings.flash, typings.reactNativeModal.reactNativeModalStrings.jello */ Any,
      animationInTiming: Double,
      animationOut: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typings.reactNativeModal.reactNativeModalStrings.bounce, typings.reactNativeModal.reactNativeModalStrings.flash, typings.reactNativeModal.reactNativeModalStrings.jello */ Any,
      animationOutTiming: Double,
      avoidKeyboard: Boolean,
      backdropColor: String,
      backdropOpacity: Double,
      backdropTransitionInTiming: Double,
      backdropTransitionOutTiming: Double,
      coverScreen: Boolean,
      hasBackdrop: Boolean,
      hideModalContentWhileAnimating: Boolean,
      isVisible: Boolean,
      onBackButtonPress: () => Unit,
      onBackdropPress: () => Unit,
      onModalHide: () => Unit,
      onModalShow: () => Unit,
      onModalWillHide: () => Unit,
      onModalWillShow: () => Unit,
      panResponderThreshold: Double,
      propagateSwipe: Boolean | (js.Function2[
          /* event */ GestureResponderEvent, 
          /* gestureState */ PanResponderGestureState, 
          Boolean
        ]),
      scrollHorizontal: Boolean,
      scrollOffset: Double,
      scrollOffsetMax: Double,
      statusBarTranslucent: Boolean,
      supportedOrientations: js.Array[
          landscape | portrait | `portrait-upside-down` | `landscape-left` | `landscape-right`
        ],
      swipeThreshold: Double,
      useNativeDriver: Boolean
    ): AnimationInTiming = {
      val __obj = js.Dynamic.literal(animationIn = animationIn.asInstanceOf[js.Any], animationInTiming = animationInTiming.asInstanceOf[js.Any], animationOut = animationOut.asInstanceOf[js.Any], animationOutTiming = animationOutTiming.asInstanceOf[js.Any], avoidKeyboard = avoidKeyboard.asInstanceOf[js.Any], backdropColor = backdropColor.asInstanceOf[js.Any], backdropOpacity = backdropOpacity.asInstanceOf[js.Any], backdropTransitionInTiming = backdropTransitionInTiming.asInstanceOf[js.Any], backdropTransitionOutTiming = backdropTransitionOutTiming.asInstanceOf[js.Any], coverScreen = coverScreen.asInstanceOf[js.Any], hasBackdrop = hasBackdrop.asInstanceOf[js.Any], hideModalContentWhileAnimating = hideModalContentWhileAnimating.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], onBackButtonPress = js.Any.fromFunction0(onBackButtonPress), onBackdropPress = js.Any.fromFunction0(onBackdropPress), onModalHide = js.Any.fromFunction0(onModalHide), onModalShow = js.Any.fromFunction0(onModalShow), onModalWillHide = js.Any.fromFunction0(onModalWillHide), onModalWillShow = js.Any.fromFunction0(onModalWillShow), panResponderThreshold = panResponderThreshold.asInstanceOf[js.Any], propagateSwipe = propagateSwipe.asInstanceOf[js.Any], scrollHorizontal = scrollHorizontal.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], scrollOffsetMax = scrollOffsetMax.asInstanceOf[js.Any], statusBarTranslucent = statusBarTranslucent.asInstanceOf[js.Any], supportedOrientations = supportedOrientations.asInstanceOf[js.Any], swipeThreshold = swipeThreshold.asInstanceOf[js.Any], useNativeDriver = useNativeDriver.asInstanceOf[js.Any], deviceHeight = null, deviceWidth = null, scrollTo = null)
      __obj.asInstanceOf[AnimationInTiming]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnimationInTiming] (val x: Self) extends AnyVal {
      
      inline def setAnimationIn(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typings.reactNativeModal.reactNativeModalStrings.bounce, typings.reactNativeModal.reactNativeModalStrings.flash, typings.reactNativeModal.reactNativeModalStrings.jello */ Any
      ): Self = StObject.set(x, "animationIn", value.asInstanceOf[js.Any])
      
      inline def setAnimationInTiming(value: Double): Self = StObject.set(x, "animationInTiming", value.asInstanceOf[js.Any])
      
      inline def setAnimationOut(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typings.reactNativeModal.reactNativeModalStrings.bounce, typings.reactNativeModal.reactNativeModalStrings.flash, typings.reactNativeModal.reactNativeModalStrings.jello */ Any
      ): Self = StObject.set(x, "animationOut", value.asInstanceOf[js.Any])
      
      inline def setAnimationOutTiming(value: Double): Self = StObject.set(x, "animationOutTiming", value.asInstanceOf[js.Any])
      
      inline def setAvoidKeyboard(value: Boolean): Self = StObject.set(x, "avoidKeyboard", value.asInstanceOf[js.Any])
      
      inline def setBackdropColor(value: String): Self = StObject.set(x, "backdropColor", value.asInstanceOf[js.Any])
      
      inline def setBackdropOpacity(value: Double): Self = StObject.set(x, "backdropOpacity", value.asInstanceOf[js.Any])
      
      inline def setBackdropTransitionInTiming(value: Double): Self = StObject.set(x, "backdropTransitionInTiming", value.asInstanceOf[js.Any])
      
      inline def setBackdropTransitionOutTiming(value: Double): Self = StObject.set(x, "backdropTransitionOutTiming", value.asInstanceOf[js.Any])
      
      inline def setCoverScreen(value: Boolean): Self = StObject.set(x, "coverScreen", value.asInstanceOf[js.Any])
      
      inline def setCustomBackdrop(value: ReactNode): Self = StObject.set(x, "customBackdrop", value.asInstanceOf[js.Any])
      
      inline def setCustomBackdropUndefined: Self = StObject.set(x, "customBackdrop", js.undefined)
      
      inline def setDeviceHeight(value: Double): Self = StObject.set(x, "deviceHeight", value.asInstanceOf[js.Any])
      
      inline def setDeviceHeightNull: Self = StObject.set(x, "deviceHeight", null)
      
      inline def setDeviceWidth(value: Double): Self = StObject.set(x, "deviceWidth", value.asInstanceOf[js.Any])
      
      inline def setDeviceWidthNull: Self = StObject.set(x, "deviceWidth", null)
      
      inline def setHasBackdrop(value: Boolean): Self = StObject.set(x, "hasBackdrop", value.asInstanceOf[js.Any])
      
      inline def setHideModalContentWhileAnimating(value: Boolean): Self = StObject.set(x, "hideModalContentWhileAnimating", value.asInstanceOf[js.Any])
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setOnBackButtonPress(value: () => Unit): Self = StObject.set(x, "onBackButtonPress", js.Any.fromFunction0(value))
      
      inline def setOnBackdropPress(value: () => Unit): Self = StObject.set(x, "onBackdropPress", js.Any.fromFunction0(value))
      
      inline def setOnModalHide(value: () => Unit): Self = StObject.set(x, "onModalHide", js.Any.fromFunction0(value))
      
      inline def setOnModalShow(value: () => Unit): Self = StObject.set(x, "onModalShow", js.Any.fromFunction0(value))
      
      inline def setOnModalWillHide(value: () => Unit): Self = StObject.set(x, "onModalWillHide", js.Any.fromFunction0(value))
      
      inline def setOnModalWillShow(value: () => Unit): Self = StObject.set(x, "onModalWillShow", js.Any.fromFunction0(value))
      
      inline def setPanResponderThreshold(value: Double): Self = StObject.set(x, "panResponderThreshold", value.asInstanceOf[js.Any])
      
      inline def setPropagateSwipe(
        value: Boolean | (js.Function2[
              /* event */ GestureResponderEvent, 
              /* gestureState */ PanResponderGestureState, 
              Boolean
            ])
      ): Self = StObject.set(x, "propagateSwipe", value.asInstanceOf[js.Any])
      
      inline def setPropagateSwipeFunction2(value: (/* event */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => Boolean): Self = StObject.set(x, "propagateSwipe", js.Any.fromFunction2(value))
      
      inline def setScrollHorizontal(value: Boolean): Self = StObject.set(x, "scrollHorizontal", value.asInstanceOf[js.Any])
      
      inline def setScrollOffset(value: Double): Self = StObject.set(x, "scrollOffset", value.asInstanceOf[js.Any])
      
      inline def setScrollOffsetMax(value: Double): Self = StObject.set(x, "scrollOffsetMax", value.asInstanceOf[js.Any])
      
      inline def setScrollTo(value: /* e */ Any => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1(value))
      
      inline def setScrollToNull: Self = StObject.set(x, "scrollTo", null)
      
      inline def setStatusBarTranslucent(value: Boolean): Self = StObject.set(x, "statusBarTranslucent", value.asInstanceOf[js.Any])
      
      inline def setSupportedOrientations(
        value: js.Array[
              landscape | portrait | `portrait-upside-down` | `landscape-left` | `landscape-right`
            ]
      ): Self = StObject.set(x, "supportedOrientations", value.asInstanceOf[js.Any])
      
      inline def setSupportedOrientationsVarargs(value: (landscape | portrait | `portrait-upside-down` | `landscape-left` | `landscape-right`)*): Self = StObject.set(x, "supportedOrientations", js.Array(value*))
      
      inline def setSwipeThreshold(value: Double): Self = StObject.set(x, "swipeThreshold", value.asInstanceOf[js.Any])
      
      inline def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnimationOut extends StObject {
    
    var animationIn: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typings.reactNativeModal.reactNativeModalStrings.bounce, typings.reactNativeModal.reactNativeModalStrings.flash, typings.reactNativeModal.reactNativeModalStrings.jello */ Any
    
    var animationOut: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typings.reactNativeModal.reactNativeModalStrings.bounce, typings.reactNativeModal.reactNativeModalStrings.flash, typings.reactNativeModal.reactNativeModalStrings.jello */ Any
  }
  object AnimationOut {
    
    inline def apply(
      animationIn: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typings.reactNativeModal.reactNativeModalStrings.bounce, typings.reactNativeModal.reactNativeModalStrings.flash, typings.reactNativeModal.reactNativeModalStrings.jello */ Any,
      animationOut: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typings.reactNativeModal.reactNativeModalStrings.bounce, typings.reactNativeModal.reactNativeModalStrings.flash, typings.reactNativeModal.reactNativeModalStrings.jello */ Any
    ): AnimationOut = {
      val __obj = js.Dynamic.literal(animationIn = animationIn.asInstanceOf[js.Any], animationOut = animationOut.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimationOut]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnimationOut] (val x: Self) extends AnyVal {
      
      inline def setAnimationIn(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typings.reactNativeModal.reactNativeModalStrings.bounce, typings.reactNativeModal.reactNativeModalStrings.flash, typings.reactNativeModal.reactNativeModalStrings.jello */ Any
      ): Self = StObject.set(x, "animationIn", value.asInstanceOf[js.Any])
      
      inline def setAnimationOut(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typings.reactNativeModal.reactNativeModalStrings.bounce, typings.reactNativeModal.reactNativeModalStrings.flash, typings.reactNativeModal.reactNativeModalStrings.jello */ Any
      ): Self = StObject.set(x, "animationOut", value.asInstanceOf[js.Any])
    }
  }
  
  trait BackgroundColor extends StObject {
    
    var backgroundColor: String
    
    var bottom: Double
    
    var left: Double
    
    var opacity: Double
    
    var position: absolute
    
    var right: Double
    
    var top: Double
  }
  object BackgroundColor {
    
    inline def apply(backgroundColor: String, bottom: Double, left: Double, opacity: Double, right: Double, top: Double): BackgroundColor = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], position = "absolute", right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackgroundColor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BackgroundColor] (val x: Self) extends AnyVal {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: absolute): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait Flex extends StObject {
    
    var flex: Double
    
    var justifyContent: center
  }
  object Flex {
    
    inline def apply(flex: Double): Flex = {
      val __obj = js.Dynamic.literal(flex = flex.asInstanceOf[js.Any], justifyContent = "center")
      __obj.asInstanceOf[Flex]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Flex] (val x: Self) extends AnyVal {
      
      inline def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      inline def setJustifyContent(value: center): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
    }
  }
  
  trait From extends StObject {
    
    var from: StringDictionary[Double]
    
    var to: StringDictionary[Double]
  }
  object From {
    
    inline def apply(from: StringDictionary[Double], to: StringDictionary[Double]): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: From] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: StringDictionary[Double]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: StringDictionary[Double]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsVisible extends StObject {
    
    var isVisible: Boolean
    
    var showContent: Boolean
  }
  object IsVisible {
    
    inline def apply(isVisible: Boolean, showContent: Boolean): IsVisible = {
      val __obj = js.Dynamic.literal(isVisible = isVisible.asInstanceOf[js.Any], showContent = showContent.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsVisible]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsVisible] (val x: Self) extends AnyVal {
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setShowContent(value: Boolean): Self = StObject.set(x, "showContent", value.asInstanceOf[js.Any])
    }
  }
  
  trait Opacity extends StObject {
    
    var backgroundColor: String
    
    var opacity: Double
    
    var zIndex: Double
  }
  object Opacity {
    
    inline def apply(backgroundColor: String, opacity: Double, zIndex: Double): Opacity = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Opacity]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Opacity] (val x: Self) extends AnyVal {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<react-native-modal.react-native-modal/dist/modal.ModalProps> */
  trait ReadonlyModalProps extends StObject {
    
    val accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
    
    val accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
    
    val accessibilityHint: js.UndefOr[String] = js.undefined
    
    val accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
    
    val accessibilityLabel: js.UndefOr[String] = js.undefined
    
    val accessibilityLabelledBy: js.UndefOr[String | js.Array[String]] = js.undefined
    
    val accessibilityLanguage: js.UndefOr[String] = js.undefined
    
    val accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.undefined
    
    val accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
    
    val accessibilityState: js.UndefOr[AccessibilityState] = js.undefined
    
    val accessibilityValue: js.UndefOr[AccessibilityValue] = js.undefined
    
    val accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
    
    val accessible: js.UndefOr[Boolean] = js.undefined
    
    val animationIn: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typings.reactNativeModal.reactNativeModalStrings.bounce, typings.reactNativeModal.reactNativeModalStrings.flash, typings.reactNativeModal.reactNativeModalStrings.jello */ Any
    
    val animationInTiming: Double
    
    val animationOut: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typings.reactNativeModal.reactNativeModalStrings.bounce, typings.reactNativeModal.reactNativeModalStrings.flash, typings.reactNativeModal.reactNativeModalStrings.jello */ Any
    
    val animationOutTiming: Double
    
    val avoidKeyboard: Boolean
    
    val backdropColor: String
    
    val backdropOpacity: Double
    
    val backdropTransitionInTiming: Double
    
    val backdropTransitionOutTiming: Double
    
    val children: ReactNode
    
    val collapsable: js.UndefOr[Boolean] = js.undefined
    
    val coverScreen: Boolean
    
    val customBackdrop: ReactNode
    
    val deviceHeight: js.UndefOr[Double | Null] = js.undefined
    
    val deviceWidth: js.UndefOr[Double | Null] = js.undefined
    
    val focusable: js.UndefOr[Boolean] = js.undefined
    
    val hardwareAccelerated: js.UndefOr[Boolean] = js.undefined
    
    val hasBackdrop: Boolean
    
    val hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
    
    val hideModalContentWhileAnimating: Boolean
    
    val hitSlop: js.UndefOr[Insets] = js.undefined
    
    val importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
    
    val isTVSelectable: js.UndefOr[Boolean] = js.undefined
    
    val isVisible: Boolean
    
    val nativeID: js.UndefOr[String] = js.undefined
    
    val needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined
    
    val onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.undefined
    
    val onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    val onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    val onBackButtonPress: js.Function0[Unit]
    
    val onBackdropPress: js.Function0[Unit]
    
    val onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    val onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
    
    val onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    val onModalHide: js.Function0[Unit]
    
    val onModalShow: js.Function0[Unit]
    
    val onModalWillHide: js.Function0[Unit]
    
    val onModalWillShow: js.Function0[Unit]
    
    val onMoveShouldSetResponder: js.UndefOr[js.Function1[/* event */ typings.reactNative.mod.GestureResponderEvent, Boolean]] = js.undefined
    
    val onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ typings.reactNative.mod.GestureResponderEvent, Boolean]] = js.undefined
    
    val onOrientationChange: js.UndefOr[OnOrientationChange] = js.undefined
    
    val onPointerCancel: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    val onPointerCancelCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    val onPointerDown: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    val onPointerDownCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    val onPointerEnter: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    val onPointerEnterCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    val onPointerLeave: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    val onPointerLeaveCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    val onPointerMove: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    val onPointerMoveCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    val onPointerUp: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    val onPointerUpCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    val onResponderEnd: js.UndefOr[js.Function1[/* event */ typings.reactNative.mod.GestureResponderEvent, Unit]] = js.undefined
    
    val onResponderGrant: js.UndefOr[js.Function1[/* event */ typings.reactNative.mod.GestureResponderEvent, Unit]] = js.undefined
    
    val onResponderMove: js.UndefOr[js.Function1[/* event */ typings.reactNative.mod.GestureResponderEvent, Unit]] = js.undefined
    
    val onResponderReject: js.UndefOr[js.Function1[/* event */ typings.reactNative.mod.GestureResponderEvent, Unit]] = js.undefined
    
    val onResponderRelease: js.UndefOr[js.Function1[/* event */ typings.reactNative.mod.GestureResponderEvent, Unit]] = js.undefined
    
    val onResponderStart: js.UndefOr[js.Function1[/* event */ typings.reactNative.mod.GestureResponderEvent, Unit]] = js.undefined
    
    val onResponderTerminate: js.UndefOr[js.Function1[/* event */ typings.reactNative.mod.GestureResponderEvent, Unit]] = js.undefined
    
    val onResponderTerminationRequest: js.UndefOr[js.Function1[/* event */ typings.reactNative.mod.GestureResponderEvent, Boolean]] = js.undefined
    
    val onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    val onStartShouldSetResponder: js.UndefOr[js.Function1[/* event */ typings.reactNative.mod.GestureResponderEvent, Boolean]] = js.undefined
    
    val onStartShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ typings.reactNative.mod.GestureResponderEvent, Boolean]] = js.undefined
    
    val onSwipeCancel: js.UndefOr[js.Function1[/* gestureState */ PanResponderGestureState, Unit]] = js.undefined
    
    val onSwipeComplete: js.UndefOr[
        js.Function2[
          /* params */ OnSwipeCompleteParams, 
          /* gestureState */ PanResponderGestureState, 
          Unit
        ]
      ] = js.undefined
    
    val onSwipeMove: js.UndefOr[
        js.Function2[/* percentageShown */ Double, /* gestureState */ PanResponderGestureState, Unit]
      ] = js.undefined
    
    val onSwipeStart: js.UndefOr[js.Function1[/* gestureState */ PanResponderGestureState, Unit]] = js.undefined
    
    val onTouchCancel: js.UndefOr[js.Function1[/* event */ typings.reactNative.mod.GestureResponderEvent, Unit]] = js.undefined
    
    val onTouchEnd: js.UndefOr[js.Function1[/* event */ typings.reactNative.mod.GestureResponderEvent, Unit]] = js.undefined
    
    val onTouchEndCapture: js.UndefOr[js.Function1[/* event */ typings.reactNative.mod.GestureResponderEvent, Unit]] = js.undefined
    
    val onTouchMove: js.UndefOr[js.Function1[/* event */ typings.reactNative.mod.GestureResponderEvent, Unit]] = js.undefined
    
    val onTouchStart: js.UndefOr[js.Function1[/* event */ typings.reactNative.mod.GestureResponderEvent, Unit]] = js.undefined
    
    val panResponderThreshold: Double
    
    val pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.undefined
    
    val presentationStyle: js.UndefOr[PresentationStyle] = js.undefined
    
    val propagateSwipe: Boolean | (js.Function2[
        /* event */ GestureResponderEvent, 
        /* gestureState */ PanResponderGestureState, 
        Boolean
      ])
    
    val removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
    
    val renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined
    
    val scrollHorizontal: Boolean
    
    val scrollOffset: Double
    
    val scrollOffsetMax: Double
    
    val scrollTo: OrNull[js.Function1[/* e */ Any, Unit]]
    
    val shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined
    
    val statusBarTranslucent: Boolean
    
    val style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    val supportedOrientations: js.Array[
        landscape | portrait | `portrait-upside-down` | `landscape-left` | `landscape-right`
      ]
    
    val swipeDirection: js.UndefOr[Direction | js.Array[Direction]] = js.undefined
    
    val swipeThreshold: Double
    
    val testID: js.UndefOr[String] = js.undefined
    
    val tvParallaxMagnification: js.UndefOr[Double] = js.undefined
    
    val tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
    
    val tvParallaxShiftDistanceX: js.UndefOr[Double] = js.undefined
    
    val tvParallaxShiftDistanceY: js.UndefOr[Double] = js.undefined
    
    val tvParallaxTiltAngle: js.UndefOr[Double] = js.undefined
    
    val useNativeDriver: Boolean
    
    val useNativeDriverForBackdrop: js.UndefOr[Boolean] = js.undefined
  }
  object ReadonlyModalProps {
    
    inline def apply(
      animationIn: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typings.reactNativeModal.reactNativeModalStrings.bounce, typings.reactNativeModal.reactNativeModalStrings.flash, typings.reactNativeModal.reactNativeModalStrings.jello */ Any,
      animationInTiming: Double,
      animationOut: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typings.reactNativeModal.reactNativeModalStrings.bounce, typings.reactNativeModal.reactNativeModalStrings.flash, typings.reactNativeModal.reactNativeModalStrings.jello */ Any,
      animationOutTiming: Double,
      avoidKeyboard: Boolean,
      backdropColor: String,
      backdropOpacity: Double,
      backdropTransitionInTiming: Double,
      backdropTransitionOutTiming: Double,
      coverScreen: Boolean,
      hasBackdrop: Boolean,
      hideModalContentWhileAnimating: Boolean,
      isVisible: Boolean,
      onBackButtonPress: () => Unit,
      onBackdropPress: () => Unit,
      onModalHide: () => Unit,
      onModalShow: () => Unit,
      onModalWillHide: () => Unit,
      onModalWillShow: () => Unit,
      panResponderThreshold: Double,
      propagateSwipe: Boolean | (js.Function2[
          /* event */ GestureResponderEvent, 
          /* gestureState */ PanResponderGestureState, 
          Boolean
        ]),
      scrollHorizontal: Boolean,
      scrollOffset: Double,
      scrollOffsetMax: Double,
      statusBarTranslucent: Boolean,
      supportedOrientations: js.Array[
          landscape | portrait | `portrait-upside-down` | `landscape-left` | `landscape-right`
        ],
      swipeThreshold: Double,
      useNativeDriver: Boolean
    ): ReadonlyModalProps = {
      val __obj = js.Dynamic.literal(animationIn = animationIn.asInstanceOf[js.Any], animationInTiming = animationInTiming.asInstanceOf[js.Any], animationOut = animationOut.asInstanceOf[js.Any], animationOutTiming = animationOutTiming.asInstanceOf[js.Any], avoidKeyboard = avoidKeyboard.asInstanceOf[js.Any], backdropColor = backdropColor.asInstanceOf[js.Any], backdropOpacity = backdropOpacity.asInstanceOf[js.Any], backdropTransitionInTiming = backdropTransitionInTiming.asInstanceOf[js.Any], backdropTransitionOutTiming = backdropTransitionOutTiming.asInstanceOf[js.Any], coverScreen = coverScreen.asInstanceOf[js.Any], hasBackdrop = hasBackdrop.asInstanceOf[js.Any], hideModalContentWhileAnimating = hideModalContentWhileAnimating.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], onBackButtonPress = js.Any.fromFunction0(onBackButtonPress), onBackdropPress = js.Any.fromFunction0(onBackdropPress), onModalHide = js.Any.fromFunction0(onModalHide), onModalShow = js.Any.fromFunction0(onModalShow), onModalWillHide = js.Any.fromFunction0(onModalWillHide), onModalWillShow = js.Any.fromFunction0(onModalWillShow), panResponderThreshold = panResponderThreshold.asInstanceOf[js.Any], propagateSwipe = propagateSwipe.asInstanceOf[js.Any], scrollHorizontal = scrollHorizontal.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], scrollOffsetMax = scrollOffsetMax.asInstanceOf[js.Any], statusBarTranslucent = statusBarTranslucent.asInstanceOf[js.Any], supportedOrientations = supportedOrientations.asInstanceOf[js.Any], swipeThreshold = swipeThreshold.asInstanceOf[js.Any], useNativeDriver = useNativeDriver.asInstanceOf[js.Any], scrollTo = null)
      __obj.asInstanceOf[ReadonlyModalProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyModalProps] (val x: Self) extends AnyVal {
      
      inline def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
      
      inline def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value*))
      
      inline def setAccessibilityElementsHidden(value: Boolean): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
      
      inline def setAccessibilityHint(value: String): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
      
      inline def setAccessibilityIgnoresInvertColors(value: Boolean): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
      
      inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
      
      inline def setAccessibilityLabelledBy(value: String | js.Array[String]): Self = StObject.set(x, "accessibilityLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLabelledByUndefined: Self = StObject.set(x, "accessibilityLabelledBy", js.undefined)
      
      inline def setAccessibilityLabelledByVarargs(value: String*): Self = StObject.set(x, "accessibilityLabelledBy", js.Array(value*))
      
      inline def setAccessibilityLanguage(value: String): Self = StObject.set(x, "accessibilityLanguage", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLanguageUndefined: Self = StObject.set(x, "accessibilityLanguage", js.undefined)
      
      inline def setAccessibilityLiveRegion(value: none | polite | assertive): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
      
      inline def setAccessibilityRole(value: AccessibilityRole): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
      
      inline def setAccessibilityState(value: AccessibilityState): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
      
      inline def setAccessibilityValue(value: AccessibilityValue): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
      
      inline def setAccessibilityViewIsModal(value: Boolean): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
      
      inline def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
      
      inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
      
      inline def setAnimationIn(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typings.reactNativeModal.reactNativeModalStrings.bounce, typings.reactNativeModal.reactNativeModalStrings.flash, typings.reactNativeModal.reactNativeModalStrings.jello */ Any
      ): Self = StObject.set(x, "animationIn", value.asInstanceOf[js.Any])
      
      inline def setAnimationInTiming(value: Double): Self = StObject.set(x, "animationInTiming", value.asInstanceOf[js.Any])
      
      inline def setAnimationOut(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typings.reactNativeModal.reactNativeModalStrings.bounce, typings.reactNativeModal.reactNativeModalStrings.flash, typings.reactNativeModal.reactNativeModalStrings.jello */ Any
      ): Self = StObject.set(x, "animationOut", value.asInstanceOf[js.Any])
      
      inline def setAnimationOutTiming(value: Double): Self = StObject.set(x, "animationOutTiming", value.asInstanceOf[js.Any])
      
      inline def setAvoidKeyboard(value: Boolean): Self = StObject.set(x, "avoidKeyboard", value.asInstanceOf[js.Any])
      
      inline def setBackdropColor(value: String): Self = StObject.set(x, "backdropColor", value.asInstanceOf[js.Any])
      
      inline def setBackdropOpacity(value: Double): Self = StObject.set(x, "backdropOpacity", value.asInstanceOf[js.Any])
      
      inline def setBackdropTransitionInTiming(value: Double): Self = StObject.set(x, "backdropTransitionInTiming", value.asInstanceOf[js.Any])
      
      inline def setBackdropTransitionOutTiming(value: Double): Self = StObject.set(x, "backdropTransitionOutTiming", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCollapsable(value: Boolean): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
      
      inline def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
      
      inline def setCoverScreen(value: Boolean): Self = StObject.set(x, "coverScreen", value.asInstanceOf[js.Any])
      
      inline def setCustomBackdrop(value: ReactNode): Self = StObject.set(x, "customBackdrop", value.asInstanceOf[js.Any])
      
      inline def setCustomBackdropUndefined: Self = StObject.set(x, "customBackdrop", js.undefined)
      
      inline def setDeviceHeight(value: Double): Self = StObject.set(x, "deviceHeight", value.asInstanceOf[js.Any])
      
      inline def setDeviceHeightNull: Self = StObject.set(x, "deviceHeight", null)
      
      inline def setDeviceHeightUndefined: Self = StObject.set(x, "deviceHeight", js.undefined)
      
      inline def setDeviceWidth(value: Double): Self = StObject.set(x, "deviceWidth", value.asInstanceOf[js.Any])
      
      inline def setDeviceWidthNull: Self = StObject.set(x, "deviceWidth", null)
      
      inline def setDeviceWidthUndefined: Self = StObject.set(x, "deviceWidth", js.undefined)
      
      inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      inline def setHardwareAccelerated(value: Boolean): Self = StObject.set(x, "hardwareAccelerated", value.asInstanceOf[js.Any])
      
      inline def setHardwareAcceleratedUndefined: Self = StObject.set(x, "hardwareAccelerated", js.undefined)
      
      inline def setHasBackdrop(value: Boolean): Self = StObject.set(x, "hasBackdrop", value.asInstanceOf[js.Any])
      
      inline def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
      
      inline def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
      
      inline def setHideModalContentWhileAnimating(value: Boolean): Self = StObject.set(x, "hideModalContentWhileAnimating", value.asInstanceOf[js.Any])
      
      inline def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      inline def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
      
      inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
      
      inline def setIsTVSelectable(value: Boolean): Self = StObject.set(x, "isTVSelectable", value.asInstanceOf[js.Any])
      
      inline def setIsTVSelectableUndefined: Self = StObject.set(x, "isTVSelectable", js.undefined)
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
      
      inline def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
      
      inline def setNeedsOffscreenAlphaCompositing(value: Boolean): Self = StObject.set(x, "needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
      
      inline def setNeedsOffscreenAlphaCompositingUndefined: Self = StObject.set(x, "needsOffscreenAlphaCompositing", js.undefined)
      
      inline def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Unit): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1(value))
      
      inline def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
      
      inline def setOnAccessibilityEscape(value: () => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction0(value))
      
      inline def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
      
      inline def setOnAccessibilityTap(value: () => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction0(value))
      
      inline def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
      
      inline def setOnBackButtonPress(value: () => Unit): Self = StObject.set(x, "onBackButtonPress", js.Any.fromFunction0(value))
      
      inline def setOnBackdropPress(value: () => Unit): Self = StObject.set(x, "onBackdropPress", js.Any.fromFunction0(value))
      
      inline def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
      
      inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
      
      inline def setOnMagicTap(value: () => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction0(value))
      
      inline def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
      
      inline def setOnModalHide(value: () => Unit): Self = StObject.set(x, "onModalHide", js.Any.fromFunction0(value))
      
      inline def setOnModalShow(value: () => Unit): Self = StObject.set(x, "onModalShow", js.Any.fromFunction0(value))
      
      inline def setOnModalWillHide(value: () => Unit): Self = StObject.set(x, "onModalWillHide", js.Any.fromFunction0(value))
      
      inline def setOnModalWillShow(value: () => Unit): Self = StObject.set(x, "onModalWillShow", js.Any.fromFunction0(value))
      
      inline def setOnMoveShouldSetResponder(value: /* event */ typings.reactNative.mod.GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponder", js.Any.fromFunction1(value))
      
      inline def setOnMoveShouldSetResponderCapture(value: /* event */ typings.reactNative.mod.GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      inline def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
      
      inline def setOnMoveShouldSetResponderUndefined: Self = StObject.set(x, "onMoveShouldSetResponder", js.undefined)
      
      inline def setOnOrientationChange(value: /* orientation */ NativeSyntheticEvent[Any] => Unit): Self = StObject.set(x, "onOrientationChange", js.Any.fromFunction1(value))
      
      inline def setOnOrientationChangeUndefined: Self = StObject.set(x, "onOrientationChange", js.undefined)
      
      inline def setOnPointerCancel(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      inline def setOnPointerCancelCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerCancelCapture", js.Any.fromFunction1(value))
      
      inline def setOnPointerCancelCaptureUndefined: Self = StObject.set(x, "onPointerCancelCapture", js.undefined)
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      inline def setOnPointerDownCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerDownCapture", js.Any.fromFunction1(value))
      
      inline def setOnPointerDownCaptureUndefined: Self = StObject.set(x, "onPointerDownCapture", js.undefined)
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      inline def setOnPointerEnterCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerEnterCapture", js.Any.fromFunction1(value))
      
      inline def setOnPointerEnterCaptureUndefined: Self = StObject.set(x, "onPointerEnterCapture", js.undefined)
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      inline def setOnPointerLeaveCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerLeaveCapture", js.Any.fromFunction1(value))
      
      inline def setOnPointerLeaveCaptureUndefined: Self = StObject.set(x, "onPointerLeaveCapture", js.undefined)
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      inline def setOnPointerMoveCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerMoveCapture", js.Any.fromFunction1(value))
      
      inline def setOnPointerMoveCaptureUndefined: Self = StObject.set(x, "onPointerMoveCapture", js.undefined)
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerUp(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      inline def setOnPointerUpCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerUpCapture", js.Any.fromFunction1(value))
      
      inline def setOnPointerUpCaptureUndefined: Self = StObject.set(x, "onPointerUpCapture", js.undefined)
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnResponderEnd(value: /* event */ typings.reactNative.mod.GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderEnd", js.Any.fromFunction1(value))
      
      inline def setOnResponderEndUndefined: Self = StObject.set(x, "onResponderEnd", js.undefined)
      
      inline def setOnResponderGrant(value: /* event */ typings.reactNative.mod.GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderGrant", js.Any.fromFunction1(value))
      
      inline def setOnResponderGrantUndefined: Self = StObject.set(x, "onResponderGrant", js.undefined)
      
      inline def setOnResponderMove(value: /* event */ typings.reactNative.mod.GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderMove", js.Any.fromFunction1(value))
      
      inline def setOnResponderMoveUndefined: Self = StObject.set(x, "onResponderMove", js.undefined)
      
      inline def setOnResponderReject(value: /* event */ typings.reactNative.mod.GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderReject", js.Any.fromFunction1(value))
      
      inline def setOnResponderRejectUndefined: Self = StObject.set(x, "onResponderReject", js.undefined)
      
      inline def setOnResponderRelease(value: /* event */ typings.reactNative.mod.GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderRelease", js.Any.fromFunction1(value))
      
      inline def setOnResponderReleaseUndefined: Self = StObject.set(x, "onResponderRelease", js.undefined)
      
      inline def setOnResponderStart(value: /* event */ typings.reactNative.mod.GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderStart", js.Any.fromFunction1(value))
      
      inline def setOnResponderStartUndefined: Self = StObject.set(x, "onResponderStart", js.undefined)
      
      inline def setOnResponderTerminate(value: /* event */ typings.reactNative.mod.GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderTerminate", js.Any.fromFunction1(value))
      
      inline def setOnResponderTerminateUndefined: Self = StObject.set(x, "onResponderTerminate", js.undefined)
      
      inline def setOnResponderTerminationRequest(value: /* event */ typings.reactNative.mod.GestureResponderEvent => Boolean): Self = StObject.set(x, "onResponderTerminationRequest", js.Any.fromFunction1(value))
      
      inline def setOnResponderTerminationRequestUndefined: Self = StObject.set(x, "onResponderTerminationRequest", js.undefined)
      
      inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setOnStartShouldSetResponder(value: /* event */ typings.reactNative.mod.GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponder", js.Any.fromFunction1(value))
      
      inline def setOnStartShouldSetResponderCapture(value: /* event */ typings.reactNative.mod.GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      inline def setOnStartShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetResponderCapture", js.undefined)
      
      inline def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
      
      inline def setOnSwipeCancel(value: /* gestureState */ PanResponderGestureState => Unit): Self = StObject.set(x, "onSwipeCancel", js.Any.fromFunction1(value))
      
      inline def setOnSwipeCancelUndefined: Self = StObject.set(x, "onSwipeCancel", js.undefined)
      
      inline def setOnSwipeComplete(value: (/* params */ OnSwipeCompleteParams, /* gestureState */ PanResponderGestureState) => Unit): Self = StObject.set(x, "onSwipeComplete", js.Any.fromFunction2(value))
      
      inline def setOnSwipeCompleteUndefined: Self = StObject.set(x, "onSwipeComplete", js.undefined)
      
      inline def setOnSwipeMove(value: (/* percentageShown */ Double, /* gestureState */ PanResponderGestureState) => Unit): Self = StObject.set(x, "onSwipeMove", js.Any.fromFunction2(value))
      
      inline def setOnSwipeMoveUndefined: Self = StObject.set(x, "onSwipeMove", js.undefined)
      
      inline def setOnSwipeStart(value: /* gestureState */ PanResponderGestureState => Unit): Self = StObject.set(x, "onSwipeStart", js.Any.fromFunction1(value))
      
      inline def setOnSwipeStartUndefined: Self = StObject.set(x, "onSwipeStart", js.undefined)
      
      inline def setOnTouchCancel(value: /* event */ typings.reactNative.mod.GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: /* event */ typings.reactNative.mod.GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndCapture(value: /* event */ typings.reactNative.mod.GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: /* event */ typings.reactNative.mod.GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: /* event */ typings.reactNative.mod.GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setPanResponderThreshold(value: Double): Self = StObject.set(x, "panResponderThreshold", value.asInstanceOf[js.Any])
      
      inline def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      inline def setPresentationStyle(value: PresentationStyle): Self = StObject.set(x, "presentationStyle", value.asInstanceOf[js.Any])
      
      inline def setPresentationStyleUndefined: Self = StObject.set(x, "presentationStyle", js.undefined)
      
      inline def setPropagateSwipe(
        value: Boolean | (js.Function2[
              /* event */ GestureResponderEvent, 
              /* gestureState */ PanResponderGestureState, 
              Boolean
            ])
      ): Self = StObject.set(x, "propagateSwipe", value.asInstanceOf[js.Any])
      
      inline def setPropagateSwipeFunction2(value: (/* event */ GestureResponderEvent, /* gestureState */ PanResponderGestureState) => Boolean): Self = StObject.set(x, "propagateSwipe", js.Any.fromFunction2(value))
      
      inline def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
      
      inline def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
      
      inline def setRenderToHardwareTextureAndroid(value: Boolean): Self = StObject.set(x, "renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
      
      inline def setRenderToHardwareTextureAndroidUndefined: Self = StObject.set(x, "renderToHardwareTextureAndroid", js.undefined)
      
      inline def setScrollHorizontal(value: Boolean): Self = StObject.set(x, "scrollHorizontal", value.asInstanceOf[js.Any])
      
      inline def setScrollOffset(value: Double): Self = StObject.set(x, "scrollOffset", value.asInstanceOf[js.Any])
      
      inline def setScrollOffsetMax(value: Double): Self = StObject.set(x, "scrollOffsetMax", value.asInstanceOf[js.Any])
      
      inline def setScrollTo(value: /* e */ Any => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1(value))
      
      inline def setScrollToNull: Self = StObject.set(x, "scrollTo", null)
      
      inline def setShouldRasterizeIOS(value: Boolean): Self = StObject.set(x, "shouldRasterizeIOS", value.asInstanceOf[js.Any])
      
      inline def setShouldRasterizeIOSUndefined: Self = StObject.set(x, "shouldRasterizeIOS", js.undefined)
      
      inline def setStatusBarTranslucent(value: Boolean): Self = StObject.set(x, "statusBarTranslucent", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSupportedOrientations(
        value: js.Array[
              landscape | portrait | `portrait-upside-down` | `landscape-left` | `landscape-right`
            ]
      ): Self = StObject.set(x, "supportedOrientations", value.asInstanceOf[js.Any])
      
      inline def setSupportedOrientationsVarargs(value: (landscape | portrait | `portrait-upside-down` | `landscape-left` | `landscape-right`)*): Self = StObject.set(x, "supportedOrientations", js.Array(value*))
      
      inline def setSwipeDirection(value: Direction | js.Array[Direction]): Self = StObject.set(x, "swipeDirection", value.asInstanceOf[js.Any])
      
      inline def setSwipeDirectionUndefined: Self = StObject.set(x, "swipeDirection", js.undefined)
      
      inline def setSwipeDirectionVarargs(value: Direction*): Self = StObject.set(x, "swipeDirection", js.Array(value*))
      
      inline def setSwipeThreshold(value: Double): Self = StObject.set(x, "swipeThreshold", value.asInstanceOf[js.Any])
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      inline def setTvParallaxMagnification(value: Double): Self = StObject.set(x, "tvParallaxMagnification", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxMagnificationUndefined: Self = StObject.set(x, "tvParallaxMagnification", js.undefined)
      
      inline def setTvParallaxProperties(value: TVParallaxProperties): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
      
      inline def setTvParallaxShiftDistanceX(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxShiftDistanceXUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceX", js.undefined)
      
      inline def setTvParallaxShiftDistanceY(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxShiftDistanceYUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceY", js.undefined)
      
      inline def setTvParallaxTiltAngle(value: Double): Self = StObject.set(x, "tvParallaxTiltAngle", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxTiltAngleUndefined: Self = StObject.set(x, "tvParallaxTiltAngle", js.undefined)
      
      inline def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
      
      inline def setUseNativeDriverForBackdrop(value: Boolean): Self = StObject.set(x, "useNativeDriverForBackdrop", value.asInstanceOf[js.Any])
      
      inline def setUseNativeDriverForBackdropUndefined: Self = StObject.set(x, "useNativeDriverForBackdrop", js.undefined)
    }
  }
}
