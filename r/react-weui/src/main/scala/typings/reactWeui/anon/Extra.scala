package typings.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Extra extends js.Object {
  var extra: Boolean = js.native
}

object Extra {
  @scala.inline
  def apply(extra: Boolean): Extra = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extra]
  }
  @scala.inline
  implicit class ExtraOps[Self <: Extra] (val x: Self) extends AnyVal {
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
    def setExtra(value: Boolean): Self = this.set("extra", value.asInstanceOf[js.Any])
  }
  
}

