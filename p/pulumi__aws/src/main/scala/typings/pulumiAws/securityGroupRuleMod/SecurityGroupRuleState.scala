package typings.pulumiAws.securityGroupRuleMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityGroupRuleState extends js.Object {
  /**
    * List of CIDR blocks. Cannot be specified with `sourceSecurityGroupId`.
    */
  val cidrBlocks: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Description of the rule.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The start port (or ICMP type number if protocol is "icmp" or "icmpv6").
    */
  val fromPort: js.UndefOr[Input[Double]] = js.native
  /**
    * List of IPv6 CIDR blocks.
    */
  val ipv6CidrBlocks: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * List of prefix list IDs (for allowing access to VPC endpoints).
    * Only valid with `egress`.
    */
  val prefixListIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The protocol. If not icmp, icmpv6, tcp, udp, or all use the [protocol number](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
    */
  val protocol: js.UndefOr[Input[String]] = js.native
  /**
    * The security group to apply this rule to.
    */
  val securityGroupId: js.UndefOr[Input[String]] = js.native
  /**
    * If true, the security group itself will be added as
    * a source to this ingress rule. Cannot be specified with `sourceSecurityGroupId`.
    */
  val self: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The security group id to allow access to/from,
    * depending on the `type`. Cannot be specified with `cidrBlocks` and `self`.
    */
  val sourceSecurityGroupId: js.UndefOr[Input[String]] = js.native
  /**
    * The end port (or ICMP code if protocol is "icmp").
    */
  val toPort: js.UndefOr[Input[Double]] = js.native
  /**
    * The type of rule being created. Valid options are `ingress` (inbound)
    * or `egress` (outbound).
    */
  val `type`: js.UndefOr[Input[String]] = js.native
}

object SecurityGroupRuleState {
  @scala.inline
  def apply(
    cidrBlocks: Input[js.Array[Input[String]]] = null,
    description: Input[String] = null,
    fromPort: Input[Double] = null,
    ipv6CidrBlocks: Input[js.Array[Input[String]]] = null,
    prefixListIds: Input[js.Array[Input[String]]] = null,
    protocol: Input[String] = null,
    securityGroupId: Input[String] = null,
    self: Input[Boolean] = null,
    sourceSecurityGroupId: Input[String] = null,
    toPort: Input[Double] = null,
    `type`: Input[String] = null
  ): SecurityGroupRuleState = {
    val __obj = js.Dynamic.literal()
    if (cidrBlocks != null) __obj.updateDynamic("cidrBlocks")(cidrBlocks.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (fromPort != null) __obj.updateDynamic("fromPort")(fromPort.asInstanceOf[js.Any])
    if (ipv6CidrBlocks != null) __obj.updateDynamic("ipv6CidrBlocks")(ipv6CidrBlocks.asInstanceOf[js.Any])
    if (prefixListIds != null) __obj.updateDynamic("prefixListIds")(prefixListIds.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (securityGroupId != null) __obj.updateDynamic("securityGroupId")(securityGroupId.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (sourceSecurityGroupId != null) __obj.updateDynamic("sourceSecurityGroupId")(sourceSecurityGroupId.asInstanceOf[js.Any])
    if (toPort != null) __obj.updateDynamic("toPort")(toPort.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGroupRuleState]
  }
}

