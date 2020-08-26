package typings.reactNativePopupDialog.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogProps extends js.Object {
  var animationDuration: js.UndefOr[Double] = js.native
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var dialogAnimation: js.UndefOr[FadeAnimation | ScaleAnimation | SlideAnimation] = js.native
  var dialogStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var dialogTitle: js.UndefOr[js.Any] = js.native
  var footer: js.UndefOr[js.Any] = js.native
  var hasOverlay: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  var onHardwareBackPress: js.UndefOr[js.Function0[Boolean]] = js.native
  var onShow: js.UndefOr[js.Function0[Unit]] = js.native
  var onTouchOutside: js.UndefOr[js.Function0[Unit]] = js.native
  var overlayBackgroundColor: js.UndefOr[String] = js.native
  var overlayOpacity: js.UndefOr[Double] = js.native
  var overlayPointerEvents: js.UndefOr[OverlayPointerEventTypes] = js.native
  var rounded: js.UndefOr[Boolean] = js.native
  var useNativeDriver: js.UndefOr[Boolean] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double] = js.native
}

object DialogProps {
  @scala.inline
  def apply(): DialogProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogProps]
  }
  @scala.inline
  implicit class DialogPropsOps[Self <: DialogProps] (val x: Self) extends AnyVal {
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
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    @scala.inline
    def setContainerStyleNull: Self = this.set("containerStyle", null)
    @scala.inline
    def setDialogAnimation(value: FadeAnimation | ScaleAnimation | SlideAnimation): Self = this.set("dialogAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialogAnimation: Self = this.set("dialogAnimation", js.undefined)
    @scala.inline
    def setDialogStyle(value: StyleProp[ViewStyle]): Self = this.set("dialogStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialogStyle: Self = this.set("dialogStyle", js.undefined)
    @scala.inline
    def setDialogStyleNull: Self = this.set("dialogStyle", null)
    @scala.inline
    def setDialogTitle(value: js.Any): Self = this.set("dialogTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialogTitle: Self = this.set("dialogTitle", js.undefined)
    @scala.inline
    def setFooter(value: js.Any): Self = this.set("footer", value.asInstanceOf[js.Any])
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
    def setOnDismiss(value: () => Unit): Self = this.set("onDismiss", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    @scala.inline
    def setOnHardwareBackPress(value: () => Boolean): Self = this.set("onHardwareBackPress", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnHardwareBackPress: Self = this.set("onHardwareBackPress", js.undefined)
    @scala.inline
    def setOnShow(value: () => Unit): Self = this.set("onShow", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
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
    def setUseNativeDriver(value: Boolean): Self = this.set("useNativeDriver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseNativeDriver: Self = this.set("useNativeDriver", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

