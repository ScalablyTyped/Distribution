package typings.smartFoxServer.SFS2X

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICONNECTION_LOST extends js.Object {
  var reason: String
}

object ICONNECTION_LOST {
  @scala.inline
  def apply(reason: String): ICONNECTION_LOST = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICONNECTION_LOST]
  }
}

