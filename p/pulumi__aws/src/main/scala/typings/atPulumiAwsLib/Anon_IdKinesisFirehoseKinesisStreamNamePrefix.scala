package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdKinesisFirehoseKinesisStreamNamePrefix extends js.Object {
  var id: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var kinesisFirehose: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_ResourceArnRoleArn]] = js.undefined
  var kinesisStream: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_ResourceArnRoleArn]] = js.undefined
  var namePrefix: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var parallelism: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_CountInput]] = js.undefined
  var processingConfiguration: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_LambdaAnonResourceArnRoleArn]] = js.undefined
  var schema: atPulumiPulumiLib.outputMod.Input[Anon_RecordColumnsRecordEncoding]
  var startingPositionConfigurations: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_StartingPositionInput]]]
  ] = js.undefined
  var streamNames: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
}

object Anon_IdKinesisFirehoseKinesisStreamNamePrefix {
  @scala.inline
  def apply(
    namePrefix: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    schema: atPulumiPulumiLib.outputMod.Input[Anon_RecordColumnsRecordEncoding],
    id: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    kinesisFirehose: atPulumiPulumiLib.outputMod.Input[Anon_ResourceArnRoleArn] = null,
    kinesisStream: atPulumiPulumiLib.outputMod.Input[Anon_ResourceArnRoleArn] = null,
    parallelism: atPulumiPulumiLib.outputMod.Input[Anon_CountInput] = null,
    processingConfiguration: atPulumiPulumiLib.outputMod.Input[Anon_LambdaAnonResourceArnRoleArn] = null,
    startingPositionConfigurations: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_StartingPositionInput]]] = null,
    streamNames: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null
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

