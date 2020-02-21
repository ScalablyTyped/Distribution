package typings.pulumiAws.securityGroupRuleMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
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
    * List of CIDR blocks. Cannot be specified with `sourceSecurityGroupId`.
    */
  val cidrBlocks: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * Description of the rule.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * The start port (or ICMP type number if protocol is "icmp" or "icmpv6").
    */
  val fromPort: Output_[Double] = js.native
  /**
    * List of IPv6 CIDR blocks.
    */
  val ipv6CidrBlocks: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * List of prefix list IDs (for allowing access to VPC endpoints).
    * Only valid with `egress`.
    */
  val prefixListIds: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The protocol. If not icmp, icmpv6, tcp, udp, or all use the [protocol number](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
    */
  val protocol: Output_[String] = js.native
  /**
    * The security group to apply this rule to.
    */
  val securityGroupId: Output_[String] = js.native
  /**
    * If true, the security group itself will be added as
    * a source to this ingress rule. Cannot be specified with `sourceSecurityGroupId`.
    */
  val self: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * The security group id to allow access to/from,
    * depending on the `type`. Cannot be specified with `cidrBlocks` and `self`.
    */
  val sourceSecurityGroupId: Output_[String] = js.native
  /**
    * The end port (or ICMP code if protocol is "icmp").
    */
  val toPort: Output_[Double] = js.native
  /**
    * The type of rule being created. Valid options are `ingress` (inbound)
    * or `egress` (outbound).
    */
  val `type`: Output_[String] = js.native
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

