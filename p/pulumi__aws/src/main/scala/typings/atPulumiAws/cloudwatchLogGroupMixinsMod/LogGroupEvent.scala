package typings.atPulumiAws.cloudwatchLogGroupMixinsMod

import typings.atPulumiAws.Anon_Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogGroupEvent extends js.Object {
  var awslogs: Anon_Data = js.native
}

object LogGroupEvent {
  @scala.inline
  def apply(awslogs: Anon_Data): LogGroupEvent = {
    val __obj = js.Dynamic.literal(awslogs = awslogs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LogGroupEvent]
  }
}

