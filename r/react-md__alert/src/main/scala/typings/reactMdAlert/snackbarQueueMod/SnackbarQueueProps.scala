package typings.reactMdAlert.snackbarQueueMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.reactMdAlert.messageQueueContextMod.ToastMessage
import typings.reactMdAlert.snackbarMod.SnackbarProps
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnackbarQueueProps[M /* <: ToastMessage */] extends SnackbarProps {
  
  var onActionClick: js.UndefOr[ActionEventHandler[M]] = js.native
  
  var queue: js.Array[M] = js.native
}
object SnackbarQueueProps {
  
  @scala.inline
  def apply[M /* <: ToastMessage */](id: String, queue: js.Array[M]): SnackbarQueueProps[M] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnackbarQueueProps[M]]
  }
  
  @scala.inline
  implicit class SnackbarQueuePropsOps[Self <: SnackbarQueueProps[_], M /* <: ToastMessage */] (val x: Self with SnackbarQueueProps[M]) extends AnyVal {
    
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
    def setQueueVarargs(value: M*): Self = this.set("queue", js.Array(value :_*))
    
    @scala.inline
    def setQueue(value: js.Array[M]): Self = this.set("queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnActionClick(value: (M, /* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent]) => Unit): Self = this.set("onActionClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnActionClick: Self = this.set("onActionClick", js.undefined)
  }
}
