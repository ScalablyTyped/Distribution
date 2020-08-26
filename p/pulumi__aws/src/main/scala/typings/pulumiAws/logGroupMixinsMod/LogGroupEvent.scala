package typings.pulumiAws.logGroupMixinsMod

import typings.pulumiAws.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogGroupEvent extends js.Object {
  var awslogs: Data = js.native
}

object LogGroupEvent {
  @scala.inline
  def apply(awslogs: Data): LogGroupEvent = {
    val __obj = js.Dynamic.literal(awslogs = awslogs.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogGroupEvent]
  }
  @scala.inline
  implicit class LogGroupEventOps[Self <: LogGroupEvent] (val x: Self) extends AnyVal {
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
    def setAwslogs(value: Data): Self = this.set("awslogs", value.asInstanceOf[js.Any])
  }
  
}

