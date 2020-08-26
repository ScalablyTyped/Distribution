package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostMessageOptions extends js.Object {
  var transfer: js.UndefOr[js.Array[_]] = js.native
}

object PostMessageOptions {
  @scala.inline
  def apply(): PostMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostMessageOptions]
  }
  @scala.inline
  implicit class PostMessageOptionsOps[Self <: PostMessageOptions] (val x: Self) extends AnyVal {
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
    def setTransferVarargs(value: js.Any*): Self = this.set("transfer", js.Array(value :_*))
    @scala.inline
    def setTransfer(value: js.Array[_]): Self = this.set("transfer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransfer: Self = this.set("transfer", js.undefined)
  }
  
}

