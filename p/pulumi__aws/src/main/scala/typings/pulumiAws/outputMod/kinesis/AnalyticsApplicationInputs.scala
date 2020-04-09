package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationInputs extends js.Object {
  /**
    * The ARN of the Kinesis Analytics Application.
    */
  var id: String = js.native
  /**
    * The Kinesis Firehose configuration for the streaming source. Conflicts with `kinesisStream`.
    * See Kinesis Firehose below for more details.
    */
  var kinesisFirehose: js.UndefOr[AnalyticsApplicationInputsKinesisFirehose] = js.native
  /**
    * The Kinesis Stream configuration for the streaming source. Conflicts with `kinesisFirehose`.
    * See Kinesis Stream below for more details.
    */
  var kinesisStream: js.UndefOr[AnalyticsApplicationInputsKinesisStream] = js.native
  /**
    * The Name Prefix to use when creating an in-application stream.
    */
  var namePrefix: String = js.native
  /**
    * The number of Parallel in-application streams to create.
    * See Parallelism below for more details.
    */
  var parallelism: js.UndefOr[AnalyticsApplicationInputsParallelism] = js.native
  /**
    * The Processing Configuration to transform records as they are received from the stream.
    * See Processing Configuration below for more details.
    */
  var processingConfiguration: js.UndefOr[AnalyticsApplicationInputsProcessingConfiguration] = js.native
  /**
    * The Schema format of the data in the streaming source. See Source Schema below for more details.
    */
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

