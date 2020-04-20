package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOBJECT_MESSAGE extends js.Object {
  var message: String
  var sender: SFSUser
}

object IOBJECT_MESSAGE {
  @scala.inline
  def apply(message: String, sender: SFSUser): IOBJECT_MESSAGE = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOBJECT_MESSAGE]
  }
}

