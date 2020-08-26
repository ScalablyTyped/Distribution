package typings.reactFileUtils.anon

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Multiple extends js.Object {
  var handleFiles: js.UndefOr[js.Function1[/* files */ js.Array[File], Unit]] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
}

object Multiple {
  @scala.inline
  def apply(): Multiple = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Multiple]
  }
  @scala.inline
  implicit class MultipleOps[Self <: Multiple] (val x: Self) extends AnyVal {
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
    def setHandleFiles(value: /* files */ js.Array[File] => Unit): Self = this.set("handleFiles", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHandleFiles: Self = this.set("handleFiles", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
  }
  
}

