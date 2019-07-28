package typings.atPulumiAws.cloudwatchLogGroupMixinsMod

import typings.atPulumiAws.Anon_Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogGroupEvent extends js.Object {
  var awslogs: Anon_Data
}

object LogGroupEvent {
  @scala.inline
  def apply(awslogs: Anon_Data): LogGroupEvent = {
    val __obj = js.Dynamic.literal(awslogs = awslogs)
  
    __obj.asInstanceOf[LogGroupEvent]
  }
}

