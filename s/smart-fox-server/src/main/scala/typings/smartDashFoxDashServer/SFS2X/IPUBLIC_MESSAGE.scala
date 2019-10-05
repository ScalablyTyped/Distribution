package typings.smartDashFoxDashServer.SFS2X

import typings.smartDashFoxDashServer.SFS2X.Entities.SFSRoom
import typings.smartDashFoxDashServer.SFS2X.Entities.SFSUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPUBLIC_MESSAGE extends js.Object {
  var data: js.Object
  var message: String
  var room: SFSRoom
  var sender: SFSUser
}

object IPUBLIC_MESSAGE {
  @scala.inline
  def apply(data: js.Object, message: String, room: SFSRoom, sender: SFSUser): IPUBLIC_MESSAGE = {
    val __obj = js.Dynamic.literal(data = data, message = message, room = room, sender = sender)
  
    __obj.asInstanceOf[IPUBLIC_MESSAGE]
  }
}

