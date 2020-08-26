package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPRIVATE_MESSAGE extends js.Object {
  var data: js.Object = js.native
  var message: String = js.native
  var sender: SFSUser = js.native
}

object IPRIVATE_MESSAGE {
  @scala.inline
  def apply(data: js.Object, message: String, sender: SFSUser): IPRIVATE_MESSAGE = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPRIVATE_MESSAGE]
  }
  @scala.inline
  implicit class IPRIVATE_MESSAGEOps[Self <: IPRIVATE_MESSAGE] (val x: Self) extends AnyVal {
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
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setSender(value: SFSUser): Self = this.set("sender", value.asInstanceOf[js.Any])
  }
  
}

