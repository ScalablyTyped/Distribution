package typings
package pubnubLib.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryStatus extends js.Object {
  var error: scala.Boolean
  var errorData: js.UndefOr[stdLib.Error] = js.undefined
  var operation: java.lang.String
   // see Pubnub.Operations
  var statusCode: js.UndefOr[scala.Double] = js.undefined
}

object HistoryStatus {
  @scala.inline
  def apply(
    error: scala.Boolean,
    operation: java.lang.String,
    errorData: stdLib.Error = null,
    statusCode: scala.Int | scala.Double = null
  ): HistoryStatus = {
    val __obj = js.Dynamic.literal(error = error, operation = operation)
    if (errorData != null) __obj.updateDynamic("errorData")(errorData)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryStatus]
  }
}

