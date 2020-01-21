package typings.reactNativeModal

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimationIn extends js.Object {
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

object AnonAnimationIn {
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
  ): AnonAnimationIn = {
    val __obj = js.Dynamic.literal(animationIn = animationIn.asInstanceOf[js.Any], animationInTiming = animationInTiming.asInstanceOf[js.Any], animationOut = animationOut.asInstanceOf[js.Any], animationOutTiming = animationOutTiming.asInstanceOf[js.Any], avoidKeyboard = avoidKeyboard.asInstanceOf[js.Any], backdropColor = backdropColor.asInstanceOf[js.Any], backdropOpacity = backdropOpacity.asInstanceOf[js.Any], backdropTransitionInTiming = backdropTransitionInTiming.asInstanceOf[js.Any], backdropTransitionOutTiming = backdropTransitionOutTiming.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], coverScreen = coverScreen.asInstanceOf[js.Any], customBackdrop = customBackdrop.asInstanceOf[js.Any], deviceHeight = deviceHeight.asInstanceOf[js.Any], deviceWidth = deviceWidth.asInstanceOf[js.Any], hasBackdrop = hasBackdrop.asInstanceOf[js.Any], hideModalContentWhileAnimating = hideModalContentWhileAnimating.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], onBackButtonPress = onBackButtonPress.asInstanceOf[js.Any], onBackdropPress = onBackdropPress.asInstanceOf[js.Any], onModalHide = onModalHide.asInstanceOf[js.Any], onModalShow = onModalShow.asInstanceOf[js.Any], onModalWillHide = onModalWillHide.asInstanceOf[js.Any], onModalWillShow = onModalWillShow.asInstanceOf[js.Any], onSwipeCancel = onSwipeCancel.asInstanceOf[js.Any], onSwipeComplete = onSwipeComplete.asInstanceOf[js.Any], onSwipeMove = onSwipeMove.asInstanceOf[js.Any], onSwipeStart = onSwipeStart.asInstanceOf[js.Any], propagateSwipe = propagateSwipe.asInstanceOf[js.Any], scrollHorizontal = scrollHorizontal.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], scrollOffsetMax = scrollOffsetMax.asInstanceOf[js.Any], scrollTo = scrollTo.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], supportedOrientations = supportedOrientations.asInstanceOf[js.Any], swipeDirection = swipeDirection.asInstanceOf[js.Any], swipeThreshold = swipeThreshold.asInstanceOf[js.Any], useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAnimationIn]
  }
}

