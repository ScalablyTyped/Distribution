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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("kinesisSchemaVersion")(kinesisSchemaVersion)
    __obj.updateDynamic("partitionKey")(partitionKey)
    __obj.updateDynamic("sequenceNumber")(sequenceNumber)
    __obj.asInstanceOf[Anon_DataKinesisSchemaVersion]
  }
}

