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
}

