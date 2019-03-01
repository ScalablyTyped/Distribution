package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPLAYER_TO_SPECTATOR_ERROR extends js.Object {
  var errorCode: scala.Double
  var errorMessage: java.lang.String
}

object IPLAYER_TO_SPECTATOR_ERROR {
  @scala.inline
  def apply(errorCode: scala.Double, errorMessage: java.lang.String): IPLAYER_TO_SPECTATOR_ERROR = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errorCode")(errorCode)
    __obj.updateDynamic("errorMessage")(errorMessage)
    __obj.asInstanceOf[IPLAYER_TO_SPECTATOR_ERROR]
  }
}

