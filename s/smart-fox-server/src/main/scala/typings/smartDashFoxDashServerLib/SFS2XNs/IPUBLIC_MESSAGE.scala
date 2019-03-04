package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPUBLIC_MESSAGE extends js.Object {
  var data: js.Object
  var message: java.lang.String
  var room: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSRoom
  var sender: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser
}

object IPUBLIC_MESSAGE {
  @scala.inline
  def apply(
    data: js.Object,
    message: java.lang.String,
    room: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSRoom,
    sender: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser
  ): IPUBLIC_MESSAGE = {
    val __obj = js.Dynamic.literal(data = data, message = message, room = room, sender = sender)
  
    __obj.asInstanceOf[IPUBLIC_MESSAGE]
  }
}

