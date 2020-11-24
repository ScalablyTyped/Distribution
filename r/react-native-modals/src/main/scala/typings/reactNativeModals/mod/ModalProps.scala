package typings.reactNativeModals.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalProps extends js.Object {
  
  var animationDuration: js.UndefOr[Double] = js.native
  
  var footer: js.UndefOr[ReactNode] = js.native
  
  var hasOverlay: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var modalAnimation: js.UndefOr[FadeAnimation | ScaleAnimation | SlideAnimation] = js.native
  
  var modalStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var modalTitle: js.UndefOr[ReactNode] = js.native
  
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onHardwareBackPress: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var onMove: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  
  var onShow: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onSwipeOut: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  
  var onSwipeRelease: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  
  var onSwiping: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  
  var onSwipingOut: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  
  var onTouchOutside: js.UndefOr[js.Function0[Unit]] = js.native
  
  var overlayBackgroundColor: js.UndefOr[String] = js.native
  
  var overlayOpacity: js.UndefOr[Double] = js.native
  
  var overlayPointerEvents: js.UndefOr[OverlayPointerEventTypes] = js.native
  
  var rounded: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var swipeDirection: js.UndefOr[SwipeDirection | js.Array[SwipeDirection]] = js.native
  
  var swipeThreshold: js.UndefOr[Double] = js.native
  
  var useNativeDriver: js.UndefOr[Boolean] = js.native
  
  var visible: Boolean = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object ModalProps {
  
  @scala.inline
  def apply(visible: Boolean): ModalProps = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
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
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
    @scala.inline
    def setFooter(value: ReactNode): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setHasOverlay(value: Boolean): Self = this.set("hasOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasOverlay: Self = this.set("hasOverlay", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setModalAnimation(value: FadeAnimation | ScaleAnimation | SlideAnimation): Self = this.set("modalAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModalAnimation: Self = this.set("modalAnimation", js.undefined)
    
    @scala.inline
    def setModalStyle(value: StyleProp[ViewStyle]): Self = this.set("modalStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModalStyle: Self = this.set("modalStyle", js.undefined)
    
    @scala.inline
    def setModalStyleNull: Self = this.set("modalStyle", null)
    
    @scala.inline
    def setModalTitle(value: ReactNode): Self = this.set("modalTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModalTitle: Self = this.set("modalTitle", js.undefined)
    
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = this.set("onDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    
    @scala.inline
    def setOnHardwareBackPress(value: () => Boolean): Self = this.set("onHardwareBackPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnHardwareBackPress: Self = this.set("onHardwareBackPress", js.undefined)
    
    @scala.inline
    def setOnMove(value: /* event */ DragEvent => Unit): Self = this.set("onMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMove: Self = this.set("onMove", js.undefined)
    
    @scala.inline
    def setOnShow(value: () => Unit): Self = this.set("onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setOnSwipeOut(value: /* event */ DragEvent => Unit): Self = this.set("onSwipeOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSwipeOut: Self = this.set("onSwipeOut", js.undefined)
    
    @scala.inline
    def setOnSwipeRelease(value: /* event */ DragEvent => Unit): Self = this.set("onSwipeRelease", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSwipeRelease: Self = this.set("onSwipeRelease", js.undefined)
    
    @scala.inline
    def setOnSwiping(value: /* event */ DragEvent => Unit): Self = this.set("onSwiping", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSwiping: Self = this.set("onSwiping", js.undefined)
    
    @scala.inline
    def setOnSwipingOut(value: /* event */ DragEvent => Unit): Self = this.set("onSwipingOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSwipingOut: Self = this.set("onSwipingOut", js.undefined)
    
    @scala.inline
    def setOnTouchOutside(value: () => Unit): Self = this.set("onTouchOutside", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnTouchOutside: Self = this.set("onTouchOutside", js.undefined)
    
    @scala.inline
    def setOverlayBackgroundColor(value: String): Self = this.set("overlayBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayBackgroundColor: Self = this.set("overlayBackgroundColor", js.undefined)
    
    @scala.inline
    def setOverlayOpacity(value: Double): Self = this.set("overlayOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayOpacity: Self = this.set("overlayOpacity", js.undefined)
    
    @scala.inline
    def setOverlayPointerEvents(value: OverlayPointerEventTypes): Self = this.set("overlayPointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayPointerEvents: Self = this.set("overlayPointerEvents", js.undefined)
    
    @scala.inline
    def setRounded(value: Boolean): Self = this.set("rounded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRounded: Self = this.set("rounded", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setSwipeDirectionVarargs(value: SwipeDirection*): Self = this.set("swipeDirection", js.Array(value :_*))
    
    @scala.inline
    def setSwipeDirection(value: SwipeDirection | js.Array[SwipeDirection]): Self = this.set("swipeDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeDirection: Self = this.set("swipeDirection", js.undefined)
    
    @scala.inline
    def setSwipeThreshold(value: Double): Self = this.set("swipeThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeThreshold: Self = this.set("swipeThreshold", js.undefined)
    
    @scala.inline
    def setUseNativeDriver(value: Boolean): Self = this.set("useNativeDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNativeDriver: Self = this.set("useNativeDriver", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
