package typings.pulumiAws.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApproximateCreationDateTime extends js.Object {
  var ApproximateCreationDateTime: Double = js.native
  var Keys: Record[String, _] = js.native
  var NewImage: js.UndefOr[Record[String, _]] = js.native
  var OldImage: js.UndefOr[Record[String, _]] = js.native
  var SequenceNumber: String = js.native
  var SizeBytes: Double = js.native
  var StreamViewType: String = js.native
}

object ApproximateCreationDateTime {
  @scala.inline
  def apply(
    ApproximateCreationDateTime: Double,
    Keys: Record[String, _],
    SequenceNumber: String,
    SizeBytes: Double,
    StreamViewType: String
  ): ApproximateCreationDateTime = {
    val __obj = js.Dynamic.literal(ApproximateCreationDateTime = ApproximateCreationDateTime.asInstanceOf[js.Any], Keys = Keys.asInstanceOf[js.Any], SequenceNumber = SequenceNumber.asInstanceOf[js.Any], SizeBytes = SizeBytes.asInstanceOf[js.Any], StreamViewType = StreamViewType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApproximateCreationDateTime]
  }
  @scala.inline
  implicit class ApproximateCreationDateTimeOps[Self <: ApproximateCreationDateTime] (val x: Self) extends AnyVal {
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
    def setApproximateCreationDateTime(value: Double): Self = this.set("ApproximateCreationDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeys(value: Record[String, _]): Self = this.set("Keys", value.asInstanceOf[js.Any])
    @scala.inline
    def setSequenceNumber(value: String): Self = this.set("SequenceNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizeBytes(value: Double): Self = this.set("SizeBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreamViewType(value: String): Self = this.set("StreamViewType", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewImage(value: Record[String, _]): Self = this.set("NewImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewImage: Self = this.set("NewImage", js.undefined)
    @scala.inline
    def setOldImage(value: Record[String, _]): Self = this.set("OldImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldImage: Self = this.set("OldImage", js.undefined)
  }
  
}

