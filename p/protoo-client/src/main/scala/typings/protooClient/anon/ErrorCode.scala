package typings.protooClient.anon

import typings.protooClient.mod.ProtooResponse
import typings.protooClient.protooClientBooleans.`false`
import typings.protooClient.protooClientBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorCode extends ProtooResponse {
  var errorCode: Double = js.native
  var errorReason: String = js.native
  var id: Double = js.native
  var ok: `false` = js.native
  var response: `true` = js.native
}

object ErrorCode {
  @scala.inline
  def apply(errorCode: Double, errorReason: String, id: Double, ok: `false`, response: `true`): ErrorCode = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorReason = errorReason.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCode]
  }
  @scala.inline
  implicit class ErrorCodeOps[Self <: ErrorCode] (val x: Self) extends AnyVal {
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
    def setErrorReason(value: String): Self = this.set("errorReason", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOk(value: `false`): Self = this.set("ok", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: `true`): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

