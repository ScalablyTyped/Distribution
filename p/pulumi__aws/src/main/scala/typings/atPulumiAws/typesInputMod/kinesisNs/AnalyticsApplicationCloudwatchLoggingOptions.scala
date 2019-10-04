package typings.atPulumiAws.typesInputMod.kinesisNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationCloudwatchLoggingOptions extends js.Object {
  /**
    * The ARN of the Kinesis Analytics Application.
    */
  var id: js.UndefOr[Input[String]] = js.undefined
  var logStreamArn: Input[String]
  var roleArn: Input[String]
}

object AnalyticsApplicationCloudwatchLoggingOptions {
  @scala.inline
  def apply(logStreamArn: Input[String], roleArn: Input[String], id: Input[String] = null): AnalyticsApplicationCloudwatchLoggingOptions = {
    val __obj = js.Dynamic.literal(logStreamArn = logStreamArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationCloudwatchLoggingOptions]
  }
}

