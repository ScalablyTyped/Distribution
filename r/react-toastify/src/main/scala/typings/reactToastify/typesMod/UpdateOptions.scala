package typings.reactToastify.typesMod

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactToastify.reactToastifyBooleans.`false`
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent react-toastify.react-toastify/dist/types.Nullable<react-toastify.react-toastify/dist/types.ToastOptions> */
@js.native
trait UpdateOptions extends js.Object {
  var autoClose: js.UndefOr[Double | `false` | Null] = js.native
  var bodyClassName: js.UndefOr[ClassName | Null] = js.native
  var bodyStyle: js.UndefOr[CSSProperties | Null] = js.native
  var className: js.UndefOr[ClassName | Null] = js.native
  var closeButton: js.UndefOr[ReactElement | (js.Function1[/* props */ js.Any, ReactElement]) | Boolean | Null] = js.native
  var closeOnClick: js.UndefOr[Boolean | Null] = js.native
  var containerId: js.UndefOr[Id | Null] = js.native
  var delay: js.UndefOr[Double | Null] = js.native
  var draggable: js.UndefOr[Boolean | Null] = js.native
  var draggablePercent: js.UndefOr[Double | Null] = js.native
  var hideProgressBar: js.UndefOr[Boolean | Null] = js.native
  var onClick: js.UndefOr[(js.Function1[/* event */ MouseEvent[Element, NativeMouseEvent], Unit]) | Null] = js.native
  var onClose: js.UndefOr[(js.Function1[/* props */ js.Object, Unit]) | Null] = js.native
  var onOpen: js.UndefOr[(js.Function1[/* props */ js.Object, Unit]) | Null] = js.native
  var pauseOnFocusLoss: js.UndefOr[Boolean | Null] = js.native
  var pauseOnHover: js.UndefOr[Boolean | Null] = js.native
  var position: js.UndefOr[ToastPosition | Null] = js.native
  var progress: js.UndefOr[Double | String | Null] = js.native
  var progressClassName: js.UndefOr[ClassName | Null] = js.native
  var progressStyle: js.UndefOr[CSSProperties | Null] = js.native
  /**
    * Used to update a toast.
    * Pass any valid ReactNode(string, number, component)
    */
  var render: js.UndefOr[ToastContent] = js.native
  var role: js.UndefOr[String | Null] = js.native
  var rtl: js.UndefOr[Boolean | Null] = js.native
  var style: js.UndefOr[CSSProperties | Null] = js.native
  var toastId: js.UndefOr[Id | Null] = js.native
  var transition: js.UndefOr[ToastTransition | Null] = js.native
  var `type`: js.UndefOr[TypeOptions | Null] = js.native
  var updateId: js.UndefOr[Id | Null] = js.native
}

object UpdateOptions {
  @scala.inline
  def apply(): UpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOptions]
  }
  @scala.inline
  implicit class UpdateOptionsOps[Self <: UpdateOptions] (val x: Self) extends AnyVal {
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
    def setAutoCloseNull: Self = this.set("autoClose", null)
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
    def setBodyStyleNull: Self = this.set("bodyStyle", null)
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
    def setCloseButtonNull: Self = this.set("closeButton", null)
    @scala.inline
    def setCloseOnClick(value: Boolean): Self = this.set("closeOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnClick: Self = this.set("closeOnClick", js.undefined)
    @scala.inline
    def setCloseOnClickNull: Self = this.set("closeOnClick", null)
    @scala.inline
    def setContainerId(value: Id): Self = this.set("containerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerId: Self = this.set("containerId", js.undefined)
    @scala.inline
    def setContainerIdNull: Self = this.set("containerId", null)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDelayNull: Self = this.set("delay", null)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setDraggableNull: Self = this.set("draggable", null)
    @scala.inline
    def setDraggablePercent(value: Double): Self = this.set("draggablePercent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggablePercent: Self = this.set("draggablePercent", js.undefined)
    @scala.inline
    def setDraggablePercentNull: Self = this.set("draggablePercent", null)
    @scala.inline
    def setHideProgressBar(value: Boolean): Self = this.set("hideProgressBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideProgressBar: Self = this.set("hideProgressBar", js.undefined)
    @scala.inline
    def setHideProgressBarNull: Self = this.set("hideProgressBar", null)
    @scala.inline
    def setOnClick(value: /* event */ MouseEvent[Element, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnClickNull: Self = this.set("onClick", null)
    @scala.inline
    def setOnClose(value: /* props */ js.Object => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnCloseNull: Self = this.set("onClose", null)
    @scala.inline
    def setOnOpen(value: /* props */ js.Object => Unit): Self = this.set("onOpen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    @scala.inline
    def setOnOpenNull: Self = this.set("onOpen", null)
    @scala.inline
    def setPauseOnFocusLoss(value: Boolean): Self = this.set("pauseOnFocusLoss", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePauseOnFocusLoss: Self = this.set("pauseOnFocusLoss", js.undefined)
    @scala.inline
    def setPauseOnFocusLossNull: Self = this.set("pauseOnFocusLoss", null)
    @scala.inline
    def setPauseOnHover(value: Boolean): Self = this.set("pauseOnHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePauseOnHover: Self = this.set("pauseOnHover", js.undefined)
    @scala.inline
    def setPauseOnHoverNull: Self = this.set("pauseOnHover", null)
    @scala.inline
    def setPosition(value: ToastPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setPositionNull: Self = this.set("position", null)
    @scala.inline
    def setProgress(value: Double | String): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    @scala.inline
    def setProgressNull: Self = this.set("progress", null)
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
    def setProgressStyleNull: Self = this.set("progressStyle", null)
    @scala.inline
    def setRenderFunction1(value: /* props */ ToastContentProps => ReactNode): Self = this.set("render", js.Any.fromFunction1(value))
    @scala.inline
    def setRender(value: ToastContent): Self = this.set("render", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setRoleNull: Self = this.set("role", null)
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
    @scala.inline
    def setRtlNull: Self = this.set("rtl", null)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    @scala.inline
    def setToastId(value: Id): Self = this.set("toastId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToastId: Self = this.set("toastId", js.undefined)
    @scala.inline
    def setToastIdNull: Self = this.set("toastId", null)
    @scala.inline
    def setTransition(value: ToastTransition): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    @scala.inline
    def setTransitionNull: Self = this.set("transition", null)
    @scala.inline
    def setType(value: TypeOptions): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
    @scala.inline
    def setUpdateId(value: Id): Self = this.set("updateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateId: Self = this.set("updateId", js.undefined)
    @scala.inline
    def setUpdateIdNull: Self = this.set("updateId", null)
  }
  
}

