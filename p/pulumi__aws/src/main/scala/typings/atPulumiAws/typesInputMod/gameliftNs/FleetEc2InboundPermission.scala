package typings.atPulumiAws.typesInputMod.gameliftNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FleetEc2InboundPermission extends js.Object {
  /**
    * Starting value for a range of allowed port numbers.
    */
  var fromPort: Input[Double]
  /**
    * Range of allowed IP addresses expressed in CIDR notation. e.g. `000.000.000.000/[subnet mask]` or `0.0.0.0/[subnet mask]`.
    */
  var ipRange: Input[String]
  /**
    * Network communication protocol used by the fleet. e.g. `TCP` or `UDP`
    */
  var protocol: Input[String]
  /**
    * Ending value for a range of allowed port numbers. Port numbers are end-inclusive. This value must be higher than `fromPort`.
    */
  var toPort: Input[Double]
}

object FleetEc2InboundPermission {
  @scala.inline
  def apply(fromPort: Input[Double], ipRange: Input[String], protocol: Input[String], toPort: Input[Double]): FleetEc2InboundPermission = {
    val __obj = js.Dynamic.literal(fromPort = fromPort.asInstanceOf[js.Any], ipRange = ipRange.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], toPort = toPort.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FleetEc2InboundPermission]
  }
}

