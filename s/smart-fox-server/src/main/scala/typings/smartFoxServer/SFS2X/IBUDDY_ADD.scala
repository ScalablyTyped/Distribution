package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSBuddy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBUDDY_ADD extends js.Object {
  var buddy: SFSBuddy
}

object IBUDDY_ADD {
  @scala.inline
  def apply(buddy: SFSBuddy): IBUDDY_ADD = {
    val __obj = js.Dynamic.literal(buddy = buddy.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBUDDY_ADD]
  }
}

