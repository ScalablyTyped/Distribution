package typings.smartFoxServer.SFS2X

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICONNECTION extends js.Object {
  var success: Boolean = js.native
}

object ICONNECTION {
  @scala.inline
  def apply(success: Boolean): ICONNECTION = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICONNECTION]
  }
  @scala.inline
  implicit class ICONNECTIONOps[Self <: ICONNECTION] (val x: Self) extends AnyVal {
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
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
  }
  
}

