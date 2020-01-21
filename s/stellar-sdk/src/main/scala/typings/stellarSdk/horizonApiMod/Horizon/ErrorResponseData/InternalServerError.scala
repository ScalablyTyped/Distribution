package typings.stellarSdk.horizonApiMod.Horizon.ErrorResponseData

import typings.stellarSdk.stellarSdkNumbers.`500`
import typings.stellarSdk.stellarSdkStrings.`Internal Server Error`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalServerError extends Base {
  @JSName("status")
  var status_InternalServerError: `500`
  @JSName("title")
  var title_InternalServerError: `Internal Server Error`
}

object InternalServerError {
  @scala.inline
  def apply(details: String, instance: String, status: `500`, title: `Internal Server Error`, `type`: String): InternalServerError = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalServerError]
  }
}

