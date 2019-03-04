package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApproximateCreationDateTime extends js.Object {
  var ApproximateCreationDateTime: scala.Double
  var Keys: stdLib.Record[java.lang.String, _]
  var NewImage: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var OldImage: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var SequenceNumber: java.lang.String
  var SizeBytes: scala.Double
  var StreamViewType: java.lang.String
}

object Anon_ApproximateCreationDateTime {
  @scala.inline
  def apply(
    ApproximateCreationDateTime: scala.Double,
    Keys: stdLib.Record[java.lang.String, _],
    SequenceNumber: java.lang.String,
    SizeBytes: scala.Double,
    StreamViewType: java.lang.String,
    NewImage: stdLib.Record[java.lang.String, _] = null,
    OldImage: stdLib.Record[java.lang.String, _] = null
  ): Anon_ApproximateCreationDateTime = {
    val __obj = js.Dynamic.literal(ApproximateCreationDateTime = ApproximateCreationDateTime, Keys = Keys, SequenceNumber = SequenceNumber, SizeBytes = SizeBytes, StreamViewType = StreamViewType)
    if (NewImage != null) __obj.updateDynamic("NewImage")(NewImage)
    if (OldImage != null) __obj.updateDynamic("OldImage")(OldImage)
    __obj.asInstanceOf[Anon_ApproximateCreationDateTime]
  }
}

