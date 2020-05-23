package typings.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApproximateFirstReceiveTimestamp extends js.Object {
  var ApproximateFirstReceiveTimestamp: String = js.native
  var ApproximateReceiveCount: String = js.native
  var SenderId: String = js.native
  var SentTimestamp: String = js.native
}

object ApproximateFirstReceiveTimestamp {
  @scala.inline
  def apply(
    ApproximateFirstReceiveTimestamp: String,
    ApproximateReceiveCount: String,
    SenderId: String,
    SentTimestamp: String
  ): ApproximateFirstReceiveTimestamp = {
    val __obj = js.Dynamic.literal(ApproximateFirstReceiveTimestamp = ApproximateFirstReceiveTimestamp.asInstanceOf[js.Any], ApproximateReceiveCount = ApproximateReceiveCount.asInstanceOf[js.Any], SenderId = SenderId.asInstanceOf[js.Any], SentTimestamp = SentTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApproximateFirstReceiveTimestamp]
  }
}

