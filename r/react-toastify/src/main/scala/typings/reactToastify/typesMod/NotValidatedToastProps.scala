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

/* Inlined parent std.Partial<react-toastify.react-toastify/dist/types.ToastProps> */
@js.native
trait NotValidatedToastProps extends js.Object {
  var autoClose: js.UndefOr[Double | `false`] = js.native
  var bodyClassName: js.UndefOr[ClassName] = js.native
  var bodyStyle: js.UndefOr[CSSProperties] = js.native
  var children: js.UndefOr[ToastContent] = js.native
  var className: js.UndefOr[ClassName] = js.native
  var closeButton: js.UndefOr[ReactElement | (js.Function1[/* props */ js.Any, ReactElement]) | Boolean] = js.native
  var closeOnClick: js.UndefOr[Boolean] = js.native
  var closeToast: js.UndefOr[js.Function0[Unit]] = js.native
  var containerId: js.UndefOr[Id] = js.native
  var delay: js.UndefOr[Double] = js.native
  var deleteToast: js.UndefOr[js.Function0[Unit]] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var draggablePercent: js.UndefOr[Double] = js.native
  var hideProgressBar: js.UndefOr[Boolean] = js.native
  var in: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[Id] = js.native
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.native
  var onClose: js.UndefOr[js.Function1[/* props */ js.Object, Unit]] = js.native
  var onOpen: js.UndefOr[js.Function1[/* props */ js.Object, Unit]] = js.native
  var pauseOnFocusLoss: js.UndefOr[Boolean] = js.native
  var pauseOnHover: js.UndefOr[Boolean] = js.native
  var position: js.UndefOr[ToastPosition] = js.native
  var progress: js.UndefOr[Double | String] = js.native
  var progressClassName: js.UndefOr[ClassName] = js.native
  var progressStyle: js.UndefOr[CSSProperties] = js.native
  var role: js.UndefOr[String] = js.native
  var rtl: js.UndefOr[Boolean] = js.native
  var staleId: js.UndefOr[Id] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var toastId: Id = js.native
  var transition: js.UndefOr[ToastTransition] = js.native
  var `type`: js.UndefOr[TypeOptions] = js.native
  var updateId: js.UndefOr[Id] = js.native
}

object NotValidatedToastProps {
  @scala.inline
  def apply(toastId: Id): NotValidatedToastProps = {
    val __obj = js.Dynamic.literal(toastId = toastId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotValidatedToastProps]
  }
  @scala.inline
  implicit class NotValidatedToastPropsOps[Self <: NotValidatedToastProps] (val x: Self) extends AnyVal {
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
    def setToastId(value: Id): Self = this.set("toastId", value.asInstanceOf[js.Any])
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
    def setChildrenFunction1(value: /* props */ ToastContentProps => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setChildren(value: ToastContent): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
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
    def setCloseToast(value: () => Unit): Self = this.set("closeToast", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCloseToast: Self = this.set("closeToast", js.undefined)
    @scala.inline
    def setContainerId(value: Id): Self = this.set("containerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerId: Self = this.set("containerId", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDeleteToast(value: () => Unit): Self = this.set("deleteToast", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDeleteToast: Self = this.set("deleteToast", js.undefined)
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
    def setIn(value: Boolean): Self = this.set("in", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIn: Self = this.set("in", js.undefined)
    @scala.inline
    def setKey(value: Id): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setOnClick(value: /* event */ MouseEvent[Element, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnClose(value: /* props */ js.Object => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnOpen(value: /* props */ js.Object => Unit): Self = this.set("onOpen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
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
    def setProgress(value: Double | String): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
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
    def setStaleId(value: Id): Self = this.set("staleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaleId: Self = this.set("staleId", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTransition(value: ToastTransition): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    @scala.inline
    def setType(value: TypeOptions): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUpdateId(value: Id): Self = this.set("updateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateId: Self = this.set("updateId", js.undefined)
  }
  
}

