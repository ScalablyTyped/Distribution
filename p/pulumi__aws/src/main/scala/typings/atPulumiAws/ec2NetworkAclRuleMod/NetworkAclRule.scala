package typings.atPulumiAws.ec2NetworkAclRuleMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/networkAclRule", "NetworkAclRule")
@js.native
class NetworkAclRule protected () extends CustomResource {
  /**
    * Create a NetworkAclRule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: NetworkAclRuleArgs) = this()
  def this(name: String, args: NetworkAclRuleArgs, opts: CustomResourceOptions) = this()
  /**
    * The network range to allow or deny, in CIDR notation (for example 172.16.0.0/24 ).
    */
  val cidrBlock: Output[js.UndefOr[String]] = js.native
  /**
    * Indicates whether this is an egress rule (rule is applied to traffic leaving the subnet). Default `false`.
    */
  val egress: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The from port to match.
    */
  val fromPort: Output[js.UndefOr[Double]] = js.native
  /**
    * ICMP protocol: The ICMP code. Required if specifying ICMP for the protocol. e.g. -1
    */
  val icmpCode: Output[js.UndefOr[String]] = js.native
  /**
    * ICMP protocol: The ICMP type. Required if specifying ICMP for the protocol. e.g. -1
    */
  val icmpType: Output[js.UndefOr[String]] = js.native
  /**
    * The IPv6 CIDR block to allow or deny.
    */
  val ipv6CidrBlock: Output[js.UndefOr[String]] = js.native
  /**
    * The ID of the network ACL.
    */
  val networkAclId: Output[String] = js.native
  /**
    * The protocol. A value of -1 means all protocols.
    */
  val protocol: Output[String] = js.native
  /**
    * Indicates whether to allow or deny the traffic that matches the rule. Accepted values: `allow` | `deny`
    */
  val ruleAction: Output[String] = js.native
  /**
    * The rule number for the entry (for example, 100). ACL entries are processed in ascending order by rule number.
    */
  val ruleNumber: Output[Double] = js.native
  /**
    * The to port to match.
    */
  val toPort: Output[js.UndefOr[Double]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/networkAclRule", "NetworkAclRule")
@js.native
object NetworkAclRule extends js.Object {
  /**
    * Get an existing NetworkAclRule resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): NetworkAclRule = js.native
  def get(name: String, id: Input[ID], state: NetworkAclRuleState): NetworkAclRule = js.native
  def get(name: String, id: Input[ID], state: NetworkAclRuleState, opts: CustomResourceOptions): NetworkAclRule = js.native
  /**
    * Returns true if the given object is an instance of NetworkAclRule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/networkAclRule.NetworkAclRule */ Boolean = js.native
}

