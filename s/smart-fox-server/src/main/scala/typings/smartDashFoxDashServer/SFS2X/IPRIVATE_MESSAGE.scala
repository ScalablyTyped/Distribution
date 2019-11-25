package typings.smartDashFoxDashServer.SFS2X

import typings.smartDashFoxDashServer.SFS2X.Entities.SFSUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPRIVATE_MESSAGE extends js.Object {
  var data: js.Object
  var message: String
  var sender: SFSUser
}

object IPRIVATE_MESSAGE {
  @scala.inline
  def apply(data: js.Object, message: String, sender: SFSUser): IPRIVATE_MESSAGE = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPRIVATE_MESSAGE]
  }
}

