package typings.pubnub.pubnubMod

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
    val __obj = js.Dynamic.literal(PNAccessDeniedCategory = PNAccessDeniedCategory, PNBadRequestCategory = PNBadRequestCategory, PNConnectedCategory = PNConnectedCategory, PNMalformedResponseCategory = PNMalformedResponseCategory, PNNetworkDownCategory = PNNetworkDownCategory, PNNetworkIssuesCategory = PNNetworkIssuesCategory, PNNetworkUpCategory = PNNetworkUpCategory, PNReconnectedCategory = PNReconnectedCategory, PNRequestMessageCountExceedCategory = PNRequestMessageCountExceedCategory, PNTimeoutCategory = PNTimeoutCategory, PNUnknownCategory = PNUnknownCategory)
  
    __obj.asInstanceOf[Categories]
  }
}

