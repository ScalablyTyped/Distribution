package typings
package atPulumiAwsLib.cloudwatchLogGroupMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecodedLogGroupEvent extends js.Object {
  var logEvents: js.Array[LogGroupEventRecord]
  var logGroup: java.lang.String
  var logStream: java.lang.String
  var messageType: java.lang.String
  var owner: java.lang.String
  var subscriptionFilters: js.Array[java.lang.String]
}

object DecodedLogGroupEvent {
  @scala.inline
  def apply(
    logEvents: js.Array[LogGroupEventRecord],
    logGroup: java.lang.String,
    logStream: java.lang.String,
    messageType: java.lang.String,
    owner: java.lang.String,
    subscriptionFilters: js.Array[java.lang.String]
  ): DecodedLogGroupEvent = {
    val __obj = js.Dynamic.literal(logEvents = logEvents, logGroup = logGroup, logStream = logStream, messageType = messageType, owner = owner, subscriptionFilters = subscriptionFilters)
  
    __obj.asInstanceOf[DecodedLogGroupEvent]
  }
}

