package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdKinesisFirehoseKinesisStreamLambda extends js.Object {
  var id: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var kinesisFirehose: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_ResourceArnRoleArn]] = js.undefined
  var kinesisStream: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_ResourceArnRoleArn]] = js.undefined
  var lambda: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_ResourceArnRoleArn]] = js.undefined
  var name: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var schema: atPulumiPulumiLib.outputMod.Input[Anon_RecordFormatTypeInput]
}

object Anon_IdKinesisFirehoseKinesisStreamLambda {
  @scala.inline
  def apply(
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    schema: atPulumiPulumiLib.outputMod.Input[Anon_RecordFormatTypeInput],
    id: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    kinesisFirehose: atPulumiPulumiLib.outputMod.Input[Anon_ResourceArnRoleArn] = null,
    kinesisStream: atPulumiPulumiLib.outputMod.Input[Anon_ResourceArnRoleArn] = null,
    lambda: atPulumiPulumiLib.outputMod.Input[Anon_ResourceArnRoleArn] = null
  ): Anon_IdKinesisFirehoseKinesisStreamLambda = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kinesisFirehose != null) __obj.updateDynamic("kinesisFirehose")(kinesisFirehose.asInstanceOf[js.Any])
    if (kinesisStream != null) __obj.updateDynamic("kinesisStream")(kinesisStream.asInstanceOf[js.Any])
    if (lambda != null) __obj.updateDynamic("lambda")(lambda.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IdKinesisFirehoseKinesisStreamLambda]
  }
}

