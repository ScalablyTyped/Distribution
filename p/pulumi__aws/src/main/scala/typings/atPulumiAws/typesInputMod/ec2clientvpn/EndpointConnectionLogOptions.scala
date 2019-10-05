package typings.atPulumiAws.typesInputMod.ec2clientvpn

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointConnectionLogOptions extends js.Object {
  /**
    * The name of the CloudWatch Logs log group.
    */
  var cloudwatchLogGroup: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the CloudWatch Logs log stream to which the connection data is published.
    */
  var cloudwatchLogStream: js.UndefOr[Input[String]] = js.undefined
  /**
    * Indicates whether connection logging is enabled.
    */
  var enabled: Input[Boolean]
}

object EndpointConnectionLogOptions {
  @scala.inline
  def apply(
    enabled: Input[Boolean],
    cloudwatchLogGroup: Input[String] = null,
    cloudwatchLogStream: Input[String] = null
  ): EndpointConnectionLogOptions = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    if (cloudwatchLogGroup != null) __obj.updateDynamic("cloudwatchLogGroup")(cloudwatchLogGroup.asInstanceOf[js.Any])
    if (cloudwatchLogStream != null) __obj.updateDynamic("cloudwatchLogStream")(cloudwatchLogStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointConnectionLogOptions]
  }
}

