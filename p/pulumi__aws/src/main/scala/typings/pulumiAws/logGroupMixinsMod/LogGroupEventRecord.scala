package typings.pulumiAws.logGroupMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogGroupEventRecord extends js.Object {
  var id: String = js.native
  var message: String = js.native
  var timestamp: Double = js.native
}

object LogGroupEventRecord {
  @scala.inline
  def apply(id: String, message: String, timestamp: Double): LogGroupEventRecord = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LogGroupEventRecord]
  }
}

