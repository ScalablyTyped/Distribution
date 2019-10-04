package typings.atPulumiAws.ec2SecurityGroupRuleMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityGroupRuleArgs extends js.Object {
  /**
    * List of CIDR blocks. Cannot be specified with `sourceSecurityGroupId`.
    */
  val cidrBlocks: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Description of the rule.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * The start port (or ICMP type number if protocol is "icmp").
    */
  val fromPort: Input[Double]
  /**
    * List of IPv6 CIDR blocks.
    */
  val ipv6CidrBlocks: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * List of prefix list IDs (for allowing access to VPC endpoints).
    */
  val prefixListIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The protocol. If not icmp, tcp, udp, or all use the [protocol number](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
    */
  val protocol: Input[String]
  /**
    * The security group to apply this rule to.
    */
  val securityGroupId: Input[String]
  /**
    * If true, the security group itself will be added as
    * a source to this ingress rule. Cannot be specified with `sourceSecurityGroupId`.
    */
  val self: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The security group id to allow access to/from,
    * depending on the `type`. Cannot be specified with `cidrBlocks` and `self`.
    */
  val sourceSecurityGroupId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The end port (or ICMP code if protocol is "icmp").
    */
  val toPort: Input[Double]
  /**
    * The type of rule being created. Valid options are `ingress` (inbound)
    * or `egress` (outbound).
    */
  val `type`: Input[String]
}

object SecurityGroupRuleArgs {
  @scala.inline
  def apply(
    fromPort: Input[Double],
    protocol: Input[String],
    securityGroupId: Input[String],
    toPort: Input[Double],
    `type`: Input[String],
    cidrBlocks: Input[js.Array[Input[String]]] = null,
    description: Input[String] = null,
    ipv6CidrBlocks: Input[js.Array[Input[String]]] = null,
    prefixListIds: Input[js.Array[Input[String]]] = null,
    self: Input[Boolean] = null,
    sourceSecurityGroupId: Input[String] = null
  ): SecurityGroupRuleArgs = {
    val __obj = js.Dynamic.literal(fromPort = fromPort.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], securityGroupId = securityGroupId.asInstanceOf[js.Any], toPort = toPort.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (cidrBlocks != null) __obj.updateDynamic("cidrBlocks")(cidrBlocks.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (ipv6CidrBlocks != null) __obj.updateDynamic("ipv6CidrBlocks")(ipv6CidrBlocks.asInstanceOf[js.Any])
    if (prefixListIds != null) __obj.updateDynamic("prefixListIds")(prefixListIds.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (sourceSecurityGroupId != null) __obj.updateDynamic("sourceSecurityGroupId")(sourceSecurityGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGroupRuleArgs]
  }
}

