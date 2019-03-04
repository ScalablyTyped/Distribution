package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOBJECT_MESSAGE extends js.Object {
  var message: java.lang.String
  var sender: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser
}

object IOBJECT_MESSAGE {
  @scala.inline
  def apply(message: java.lang.String, sender: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser): IOBJECT_MESSAGE = {
    val __obj = js.Dynamic.literal(message = message, sender = sender)
  
    __obj.asInstanceOf[IOBJECT_MESSAGE]
  }
}

