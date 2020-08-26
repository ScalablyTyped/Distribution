package typings.reactToastify.typesMod

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.reactToastify.reactToastifyBooleans.`false`
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonOptions extends js.Object {
  /**
    * Set the delay in ms to close the toast automatically.
    * Use `false` to prevent the toast from closing.
    * `Default: 5000`
    */
  var autoClose: js.UndefOr[Double | `false`] = js.native
  /**
    * An optional css class to set for the toast content.
    */
  var bodyClassName: js.UndefOr[ClassName] = js.native
  /**
    * An optional inline style to apply for the toast content.
    */
  var bodyStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * An optional css class to set.
    */
  var className: js.UndefOr[ClassName] = js.native
  /**
    * Pass a custom close button.
    * To remove the close button pass `false`
    */
  var closeButton: js.UndefOr[ReactElement | (js.Function1[/* props */ js.Any, ReactElement]) | Boolean] = js.native
  /**
    * Remove the toast when clicked.
    * `Default: true`
    */
  var closeOnClick: js.UndefOr[Boolean] = js.native
  /**
    * Set id to handle multiple container
    */
  var containerId: js.UndefOr[Id] = js.native
  /**
    * Allow toast to be draggable
    * `Default: true`
    */
  var draggable: js.UndefOr[Boolean] = js.native
  /**
    * The percentage of the toast's width it takes for a drag to dismiss a toast
    * `Default: 80`
    */
  var draggablePercent: js.UndefOr[Double] = js.native
  /**
    * Hide or show the progress bar.
    * `Default: false`
    */
  var hideProgressBar: js.UndefOr[Boolean] = js.native
  /**
    * Fired when clicking inside toaster
    */
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.native
  /**
    * Pause the toast when the window loose focus.
    * `Default: true`
    */
  var pauseOnFocusLoss: js.UndefOr[Boolean] = js.native
  /**
    * Pause the timer when the mouse hover the toast.
    * `Default: true`
    */
  var pauseOnHover: js.UndefOr[Boolean] = js.native
  /**
    * Set the default position to use.
    * `One of: 'top-right', 'top-center', 'top-left', 'bottom-right', 'bottom-center', 'bottom-left'`
    * `Default: 'top-right'`
    */
  var position: js.UndefOr[ToastPosition] = js.native
  /**
    * An optional css class to set for the progress bar.
    */
  var progressClassName: js.UndefOr[ClassName] = js.native
  /**
    * An optional style to set for the progress bar.
    */
  var progressStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * Define the ARIA role for the toast
    * `Default: alert`
    *  https://www.w3.org/WAI/PF/aria/roles
    */
  var role: js.UndefOr[String] = js.native
  /**
    * Support right to left display.
    * `Default: false`
    */
  var rtl: js.UndefOr[Boolean] = js.native
  /**
    * Pass a custom transition built with react-transition-group.
    */
  var transition: js.UndefOr[ToastTransition] = js.native
}

object CommonOptions {
  @scala.inline
  def apply(): CommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonOptions]
  }
  @scala.inline
  implicit class CommonOptionsOps[Self <: CommonOptions] (val x: Self) extends AnyVal {
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
    def setAutoClose(value: Double | `false`): Self = this.set("autoClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoClose: Self = this.set("autoClose", js.undefined)
    @scala.inline
    def setBodyClassName(value: ClassName): Self = this.set("bodyClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyClassName: Self = this.set("bodyClassName", js.undefined)
    @scala.inline
    def setBodyClassNameNull: Self = this.set("bodyClassName", null)
    @scala.inline
    def setBodyStyle(value: CSSProperties): Self = this.set("bodyStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyStyle: Self = this.set("bodyStyle", js.undefined)
    @scala.inline
    def setClassName(value: ClassName): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClassNameNull: Self = this.set("className", null)
    @scala.inline
    def setCloseButtonFunction1(value: /* props */ js.Any => ReactElement): Self = this.set("closeButton", js.Any.fromFunction1(value))
    @scala.inline
    def setCloseButton(value: ReactElement | (js.Function1[/* props */ js.Any, ReactElement]) | Boolean): Self = this.set("closeButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseButton: Self = this.set("closeButton", js.undefined)
    @scala.inline
    def setCloseOnClick(value: Boolean): Self = this.set("closeOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnClick: Self = this.set("closeOnClick", js.undefined)
    @scala.inline
    def setContainerId(value: Id): Self = this.set("containerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerId: Self = this.set("containerId", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setDraggablePercent(value: Double): Self = this.set("draggablePercent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggablePercent: Self = this.set("draggablePercent", js.undefined)
    @scala.inline
    def setHideProgressBar(value: Boolean): Self = this.set("hideProgressBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideProgressBar: Self = this.set("hideProgressBar", js.undefined)
    @scala.inline
    def setOnClick(value: /* event */ MouseEvent[Element, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setPauseOnFocusLoss(value: Boolean): Self = this.set("pauseOnFocusLoss", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePauseOnFocusLoss: Self = this.set("pauseOnFocusLoss", js.undefined)
    @scala.inline
    def setPauseOnHover(value: Boolean): Self = this.set("pauseOnHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePauseOnHover: Self = this.set("pauseOnHover", js.undefined)
    @scala.inline
    def setPosition(value: ToastPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setProgressClassName(value: ClassName): Self = this.set("progressClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressClassName: Self = this.set("progressClassName", js.undefined)
    @scala.inline
    def setProgressClassNameNull: Self = this.set("progressClassName", null)
    @scala.inline
    def setProgressStyle(value: CSSProperties): Self = this.set("progressStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressStyle: Self = this.set("progressStyle", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
    @scala.inline
    def setTransition(value: ToastTransition): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
  }
  
}

