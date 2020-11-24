package typings.reactNativeModal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationInTiming extends js.Object {
  
  var animationIn: String = js.native
  
  var animationInTiming: Double = js.native
  
  var animationOut: String = js.native
  
  var animationOutTiming: Double = js.native
  
  var avoidKeyboard: Boolean = js.native
  
  var backdropColor: String = js.native
  
  var backdropOpacity: Double = js.native
  
  var backdropTransitionInTiming: Double = js.native
  
  var backdropTransitionOutTiming: Double = js.native
  
  var coverScreen: Boolean = js.native
  
  var customBackdrop: Null = js.native
  
  var deviceHeight: Null = js.native
  
  var deviceWidth: Null = js.native
  
  var hasBackdrop: Boolean = js.native
  
  var hideModalContentWhileAnimating: Boolean = js.native
  
  var isVisible: Boolean = js.native
  
  def onBackButtonPress(): Null = js.native
  
  def onBackdropPress(): Null = js.native
  
  def onModalHide(): Null = js.native
  
  def onModalShow(): Null = js.native
  
  def onModalWillHide(): Null = js.native
  
  def onModalWillShow(): Null = js.native
  
  var propagateSwipe: Boolean = js.native
  
  var scrollHorizontal: Boolean = js.native
  
  var scrollOffset: Double = js.native
  
  var scrollOffsetMax: Double = js.native
  
  var scrollTo: Null = js.native
  
  var supportedOrientations: js.Array[String] = js.native
  
  var swipeThreshold: Double = js.native
  
  var useNativeDriver: Boolean = js.native
}
object AnimationInTiming {
  
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
  ): AnimationInTiming = {
    val __obj = js.Dynamic.literal(animationIn = animationIn.asInstanceOf[js.Any], animationInTiming = animationInTiming.asInstanceOf[js.Any], animationOut = animationOut.asInstanceOf[js.Any], animationOutTiming = animationOutTiming.asInstanceOf[js.Any], avoidKeyboard = avoidKeyboard.asInstanceOf[js.Any], backdropColor = backdropColor.asInstanceOf[js.Any], backdropOpacity = backdropOpacity.asInstanceOf[js.Any], backdropTransitionInTiming = backdropTransitionInTiming.asInstanceOf[js.Any], backdropTransitionOutTiming = backdropTransitionOutTiming.asInstanceOf[js.Any], coverScreen = coverScreen.asInstanceOf[js.Any], customBackdrop = customBackdrop.asInstanceOf[js.Any], deviceHeight = deviceHeight.asInstanceOf[js.Any], deviceWidth = deviceWidth.asInstanceOf[js.Any], hasBackdrop = hasBackdrop.asInstanceOf[js.Any], hideModalContentWhileAnimating = hideModalContentWhileAnimating.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], onBackButtonPress = js.Any.fromFunction0(onBackButtonPress), onBackdropPress = js.Any.fromFunction0(onBackdropPress), onModalHide = js.Any.fromFunction0(onModalHide), onModalShow = js.Any.fromFunction0(onModalShow), onModalWillHide = js.Any.fromFunction0(onModalWillHide), onModalWillShow = js.Any.fromFunction0(onModalWillShow), propagateSwipe = propagateSwipe.asInstanceOf[js.Any], scrollHorizontal = scrollHorizontal.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], scrollOffsetMax = scrollOffsetMax.asInstanceOf[js.Any], scrollTo = scrollTo.asInstanceOf[js.Any], supportedOrientations = supportedOrientations.asInstanceOf[js.Any], swipeThreshold = swipeThreshold.asInstanceOf[js.Any], useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationInTiming]
  }
  
  @scala.inline
  implicit class AnimationInTimingOps[Self <: AnimationInTiming] (val x: Self) extends AnyVal {
    
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
    def setAnimationIn(value: String): Self = this.set("animationIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationInTiming(value: Double): Self = this.set("animationInTiming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOut(value: String): Self = this.set("animationOut", value.asInstanceOf[js.Any])
    
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
    def setCustomBackdrop(value: Null): Self = this.set("customBackdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceHeight(value: Null): Self = this.set("deviceHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceWidth(value: Null): Self = this.set("deviceWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasBackdrop(value: Boolean): Self = this.set("hasBackdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideModalContentWhileAnimating(value: Boolean): Self = this.set("hideModalContentWhileAnimating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBackButtonPress(value: () => Null): Self = this.set("onBackButtonPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnBackdropPress(value: () => Null): Self = this.set("onBackdropPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnModalHide(value: () => Null): Self = this.set("onModalHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnModalShow(value: () => Null): Self = this.set("onModalShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnModalWillHide(value: () => Null): Self = this.set("onModalWillHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnModalWillShow(value: () => Null): Self = this.set("onModalWillShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPropagateSwipe(value: Boolean): Self = this.set("propagateSwipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollHorizontal(value: Boolean): Self = this.set("scrollHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollOffset(value: Double): Self = this.set("scrollOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollOffsetMax(value: Double): Self = this.set("scrollOffsetMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTo(value: Null): Self = this.set("scrollTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedOrientationsVarargs(value: String*): Self = this.set("supportedOrientations", js.Array(value :_*))
    
    @scala.inline
    def setSupportedOrientations(value: js.Array[String]): Self = this.set("supportedOrientations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeThreshold(value: Double): Self = this.set("swipeThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseNativeDriver(value: Boolean): Self = this.set("useNativeDriver", value.asInstanceOf[js.Any])
  }
}
