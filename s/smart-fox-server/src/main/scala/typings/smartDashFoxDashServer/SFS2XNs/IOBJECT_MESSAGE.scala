package typings.smartDashFoxDashServer.SFS2XNs

import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.SFSUser
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
    val __obj = js.Dynamic.literal(message = message, sender = sender)
  
    __obj.asInstanceOf[IOBJECT_MESSAGE]
  }
}

