package typings.reactDashNativeDashModal

import typings.propDashTypes.propDashTypesMod.ReactElementLike
import typings.propDashTypes.propDashTypesMod.ReactNodeArray
import typings.propDashTypes.propDashTypesMod.ReactNodeLike
import typings.propDashTypes.propDashTypesMod.Requireable
import typings.propDashTypes.propDashTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimationIn extends js.Object {
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
  var onBackButtonPress: Requireable[js.Function1[/* repeated */ _, _]]
  var onBackdropPress: Requireable[js.Function1[/* repeated */ _, _]]
  var onModalHide: Requireable[js.Function1[/* repeated */ _, _]]
  var onModalShow: Requireable[js.Function1[/* repeated */ _, _]]
  var onModalWillHide: Requireable[js.Function1[/* repeated */ _, _]]
  var onModalWillShow: Requireable[js.Function1[/* repeated */ _, _]]
  var onSwipeCancel: Requireable[js.Function1[/* repeated */ _, _]]
  var onSwipeComplete: Requireable[js.Function1[/* repeated */ _, _]]
  var onSwipeMove: Requireable[js.Function1[/* repeated */ _, _]]
  var onSwipeStart: Requireable[js.Function1[/* repeated */ _, _]]
  var propagateSwipe: Requireable[Boolean]
  var scrollHorizontal: Requireable[Boolean]
  var scrollOffset: Requireable[Double]
  var scrollOffsetMax: Requireable[Double]
  var scrollTo: Requireable[js.Function1[/* repeated */ _, _]]
  var style: Requireable[_]
  var supportedOrientations: Requireable[js.Array[js.UndefOr[String | Null]]]
  var swipeDirection: Requireable[String | (js.Array[js.UndefOr[String | Null]])]
  var swipeThreshold: Requireable[Double]
  var useNativeDriver: Requireable[Boolean]
}

object Anon_AnimationIn {
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
  ): Anon_AnimationIn = {
    val __obj = js.Dynamic.literal(animationIn = animationIn, animationInTiming = animationInTiming, animationOut = animationOut, animationOutTiming = animationOutTiming, avoidKeyboard = avoidKeyboard, backdropColor = backdropColor, backdropOpacity = backdropOpacity, backdropTransitionInTiming = backdropTransitionInTiming, backdropTransitionOutTiming = backdropTransitionOutTiming, children = children, coverScreen = coverScreen, customBackdrop = customBackdrop, deviceHeight = deviceHeight, deviceWidth = deviceWidth, hasBackdrop = hasBackdrop, hideModalContentWhileAnimating = hideModalContentWhileAnimating, isVisible = isVisible, onBackButtonPress = onBackButtonPress, onBackdropPress = onBackdropPress, onModalHide = onModalHide, onModalShow = onModalShow, onModalWillHide = onModalWillHide, onModalWillShow = onModalWillShow, onSwipeCancel = onSwipeCancel, onSwipeComplete = onSwipeComplete, onSwipeMove = onSwipeMove, onSwipeStart = onSwipeStart, propagateSwipe = propagateSwipe, scrollHorizontal = scrollHorizontal, scrollOffset = scrollOffset, scrollOffsetMax = scrollOffsetMax, scrollTo = scrollTo, style = style, supportedOrientations = supportedOrientations, swipeDirection = swipeDirection, swipeThreshold = swipeThreshold, useNativeDriver = useNativeDriver)
  
    __obj.asInstanceOf[Anon_AnimationIn]
  }
}

