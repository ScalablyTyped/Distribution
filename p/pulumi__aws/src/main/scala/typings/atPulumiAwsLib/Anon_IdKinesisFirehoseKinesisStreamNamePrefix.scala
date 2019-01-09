package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdKinesisFirehoseKinesisStreamNamePrefix extends js.Object {
  var id: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var kinesisFirehose: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_ResourceArnRoleArn]] = js.undefined
  var kinesisStream: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_ResourceArnRoleArn]] = js.undefined
  var namePrefix: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var parallelism: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_CountInput]] = js.undefined
  var processingConfiguration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_LambdaAnonResourceArnRoleArn]] = js.undefined
  var schema: atPulumiPulumiLib.resourceMod.Input[Anon_RecordColumnsRecordEncoding]
  var startingPositionConfigurations: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_StartingPositionInput]]]
  ] = js.undefined
  var streamNames: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
}

