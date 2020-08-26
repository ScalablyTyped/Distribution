package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Categories extends js.Object {
  var PNAccessDeniedCategory: String = js.native
  var PNBadRequestCategory: String = js.native
  var PNConnectedCategory: String = js.native
  var PNMalformedResponseCategory: String = js.native
  var PNNetworkDownCategory: String = js.native
  var PNNetworkIssuesCategory: String = js.native
  var PNNetworkUpCategory: String = js.native
  var PNReconnectedCategory: String = js.native
  var PNRequestMessageCountExceedCategory: String = js.native
  var PNTimeoutCategory: String = js.native
  var PNUnknownCategory: String = js.native
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
  @scala.inline
  implicit class CategoriesOps[Self <: Categories] (val x: Self) extends AnyVal {
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
    def setPNAccessDeniedCategory(value: String): Self = this.set("PNAccessDeniedCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def setPNBadRequestCategory(value: String): Self = this.set("PNBadRequestCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def setPNConnectedCategory(value: String): Self = this.set("PNConnectedCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def setPNMalformedResponseCategory(value: String): Self = this.set("PNMalformedResponseCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def setPNNetworkDownCategory(value: String): Self = this.set("PNNetworkDownCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def setPNNetworkIssuesCategory(value: String): Self = this.set("PNNetworkIssuesCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def setPNNetworkUpCategory(value: String): Self = this.set("PNNetworkUpCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def setPNReconnectedCategory(value: String): Self = this.set("PNReconnectedCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def setPNRequestMessageCountExceedCategory(value: String): Self = this.set("PNRequestMessageCountExceedCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def setPNTimeoutCategory(value: String): Self = this.set("PNTimeoutCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def setPNUnknownCategory(value: String): Self = this.set("PNUnknownCategory", value.asInstanceOf[js.Any])
  }
  
}

