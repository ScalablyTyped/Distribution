package typings.atPulumiAws

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApproximateCreationDateTime extends js.Object {
  var ApproximateCreationDateTime: Double
  var Keys: Record[String, _]
  var NewImage: js.UndefOr[Record[String, _]] = js.undefined
  var OldImage: js.UndefOr[Record[String, _]] = js.undefined
  var SequenceNumber: String
  var SizeBytes: Double
  var StreamViewType: String
}

object Anon_ApproximateCreationDateTime {
  @scala.inline
  def apply(
    ApproximateCreationDateTime: Double,
    Keys: Record[String, _],
    SequenceNumber: String,
    SizeBytes: Double,
    StreamViewType: String,
    NewImage: Record[String, _] = null,
    OldImage: Record[String, _] = null
  ): Anon_ApproximateCreationDateTime = {
    val __obj = js.Dynamic.literal(ApproximateCreationDateTime = ApproximateCreationDateTime, Keys = Keys, SequenceNumber = SequenceNumber, SizeBytes = SizeBytes, StreamViewType = StreamViewType)
    if (NewImage != null) __obj.updateDynamic("NewImage")(NewImage)
    if (OldImage != null) __obj.updateDynamic("OldImage")(OldImage)
    __obj.asInstanceOf[Anon_ApproximateCreationDateTime]
  }
}

