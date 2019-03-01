package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBUDDY_ONLINE_STATE_CHANGE extends js.Object {
  var buddy: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSBuddy
  var isItMe: scala.Boolean
}

object IBUDDY_ONLINE_STATE_CHANGE {
  @scala.inline
  def apply(buddy: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSBuddy, isItMe: scala.Boolean): IBUDDY_ONLINE_STATE_CHANGE = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buddy")(buddy)
    __obj.updateDynamic("isItMe")(isItMe)
    __obj.asInstanceOf[IBUDDY_ONLINE_STATE_CHANGE]
  }
}

