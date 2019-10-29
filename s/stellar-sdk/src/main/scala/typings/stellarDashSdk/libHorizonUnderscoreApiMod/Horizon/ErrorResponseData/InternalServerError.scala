package typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.ErrorResponseData

import typings.stellarDashSdk.stellarDashSdkNumbers.`500`
import typings.stellarDashSdk.stellarDashSdkStrings.`Internal Server Error`
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
    val __obj = js.Dynamic.literal(details = details, instance = instance, status = status, title = title)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[InternalServerError]
  }
}

