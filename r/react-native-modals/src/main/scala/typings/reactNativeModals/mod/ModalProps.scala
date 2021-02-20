package typings.reactNativeModals.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalProps extends StObject {
  
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
  implicit class ModalPropsMutableBuilder[Self <: ModalProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    @scala.inline
    def setFooter(value: ReactNode): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setHasOverlay(value: Boolean): Self = StObject.set(x, "hasOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasOverlayUndefined: Self = StObject.set(x, "hasOverlay", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setModalAnimation(value: FadeAnimation | ScaleAnimation | SlideAnimation): Self = StObject.set(x, "modalAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalAnimationUndefined: Self = StObject.set(x, "modalAnimation", js.undefined)
    
    @scala.inline
    def setModalStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "modalStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalStyleNull: Self = StObject.set(x, "modalStyle", null)
    
    @scala.inline
    def setModalStyleUndefined: Self = StObject.set(x, "modalStyle", js.undefined)
    
    @scala.inline
    def setModalTitle(value: ReactNode): Self = StObject.set(x, "modalTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalTitleUndefined: Self = StObject.set(x, "modalTitle", js.undefined)
    
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
    
    @scala.inline
    def setOnHardwareBackPress(value: () => Boolean): Self = StObject.set(x, "onHardwareBackPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnHardwareBackPressUndefined: Self = StObject.set(x, "onHardwareBackPress", js.undefined)
    
    @scala.inline
    def setOnMove(value: /* event */ DragEvent => Unit): Self = StObject.set(x, "onMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMoveUndefined: Self = StObject.set(x, "onMove", js.undefined)
    
    @scala.inline
    def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    @scala.inline
    def setOnSwipeOut(value: /* event */ DragEvent => Unit): Self = StObject.set(x, "onSwipeOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSwipeOutUndefined: Self = StObject.set(x, "onSwipeOut", js.undefined)
    
    @scala.inline
    def setOnSwipeRelease(value: /* event */ DragEvent => Unit): Self = StObject.set(x, "onSwipeRelease", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSwipeReleaseUndefined: Self = StObject.set(x, "onSwipeRelease", js.undefined)
    
    @scala.inline
    def setOnSwiping(value: /* event */ DragEvent => Unit): Self = StObject.set(x, "onSwiping", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSwipingOut(value: /* event */ DragEvent => Unit): Self = StObject.set(x, "onSwipingOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSwipingOutUndefined: Self = StObject.set(x, "onSwipingOut", js.undefined)
    
    @scala.inline
    def setOnSwipingUndefined: Self = StObject.set(x, "onSwiping", js.undefined)
    
    @scala.inline
    def setOnTouchOutside(value: () => Unit): Self = StObject.set(x, "onTouchOutside", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnTouchOutsideUndefined: Self = StObject.set(x, "onTouchOutside", js.undefined)
    
    @scala.inline
    def setOverlayBackgroundColor(value: String): Self = StObject.set(x, "overlayBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayBackgroundColorUndefined: Self = StObject.set(x, "overlayBackgroundColor", js.undefined)
    
    @scala.inline
    def setOverlayOpacity(value: Double): Self = StObject.set(x, "overlayOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayOpacityUndefined: Self = StObject.set(x, "overlayOpacity", js.undefined)
    
    @scala.inline
    def setOverlayPointerEvents(value: OverlayPointerEventTypes): Self = StObject.set(x, "overlayPointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayPointerEventsUndefined: Self = StObject.set(x, "overlayPointerEvents", js.undefined)
    
    @scala.inline
    def setRounded(value: Boolean): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSwipeDirection(value: SwipeDirection | js.Array[SwipeDirection]): Self = StObject.set(x, "swipeDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeDirectionUndefined: Self = StObject.set(x, "swipeDirection", js.undefined)
    
    @scala.inline
    def setSwipeDirectionVarargs(value: SwipeDirection*): Self = StObject.set(x, "swipeDirection", js.Array(value :_*))
    
    @scala.inline
    def setSwipeThreshold(value: Double): Self = StObject.set(x, "swipeThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeThresholdUndefined: Self = StObject.set(x, "swipeThreshold", js.undefined)
    
    @scala.inline
    def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
