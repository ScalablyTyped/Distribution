package typings
package atPulumiAwsLib.ec2SecurityGroupRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityGroupRuleState extends js.Object {
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
  val fromPort: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
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
  val protocol: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The security group to apply this rule to.
    */
  val securityGroupId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
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
  val toPort: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The type of rule being created. Valid options are `ingress` (inbound)
    * or `egress` (outbound).
    */
  val `type`: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

