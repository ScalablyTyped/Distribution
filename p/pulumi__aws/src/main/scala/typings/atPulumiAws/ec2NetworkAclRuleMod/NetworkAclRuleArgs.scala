package typings.atPulumiAws.ec2NetworkAclRuleMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkAclRuleArgs extends js.Object {
  /**
    * The network range to allow or deny, in CIDR notation (for example 172.16.0.0/24 ).
    */
  val cidrBlock: js.UndefOr[Input[String]] = js.undefined
  /**
    * Indicates whether this is an egress rule (rule is applied to traffic leaving the subnet). Default `false`.
    */
  val egress: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The from port to match.
    */
  val fromPort: js.UndefOr[Input[Double]] = js.undefined
  /**
    * ICMP protocol: The ICMP code. Required if specifying ICMP for the protocol. e.g. -1
    */
  val icmpCode: js.UndefOr[Input[String]] = js.undefined
  /**
    * ICMP protocol: The ICMP type. Required if specifying ICMP for the protocol. e.g. -1
    */
  val icmpType: js.UndefOr[Input[String]] = js.undefined
  /**
    * The IPv6 CIDR block to allow or deny.
    */
  val ipv6CidrBlock: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ID of the network ACL.
    */
  val networkAclId: Input[String]
  /**
    * The protocol. A value of -1 means all protocols.
    */
  val protocol: Input[String]
  /**
    * Indicates whether to allow or deny the traffic that matches the rule. Accepted values: `allow` | `deny`
    */
  val ruleAction: Input[String]
  /**
    * The rule number for the entry (for example, 100). ACL entries are processed in ascending order by rule number.
    */
  val ruleNumber: Input[Double]
  /**
    * The to port to match.
    */
  val toPort: js.UndefOr[Input[Double]] = js.undefined
}

object NetworkAclRuleArgs {
  @scala.inline
  def apply(
    networkAclId: Input[String],
    protocol: Input[String],
    ruleAction: Input[String],
    ruleNumber: Input[Double],
    cidrBlock: Input[String] = null,
    egress: Input[Boolean] = null,
    fromPort: Input[Double] = null,
    icmpCode: Input[String] = null,
    icmpType: Input[String] = null,
    ipv6CidrBlock: Input[String] = null,
    toPort: Input[Double] = null
  ): NetworkAclRuleArgs = {
    val __obj = js.Dynamic.literal(networkAclId = networkAclId.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], ruleAction = ruleAction.asInstanceOf[js.Any], ruleNumber = ruleNumber.asInstanceOf[js.Any])
    if (cidrBlock != null) __obj.updateDynamic("cidrBlock")(cidrBlock.asInstanceOf[js.Any])
    if (egress != null) __obj.updateDynamic("egress")(egress.asInstanceOf[js.Any])
    if (fromPort != null) __obj.updateDynamic("fromPort")(fromPort.asInstanceOf[js.Any])
    if (icmpCode != null) __obj.updateDynamic("icmpCode")(icmpCode.asInstanceOf[js.Any])
    if (icmpType != null) __obj.updateDynamic("icmpType")(icmpType.asInstanceOf[js.Any])
    if (ipv6CidrBlock != null) __obj.updateDynamic("ipv6CidrBlock")(ipv6CidrBlock.asInstanceOf[js.Any])
    if (toPort != null) __obj.updateDynamic("toPort")(toPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkAclRuleArgs]
  }
}

