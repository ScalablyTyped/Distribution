package typings.atPulumiAws.typesOutputMod.ec2clientvpnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointConnectionLogOptions extends js.Object {
  /**
    * The name of the CloudWatch Logs log group.
    */
  var cloudwatchLogGroup: js.UndefOr[String] = js.undefined
  /**
    * The name of the CloudWatch Logs log stream to which the connection data is published.
    */
  var cloudwatchLogStream: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether connection logging is enabled.
    */
  var enabled: Boolean
}

object EndpointConnectionLogOptions {
  @scala.inline
  def apply(enabled: Boolean, cloudwatchLogGroup: String = null, cloudwatchLogStream: String = null): EndpointConnectionLogOptions = {
    val __obj = js.Dynamic.literal(enabled = enabled)
    if (cloudwatchLogGroup != null) __obj.updateDynamic("cloudwatchLogGroup")(cloudwatchLogGroup)
    if (cloudwatchLogStream != null) __obj.updateDynamic("cloudwatchLogStream")(cloudwatchLogStream)
    __obj.asInstanceOf[EndpointConnectionLogOptions]
  }
}

