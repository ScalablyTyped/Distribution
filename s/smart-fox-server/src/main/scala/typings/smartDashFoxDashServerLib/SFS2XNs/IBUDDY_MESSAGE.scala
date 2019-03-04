package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBUDDY_MESSAGE extends js.Object {
  var buddy: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSBuddy
  var data: js.Object
  var isItMe: scala.Boolean
  var message: java.lang.String
}

object IBUDDY_MESSAGE {
  @scala.inline
  def apply(
    buddy: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSBuddy,
    data: js.Object,
    isItMe: scala.Boolean,
    message: java.lang.String
  ): IBUDDY_MESSAGE = {
    val __obj = js.Dynamic.literal(buddy = buddy, data = data, isItMe = isItMe, message = message)
  
    __obj.asInstanceOf[IBUDDY_MESSAGE]
  }
}

