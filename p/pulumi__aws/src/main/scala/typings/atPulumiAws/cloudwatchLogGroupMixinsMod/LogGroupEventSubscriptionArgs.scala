package typings.atPulumiAws.cloudwatchLogGroupMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogGroupEventSubscriptionArgs extends js.Object {
  /**
    * A valid CloudWatch Logs filter pattern for subscribing to a filtered stream of log events. If
    * not provided, the empty-string pattern will be used.
    */
  var filterPattern: js.UndefOr[String] = js.undefined
}

object LogGroupEventSubscriptionArgs {
  @scala.inline
  def apply(filterPattern: String = null): LogGroupEventSubscriptionArgs = {
    val __obj = js.Dynamic.literal()
    if (filterPattern != null) __obj.updateDynamic("filterPattern")(filterPattern)
    __obj.asInstanceOf[LogGroupEventSubscriptionArgs]
  }
}

