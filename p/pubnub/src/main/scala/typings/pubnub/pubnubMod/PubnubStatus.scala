package typings.pubnub.pubnubMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PubnubStatus extends js.Object {
  var category: js.UndefOr[String] = js.undefined
  var error: Boolean
  var errorData: js.UndefOr[Error] = js.undefined
   // see Pubnub.Categories
  var operation: String
   // see Pubnub.Operations
  var statusCode: Double
}

object PubnubStatus {
  @scala.inline
  def apply(
    error: Boolean,
    operation: String,
    statusCode: Double,
    category: String = null,
    errorData: Error = null
  ): PubnubStatus = {
    val __obj = js.Dynamic.literal(error = error, operation = operation, statusCode = statusCode)
    if (category != null) __obj.updateDynamic("category")(category)
    if (errorData != null) __obj.updateDynamic("errorData")(errorData)
    __obj.asInstanceOf[PubnubStatus]
  }
}

