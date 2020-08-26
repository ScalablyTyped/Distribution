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
  @scala.inline
  implicit class ApproximateFirstReceiveTimestampOps[Self <: ApproximateFirstReceiveTimestamp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApproximateFirstReceiveTimestamp(value: String): Self = this.set("ApproximateFirstReceiveTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setApproximateReceiveCount(value: String): Self = this.set("ApproximateReceiveCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setSenderId(value: String): Self = this.set("SenderId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSentTimestamp(value: String): Self = this.set("SentTimestamp", value.asInstanceOf[js.Any])
  }
  
}

