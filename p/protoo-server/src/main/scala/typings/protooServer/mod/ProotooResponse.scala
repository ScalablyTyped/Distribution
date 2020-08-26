package typings.protooServer.mod

import typings.protooServer.protooServerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProotooResponse extends js.Object {
  var data: js.UndefOr[js.Any] = js.native
  var errorCode: js.UndefOr[Double] = js.native
  var errorReason: js.UndefOr[String] = js.native
  var id: Double = js.native
  var ok: Boolean = js.native
  var response: `true` = js.native
}

object ProotooResponse {
  @scala.inline
  def apply(id: Double, ok: Boolean, response: `true`): ProotooResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProotooResponse]
  }
  @scala.inline
  implicit class ProotooResponseOps[Self <: ProotooResponse] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOk(value: Boolean): Self = this.set("ok", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: `true`): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setErrorCode(value: Double): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
    @scala.inline
    def setErrorReason(value: String): Self = this.set("errorReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorReason: Self = this.set("errorReason", js.undefined)
  }
  
}

