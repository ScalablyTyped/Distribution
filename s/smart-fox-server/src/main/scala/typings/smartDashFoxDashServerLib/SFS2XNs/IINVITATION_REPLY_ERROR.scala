package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IINVITATION_REPLY_ERROR extends js.Object {
  var errorCode: scala.Double
  var errorMessage: java.lang.String
}

object IINVITATION_REPLY_ERROR {
  @scala.inline
  def apply(errorCode: scala.Double, errorMessage: java.lang.String): IINVITATION_REPLY_ERROR = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errorCode")(errorCode)
    __obj.updateDynamic("errorMessage")(errorMessage)
    __obj.asInstanceOf[IINVITATION_REPLY_ERROR]
  }
}

