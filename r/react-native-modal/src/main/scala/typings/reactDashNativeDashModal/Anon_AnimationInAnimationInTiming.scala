package typings.reactDashNativeDashModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimationInAnimationInTiming extends js.Object {
  var animationIn: String
  var animationInTiming: Double
  var animationOut: String
  var animationOutTiming: Double
  var avoidKeyboard: Boolean
  var backdropColor: String
  var backdropOpacity: Double
  var backdropTransitionInTiming: Double
  var backdropTransitionOutTiming: Double
  var coverScreen: Boolean
  var customBackdrop: Null
  var deviceHeight: Null
  var deviceWidth: Null
  var hasBackdrop: Boolean
  var hideModalContentWhileAnimating: Boolean
  var isVisible: Boolean
  var propagateSwipe: Boolean
  var scrollHorizontal: Boolean
  var scrollOffset: Double
  var scrollOffsetMax: Double
  var scrollTo: Null
  var supportedOrientations: js.Array[String]
  var swipeThreshold: Double
  var useNativeDriver: Boolean
  def onBackButtonPress(): Null
  def onBackdropPress(): Null
  def onModalHide(): Null
  def onModalShow(): Null
  def onModalWillHide(): Null
  def onModalWillShow(): Null
}

object Anon_AnimationInAnimationInTiming {
  @scala.inline
  def apply(
    animationIn: String,
    animationInTiming: Double,
    animationOut: String,
    animationOutTiming: Double,
    avoidKeyboard: Boolean,
    backdropColor: String,
    backdropOpacity: Double,
    backdropTransitionInTiming: Double,
    backdropTransitionOutTiming: Double,
    coverScreen: Boolean,
    customBackdrop: Null,
    deviceHeight: Null,
    deviceWidth: Null,
    hasBackdrop: Boolean,
    hideModalContentWhileAnimating: Boolean,
    isVisible: Boolean,
    onBackButtonPress: () => Null,
    onBackdropPress: () => Null,
    onModalHide: () => Null,
    onModalShow: () => Null,
    onModalWillHide: () => Null,
    onModalWillShow: () => Null,
    propagateSwipe: Boolean,
    scrollHorizontal: Boolean,
    scrollOffset: Double,
    scrollOffsetMax: Double,
    scrollTo: Null,
    supportedOrientations: js.Array[String],
    swipeThreshold: Double,
    useNativeDriver: Boolean
  ): Anon_AnimationInAnimationInTiming = {
    val __obj = js.Dynamic.literal(animationIn = animationIn, animationInTiming = animationInTiming, animationOut = animationOut, animationOutTiming = animationOutTiming, avoidKeyboard = avoidKeyboard, backdropColor = backdropColor, backdropOpacity = backdropOpacity, backdropTransitionInTiming = backdropTransitionInTiming, backdropTransitionOutTiming = backdropTransitionOutTiming, coverScreen = coverScreen, customBackdrop = customBackdrop, deviceHeight = deviceHeight, deviceWidth = deviceWidth, hasBackdrop = hasBackdrop, hideModalContentWhileAnimating = hideModalContentWhileAnimating, isVisible = isVisible, onBackButtonPress = js.Any.fromFunction0(onBackButtonPress), onBackdropPress = js.Any.fromFunction0(onBackdropPress), onModalHide = js.Any.fromFunction0(onModalHide), onModalShow = js.Any.fromFunction0(onModalShow), onModalWillHide = js.Any.fromFunction0(onModalWillHide), onModalWillShow = js.Any.fromFunction0(onModalWillShow), propagateSwipe = propagateSwipe, scrollHorizontal = scrollHorizontal, scrollOffset = scrollOffset, scrollOffsetMax = scrollOffsetMax, scrollTo = scrollTo, supportedOrientations = supportedOrientations, swipeThreshold = swipeThreshold, useNativeDriver = useNativeDriver)
  
    __obj.asInstanceOf[Anon_AnimationInAnimationInTiming]
  }
}

