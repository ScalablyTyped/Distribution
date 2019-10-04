package typings.atPulumiAws.typesOutputMod.kinesisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationOutput extends js.Object {
  /**
    * The ARN of the Kinesis Analytics Application.
    */
  var id: String
  var kinesisFirehose: js.UndefOr[AnalyticsApplicationOutputKinesisFirehose] = js.undefined
  var kinesisStream: js.UndefOr[AnalyticsApplicationOutputKinesisStream] = js.undefined
  var lambda: js.UndefOr[AnalyticsApplicationOutputLambda] = js.undefined
  /**
    * Name of the Kinesis Analytics Application.
    */
  var name: String
  var schema: AnalyticsApplicationOutputSchema
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
    val __obj = js.Dynamic.literal(id = id, name = name, schema = schema)
    if (kinesisFirehose != null) __obj.updateDynamic("kinesisFirehose")(kinesisFirehose)
    if (kinesisStream != null) __obj.updateDynamic("kinesisStream")(kinesisStream)
    if (lambda != null) __obj.updateDynamic("lambda")(lambda)
    __obj.asInstanceOf[AnalyticsApplicationOutput]
  }
}

