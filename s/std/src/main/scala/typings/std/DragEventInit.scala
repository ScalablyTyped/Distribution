package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragEventInit extends MouseEventInit {
  var dataTransfer: js.UndefOr[DataTransfer | Null] = js.native
}

object DragEventInit {
  @scala.inline
  def apply(): DragEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragEventInit]
  }
  @scala.inline
  implicit class DragEventInitOps[Self <: DragEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataTransfer(value: DataTransfer): Self = this.set("dataTransfer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataTransfer: Self = this.set("dataTransfer", js.undefined)
    @scala.inline
    def setDataTransferNull: Self = this.set("dataTransfer", null)
  }
  
}

