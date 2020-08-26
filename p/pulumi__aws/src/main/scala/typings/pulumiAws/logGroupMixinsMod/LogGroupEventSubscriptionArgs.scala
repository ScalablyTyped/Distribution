package typings.pulumiAws.logGroupMixinsMod

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
  def apply(): LogGroupEventSubscriptionArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogGroupEventSubscriptionArgs]
  }
  @scala.inline
  implicit class LogGroupEventSubscriptionArgsOps[Self <: LogGroupEventSubscriptionArgs] (val x: Self) extends AnyVal {
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
    def setFilterPattern(value: String): Self = this.set("filterPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterPattern: Self = this.set("filterPattern", js.undefined)
  }
  
}

