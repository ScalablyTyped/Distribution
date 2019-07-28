package typings.atPulumiAws.cloudwatchLogGroupMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecodedLogGroupEvent extends js.Object {
  var logEvents: js.Array[LogGroupEventRecord]
  var logGroup: String
  var logStream: String
  var messageType: String
  var owner: String
  var subscriptionFilters: js.Array[String]
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
    val __obj = js.Dynamic.literal(logEvents = logEvents, logGroup = logGroup, logStream = logStream, messageType = messageType, owner = owner, subscriptionFilters = subscriptionFilters)
  
    __obj.asInstanceOf[DecodedLogGroupEvent]
  }
}

