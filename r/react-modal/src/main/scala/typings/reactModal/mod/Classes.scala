package typings.reactModal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Classes extends js.Object {
  var afterOpen: String = js.native
  var base: String = js.native
  var beforeClose: String = js.native
}

object Classes {
  @scala.inline
  def apply(afterOpen: String, base: String, beforeClose: String): Classes = {
    val __obj = js.Dynamic.literal(afterOpen = afterOpen.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], beforeClose = beforeClose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classes]
  }
  @scala.inline
  implicit class ClassesOps[Self <: Classes] (val x: Self) extends AnyVal {
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
    def setAfterOpen(value: String): Self = this.set("afterOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeforeClose(value: String): Self = this.set("beforeClose", value.asInstanceOf[js.Any])
  }
  
}

