package typings.pulumiAws.outputMod.gamelift

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetEc2InboundPermission extends js.Object {
  /**
    * Starting value for a range of allowed port numbers.
    */
  var fromPort: Double = js.native
  /**
    * Range of allowed IP addresses expressed in CIDR notation. e.g. `000.000.000.000/[subnet mask]` or `0.0.0.0/[subnet mask]`.
    */
  var ipRange: String = js.native
  /**
    * Network communication protocol used by the fleet. e.g. `TCP` or `UDP`
    */
  var protocol: String = js.native
  /**
    * Ending value for a range of allowed port numbers. Port numbers are end-inclusive. This value must be higher than `fromPort`.
    */
  var toPort: Double = js.native
}

object FleetEc2InboundPermission {
  @scala.inline
  def apply(fromPort: Double, ipRange: String, protocol: String, toPort: Double): FleetEc2InboundPermission = {
    val __obj = js.Dynamic.literal(fromPort = fromPort.asInstanceOf[js.Any], ipRange = ipRange.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], toPort = toPort.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FleetEc2InboundPermission]
  }
}

