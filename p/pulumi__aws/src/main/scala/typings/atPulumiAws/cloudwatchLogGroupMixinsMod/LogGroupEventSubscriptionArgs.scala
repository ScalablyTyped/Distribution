package typings.atPulumiAws.cloudwatchLogGroupMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogGroupEventSubscriptionArgs extends js.Object {
  /**
    * A valid CloudWatch Logs filter pattern for subscribing to a filtered stream of log events. If
    * not provided, the empty-string pattern will be used.
    */
  var filterPattern: js.UndefOr[String] = js.native
}

object LogGroupEventSubscriptionArgs {
  @scala.inline
  def apply(filterPattern: String = null): LogGroupEventSubscriptionArgs = {
    val __obj = js.Dynamic.literal()
    if (filterPattern != null) __obj.updateDynamic("filterPattern")(filterPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogGroupEventSubscriptionArgs]
  }
}

