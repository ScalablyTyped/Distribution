package typings.pulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKinesisSchemaVersion extends js.Object {
  var data: String = js.native
  var kinesisSchemaVersion: String = js.native
  var partitionKey: String = js.native
  var sequenceNumber: String = js.native
}

object AnonKinesisSchemaVersion {
  @scala.inline
  def apply(data: String, kinesisSchemaVersion: String, partitionKey: String, sequenceNumber: String): AnonKinesisSchemaVersion = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], kinesisSchemaVersion = kinesisSchemaVersion.asInstanceOf[js.Any], partitionKey = partitionKey.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKinesisSchemaVersion]
  }
}

