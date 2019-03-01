package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICONNECTION_LOST extends js.Object {
  var reason: java.lang.String
}

object ICONNECTION_LOST {
  @scala.inline
  def apply(reason: java.lang.String): ICONNECTION_LOST = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[ICONNECTION_LOST]
  }
}

