package typings
package atPulumiAwsLib.ec2SecurityGroupRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/securityGroupRule", "SecurityGroupRule")
@js.native
class SecurityGroupRule protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a SecurityGroupRule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: SecurityGroupRuleArgs) = this()
  def this(name: java.lang.String, args: SecurityGroupRuleArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * List of CIDR blocks. Cannot be specified with `source_security_group_id`.
    */
  val cidrBlocks: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * Description of the rule.
    */
  val description: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The start port (or ICMP type number if protocol is "icmp").
    */
  val fromPort: atPulumiPulumiLib.atPulumiPulumiMod.Output[scala.Double] = js.native
  /**
    * List of IPv6 CIDR blocks.
    */
  val ipv6CidrBlocks: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * List of prefix list IDs (for allowing access to VPC endpoints).
    * Only valid with `egress`.
    */
  val prefixListIds: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * The protocol. If not icmp, tcp, udp, or all use the [protocol number](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
    */
  val protocol: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The security group to apply this rule to.
    */
  val securityGroupId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * If true, the security group itself will be added as
    * a source to this ingress rule.
    */
  val self: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The security group id to allow access to/from,
    * depending on the `type`. Cannot be specified with `cidr_blocks`.
    */
  val sourceSecurityGroupId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The end port (or ICMP code if protocol is "icmp").
    */
  val toPort: atPulumiPulumiLib.atPulumiPulumiMod.Output[scala.Double] = js.native
  /**
    * The type of rule being created. Valid options are `ingress` (inbound)
    * or `egress` (outbound).
    */
  val `type`: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/securityGroupRule", "SecurityGroupRule")
@js.native
object SecurityGroupRule extends js.Object {
  /**
    * Get an existing SecurityGroupRule resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2SecurityGroupRuleMod.SecurityGroupRule = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2SecurityGroupRuleMod.SecurityGroupRuleState
  ): atPulumiAwsLib.ec2SecurityGroupRuleMod.SecurityGroupRule = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2SecurityGroupRuleMod.SecurityGroupRuleState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2SecurityGroupRuleMod.SecurityGroupRule = js.native
}

