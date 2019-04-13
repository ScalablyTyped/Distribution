package typings
package pubnubLib.pubnubMod

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
    val __obj = js.Dynamic.literal(PNAccessDeniedCategory = PNAccessDeniedCategory, PNBadRequestCategory = PNBadRequestCategory, PNConnectedCategory = PNConnectedCategory, PNNetworkDownCategory = PNNetworkDownCategory, PNNetworkIssuesCategory = PNNetworkIssuesCategory, PNNetworkUpCategory = PNNetworkUpCategory, PNReconnectedCategory = PNReconnectedCategory, PNRequestMessageCountExceededCategory = PNRequestMessageCountExceededCategory, PNTimeoutCategory = PNTimeoutCategory, PNUnknownCategory = PNUnknownCategory)
  
    __obj.asInstanceOf[Categories]
  }
}

