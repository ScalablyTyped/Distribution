package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationOutput extends js.Object {
  /**
    * The ARN of the Kinesis Analytics Application.
    */
  var id: String = js.native
  var kinesisFirehose: js.UndefOr[AnalyticsApplicationOutputKinesisFirehose] = js.native
  var kinesisStream: js.UndefOr[AnalyticsApplicationOutputKinesisStream] = js.native
  var lambda: js.UndefOr[AnalyticsApplicationOutputLambda] = js.native
  /**
    * Name of the Kinesis Analytics Application.
    */
  var name: String = js.native
  var schema: AnalyticsApplicationOutputSchema = js.native
}

object AnalyticsApplicationOutput {
  @scala.inline
  def apply(
    id: String,
    name: String,
    schema: AnalyticsApplicationOutputSchema,
    kinesisFirehose: AnalyticsApplicationOutputKinesisFirehose = null,
    kinesisStream: AnalyticsApplicationOutputKinesisStream = null,
    lambda: AnalyticsApplicationOutputLambda = null
  ): AnalyticsApplicationOutput = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    if (kinesisFirehose != null) __obj.updateDynamic("kinesisFirehose")(kinesisFirehose.asInstanceOf[js.Any])
    if (kinesisStream != null) __obj.updateDynamic("kinesisStream")(kinesisStream.asInstanceOf[js.Any])
    if (lambda != null) __obj.updateDynamic("lambda")(lambda.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationOutput]
  }
}

