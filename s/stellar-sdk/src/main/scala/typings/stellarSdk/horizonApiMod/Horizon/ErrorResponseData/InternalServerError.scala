package typings.stellarSdk.horizonApiMod.Horizon.ErrorResponseData

import typings.stellarSdk.stellarSdkNumbers.`500`
import typings.stellarSdk.stellarSdkStrings.`Internal Server Error`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalServerError extends Base {
  @JSName("status")
  var status_InternalServerError: `500` = js.native
  @JSName("title")
  var title_InternalServerError: `Internal Server Error` = js.native
}

object InternalServerError {
  @scala.inline
  def apply(details: String, instance: String, status: `500`, title: `Internal Server Error`, `type`: String): InternalServerError = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalServerError]
  }
  @scala.inline
  implicit class InternalServerErrorOps[Self <: InternalServerError] (val x: Self) extends AnyVal {
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
    def setStatus(value: `500`): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: `Internal Server Error`): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

