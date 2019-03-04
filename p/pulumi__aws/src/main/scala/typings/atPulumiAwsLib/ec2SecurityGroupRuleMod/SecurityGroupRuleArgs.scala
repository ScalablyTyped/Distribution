package typings
package atPulumiAwsLib.ec2SecurityGroupRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityGroupRuleArgs extends js.Object {
  /**
    * List of CIDR blocks. Cannot be specified with `source_security_group_id`.
    */
  val cidrBlocks: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Description of the rule.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The start port (or ICMP type number if protocol is "icmp").
    */
  val fromPort: atPulumiPulumiLib.outputMod.Input[scala.Double]
  /**
    * List of IPv6 CIDR blocks.
    */
  val ipv6CidrBlocks: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * List of prefix list IDs (for allowing access to VPC endpoints).
    * Only valid with `egress`.
    */
  val prefixListIds: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The protocol. If not icmp, tcp, udp, or all use the [protocol number](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
    */
  val protocol: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The security group to apply this rule to.
    */
  val securityGroupId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * If true, the security group itself will be added as
    * a source to this ingress rule.
    */
  val self: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The security group id to allow access to/from,
    * depending on the `type`. Cannot be specified with `cidr_blocks`.
    */
  val sourceSecurityGroupId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The end port (or ICMP code if protocol is "icmp").
    */
  val toPort: atPulumiPulumiLib.outputMod.Input[scala.Double]
  /**
    * The type of rule being created. Valid options are `ingress` (inbound)
    * or `egress` (outbound).
    */
  val `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object SecurityGroupRuleArgs {
  @scala.inline
  def apply(
    fromPort: atPulumiPulumiLib.outputMod.Input[scala.Double],
    protocol: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    securityGroupId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    toPort: atPulumiPulumiLib.outputMod.Input[scala.Double],
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    cidrBlocks: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    ipv6CidrBlocks: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    prefixListIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    self: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    sourceSecurityGroupId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
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

