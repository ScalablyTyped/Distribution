package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdKinesisFirehoseKinesisStreamLambda extends js.Object {
  var id: js.UndefOr[Input[String]] = js.undefined
  var kinesisFirehose: js.UndefOr[Input[Anon_ResourceArnRoleArn]] = js.undefined
  var kinesisStream: js.UndefOr[Input[Anon_ResourceArnRoleArn]] = js.undefined
  var lambda: js.UndefOr[Input[Anon_ResourceArnRoleArn]] = js.undefined
  var name: Input[String]
  var schema: Input[Anon_RecordFormatTypeInput]
}

object Anon_IdKinesisFirehoseKinesisStreamLambda {
  @scala.inline
  def apply(
    name: Input[String],
    schema: Input[Anon_RecordFormatTypeInput],
    id: Input[String] = null,
    kinesisFirehose: Input[Anon_ResourceArnRoleArn] = null,
    kinesisStream: Input[Anon_ResourceArnRoleArn] = null,
    lambda: Input[Anon_ResourceArnRoleArn] = null
  ): Anon_IdKinesisFirehoseKinesisStreamLambda = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kinesisFirehose != null) __obj.updateDynamic("kinesisFirehose")(kinesisFirehose.asInstanceOf[js.Any])
    if (kinesisStream != null) __obj.updateDynamic("kinesisStream")(kinesisStream.asInstanceOf[js.Any])
    if (lambda != null) __obj.updateDynamic("lambda")(lambda.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IdKinesisFirehoseKinesisStreamLambda]
  }
}

