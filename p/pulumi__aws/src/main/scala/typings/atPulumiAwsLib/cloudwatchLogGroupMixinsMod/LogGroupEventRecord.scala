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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[LogGroupEventRecord]
  }
}

