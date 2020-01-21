package typings.pulumiAws.logGroupMixinsMod

import typings.pulumiAws.AnonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogGroupEvent extends js.Object {
  var awslogs: AnonData = js.native
}

object LogGroupEvent {
  @scala.inline
  def apply(awslogs: AnonData): LogGroupEvent = {
    val __obj = js.Dynamic.literal(awslogs = awslogs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LogGroupEvent]
  }
}

