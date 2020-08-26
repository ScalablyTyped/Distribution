package typings.pulumiAws.outputMod.ec2clientvpn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointConnectionLogOptions extends js.Object {
  /**
    * The name of the CloudWatch Logs log group.
    */
  var cloudwatchLogGroup: js.UndefOr[String] = js.native
  /**
    * The name of the CloudWatch Logs log stream to which the connection data is published.
    */
  var cloudwatchLogStream: js.UndefOr[String] = js.native
  /**
    * Indicates whether connection logging is enabled.
    */
  var enabled: Boolean = js.native
}

object EndpointConnectionLogOptions {
  @scala.inline
  def apply(enabled: Boolean): EndpointConnectionLogOptions = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointConnectionLogOptions]
  }
  @scala.inline
  implicit class EndpointConnectionLogOptionsOps[Self <: EndpointConnectionLogOptions] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloudwatchLogGroup(value: String): Self = this.set("cloudwatchLogGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudwatchLogGroup: Self = this.set("cloudwatchLogGroup", js.undefined)
    @scala.inline
    def setCloudwatchLogStream(value: String): Self = this.set("cloudwatchLogStream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudwatchLogStream: Self = this.set("cloudwatchLogStream", js.undefined)
  }
  
}

