package typings.reactDropzone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropzoneRef extends js.Object {
  def open(): Unit = js.native
}

object DropzoneRef {
  @scala.inline
  def apply(open: () => Unit): DropzoneRef = {
    val __obj = js.Dynamic.literal(open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[DropzoneRef]
  }
  @scala.inline
  implicit class DropzoneRefOps[Self <: DropzoneRef] (val x: Self) extends AnyVal {
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
    def setOpen(value: () => Unit): Self = this.set("open", js.Any.fromFunction0(value))
  }
  
}

