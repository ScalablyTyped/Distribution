package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBUDDY_VARIABLES_UPDATE extends js.Object {
  var buddy: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSBuddy
  var changedVars: js.Array[java.lang.String]
  var isItMe: scala.Boolean
}

object IBUDDY_VARIABLES_UPDATE {
  @scala.inline
  def apply(
    buddy: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSBuddy,
    changedVars: js.Array[java.lang.String],
    isItMe: scala.Boolean
  ): IBUDDY_VARIABLES_UPDATE = {
    val __obj = js.Dynamic.literal(buddy = buddy, changedVars = changedVars, isItMe = isItMe)
  
    __obj.asInstanceOf[IBUDDY_VARIABLES_UPDATE]
  }
}

