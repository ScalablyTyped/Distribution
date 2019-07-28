package typings.smartDashFoxDashServer.SFS2XNs

import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.SFSBuddy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBUDDY_VARIABLES_UPDATE extends js.Object {
  var buddy: SFSBuddy
  var changedVars: js.Array[String]
  var isItMe: Boolean
}

object IBUDDY_VARIABLES_UPDATE {
  @scala.inline
  def apply(buddy: SFSBuddy, changedVars: js.Array[String], isItMe: Boolean): IBUDDY_VARIABLES_UPDATE = {
    val __obj = js.Dynamic.literal(buddy = buddy, changedVars = changedVars, isItMe = isItMe)
  
    __obj.asInstanceOf[IBUDDY_VARIABLES_UPDATE]
  }
}

