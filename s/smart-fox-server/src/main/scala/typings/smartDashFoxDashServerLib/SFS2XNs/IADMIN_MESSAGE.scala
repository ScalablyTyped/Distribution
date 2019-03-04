package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IADMIN_MESSAGE extends js.Object {
  var data: js.Object
  var message: java.lang.String
  var sender: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser
}

object IADMIN_MESSAGE {
  @scala.inline
  def apply(
    data: js.Object,
    message: java.lang.String,
    sender: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser
  ): IADMIN_MESSAGE = {
    val __obj = js.Dynamic.literal(data = data, message = message, sender = sender)
  
    __obj.asInstanceOf[IADMIN_MESSAGE]
  }
}

