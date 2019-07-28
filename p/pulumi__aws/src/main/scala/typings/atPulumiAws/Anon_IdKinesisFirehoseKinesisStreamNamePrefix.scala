package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdKinesisFirehoseKinesisStreamNamePrefix extends js.Object {
  var id: js.UndefOr[Input[String]] = js.undefined
  var kinesisFirehose: js.UndefOr[Input[Anon_ResourceArnRoleArn]] = js.undefined
  var kinesisStream: js.UndefOr[Input[Anon_ResourceArnRoleArn]] = js.undefined
  var namePrefix: Input[String]
  var parallelism: js.UndefOr[Input[Anon_CountInput]] = js.undefined
  var processingConfiguration: js.UndefOr[Input[Anon_LambdaAnonResourceArnRoleArn]] = js.undefined
  var schema: Input[Anon_RecordColumnsRecordEncoding]
  var startingPositionConfigurations: js.UndefOr[Input[js.Array[Input[Anon_StartingPositionInput]]]] = js.undefined
  var streamNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object Anon_IdKinesisFirehoseKinesisStreamNamePrefix {
  @scala.inline
  def apply(
    namePrefix: Input[String],
    schema: Input[Anon_RecordColumnsRecordEncoding],
    id: Input[String] = null,
    kinesisFirehose: Input[Anon_ResourceArnRoleArn] = null,
    kinesisStream: Input[Anon_ResourceArnRoleArn] = null,
    parallelism: Input[Anon_CountInput] = null,
    processingConfiguration: Input[Anon_LambdaAnonResourceArnRoleArn] = null,
    startingPositionConfigurations: Input[js.Array[Input[Anon_StartingPositionInput]]] = null,
    streamNames: Input[js.Array[Input[String]]] = null
  ): Anon_IdKinesisFirehoseKinesisStreamNamePrefix = {
    val __obj = js.Dynamic.literal(namePrefix = namePrefix.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kinesisFirehose != null) __obj.updateDynamic("kinesisFirehose")(kinesisFirehose.asInstanceOf[js.Any])
    if (kinesisStream != null) __obj.updateDynamic("kinesisStream")(kinesisStream.asInstanceOf[js.Any])
    if (parallelism != null) __obj.updateDynamic("parallelism")(parallelism.asInstanceOf[js.Any])
    if (processingConfiguration != null) __obj.updateDynamic("processingConfiguration")(processingConfiguration.asInstanceOf[js.Any])
    if (startingPositionConfigurations != null) __obj.updateDynamic("startingPositionConfigurations")(startingPositionConfigurations.asInstanceOf[js.Any])
    if (streamNames != null) __obj.updateDynamic("streamNames")(streamNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IdKinesisFirehoseKinesisStreamNamePrefix]
  }
}

