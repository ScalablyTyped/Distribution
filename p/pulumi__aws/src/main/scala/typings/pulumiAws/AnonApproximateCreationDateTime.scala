package typings.pulumiAws

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApproximateCreationDateTime extends js.Object {
  var ApproximateCreationDateTime: Double = js.native
  var Keys: Record[String, _] = js.native
  var NewImage: js.UndefOr[Record[String, _]] = js.native
  var OldImage: js.UndefOr[Record[String, _]] = js.native
  var SequenceNumber: String = js.native
  var SizeBytes: Double = js.native
  var StreamViewType: String = js.native
}

object AnonApproximateCreationDateTime {
  @scala.inline
  def apply(
    ApproximateCreationDateTime: Double,
    Keys: Record[String, _],
    SequenceNumber: String,
    SizeBytes: Double,
    StreamViewType: String,
    NewImage: Record[String, _] = null,
    OldImage: Record[String, _] = null
  ): AnonApproximateCreationDateTime = {
    val __obj = js.Dynamic.literal(ApproximateCreationDateTime = ApproximateCreationDateTime.asInstanceOf[js.Any], Keys = Keys.asInstanceOf[js.Any], SequenceNumber = SequenceNumber.asInstanceOf[js.Any], SizeBytes = SizeBytes.asInstanceOf[js.Any], StreamViewType = StreamViewType.asInstanceOf[js.Any])
    if (NewImage != null) __obj.updateDynamic("NewImage")(NewImage.asInstanceOf[js.Any])
    if (OldImage != null) __obj.updateDynamic("OldImage")(OldImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApproximateCreationDateTime]
  }
}

