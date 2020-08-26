package typings.reactNativeModalPopover.popoverMod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeModalPopover.popoverGeometryMod.Placement
import typings.reactNativeModalPopover.popoverGeometryMod.Rect
import typings.reactNativeModalPopover.popoverGeometryMod.Size
import typings.reactNativeModalPopover.reactNativeModalPopoverStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopoverProps extends js.Object {
  var arrowSize: js.UndefOr[Size] = js.native
  var arrowStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var backgroundStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var displayArea: js.UndefOr[Rect] = js.native
  var duration: js.UndefOr[Double] = js.native
  var easing: js.UndefOr[js.Function1[/* show */ Boolean, js.Function1[/* value */ Double, Double]]] = js.native
  var fromRect: Rect = js.native
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  var placement: js.UndefOr[Placement | auto] = js.native
  var popoverStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var supportedOrientations: js.UndefOr[js.Array[Orientation]] = js.native
  var useNativeDriver: js.UndefOr[Boolean] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object PopoverProps {
  @scala.inline
  def apply(fromRect: Rect): PopoverProps = {
    val __obj = js.Dynamic.literal(fromRect = fromRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverProps]
  }
  @scala.inline
  implicit class PopoverPropsOps[Self <: PopoverProps] (val x: Self) extends AnyVal {
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
    def setFromRect(value: Rect): Self = this.set("fromRect", value.asInstanceOf[js.Any])
    @scala.inline
    def setArrowSize(value: Size): Self = this.set("arrowSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowSize: Self = this.set("arrowSize", js.undefined)
    @scala.inline
    def setArrowStyle(value: StyleProp[ViewStyle]): Self = this.set("arrowStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowStyle: Self = this.set("arrowStyle", js.undefined)
    @scala.inline
    def setArrowStyleNull: Self = this.set("arrowStyle", null)
    @scala.inline
    def setBackgroundStyle(value: StyleProp[ViewStyle]): Self = this.set("backgroundStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundStyle: Self = this.set("backgroundStyle", js.undefined)
    @scala.inline
    def setBackgroundStyleNull: Self = this.set("backgroundStyle", null)
    @scala.inline
    def setContentStyle(value: StyleProp[ViewStyle]): Self = this.set("contentStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentStyle: Self = this.set("contentStyle", js.undefined)
    @scala.inline
    def setContentStyleNull: Self = this.set("contentStyle", null)
    @scala.inline
    def setDisplayArea(value: Rect): Self = this.set("displayArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayArea: Self = this.set("displayArea", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEasing(value: /* show */ Boolean => js.Function1[/* value */ Double, Double]): Self = this.set("easing", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = this.set("onDismiss", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    @scala.inline
    def setPlacement(value: Placement | auto): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setPopoverStyle(value: StyleProp[ViewStyle]): Self = this.set("popoverStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopoverStyle: Self = this.set("popoverStyle", js.undefined)
    @scala.inline
    def setPopoverStyleNull: Self = this.set("popoverStyle", null)
    @scala.inline
    def setSupportedOrientationsVarargs(value: Orientation*): Self = this.set("supportedOrientations", js.Array(value :_*))
    @scala.inline
    def setSupportedOrientations(value: js.Array[Orientation]): Self = this.set("supportedOrientations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedOrientations: Self = this.set("supportedOrientations", js.undefined)
    @scala.inline
    def setUseNativeDriver(value: Boolean): Self = this.set("useNativeDriver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseNativeDriver: Self = this.set("useNativeDriver", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

