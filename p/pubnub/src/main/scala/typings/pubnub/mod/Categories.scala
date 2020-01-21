package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Categories extends js.Object {
  var PNAccessDeniedCategory: String
  var PNBadRequestCategory: String
  var PNConnectedCategory: String
  var PNMalformedResponseCategory: String
  var PNNetworkDownCategory: String
  var PNNetworkIssuesCategory: String
  var PNNetworkUpCategory: String
  var PNReconnectedCategory: String
  var PNRequestMessageCountExceedCategory: String
  var PNTimeoutCategory: String
  var PNUnknownCategory: String
}

object Categories {
  @scala.inline
  def apply(
    PNAccessDeniedCategory: String,
    PNBadRequestCategory: String,
    PNConnectedCategory: String,
    PNMalformedResponseCategory: String,
    PNNetworkDownCategory: String,
    PNNetworkIssuesCategory: String,
    PNNetworkUpCategory: String,
    PNReconnectedCategory: String,
    PNRequestMessageCountExceedCategory: String,
    PNTimeoutCategory: String,
    PNUnknownCategory: String
  ): Categories = {
    val __obj = js.Dynamic.literal(PNAccessDeniedCategory = PNAccessDeniedCategory.asInstanceOf[js.Any], PNBadRequestCategory = PNBadRequestCategory.asInstanceOf[js.Any], PNConnectedCategory = PNConnectedCategory.asInstanceOf[js.Any], PNMalformedResponseCategory = PNMalformedResponseCategory.asInstanceOf[js.Any], PNNetworkDownCategory = PNNetworkDownCategory.asInstanceOf[js.Any], PNNetworkIssuesCategory = PNNetworkIssuesCategory.asInstanceOf[js.Any], PNNetworkUpCategory = PNNetworkUpCategory.asInstanceOf[js.Any], PNReconnectedCategory = PNReconnectedCategory.asInstanceOf[js.Any], PNRequestMessageCountExceedCategory = PNRequestMessageCountExceedCategory.asInstanceOf[js.Any], PNTimeoutCategory = PNTimeoutCategory.asInstanceOf[js.Any], PNUnknownCategory = PNUnknownCategory.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Categories]
  }
}

