package typings.smartDashFoxDashServer.SFS2X

import typings.smartDashFoxDashServer.SFS2X.Entities.SFSBuddy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBUDDY_REMOVE extends js.Object {
  var buddy: SFSBuddy
}

object IBUDDY_REMOVE {
  @scala.inline
  def apply(buddy: SFSBuddy): IBUDDY_REMOVE = {
    val __obj = js.Dynamic.literal(buddy = buddy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBUDDY_REMOVE]
  }
}

