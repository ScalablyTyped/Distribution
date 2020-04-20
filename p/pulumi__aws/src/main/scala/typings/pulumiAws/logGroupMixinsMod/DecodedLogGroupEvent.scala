package typings.pulumiAws.logGroupMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecodedLogGroupEvent extends js.Object {
  var logEvents: js.Array[LogGroupEventRecord] = js.native
  var logGroup: String = js.native
  var logStream: String = js.native
  var messageType: String = js.native
  var owner: String = js.native
  var subscriptionFilters: js.Array[String] = js.native
}

object DecodedLogGroupEvent {
  @scala.inline
  def apply(
    logEvents: js.Array[LogGroupEventRecord],
    logGroup: String,
    logStream: String,
    messageType: String,
    owner: String,
    subscriptionFilters: js.Array[String]
  ): DecodedLogGroupEvent = {
    val __obj = js.Dynamic.literal(logEvents = logEvents.asInstanceOf[js.Any], logGroup = logGroup.asInstanceOf[js.Any], logStream = logStream.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], subscriptionFilters = subscriptionFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodedLogGroupEvent]
  }
}

