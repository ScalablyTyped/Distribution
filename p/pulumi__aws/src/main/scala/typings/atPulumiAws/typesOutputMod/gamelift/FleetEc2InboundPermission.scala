package typings.atPulumiAws.typesOutputMod.gamelift

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FleetEc2InboundPermission extends js.Object {
  /**
    * Starting value for a range of allowed port numbers.
    */
  var fromPort: Double
  /**
    * Range of allowed IP addresses expressed in CIDR notation. e.g. `000.000.000.000/[subnet mask]` or `0.0.0.0/[subnet mask]`.
    */
  var ipRange: String
  /**
    * Network communication protocol used by the fleet. e.g. `TCP` or `UDP`
    */
  var protocol: String
  /**
    * Ending value for a range of allowed port numbers. Port numbers are end-inclusive. This value must be higher than `fromPort`.
    */
  var toPort: Double
}

object FleetEc2InboundPermission {
  @scala.inline
  def apply(fromPort: Double, ipRange: String, protocol: String, toPort: Double): FleetEc2InboundPermission = {
    val __obj = js.Dynamic.literal(fromPort = fromPort, ipRange = ipRange, protocol = protocol, toPort = toPort)
  
    __obj.asInstanceOf[FleetEc2InboundPermission]
  }
}

