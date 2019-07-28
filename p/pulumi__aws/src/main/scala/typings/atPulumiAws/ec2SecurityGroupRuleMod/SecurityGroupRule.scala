package typings.atPulumiAws.ec2SecurityGroupRuleMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/securityGroupRule", "SecurityGroupRule")
@js.native
class SecurityGroupRule protected () extends CustomResource {
  /**
    * Create a SecurityGroupRule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SecurityGroupRuleArgs) = this()
  def this(name: String, args: SecurityGroupRuleArgs, opts: CustomResourceOptions) = this()
  /**
    * List of CIDR blocks. Cannot be specified with `source_security_group_id`.
    */
  val cidrBlocks: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * Description of the rule.
    */
  val description: Output[js.UndefOr[String]] = js.native
  /**
    * The start port (or ICMP type number if protocol is "icmp").
    */
  val fromPort: Output[Double] = js.native
  /**
    * List of IPv6 CIDR blocks.
    */
  val ipv6CidrBlocks: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * List of prefix list IDs (for allowing access to VPC endpoints).
    * Only valid with `egress`.
    */
  val prefixListIds: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The protocol. If not icmp, tcp, udp, or all use the [protocol number](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
    */
  val protocol: Output[String] = js.native
  /**
    * The security group to apply this rule to.
    */
  val securityGroupId: Output[String] = js.native
  /**
    * If true, the security group itself will be added as
    * a source to this ingress rule.
    */
  val self: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The security group id to allow access to/from,
    * depending on the `type`. Cannot be specified with `cidr_blocks`.
    */
  val sourceSecurityGroupId: Output[String] = js.native
  /**
    * The end port (or ICMP code if protocol is "icmp").
    */
  val toPort: Output[Double] = js.native
  /**
    * The type of rule being created. Valid options are `ingress` (inbound)
    * or `egress` (outbound).
    */
  val `type`: Output[String] = js.native
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
  def get(name: String, id: Input[ID]): SecurityGroupRule = js.native
  def get(name: String, id: Input[ID], state: SecurityGroupRuleState): SecurityGroupRule = js.native
  def get(name: String, id: Input[ID], state: SecurityGroupRuleState, opts: CustomResourceOptions): SecurityGroupRule = js.native
  /**
    * Returns true if the given object is an instance of SecurityGroupRule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/securityGroupRule.SecurityGroupRule */ Boolean = js.native
}

