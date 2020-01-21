package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import typings.smartFoxServer.SFS2X.Entities.SFSUser
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
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPUBLIC_MESSAGE]
  }
}

