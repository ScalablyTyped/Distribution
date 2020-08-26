package typings.reactNativeModal.anon

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationIn extends js.Object {
  var animationIn: Requireable[String | js.Object] = js.native
  var animationInTiming: Requireable[Double] = js.native
  var animationOut: Requireable[String | js.Object] = js.native
  var animationOutTiming: Requireable[Double] = js.native
  var avoidKeyboard: Requireable[Boolean] = js.native
  var backdropColor: Requireable[String] = js.native
  var backdropOpacity: Requireable[Double] = js.native
  var backdropTransitionInTiming: Requireable[Double] = js.native
  var backdropTransitionOutTiming: Requireable[Double] = js.native
  var children: Validator[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray] = js.native
  var coverScreen: Requireable[Boolean] = js.native
  var customBackdrop: Requireable[ReactNodeLike] = js.native
  var deviceHeight: Requireable[Double] = js.native
  var deviceWidth: Requireable[Double] = js.native
  var hasBackdrop: Requireable[Boolean] = js.native
  var hideModalContentWhileAnimating: Requireable[Boolean] = js.native
  var isVisible: Validator[Boolean] = js.native
  var onBackButtonPress: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var onBackdropPress: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var onModalHide: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var onModalShow: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var onModalWillHide: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var onModalWillShow: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var onSwipeCancel: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var onSwipeComplete: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var onSwipeMove: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var onSwipeStart: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var propagateSwipe: Requireable[Boolean] = js.native
  var scrollHorizontal: Requireable[Boolean] = js.native
  var scrollOffset: Requireable[Double] = js.native
  var scrollOffsetMax: Requireable[Double] = js.native
  var scrollTo: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var style: Requireable[_] = js.native
  var supportedOrientations: Requireable[js.Array[js.UndefOr[String | Null]]] = js.native
  var swipeDirection: Requireable[String | (js.Array[js.UndefOr[String | Null]])] = js.native
  var swipeThreshold: Requireable[Double] = js.native
  var useNativeDriver: Requireable[Boolean] = js.native
}

object AnimationIn {
  @scala.inline
  def apply(
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
    onBackButtonPress: Requireable[js.Function1[/* repeated */ _, _]],
    onBackdropPress: Requireable[js.Function1[/* repeated */ _, _]],
    onModalHide: Requireable[js.Function1[/* repeated */ _, _]],
    onModalShow: Requireable[js.Function1[/* repeated */ _, _]],
    onModalWillHide: Requireable[js.Function1[/* repeated */ _, _]],
    onModalWillShow: Requireable[js.Function1[/* repeated */ _, _]],
    onSwipeCancel: Requireable[js.Function1[/* repeated */ _, _]],
    onSwipeComplete: Requireable[js.Function1[/* repeated */ _, _]],
    onSwipeMove: Requireable[js.Function1[/* repeated */ _, _]],
    onSwipeStart: Requireable[js.Function1[/* repeated */ _, _]],
    propagateSwipe: Requireable[Boolean],
    scrollHorizontal: Requireable[Boolean],
    scrollOffset: Requireable[Double],
    scrollOffsetMax: Requireable[Double],
    scrollTo: Requireable[js.Function1[/* repeated */ _, _]],
    style: Requireable[_],
    supportedOrientations: Requireable[js.Array[js.UndefOr[String | Null]]],
    swipeDirection: Requireable[String | (js.Array[js.UndefOr[String | Null]])],
    swipeThreshold: Requireable[Double],
    useNativeDriver: Requireable[Boolean]
  ): AnimationIn = {
    val __obj = js.Dynamic.literal(animationIn = animationIn.asInstanceOf[js.Any], animationInTiming = animationInTiming.asInstanceOf[js.Any], animationOut = animationOut.asInstanceOf[js.Any], animationOutTiming = animationOutTiming.asInstanceOf[js.Any], avoidKeyboard = avoidKeyboard.asInstanceOf[js.Any], backdropColor = backdropColor.asInstanceOf[js.Any], backdropOpacity = backdropOpacity.asInstanceOf[js.Any], backdropTransitionInTiming = backdropTransitionInTiming.asInstanceOf[js.Any], backdropTransitionOutTiming = backdropTransitionOutTiming.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], coverScreen = coverScreen.asInstanceOf[js.Any], customBackdrop = customBackdrop.asInstanceOf[js.Any], deviceHeight = deviceHeight.asInstanceOf[js.Any], deviceWidth = deviceWidth.asInstanceOf[js.Any], hasBackdrop = hasBackdrop.asInstanceOf[js.Any], hideModalContentWhileAnimating = hideModalContentWhileAnimating.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], onBackButtonPress = onBackButtonPress.asInstanceOf[js.Any], onBackdropPress = onBackdropPress.asInstanceOf[js.Any], onModalHide = onModalHide.asInstanceOf[js.Any], onModalShow = onModalShow.asInstanceOf[js.Any], onModalWillHide = onModalWillHide.asInstanceOf[js.Any], onModalWillShow = onModalWillShow.asInstanceOf[js.Any], onSwipeCancel = onSwipeCancel.asInstanceOf[js.Any], onSwipeComplete = onSwipeComplete.asInstanceOf[js.Any], onSwipeMove = onSwipeMove.asInstanceOf[js.Any], onSwipeStart = onSwipeStart.asInstanceOf[js.Any], propagateSwipe = propagateSwipe.asInstanceOf[js.Any], scrollHorizontal = scrollHorizontal.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], scrollOffsetMax = scrollOffsetMax.asInstanceOf[js.Any], scrollTo = scrollTo.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], supportedOrientations = supportedOrientations.asInstanceOf[js.Any], swipeDirection = swipeDirection.asInstanceOf[js.Any], swipeThreshold = swipeThreshold.asInstanceOf[js.Any], useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationIn]
  }
  @scala.inline
  implicit class AnimationInOps[Self <: AnimationIn] (val x: Self) extends AnyVal {
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
    def setAnimationIn(value: Requireable[String | js.Object]): Self = this.set("animationIn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationInTiming(value: Requireable[Double]): Self = this.set("animationInTiming", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationOut(value: Requireable[String | js.Object]): Self = this.set("animationOut", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationOutTiming(value: Requireable[Double]): Self = this.set("animationOutTiming", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvoidKeyboard(value: Requireable[Boolean]): Self = this.set("avoidKeyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackdropColor(value: Requireable[String]): Self = this.set("backdropColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackdropOpacity(value: Requireable[Double]): Self = this.set("backdropOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackdropTransitionInTiming(value: Requireable[Double]): Self = this.set("backdropTransitionInTiming", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackdropTransitionOutTiming(value: Requireable[Double]): Self = this.set("backdropTransitionOutTiming", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: Validator[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setCoverScreen(value: Requireable[Boolean]): Self = this.set("coverScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomBackdrop(value: Requireable[ReactNodeLike]): Self = this.set("customBackdrop", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceHeight(value: Requireable[Double]): Self = this.set("deviceHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceWidth(value: Requireable[Double]): Self = this.set("deviceWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasBackdrop(value: Requireable[Boolean]): Self = this.set("hasBackdrop", value.asInstanceOf[js.Any])
    @scala.inline
    def setHideModalContentWhileAnimating(value: Requireable[Boolean]): Self = this.set("hideModalContentWhileAnimating", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsVisible(value: Validator[Boolean]): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnBackButtonPress(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("onBackButtonPress", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnBackdropPress(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("onBackdropPress", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnModalHide(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("onModalHide", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnModalShow(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("onModalShow", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnModalWillHide(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("onModalWillHide", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnModalWillShow(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("onModalWillShow", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnSwipeCancel(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("onSwipeCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnSwipeComplete(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("onSwipeComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnSwipeMove(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("onSwipeMove", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnSwipeStart(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("onSwipeStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropagateSwipe(value: Requireable[Boolean]): Self = this.set("propagateSwipe", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollHorizontal(value: Requireable[Boolean]): Self = this.set("scrollHorizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollOffset(value: Requireable[Double]): Self = this.set("scrollOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollOffsetMax(value: Requireable[Double]): Self = this.set("scrollOffsetMax", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollTo(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("scrollTo", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: Requireable[_]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportedOrientations(value: Requireable[js.Array[js.UndefOr[String | Null]]]): Self = this.set("supportedOrientations", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipeDirection(value: Requireable[String | (js.Array[js.UndefOr[String | Null]])]): Self = this.set("swipeDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipeThreshold(value: Requireable[Double]): Self = this.set("swipeThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseNativeDriver(value: Requireable[Boolean]): Self = this.set("useNativeDriver", value.asInstanceOf[js.Any])
  }
  
}

