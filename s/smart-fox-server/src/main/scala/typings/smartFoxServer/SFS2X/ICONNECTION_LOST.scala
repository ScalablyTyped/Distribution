package typings.smartFoxServer.SFS2X

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICONNECTION_LOST extends js.Object {
  var reason: String = js.native
}

object ICONNECTION_LOST {
  @scala.inline
  def apply(reason: String): ICONNECTION_LOST = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICONNECTION_LOST]
  }
  @scala.inline
  implicit class ICONNECTION_LOSTOps[Self <: ICONNECTION_LOST] (val x: Self) extends AnyVal {
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
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
  
}

