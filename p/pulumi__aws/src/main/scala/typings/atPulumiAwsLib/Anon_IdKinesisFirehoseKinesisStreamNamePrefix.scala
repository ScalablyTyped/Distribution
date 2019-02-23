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

