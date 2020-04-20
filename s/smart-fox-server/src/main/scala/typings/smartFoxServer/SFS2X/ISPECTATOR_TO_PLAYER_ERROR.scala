package typings.smartFoxServer.SFS2X

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISPECTATOR_TO_PLAYER_ERROR extends js.Object {
  var errorCode: Double
  var errorMessage: String
}

object ISPECTATOR_TO_PLAYER_ERROR {
  @scala.inline
  def apply(errorCode: Double, errorMessage: String): ISPECTATOR_TO_PLAYER_ERROR = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISPECTATOR_TO_PLAYER_ERROR]
  }
}

