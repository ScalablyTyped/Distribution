package typings.reactNativeModal

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.ValueXY
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.PanResponderGestureState
import typings.reactNative.mod.PanResponderInstance
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewProps
import typings.reactNative.mod.ViewStyle
import typings.reactNativeAnimatable.mod.Animation
import typings.reactNativeAnimatable.mod.CustomAnimation
import typings.reactNativeModal.anon.AnimationIn
import typings.reactNativeModal.anon.AnimationInTiming
import typings.reactNativeModal.anon.IsVisible
import typings.reactNativeModal.reactNativeModalStrings.down
import typings.reactNativeModal.reactNativeModalStrings.left
import typings.reactNativeModal.reactNativeModalStrings.right
import typings.reactNativeModal.reactNativeModalStrings.up
import typings.reactNativeModal.typesMod.Direction
import typings.reactNativeModal.typesMod.OnOrientationChange
import typings.reactNativeModal.typesMod.OrNull
import typings.reactNativeModal.typesMod.Orientation
import typings.reactNativeModal.typesMod.PresentationStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalMod {
  
  @JSImport("react-native-modal/dist/modal", JSImport.Default)
  @js.native
  class default protected () extends ReactNativeModal {
    def this(props: ModalProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-native-modal/dist/modal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-modal/dist/modal", "default.defaultProps")
    @js.native
    def defaultProps: AnimationInTiming = js.native
    @scala.inline
    def defaultProps_=(x: AnimationInTiming): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def getDerivedStateFromProps(nextProps: ModalProps, state: State): IsVisible | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[IsVisible | Null]
    
    @JSImport("react-native-modal/dist/modal", "default.propTypes")
    @js.native
    def propTypes: AnimationIn = js.native
    @scala.inline
    def propTypes_=(x: AnimationIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-modal/dist/modal", "ReactNativeModal")
  @js.native
  class ReactNativeModal protected ()
    extends Component[ModalProps, State, js.Any] {
    def this(props: ModalProps) = this()
    
    var animationIn: String = js.native
    
    var animationOut: String = js.native
    
    var backdropRef: js.Any = js.native
    
    def buildPanResponder(): Unit = js.native
    
    def calcDistancePercentage(gestureState: PanResponderGestureState): Double = js.native
    
    def close(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MReactNativeModal(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MReactNativeModal(prevProps: ModalProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MReactNativeModal(): Unit = js.native
    
    var contentRef: js.Any = js.native
    
    def createAnimationEventForSwipe(): js.Function1[/* repeated */ js.Any, Unit] = js.native
    
    var currentSwipingDirection: OrNull[Direction] = js.native
    
    def getAccDistancePerDirection(gestureState: PanResponderGestureState): Double = js.native
    
    def getSwipingDirection(gestureState: PanResponderGestureState): left | right | up | down = js.native
    
    def handleDimensionsUpdate(): Unit = js.native
    
    var inSwipeClosingState: Boolean = js.native
    
    def isDirectionIncluded(direction: Direction): Boolean = js.native
    
    def isSwipeDirectionAllowed(hasDyDx: PanResponderGestureState): Boolean = js.native
    
    var isTransitioning: Boolean = js.native
    
    def open(): Unit = js.native
    
    var panResponder: OrNull[PanResponderInstance] = js.native
  }
  /* static members */
  object ReactNativeModal {
    
    @JSImport("react-native-modal/dist/modal", "ReactNativeModal")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-modal/dist/modal", "ReactNativeModal.defaultProps")
    @js.native
    def defaultProps: AnimationInTiming = js.native
    @scala.inline
    def defaultProps_=(x: AnimationInTiming): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def getDerivedStateFromProps(nextProps: ModalProps, state: State): IsVisible | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[IsVisible | Null]
    
    @JSImport("react-native-modal/dist/modal", "ReactNativeModal.propTypes")
    @js.native
    def propTypes: AnimationIn = js.native
    @scala.inline
    def propTypes_=(x: AnimationIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait ModalProps
    extends StObject
       with ViewProps {
    
    var animationIn: Animation | (CustomAnimation[TextStyle & ViewStyle & ImageStyle])
    
    var animationInTiming: Double
    
    var animationOut: Animation | (CustomAnimation[TextStyle & ViewStyle & ImageStyle])
    
    var animationOutTiming: Double
    
    var avoidKeyboard: Boolean
    
    var backdropColor: String
    
    var backdropOpacity: Double
    
    var backdropTransitionInTiming: Double
    
    var backdropTransitionOutTiming: Double
    
    var children: ReactNode
    
    var coverScreen: Boolean
    
    var customBackdrop: ReactNode
    
    var deviceHeight: Double
    
    var deviceWidth: Double
    
    var hardwareAccelerated: js.UndefOr[Boolean] = js.undefined
    
    var hasBackdrop: Boolean
    
    var hideModalContentWhileAnimating: Boolean
    
    var isVisible: Boolean
    
    def onBackButtonPress(): Unit
    
    def onBackdropPress(): Unit
    
    var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    def onModalHide(): Unit
    
    def onModalShow(): Unit
    
    def onModalWillHide(): Unit
    
    def onModalWillShow(): Unit
    
    var onOrientationChange: js.UndefOr[OnOrientationChange] = js.undefined
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSwipeCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSwipeComplete: js.UndefOr[js.Function1[/* params */ OnSwipeCompleteParams, Unit]] = js.undefined
    
    var onSwipeMove: js.UndefOr[js.Function1[/* percentageShown */ Double, Unit]] = js.undefined
    
    var onSwipeStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var presentationStyle: js.UndefOr[PresentationStyle] = js.undefined
    
    var propagateSwipe: Boolean
    
    var scrollHorizontal: Boolean
    
    var scrollOffset: Double
    
    var scrollOffsetMax: Double
    
    var scrollTo: OrNull[js.Function1[/* e */ js.Any, Unit]]
    
    var supportedOrientations: js.UndefOr[js.Array[Orientation]] = js.undefined
    
    var swipeDirection: js.UndefOr[Direction | js.Array[Direction]] = js.undefined
    
    var swipeThreshold: Double
    
    var useNativeDriver: Boolean
  }
  object ModalProps {
    
    @scala.inline
    def apply(
      animationIn: Animation | (CustomAnimation[TextStyle & ViewStyle & ImageStyle]),
      animationInTiming: Double,
      animationOut: Animation | (CustomAnimation[TextStyle & ViewStyle & ImageStyle]),
      animationOutTiming: Double,
      avoidKeyboard: Boolean,
      backdropColor: String,
      backdropOpacity: Double,
      backdropTransitionInTiming: Double,
      backdropTransitionOutTiming: Double,
      coverScreen: Boolean,
      deviceHeight: Double,
      deviceWidth: Double,
      hasBackdrop: Boolean,
      hideModalContentWhileAnimating: Boolean,
      isVisible: Boolean,
      onBackButtonPress: () => Unit,
      onBackdropPress: () => Unit,
      onModalHide: () => Unit,
      onModalShow: () => Unit,
      onModalWillHide: () => Unit,
      onModalWillShow: () => Unit,
      propagateSwipe: Boolean,
      scrollHorizontal: Boolean,
      scrollOffset: Double,
      scrollOffsetMax: Double,
      swipeThreshold: Double,
      useNativeDriver: Boolean
    ): ModalProps = {
      val __obj = js.Dynamic.literal(animationIn = animationIn.asInstanceOf[js.Any], animationInTiming = animationInTiming.asInstanceOf[js.Any], animationOut = animationOut.asInstanceOf[js.Any], animationOutTiming = animationOutTiming.asInstanceOf[js.Any], avoidKeyboard = avoidKeyboard.asInstanceOf[js.Any], backdropColor = backdropColor.asInstanceOf[js.Any], backdropOpacity = backdropOpacity.asInstanceOf[js.Any], backdropTransitionInTiming = backdropTransitionInTiming.asInstanceOf[js.Any], backdropTransitionOutTiming = backdropTransitionOutTiming.asInstanceOf[js.Any], coverScreen = coverScreen.asInstanceOf[js.Any], deviceHeight = deviceHeight.asInstanceOf[js.Any], deviceWidth = deviceWidth.asInstanceOf[js.Any], hasBackdrop = hasBackdrop.asInstanceOf[js.Any], hideModalContentWhileAnimating = hideModalContentWhileAnimating.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], onBackButtonPress = js.Any.fromFunction0(onBackButtonPress), onBackdropPress = js.Any.fromFunction0(onBackdropPress), onModalHide = js.Any.fromFunction0(onModalHide), onModalShow = js.Any.fromFunction0(onModalShow), onModalWillHide = js.Any.fromFunction0(onModalWillHide), onModalWillShow = js.Any.fromFunction0(onModalWillShow), propagateSwipe = propagateSwipe.asInstanceOf[js.Any], scrollHorizontal = scrollHorizontal.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], scrollOffsetMax = scrollOffsetMax.asInstanceOf[js.Any], swipeThreshold = swipeThreshold.asInstanceOf[js.Any], useNativeDriver = useNativeDriver.asInstanceOf[js.Any], scrollTo = null)
      __obj.asInstanceOf[ModalProps]
    }
    
    @scala.inline
    implicit class ModalPropsMutableBuilder[Self <: ModalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationIn(value: Animation | (CustomAnimation[TextStyle & ViewStyle & ImageStyle])): Self = StObject.set(x, "animationIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationInTiming(value: Double): Self = StObject.set(x, "animationInTiming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationOut(value: Animation | (CustomAnimation[TextStyle & ViewStyle & ImageStyle])): Self = StObject.set(x, "animationOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationOutTiming(value: Double): Self = StObject.set(x, "animationOutTiming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvoidKeyboard(value: Boolean): Self = StObject.set(x, "avoidKeyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropColor(value: String): Self = StObject.set(x, "backdropColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropOpacity(value: Double): Self = StObject.set(x, "backdropOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropTransitionInTiming(value: Double): Self = StObject.set(x, "backdropTransitionInTiming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropTransitionOutTiming(value: Double): Self = StObject.set(x, "backdropTransitionOutTiming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setCoverScreen(value: Boolean): Self = StObject.set(x, "coverScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomBackdrop(value: ReactNode): Self = StObject.set(x, "customBackdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomBackdropUndefined: Self = StObject.set(x, "customBackdrop", js.undefined)
      
      @scala.inline
      def setDeviceHeight(value: Double): Self = StObject.set(x, "deviceHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceWidth(value: Double): Self = StObject.set(x, "deviceWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHardwareAccelerated(value: Boolean): Self = StObject.set(x, "hardwareAccelerated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHardwareAcceleratedUndefined: Self = StObject.set(x, "hardwareAccelerated", js.undefined)
      
      @scala.inline
      def setHasBackdrop(value: Boolean): Self = StObject.set(x, "hasBackdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideModalContentWhileAnimating(value: Boolean): Self = StObject.set(x, "hideModalContentWhileAnimating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBackButtonPress(value: () => Unit): Self = StObject.set(x, "onBackButtonPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnBackdropPress(value: () => Unit): Self = StObject.set(x, "onBackdropPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      @scala.inline
      def setOnModalHide(value: () => Unit): Self = StObject.set(x, "onModalHide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnModalShow(value: () => Unit): Self = StObject.set(x, "onModalShow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnModalWillHide(value: () => Unit): Self = StObject.set(x, "onModalWillHide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnModalWillShow(value: () => Unit): Self = StObject.set(x, "onModalWillShow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnOrientationChange(value: /* orientation */ NativeSyntheticEvent[js.Any] => Unit): Self = StObject.set(x, "onOrientationChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOrientationChangeUndefined: Self = StObject.set(x, "onOrientationChange", js.undefined)
      
      @scala.inline
      def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setOnSwipeCancel(value: () => Unit): Self = StObject.set(x, "onSwipeCancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSwipeCancelUndefined: Self = StObject.set(x, "onSwipeCancel", js.undefined)
      
      @scala.inline
      def setOnSwipeComplete(value: /* params */ OnSwipeCompleteParams => Unit): Self = StObject.set(x, "onSwipeComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwipeCompleteUndefined: Self = StObject.set(x, "onSwipeComplete", js.undefined)
      
      @scala.inline
      def setOnSwipeMove(value: /* percentageShown */ Double => Unit): Self = StObject.set(x, "onSwipeMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwipeMoveUndefined: Self = StObject.set(x, "onSwipeMove", js.undefined)
      
      @scala.inline
      def setOnSwipeStart(value: () => Unit): Self = StObject.set(x, "onSwipeStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSwipeStartUndefined: Self = StObject.set(x, "onSwipeStart", js.undefined)
      
      @scala.inline
      def setPresentationStyle(value: PresentationStyle): Self = StObject.set(x, "presentationStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresentationStyleUndefined: Self = StObject.set(x, "presentationStyle", js.undefined)
      
      @scala.inline
      def setPropagateSwipe(value: Boolean): Self = StObject.set(x, "propagateSwipe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollHorizontal(value: Boolean): Self = StObject.set(x, "scrollHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollOffset(value: Double): Self = StObject.set(x, "scrollOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollOffsetMax(value: Double): Self = StObject.set(x, "scrollOffsetMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollTo(value: /* e */ js.Any => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollToNull: Self = StObject.set(x, "scrollTo", null)
      
      @scala.inline
      def setSupportedOrientations(value: js.Array[Orientation]): Self = StObject.set(x, "supportedOrientations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedOrientationsUndefined: Self = StObject.set(x, "supportedOrientations", js.undefined)
      
      @scala.inline
      def setSupportedOrientationsVarargs(value: Orientation*): Self = StObject.set(x, "supportedOrientations", js.Array(value :_*))
      
      @scala.inline
      def setSwipeDirection(value: Direction | js.Array[Direction]): Self = StObject.set(x, "swipeDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeDirectionUndefined: Self = StObject.set(x, "swipeDirection", js.undefined)
      
      @scala.inline
      def setSwipeDirectionVarargs(value: Direction*): Self = StObject.set(x, "swipeDirection", js.Array(value :_*))
      
      @scala.inline
      def setSwipeThreshold(value: Double): Self = StObject.set(x, "swipeThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnSwipeCompleteParams extends StObject {
    
    var swipingDirection: Direction
  }
  object OnSwipeCompleteParams {
    
    @scala.inline
    def apply(swipingDirection: Direction): OnSwipeCompleteParams = {
      val __obj = js.Dynamic.literal(swipingDirection = swipingDirection.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnSwipeCompleteParams]
    }
    
    @scala.inline
    implicit class OnSwipeCompleteParamsMutableBuilder[Self <: OnSwipeCompleteParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSwipingDirection(value: Direction): Self = StObject.set(x, "swipingDirection", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    var deviceHeight: Double
    
    var deviceWidth: Double
    
    var isSwipeable: Boolean
    
    var isVisible: Boolean
    
    var pan: OrNull[ValueXY]
    
    var showContent: Boolean
  }
  object State {
    
    @scala.inline
    def apply(
      deviceHeight: Double,
      deviceWidth: Double,
      isSwipeable: Boolean,
      isVisible: Boolean,
      showContent: Boolean
    ): State = {
      val __obj = js.Dynamic.literal(deviceHeight = deviceHeight.asInstanceOf[js.Any], deviceWidth = deviceWidth.asInstanceOf[js.Any], isSwipeable = isSwipeable.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], showContent = showContent.asInstanceOf[js.Any], pan = null)
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeviceHeight(value: Double): Self = StObject.set(x, "deviceHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceWidth(value: Double): Self = StObject.set(x, "deviceWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSwipeable(value: Boolean): Self = StObject.set(x, "isSwipeable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPan(value: OrNull[ValueXY]): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanNull: Self = StObject.set(x, "pan", null)
      
      @scala.inline
      def setShowContent(value: Boolean): Self = StObject.set(x, "showContent", value.asInstanceOf[js.Any])
    }
  }
}
