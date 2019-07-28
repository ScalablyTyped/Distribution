package typings.smartDashFoxDashServer.SFS2XNs

import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.SFSBuddy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBUDDY_MESSAGE extends js.Object {
  var buddy: SFSBuddy
  var data: js.Object
  var isItMe: Boolean
  var message: String
}

object IBUDDY_MESSAGE {
  @scala.inline
  def apply(buddy: SFSBuddy, data: js.Object, isItMe: Boolean, message: String): IBUDDY_MESSAGE = {
    val __obj = js.Dynamic.literal(buddy = buddy, data = data, isItMe = isItMe, message = message)
  
    __obj.asInstanceOf[IBUDDY_MESSAGE]
  }
}

