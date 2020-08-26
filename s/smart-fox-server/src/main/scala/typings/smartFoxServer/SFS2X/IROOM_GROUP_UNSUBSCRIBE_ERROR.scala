package typings.smartFoxServer.SFS2X

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IROOM_GROUP_UNSUBSCRIBE_ERROR extends js.Object {
  var errorCode: Double = js.native
  var errorMessage: String = js.native
}

object IROOM_GROUP_UNSUBSCRIBE_ERROR {
  @scala.inline
  def apply(errorCode: Double, errorMessage: String): IROOM_GROUP_UNSUBSCRIBE_ERROR = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[IROOM_GROUP_UNSUBSCRIBE_ERROR]
  }
  @scala.inline
  implicit class IROOM_GROUP_UNSUBSCRIBE_ERROROps[Self <: IROOM_GROUP_UNSUBSCRIBE_ERROR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrorCode(value: Double): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
  }
  
}

