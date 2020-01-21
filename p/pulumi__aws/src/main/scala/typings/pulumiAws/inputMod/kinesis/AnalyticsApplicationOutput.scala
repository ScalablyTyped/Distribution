package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationOutput extends js.Object {
  /**
    * The ARN of the Kinesis Analytics Application.
    */
  var id: js.UndefOr[Input[String]] = js.native
  var kinesisFirehose: js.UndefOr[Input[AnalyticsApplicationOutputKinesisFirehose]] = js.native
  var kinesisStream: js.UndefOr[Input[AnalyticsApplicationOutputKinesisStream]] = js.native
  var lambda: js.UndefOr[Input[AnalyticsApplicationOutputLambda]] = js.native
  /**
    * Name of the Kinesis Analytics Application.
    */
  var name: Input[String] = js.native
  var schema: Input[AnalyticsApplicationOutputSchema] = js.native
}

object AnalyticsApplicationOutput {
  @scala.inline
  def apply(
    name: Input[String],
    schema: Input[AnalyticsApplicationOutputSchema],
    id: Input[String] = null,
    kinesisFirehose: Input[AnalyticsApplicationOutputKinesisFirehose] = null,
    kinesisStream: Input[AnalyticsApplicationOutputKinesisStream] = null,
    lambda: Input[AnalyticsApplicationOutputLambda] = null
  ): AnalyticsApplicationOutput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kinesisFirehose != null) __obj.updateDynamic("kinesisFirehose")(kinesisFirehose.asInstanceOf[js.Any])
    if (kinesisStream != null) __obj.updateDynamic("kinesisStream")(kinesisStream.asInstanceOf[js.Any])
    if (lambda != null) __obj.updateDynamic("lambda")(lambda.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationOutput]
  }
}

