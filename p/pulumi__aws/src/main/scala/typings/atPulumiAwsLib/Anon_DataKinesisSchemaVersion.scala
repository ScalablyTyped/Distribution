package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataKinesisSchemaVersion extends js.Object {
  var data: java.lang.String
  var kinesisSchemaVersion: java.lang.String
  var partitionKey: java.lang.String
  var sequenceNumber: java.lang.String
}

object Anon_DataKinesisSchemaVersion {
  @scala.inline
  def apply(
    data: java.lang.String,
    kinesisSchemaVersion: java.lang.String,
    partitionKey: java.lang.String,
    sequenceNumber: java.lang.String
  ): Anon_DataKinesisSchemaVersion = {
    val __obj = js.Dynamic.literal(data = data, kinesisSchemaVersion = kinesisSchemaVersion, partitionKey = partitionKey, sequenceNumber = sequenceNumber)
  
    __obj.asInstanceOf[Anon_DataKinesisSchemaVersion]
  }
}

