package typings.smartDashFoxDashServer.SFS2X

import typings.smartDashFoxDashServer.SFS2X.Entities.SFSBuddy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBUDDY_ONLINE_STATE_CHANGE extends js.Object {
  var buddy: SFSBuddy
  var isItMe: Boolean
}

object IBUDDY_ONLINE_STATE_CHANGE {
  @scala.inline
  def apply(buddy: SFSBuddy, isItMe: Boolean): IBUDDY_ONLINE_STATE_CHANGE = {
    val __obj = js.Dynamic.literal(buddy = buddy, isItMe = isItMe)
  
    __obj.asInstanceOf[IBUDDY_ONLINE_STATE_CHANGE]
  }
}

