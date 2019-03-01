package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISPECTATOR_TO_PLAYER_ERROR extends js.Object {
  var errorCode: scala.Double
  var errorMessage: java.lang.String
}

object ISPECTATOR_TO_PLAYER_ERROR {
  @scala.inline
  def apply(errorCode: scala.Double, errorMessage: java.lang.String): ISPECTATOR_TO_PLAYER_ERROR = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errorCode")(errorCode)
    __obj.updateDynamic("errorMessage")(errorMessage)
    __obj.asInstanceOf[ISPECTATOR_TO_PLAYER_ERROR]
  }
}

