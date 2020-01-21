package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkAclEgress extends js.Object {
  /**
    * The action to take.
    */
  var action: Input[String] = js.native
  /**
    * The CIDR block to match. This must be a
    * valid network mask.
    */
  var cidrBlock: js.UndefOr[Input[String]] = js.native
  /**
    * The from port to match.
    */
  var fromPort: Input[Double] = js.native
  /**
    * The ICMP type code to be used. Default 0.
    */
  var icmpCode: js.UndefOr[Input[Double]] = js.native
  /**
    * The ICMP type to be used. Default 0.
    */
  var icmpType: js.UndefOr[Input[Double]] = js.native
  /**
    * The IPv6 CIDR block.
    */
  var ipv6CidrBlock: js.UndefOr[Input[String]] = js.native
  /**
    * The protocol to match. If using the -1 'all'
    * protocol, you must specify a from and to port of 0.
    */
  var protocol: Input[String] = js.native
  /**
    * The rule number. Used for ordering.
    */
  var ruleNo: Input[Double] = js.native
  /**
    * The to port to match.
    */
  var toPort: Input[Double] = js.native
}

object NetworkAclEgress {
  @scala.inline
  def apply(
    action: Input[String],
    fromPort: Input[Double],
    protocol: Input[String],
    ruleNo: Input[Double],
    toPort: Input[Double],
    cidrBlock: Input[String] = null,
    icmpCode: Input[Double] = null,
    icmpType: Input[Double] = null,
    ipv6CidrBlock: Input[String] = null
  ): NetworkAclEgress = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], fromPort = fromPort.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], ruleNo = ruleNo.asInstanceOf[js.Any], toPort = toPort.asInstanceOf[js.Any])
    if (cidrBlock != null) __obj.updateDynamic("cidrBlock")(cidrBlock.asInstanceOf[js.Any])
    if (icmpCode != null) __obj.updateDynamic("icmpCode")(icmpCode.asInstanceOf[js.Any])
    if (icmpType != null) __obj.updateDynamic("icmpType")(icmpType.asInstanceOf[js.Any])
    if (ipv6CidrBlock != null) __obj.updateDynamic("ipv6CidrBlock")(ipv6CidrBlock.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkAclEgress]
  }
}

