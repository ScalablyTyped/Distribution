package typings.atPulumiAws.typesOutputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationInputs extends js.Object {
  /**
    * The ARN of the Kinesis Analytics Application.
    */
  var id: String = js.native
  var kinesisFirehose: js.UndefOr[AnalyticsApplicationInputsKinesisFirehose] = js.native
  var kinesisStream: js.UndefOr[AnalyticsApplicationInputsKinesisStream] = js.native
  var namePrefix: String = js.native
  var parallelism: js.UndefOr[AnalyticsApplicationInputsParallelism] = js.native
  var processingConfiguration: js.UndefOr[AnalyticsApplicationInputsProcessingConfiguration] = js.native
  var schema: AnalyticsApplicationInputsSchema = js.native
  var startingPositionConfigurations: js.Array[AnalyticsApplicationInputsStartingPositionConfiguration] = js.native
  var streamNames: js.Array[String] = js.native
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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], namePrefix = namePrefix.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], startingPositionConfigurations = startingPositionConfigurations.asInstanceOf[js.Any], streamNames = streamNames.asInstanceOf[js.Any])
    if (kinesisFirehose != null) __obj.updateDynamic("kinesisFirehose")(kinesisFirehose.asInstanceOf[js.Any])
    if (kinesisStream != null) __obj.updateDynamic("kinesisStream")(kinesisStream.asInstanceOf[js.Any])
    if (parallelism != null) __obj.updateDynamic("parallelism")(parallelism.asInstanceOf[js.Any])
    if (processingConfiguration != null) __obj.updateDynamic("processingConfiguration")(processingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputs]
  }
}

