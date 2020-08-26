package typings.reapop.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnterTimeout extends js.Object {
  var enterTimeout: js.UndefOr[Double] = js.native
  var leaveTimeout: js.UndefOr[Double] = js.native
  var name: js.UndefOr[js.Any] = js.native
}

object EnterTimeout {
  @scala.inline
  def apply(): EnterTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterTimeout]
  }
  @scala.inline
  implicit class EnterTimeoutOps[Self <: EnterTimeout] (val x: Self) extends AnyVal {
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
    def setEnterTimeout(value: Double): Self = this.set("enterTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterTimeout: Self = this.set("enterTimeout", js.undefined)
    @scala.inline
    def setLeaveTimeout(value: Double): Self = this.set("leaveTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeaveTimeout: Self = this.set("leaveTimeout", js.undefined)
    @scala.inline
    def setName(value: js.Any): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

