package typings.qiniuJs.mod

import typings.qiniuJs.anon.Loaded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Next extends js.Object {
  var total: Loaded = js.native
}

object Next {
  @scala.inline
  def apply(total: Loaded): Next = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Next]
  }
  @scala.inline
  implicit class NextOps[Self <: Next] (val x: Self) extends AnyVal {
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
    def setTotal(value: Loaded): Self = this.set("total", value.asInstanceOf[js.Any])
  }
  
}

