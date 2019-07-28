package typings.smartDashFoxDashServer.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IINVITATION_REPLY_ERROR extends js.Object {
  var errorCode: Double
  var errorMessage: String
}

object IINVITATION_REPLY_ERROR {
  @scala.inline
  def apply(errorCode: Double, errorMessage: String): IINVITATION_REPLY_ERROR = {
    val __obj = js.Dynamic.literal(errorCode = errorCode, errorMessage = errorMessage)
  
    __obj.asInstanceOf[IINVITATION_REPLY_ERROR]
  }
}

