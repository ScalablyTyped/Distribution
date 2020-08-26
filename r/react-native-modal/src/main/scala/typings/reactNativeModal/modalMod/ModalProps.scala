package typings.reactNativeModal.modalMod

import typings.react.mod.ReactNode
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewProps
import typings.reactNative.mod.ViewStyle
import typings.reactNativeAnimatable.mod.Animation
import typings.reactNativeAnimatable.mod.CustomAnimation
import typings.reactNativeModal.typesMod.Direction
import typings.reactNativeModal.typesMod.OnOrientationChange
import typings.reactNativeModal.typesMod.OrNull
import typings.reactNativeModal.typesMod.Orientation
import typings.reactNativeModal.typesMod.PresentationStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalProps extends ViewProps {
  var animationIn: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle]) = js.native
  var animationInTiming: Double = js.native
  var animationOut: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle]) = js.native
  var animationOutTiming: Double = js.native
  var avoidKeyboard: Boolean = js.native
  var backdropColor: String = js.native
  var backdropOpacity: Double = js.native
  var backdropTransitionInTiming: Double = js.native
  var backdropTransitionOutTiming: Double = js.native
  var children: ReactNode = js.native
  var coverScreen: Boolean = js.native
  var customBackdrop: ReactNode = js.native
  var deviceHeight: Double = js.native
  var deviceWidth: Double = js.native
  var hardwareAccelerated: js.UndefOr[Boolean] = js.native
  var hasBackdrop: Boolean = js.native
  var hideModalContentWhileAnimating: Boolean = js.native
  var isVisible: Boolean = js.native
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  var onOrientationChange: js.UndefOr[OnOrientationChange] = js.native
  var onShow: js.UndefOr[js.Function0[Unit]] = js.native
  var onSwipeCancel: js.UndefOr[js.Function0[Unit]] = js.native
  var onSwipeComplete: js.UndefOr[js.Function1[/* params */ OnSwipeCompleteParams, Unit]] = js.native
  var onSwipeMove: js.UndefOr[js.Function1[/* percentageShown */ Double, Unit]] = js.native
  var onSwipeStart: js.UndefOr[js.Function0[Unit]] = js.native
  var presentationStyle: js.UndefOr[PresentationStyle] = js.native
  var propagateSwipe: Boolean = js.native
  var scrollHorizontal: Boolean = js.native
  var scrollOffset: Double = js.native
  var scrollOffsetMax: Double = js.native
  var scrollTo: OrNull[js.Function1[/* e */ _, Unit]] = js.native
  var supportedOrientations: js.UndefOr[js.Array[Orientation]] = js.native
  var swipeDirection: js.UndefOr[Direction | js.Array[Direction]] = js.native
  var swipeThreshold: Double = js.native
  var useNativeDriver: Boolean = js.native
  def onBackButtonPress(): Unit = js.native
  def onBackdropPress(): Unit = js.native
  def onModalHide(): Unit = js.native
  def onModalShow(): Unit = js.native
  def onModalWillHide(): Unit = js.native
  def onModalWillShow(): Unit = js.native
}

object ModalProps {
  @scala.inline
  def apply(
    animationIn: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle]),
    animationInTiming: Double,
    animationOut: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle]),
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
    val __obj = js.Dynamic.literal(animationIn = animationIn.asInstanceOf[js.Any], animationInTiming = animationInTiming.asInstanceOf[js.Any], animationOut = animationOut.asInstanceOf[js.Any], animationOutTiming = animationOutTiming.asInstanceOf[js.Any], avoidKeyboard = avoidKeyboard.asInstanceOf[js.Any], backdropColor = backdropColor.asInstanceOf[js.Any], backdropOpacity = backdropOpacity.asInstanceOf[js.Any], backdropTransitionInTiming = backdropTransitionInTiming.asInstanceOf[js.Any], backdropTransitionOutTiming = backdropTransitionOutTiming.asInstanceOf[js.Any], coverScreen = coverScreen.asInstanceOf[js.Any], deviceHeight = deviceHeight.asInstanceOf[js.Any], deviceWidth = deviceWidth.asInstanceOf[js.Any], hasBackdrop = hasBackdrop.asInstanceOf[js.Any], hideModalContentWhileAnimating = hideModalContentWhileAnimating.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], onBackButtonPress = js.Any.fromFunction0(onBackButtonPress), onBackdropPress = js.Any.fromFunction0(onBackdropPress), onModalHide = js.Any.fromFunction0(onModalHide), onModalShow = js.Any.fromFunction0(onModalShow), onModalWillHide = js.Any.fromFunction0(onModalWillHide), onModalWillShow = js.Any.fromFunction0(onModalWillShow), propagateSwipe = propagateSwipe.asInstanceOf[js.Any], scrollHorizontal = scrollHorizontal.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], scrollOffsetMax = scrollOffsetMax.asInstanceOf[js.Any], swipeThreshold = swipeThreshold.asInstanceOf[js.Any], useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalProps]
  }
  @scala.inline
  implicit class ModalPropsOps[Self <: ModalProps] (val x: Self) extends AnyVal {
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
    def setAnimationIn(value: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])): Self = this.set("animationIn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationInTiming(value: Double): Self = this.set("animationInTiming", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationOut(value: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])): Self = this.set("animationOut", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationOutTiming(value: Double): Self = this.set("animationOutTiming", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvoidKeyboard(value: Boolean): Self = this.set("avoidKeyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackdropColor(value: String): Self = this.set("backdropColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackdropOpacity(value: Double): Self = this.set("backdropOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackdropTransitionInTiming(value: Double): Self = this.set("backdropTransitionInTiming", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackdropTransitionOutTiming(value: Double): Self = this.set("backdropTransitionOutTiming", value.asInstanceOf[js.Any])
    @scala.inline
    def setCoverScreen(value: Boolean): Self = this.set("coverScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceHeight(value: Double): Self = this.set("deviceHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceWidth(value: Double): Self = this.set("deviceWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasBackdrop(value: Boolean): Self = this.set("hasBackdrop", value.asInstanceOf[js.Any])
    @scala.inline
    def setHideModalContentWhileAnimating(value: Boolean): Self = this.set("hideModalContentWhileAnimating", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnBackButtonPress(value: () => Unit): Self = this.set("onBackButtonPress", js.Any.fromFunction0(value))
    @scala.inline
    def setOnBackdropPress(value: () => Unit): Self = this.set("onBackdropPress", js.Any.fromFunction0(value))
    @scala.inline
    def setOnModalHide(value: () => Unit): Self = this.set("onModalHide", js.Any.fromFunction0(value))
    @scala.inline
    def setOnModalShow(value: () => Unit): Self = this.set("onModalShow", js.Any.fromFunction0(value))
    @scala.inline
    def setOnModalWillHide(value: () => Unit): Self = this.set("onModalWillHide", js.Any.fromFunction0(value))
    @scala.inline
    def setOnModalWillShow(value: () => Unit): Self = this.set("onModalWillShow", js.Any.fromFunction0(value))
    @scala.inline
    def setPropagateSwipe(value: Boolean): Self = this.set("propagateSwipe", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollHorizontal(value: Boolean): Self = this.set("scrollHorizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollOffset(value: Double): Self = this.set("scrollOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollOffsetMax(value: Double): Self = this.set("scrollOffsetMax", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipeThreshold(value: Double): Self = this.set("swipeThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseNativeDriver(value: Boolean): Self = this.set("useNativeDriver", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setCustomBackdrop(value: ReactNode): Self = this.set("customBackdrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomBackdrop: Self = this.set("customBackdrop", js.undefined)
    @scala.inline
    def setHardwareAccelerated(value: Boolean): Self = this.set("hardwareAccelerated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHardwareAccelerated: Self = this.set("hardwareAccelerated", js.undefined)
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = this.set("onDismiss", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    @scala.inline
    def setOnOrientationChange(value: /* orientation */ NativeSyntheticEvent[js.Any] => Unit): Self = this.set("onOrientationChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOrientationChange: Self = this.set("onOrientationChange", js.undefined)
    @scala.inline
    def setOnShow(value: () => Unit): Self = this.set("onShow", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    @scala.inline
    def setOnSwipeCancel(value: () => Unit): Self = this.set("onSwipeCancel", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnSwipeCancel: Self = this.set("onSwipeCancel", js.undefined)
    @scala.inline
    def setOnSwipeComplete(value: /* params */ OnSwipeCompleteParams => Unit): Self = this.set("onSwipeComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSwipeComplete: Self = this.set("onSwipeComplete", js.undefined)
    @scala.inline
    def setOnSwipeMove(value: /* percentageShown */ Double => Unit): Self = this.set("onSwipeMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSwipeMove: Self = this.set("onSwipeMove", js.undefined)
    @scala.inline
    def setOnSwipeStart(value: () => Unit): Self = this.set("onSwipeStart", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnSwipeStart: Self = this.set("onSwipeStart", js.undefined)
    @scala.inline
    def setPresentationStyle(value: PresentationStyle): Self = this.set("presentationStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePresentationStyle: Self = this.set("presentationStyle", js.undefined)
    @scala.inline
    def setScrollTo(value: /* e */ _ => Unit): Self = this.set("scrollTo", js.Any.fromFunction1(value))
    @scala.inline
    def setScrollToNull: Self = this.set("scrollTo", null)
    @scala.inline
    def setSupportedOrientationsVarargs(value: Orientation*): Self = this.set("supportedOrientations", js.Array(value :_*))
    @scala.inline
    def setSupportedOrientations(value: js.Array[Orientation]): Self = this.set("supportedOrientations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedOrientations: Self = this.set("supportedOrientations", js.undefined)
    @scala.inline
    def setSwipeDirectionVarargs(value: Direction*): Self = this.set("swipeDirection", js.Array(value :_*))
    @scala.inline
    def setSwipeDirection(value: Direction | js.Array[Direction]): Self = this.set("swipeDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeDirection: Self = this.set("swipeDirection", js.undefined)
  }
  
}

