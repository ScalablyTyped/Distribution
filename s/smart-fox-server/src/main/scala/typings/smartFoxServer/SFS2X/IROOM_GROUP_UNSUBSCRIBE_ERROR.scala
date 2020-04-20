package typings.smartFoxServer.SFS2X

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IROOM_GROUP_UNSUBSCRIBE_ERROR extends js.Object {
  var errorCode: Double
  var errorMessage: String
}

object IROOM_GROUP_UNSUBSCRIBE_ERROR {
  @scala.inline
  def apply(errorCode: Double, errorMessage: String): IROOM_GROUP_UNSUBSCRIBE_ERROR = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[IROOM_GROUP_UNSUBSCRIBE_ERROR]
  }
}

