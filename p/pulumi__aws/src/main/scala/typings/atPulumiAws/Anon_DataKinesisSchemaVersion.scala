package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataKinesisSchemaVersion extends js.Object {
  var data: String
  var kinesisSchemaVersion: String
  var partitionKey: String
  var sequenceNumber: String
}

object Anon_DataKinesisSchemaVersion {
  @scala.inline
  def apply(data: String, kinesisSchemaVersion: String, partitionKey: String, sequenceNumber: String): Anon_DataKinesisSchemaVersion = {
    val __obj = js.Dynamic.literal(data = data, kinesisSchemaVersion = kinesisSchemaVersion, partitionKey = partitionKey, sequenceNumber = sequenceNumber)
  
    __obj.asInstanceOf[Anon_DataKinesisSchemaVersion]
  }
}

