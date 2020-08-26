package typings.pulumiAws.inputMod.gamelift

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetEc2InboundPermission extends js.Object {
  /**
    * Starting value for a range of allowed port numbers.
    */
  var fromPort: Input[Double] = js.native
  /**
    * Range of allowed IP addresses expressed in CIDR notation. e.g. `000.000.000.000/[subnet mask]` or `0.0.0.0/[subnet mask]`.
    */
  var ipRange: Input[String] = js.native
  /**
    * Network communication protocol used by the fleet. e.g. `TCP` or `UDP`
    */
  var protocol: Input[String] = js.native
  /**
    * Ending value for a range of allowed port numbers. Port numbers are end-inclusive. This value must be higher than `fromPort`.
    */
  var toPort: Input[Double] = js.native
}

object FleetEc2InboundPermission {
  @scala.inline
  def apply(fromPort: Input[Double], ipRange: Input[String], protocol: Input[String], toPort: Input[Double]): FleetEc2InboundPermission = {
    val __obj = js.Dynamic.literal(fromPort = fromPort.asInstanceOf[js.Any], ipRange = ipRange.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], toPort = toPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetEc2InboundPermission]
  }
  @scala.inline
  implicit class FleetEc2InboundPermissionOps[Self <: FleetEc2InboundPermission] (val x: Self) extends AnyVal {
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
    def setFromPort(value: Input[Double]): Self = this.set("fromPort", value.asInstanceOf[js.Any])
    @scala.inline
    def setIpRange(value: Input[String]): Self = this.set("ipRange", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: Input[String]): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setToPort(value: Input[Double]): Self = this.set("toPort", value.asInstanceOf[js.Any])
  }
  
}

