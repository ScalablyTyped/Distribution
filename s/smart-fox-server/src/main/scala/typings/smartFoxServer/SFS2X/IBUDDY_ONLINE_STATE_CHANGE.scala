package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSBuddy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBUDDY_ONLINE_STATE_CHANGE extends js.Object {
  var buddy: SFSBuddy = js.native
  var isItMe: Boolean = js.native
}

object IBUDDY_ONLINE_STATE_CHANGE {
  @scala.inline
  def apply(buddy: SFSBuddy, isItMe: Boolean): IBUDDY_ONLINE_STATE_CHANGE = {
    val __obj = js.Dynamic.literal(buddy = buddy.asInstanceOf[js.Any], isItMe = isItMe.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBUDDY_ONLINE_STATE_CHANGE]
  }
  @scala.inline
  implicit class IBUDDY_ONLINE_STATE_CHANGEOps[Self <: IBUDDY_ONLINE_STATE_CHANGE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBuddy(value: SFSBuddy): Self = this.set("buddy", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsItMe(value: Boolean): Self = this.set("isItMe", value.asInstanceOf[js.Any])
  }
  
}

