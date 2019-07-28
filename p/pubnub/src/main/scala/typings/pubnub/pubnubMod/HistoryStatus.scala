package typings.pubnub.pubnubMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryStatus extends js.Object {
  var error: Boolean
  var errorData: js.UndefOr[Error] = js.undefined
  var operation: String
   // see Pubnub.Operations
  var statusCode: js.UndefOr[Double] = js.undefined
}

object HistoryStatus {
  @scala.inline
  def apply(error: Boolean, operation: String, errorData: Error = null, statusCode: Int | Double = null): HistoryStatus = {
    val __obj = js.Dynamic.literal(error = error, operation = operation)
    if (errorData != null) __obj.updateDynamic("errorData")(errorData)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryStatus]
  }
}

