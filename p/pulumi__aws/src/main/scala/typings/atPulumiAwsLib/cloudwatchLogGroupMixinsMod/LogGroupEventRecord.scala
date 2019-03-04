package typings
package atPulumiAwsLib.cloudwatchLogGroupMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogGroupEventRecord extends js.Object {
  var id: java.lang.String
  var message: java.lang.String
  var timestamp: scala.Double
}

object LogGroupEventRecord {
  @scala.inline
  def apply(id: java.lang.String, message: java.lang.String, timestamp: scala.Double): LogGroupEventRecord = {
    val __obj = js.Dynamic.literal(id = id, message = message, timestamp = timestamp)
  
    __obj.asInstanceOf[LogGroupEventRecord]
  }
}

