package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMODERATOR_MESSAGE extends js.Object {
  var data: js.Object
  var message: java.lang.String
  var sender: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser
}

object IMODERATOR_MESSAGE {
  @scala.inline
  def apply(
    data: js.Object,
    message: java.lang.String,
    sender: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser
  ): IMODERATOR_MESSAGE = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[IMODERATOR_MESSAGE]
  }
}

