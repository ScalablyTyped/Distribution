package typings.pulumiAws.networkAclRuleMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  val cidrBlock: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Indicates whether this is an egress rule (rule is applied to traffic leaving the subnet). Default `false`.
    */
  val egress: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The from port to match.
    */
  val fromPort: Output_[js.UndefOr[Double]] = js.native
  
  /**
    * ICMP protocol: The ICMP code. Required if specifying ICMP for the protocol. e.g. -1
    */
  val icmpCode: Output_[js.UndefOr[String]] = js.native
  
  /**
    * ICMP protocol: The ICMP type. Required if specifying ICMP for the protocol. e.g. -1
    */
  val icmpType: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The IPv6 CIDR block to allow or deny.
    */
  val ipv6CidrBlock: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The ID of the network ACL.
    */
  val networkAclId: Output_[String] = js.native
  
  /**
    * The protocol. A value of -1 means all protocols.
    */
  val protocol: Output_[String] = js.native
  
  /**
    * Indicates whether to allow or deny the traffic that matches the rule. Accepted values: `allow` | `deny`
    */
  val ruleAction: Output_[String] = js.native
  
  /**
    * The rule number for the entry (for example, 100). ACL entries are processed in ascending order by rule number.
    */
  val ruleNumber: Output_[Double] = js.native
  
  /**
    * The to port to match.
    */
  val toPort: Output_[js.UndefOr[Double]] = js.native
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): NetworkAclRule = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): NetworkAclRule = js.native
  def get(name: String, id: Input[ID], state: NetworkAclRuleState): NetworkAclRule = js.native
  def get(name: String, id: Input[ID], state: NetworkAclRuleState, opts: CustomResourceOptions): NetworkAclRule = js.native
  
  /**
    * Returns true if the given object is an instance of NetworkAclRule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/networkAclRule.NetworkAclRule */ Boolean = js.native
}
