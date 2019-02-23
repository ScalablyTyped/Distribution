package typings
package atPulumiAwsLib.ec2NetworkAclRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkAclRuleArgs extends js.Object {
  /**
    * The network range to allow or deny, in CIDR notation (for example 172.16.0.0/24 ).
    */
  val cidrBlock: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Indicates whether this is an egress rule (rule is applied to traffic leaving the subnet). Default `false`.
    */
  val egress: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The from port to match.
    */
  val fromPort: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * ICMP protocol: The ICMP code. Required if specifying ICMP for the protocol. e.g. -1
    */
  val icmpCode: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * ICMP protocol: The ICMP type. Required if specifying ICMP for the protocol. e.g. -1
    */
  val icmpType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The IPv6 CIDR block to allow or deny.
    */
  val ipv6CidrBlock: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the network ACL.
    */
  val networkAclId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The protocol. A value of -1 means all protocols.
    */
  val protocol: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Indicates whether to allow or deny the traffic that matches the rule. Accepted values: `allow` | `deny`
    */
  val ruleAction: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The rule number for the entry (for example, 100). ACL entries are processed in ascending order by rule number.
    */
  val ruleNumber: atPulumiPulumiLib.outputMod.Input[scala.Double]
  /**
    * The to port to match.
    */
  val toPort: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

