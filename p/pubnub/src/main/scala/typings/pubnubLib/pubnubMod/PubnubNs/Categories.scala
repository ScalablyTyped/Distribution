package typings
package pubnubLib.pubnubMod.PubnubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Categories extends js.Object {
  var PNAccessDeniedCategory: java.lang.String
  var PNBadRequestCategory: java.lang.String
  var PNConnectedCategory: java.lang.String
  var PNNetworkDownCategory: java.lang.String
  var PNNetworkIssuesCategory: java.lang.String
  var PNNetworkUpCategory: java.lang.String
  var PNReconnectedCategory: java.lang.String
  var PNRequestMessageCountExceededCategory: java.lang.String
  var PNTimeoutCategory: java.lang.String
  var PNUnknownCategory: java.lang.String
}

object Categories {
  @scala.inline
  def apply(
    PNAccessDeniedCategory: java.lang.String,
    PNBadRequestCategory: java.lang.String,
    PNConnectedCategory: java.lang.String,
    PNNetworkDownCategory: java.lang.String,
    PNNetworkIssuesCategory: java.lang.String,
    PNNetworkUpCategory: java.lang.String,
    PNReconnectedCategory: java.lang.String,
    PNRequestMessageCountExceededCategory: java.lang.String,
    PNTimeoutCategory: java.lang.String,
    PNUnknownCategory: java.lang.String
  ): Categories = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("PNAccessDeniedCategory")(PNAccessDeniedCategory)
    __obj.updateDynamic("PNBadRequestCategory")(PNBadRequestCategory)
    __obj.updateDynamic("PNConnectedCategory")(PNConnectedCategory)
    __obj.updateDynamic("PNNetworkDownCategory")(PNNetworkDownCategory)
    __obj.updateDynamic("PNNetworkIssuesCategory")(PNNetworkIssuesCategory)
    __obj.updateDynamic("PNNetworkUpCategory")(PNNetworkUpCategory)
    __obj.updateDynamic("PNReconnectedCategory")(PNReconnectedCategory)
    __obj.updateDynamic("PNRequestMessageCountExceededCategory")(PNRequestMessageCountExceededCategory)
    __obj.updateDynamic("PNTimeoutCategory")(PNTimeoutCategory)
    __obj.updateDynamic("PNUnknownCategory")(PNUnknownCategory)
    __obj.asInstanceOf[Categories]
  }
}

