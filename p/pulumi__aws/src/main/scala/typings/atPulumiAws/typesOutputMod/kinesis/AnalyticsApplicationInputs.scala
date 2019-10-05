package typings.atPulumiAws.typesOutputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationInputs extends js.Object {
  /**
    * The ARN of the Kinesis Analytics Application.
    */
  var id: String
  var kinesisFirehose: js.UndefOr[AnalyticsApplicationInputsKinesisFirehose] = js.undefined
  var kinesisStream: js.UndefOr[AnalyticsApplicationInputsKinesisStream] = js.undefined
  var namePrefix: String
  var parallelism: js.UndefOr[AnalyticsApplicationInputsParallelism] = js.undefined
  var processingConfiguration: js.UndefOr[AnalyticsApplicationInputsProcessingConfiguration] = js.undefined
  var schema: AnalyticsApplicationInputsSchema
  var startingPositionConfigurations: js.Array[AnalyticsApplicationInputsStartingPositionConfiguration]
  var streamNames: js.Array[String]
}

object AnalyticsApplicationInputs {
  @scala.inline
  def apply(
    id: String,
    namePrefix: String,
    schema: AnalyticsApplicationInputsSchema,
    startingPositionConfigurations: js.Array[AnalyticsApplicationInputsStartingPositionConfiguration],
    streamNames: js.Array[String],
    kinesisFirehose: AnalyticsApplicationInputsKinesisFirehose = null,
    kinesisStream: AnalyticsApplicationInputsKinesisStream = null,
    parallelism: AnalyticsApplicationInputsParallelism = null,
    processingConfiguration: AnalyticsApplicationInputsProcessingConfiguration = null
  ): AnalyticsApplicationInputs = {
    val __obj = js.Dynamic.literal(id = id, namePrefix = namePrefix, schema = schema, startingPositionConfigurations = startingPositionConfigurations, streamNames = streamNames)
    if (kinesisFirehose != null) __obj.updateDynamic("kinesisFirehose")(kinesisFirehose)
    if (kinesisStream != null) __obj.updateDynamic("kinesisStream")(kinesisStream)
    if (parallelism != null) __obj.updateDynamic("parallelism")(parallelism)
    if (processingConfiguration != null) __obj.updateDynamic("processingConfiguration")(processingConfiguration)
    __obj.asInstanceOf[AnalyticsApplicationInputs]
  }
}

