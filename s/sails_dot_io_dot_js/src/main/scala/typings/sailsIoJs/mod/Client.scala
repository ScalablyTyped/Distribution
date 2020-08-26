package typings.sailsIoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  var sails: ClientSails = js.native
  var socket: Socket = js.native
}

object Client {
  @scala.inline
  def apply(sails: ClientSails, socket: Socket): Client = {
    val __obj = js.Dynamic.literal(sails = sails.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
  @scala.inline
  implicit class ClientOps[Self <: Client] (val x: Self) extends AnyVal {
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
    def setSails(value: ClientSails): Self = this.set("sails", value.asInstanceOf[js.Any])
    @scala.inline
    def setSocket(value: Socket): Self = this.set("socket", value.asInstanceOf[js.Any])
  }
  
}

