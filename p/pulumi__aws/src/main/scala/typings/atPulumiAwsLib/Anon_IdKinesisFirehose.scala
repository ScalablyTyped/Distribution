package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdKinesisFirehose extends js.Object {
  var id: java.lang.String
  var kinesisFirehose: js.UndefOr[Anon_ResourceArn] = js.undefined
  var kinesisStream: js.UndefOr[Anon_ResourceArn] = js.undefined
  var namePrefix: java.lang.String
  var parallelism: js.UndefOr[Anon_Count] = js.undefined
  var processingConfiguration: js.UndefOr[Anon_Lambda] = js.undefined
  var schema: Anon_RecordColumns
  var startingPositionConfigurations: js.Array[Anon_StartingPosition]
  var streamNames: js.Array[java.lang.String]
}

object Anon_IdKinesisFirehose {
  @scala.inline
  def apply(
    id: java.lang.String,
    namePrefix: java.lang.String,
    schema: Anon_RecordColumns,
    startingPositionConfigurations: js.Array[Anon_StartingPosition],
    streamNames: js.Array[java.lang.String],
    kinesisFirehose: Anon_ResourceArn = null,
    kinesisStream: Anon_ResourceArn = null,
    parallelism: Anon_Count = null,
    processingConfiguration: Anon_Lambda = null
  ): Anon_IdKinesisFirehose = {
    val __obj = js.Dynamic.literal(id = id, namePrefix = namePrefix, schema = schema, startingPositionConfigurations = startingPositionConfigurations, streamNames = streamNames)
    if (kinesisFirehose != null) __obj.updateDynamic("kinesisFirehose")(kinesisFirehose)
    if (kinesisStream != null) __obj.updateDynamic("kinesisStream")(kinesisStream)
    if (parallelism != null) __obj.updateDynamic("parallelism")(parallelism)
    if (processingConfiguration != null) __obj.updateDynamic("processingConfiguration")(processingConfiguration)
    __obj.asInstanceOf[Anon_IdKinesisFirehose]
  }
}

