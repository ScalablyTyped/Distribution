package typings.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Access extends js.Object {
  var access: Boolean = js.native
}

object Access {
  @scala.inline
  def apply(access: Boolean): Access = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any])
    __obj.asInstanceOf[Access]
  }
  @scala.inline
  implicit class AccessOps[Self <: Access] (val x: Self) extends AnyVal {
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
    def setAccess(value: Boolean): Self = this.set("access", value.asInstanceOf[js.Any])
  }
  
}

