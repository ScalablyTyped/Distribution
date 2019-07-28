package typings.atPulumiAws.cloudwatchLogGroupMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogGroupEventRecord extends js.Object {
  var id: String
  var message: String
  var timestamp: Double
}

object LogGroupEventRecord {
  @scala.inline
  def apply(id: String, message: String, timestamp: Double): LogGroupEventRecord = {
    val __obj = js.Dynamic.literal(id = id, message = message, timestamp = timestamp)
  
    __obj.asInstanceOf[LogGroupEventRecord]
  }
}

