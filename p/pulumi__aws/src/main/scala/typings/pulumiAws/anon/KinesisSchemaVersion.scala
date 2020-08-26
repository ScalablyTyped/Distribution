package typings.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisSchemaVersion extends js.Object {
  var data: String = js.native
  var kinesisSchemaVersion: String = js.native
  var partitionKey: String = js.native
  var sequenceNumber: String = js.native
}

object KinesisSchemaVersion {
  @scala.inline
  def apply(data: String, kinesisSchemaVersion: String, partitionKey: String, sequenceNumber: String): KinesisSchemaVersion = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], kinesisSchemaVersion = kinesisSchemaVersion.asInstanceOf[js.Any], partitionKey = partitionKey.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisSchemaVersion]
  }
  @scala.inline
  implicit class KinesisSchemaVersionOps[Self <: KinesisSchemaVersion] (val x: Self) extends AnyVal {
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setKinesisSchemaVersion(value: String): Self = this.set("kinesisSchemaVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartitionKey(value: String): Self = this.set("partitionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSequenceNumber(value: String): Self = this.set("sequenceNumber", value.asInstanceOf[js.Any])
  }
  
}

