package typings.reactNativeModalbox.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeModalbox.reactNativeModalboxStrings.bottom
import typings.reactNativeModalbox.reactNativeModalboxStrings.center
import typings.reactNativeModalbox.reactNativeModalboxStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalProps extends js.Object {
  
  /**
    * Duration of the animation
    *
    * Default is 400ms
    *
    */
  var animationDuration: js.UndefOr[Double] = js.native
  
  /**
    * (Android only) Close modal when receiving back button event
    *
    * Default is false
    *
    */
  var backButtonClose: js.UndefOr[Boolean] = js.native
  
  /**
    * If a backdrop is displayed behind the modal
    *
    * Default is true
    *
    */
  var backdrop: js.UndefOr[Boolean] = js.native
  
  /**
    * Background color of the backdrop
    *
    * Default is black
    *
    */
  var backdropColor: js.UndefOr[String] = js.native
  
  /**
    * Add an element in the backdrop (a close button for example)
    *
    * Default is null
    *
    */
  var backdropContent: js.UndefOr[ReactNode] = js.native
  
  /**
    * Opacity of the backdrop
    *
    * Default is 0.5
    *
    */
  var backdropOpacity: js.UndefOr[Double] = js.native
  
  /**
    * If the modal can be closed by pressing on the backdrop
    *
    * Default is true
    *
    */
  var backdropPressToClose: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Default is false
    */
  var coverScreen: js.UndefOr[Boolean] = js.native
  
  /**
    * The direction modal enters from
    *
    * Default is bottom
    *
    */
  var entry: js.UndefOr[top | bottom | String] = js.native
  
  /**
    * Checks if the modal is disabled
    *
    * Default is false
    *
    */
  var isDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Checks if the modal is open
    *
    * Default is false
    *
    */
  var isOpen: js.UndefOr[Boolean] = js.native
  
  /**
    * This property prevent the modal to cover the ios status bar when the modal is scrolling up because the keyboard is opening
    *
    * Default is ios:22, android:0
    */
  var keyboardTopOffset: js.UndefOr[Double] = js.native
  
  /**
    * Event fired when the modal is closed and the animation is complete
    *
    */
  var onClosed: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * When the state of the swipe to close feature has changed
    * (useful to change the content of the modal, display a message for example)
    *
    *
    */
  var onClosingState: js.UndefOr[js.Function1[/* state */ Boolean, Unit]] = js.native
  
  /**
    * Event fired when the modal is opened and the animation is complete
    *
    */
  var onOpened: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * The final position of the modal.
    * Accepts top, center or bottom
    *
    * Default is center
    *
    */
  var position: js.UndefOr[top | center | bottom | String] = js.native
  
  /**
    * If the modal should appear open without animation upon first mount
    *
    * Default is false
    *
    */
  var startOpen: js.UndefOr[Boolean] = js.native
  
  /**
    * Custom styling for the content area
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * The height in pixels of the swipeable area
    *
    * Default is the Window Height
    *
    */
  var swipeArea: js.UndefOr[Double] = js.native
  
  /**
    * The threshold to reach in pixels to close the modal
    *
    * Default is 50
    *
    */
  var swipeThreshold: js.UndefOr[Double] = js.native
  
  /**
    * If the modal can be closed by swiping
    *
    * Default is true
    *
    */
  var swipeToClose: js.UndefOr[Boolean] = js.native
  
  /**
    * Enables the hardware acceleration to animate the modal. Please note that enabling this can cause some flashes in a weird way when animating
    *
    * Default is true
    *
    */
  var useNativeDriver: js.UndefOr[Boolean] = js.native
}
object ModalProps {
  
  @scala.inline
  def apply(): ModalProps = {
    val __obj = js.Dynamic.literal()
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
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
    @scala.inline
    def setBackButtonClose(value: Boolean): Self = this.set("backButtonClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackButtonClose: Self = this.set("backButtonClose", js.undefined)
    
    @scala.inline
    def setBackdrop(value: Boolean): Self = this.set("backdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackdrop: Self = this.set("backdrop", js.undefined)
    
    @scala.inline
    def setBackdropColor(value: String): Self = this.set("backdropColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackdropColor: Self = this.set("backdropColor", js.undefined)
    
    @scala.inline
    def setBackdropContent(value: ReactNode): Self = this.set("backdropContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackdropContent: Self = this.set("backdropContent", js.undefined)
    
    @scala.inline
    def setBackdropOpacity(value: Double): Self = this.set("backdropOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackdropOpacity: Self = this.set("backdropOpacity", js.undefined)
    
    @scala.inline
    def setBackdropPressToClose(value: Boolean): Self = this.set("backdropPressToClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackdropPressToClose: Self = this.set("backdropPressToClose", js.undefined)
    
    @scala.inline
    def setCoverScreen(value: Boolean): Self = this.set("coverScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoverScreen: Self = this.set("coverScreen", js.undefined)
    
    @scala.inline
    def setEntry(value: top | bottom | String): Self = this.set("entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntry: Self = this.set("entry", js.undefined)
    
    @scala.inline
    def setIsDisabled(value: Boolean): Self = this.set("isDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDisabled: Self = this.set("isDisabled", js.undefined)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    
    @scala.inline
    def setKeyboardTopOffset(value: Double): Self = this.set("keyboardTopOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardTopOffset: Self = this.set("keyboardTopOffset", js.undefined)
    
    @scala.inline
    def setOnClosed(value: () => Unit): Self = this.set("onClosed", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClosed: Self = this.set("onClosed", js.undefined)
    
    @scala.inline
    def setOnClosingState(value: /* state */ Boolean => Unit): Self = this.set("onClosingState", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClosingState: Self = this.set("onClosingState", js.undefined)
    
    @scala.inline
    def setOnOpened(value: () => Unit): Self = this.set("onOpened", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnOpened: Self = this.set("onOpened", js.undefined)
    
    @scala.inline
    def setPosition(value: top | center | bottom | String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setStartOpen(value: Boolean): Self = this.set("startOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartOpen: Self = this.set("startOpen", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setSwipeArea(value: Double): Self = this.set("swipeArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeArea: Self = this.set("swipeArea", js.undefined)
    
    @scala.inline
    def setSwipeThreshold(value: Double): Self = this.set("swipeThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeThreshold: Self = this.set("swipeThreshold", js.undefined)
    
    @scala.inline
    def setSwipeToClose(value: Boolean): Self = this.set("swipeToClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeToClose: Self = this.set("swipeToClose", js.undefined)
    
    @scala.inline
    def setUseNativeDriver(value: Boolean): Self = this.set("useNativeDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNativeDriver: Self = this.set("useNativeDriver", js.undefined)
  }
}
