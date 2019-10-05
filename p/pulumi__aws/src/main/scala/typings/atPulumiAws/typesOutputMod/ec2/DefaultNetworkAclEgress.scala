package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultNetworkAclEgress extends js.Object {
  /**
    * The action to take.
    */
  var action: String
  /**
    * The CIDR block to match. This must be a
    * valid network mask.
    */
  var cidrBlock: js.UndefOr[String] = js.undefined
  /**
    * The from port to match.
    */
  var fromPort: Double
  /**
    * The ICMP type code to be used. Default 0.
    */
  var icmpCode: js.UndefOr[Double] = js.undefined
  /**
    * The ICMP type to be used. Default 0.
    */
  var icmpType: js.UndefOr[Double] = js.undefined
  /**
    * The IPv6 CIDR block.
    */
  var ipv6CidrBlock: js.UndefOr[String] = js.undefined
  /**
    * The protocol to match. If using the -1 'all'
    * protocol, you must specify a from and to port of 0.
    */
  var protocol: String
  /**
    * The rule number. Used for ordering.
    */
  var ruleNo: Double
  /**
    * The to port to match.
    */
  var toPort: Double
}

object DefaultNetworkAclEgress {
  @scala.inline
  def apply(
    action: String,
    fromPort: Double,
    protocol: String,
    ruleNo: Double,
    toPort: Double,
    cidrBlock: String = null,
    icmpCode: Int | Double = null,
    icmpType: Int | Double = null,
    ipv6CidrBlock: String = null
  ): DefaultNetworkAclEgress = {
    val __obj = js.Dynamic.literal(action = action, fromPort = fromPort, protocol = protocol, ruleNo = ruleNo, toPort = toPort)
    if (cidrBlock != null) __obj.updateDynamic("cidrBlock")(cidrBlock)
    if (icmpCode != null) __obj.updateDynamic("icmpCode")(icmpCode.asInstanceOf[js.Any])
    if (icmpType != null) __obj.updateDynamic("icmpType")(icmpType.asInstanceOf[js.Any])
    if (ipv6CidrBlock != null) __obj.updateDynamic("ipv6CidrBlock")(ipv6CidrBlock)
    __obj.asInstanceOf[DefaultNetworkAclEgress]
  }
}

