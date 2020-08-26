package typings.pulumiAws.inputMod.apigateway

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StageAccessLogSettings extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or Kinesis Data Firehose delivery stream to receive access logs. If you specify a Kinesis Data Firehose delivery stream, the stream name must begin with `amazon-apigateway-`. Automatically removes trailing `:*` if present.
    */
  var destinationArn: Input[String] = js.native
  /**
    * The formatting and values recorded in the logs.
    * For more information on configuring the log format rules visit the AWS [documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html)
    */
  var format: Input[String] = js.native
}

object StageAccessLogSettings {
  @scala.inline
  def apply(destinationArn: Input[String], format: Input[String]): StageAccessLogSettings = {
    val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[StageAccessLogSettings]
  }
  @scala.inline
  implicit class StageAccessLogSettingsOps[Self <: StageAccessLogSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestinationArn(value: Input[String]): Self = this.set("destinationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: Input[String]): Self = this.set("format", value.asInstanceOf[js.Any])
  }
  
}

