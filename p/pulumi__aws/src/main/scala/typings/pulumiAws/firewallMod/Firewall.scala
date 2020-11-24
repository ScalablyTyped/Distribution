package typings.pulumiAws.firewallMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.networkfirewall.FirewallSubnetMapping
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/networkfirewall/firewall", "Firewall")
@js.native
class Firewall protected () extends CustomResource {
  /**
    * Create a Firewall resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: FirewallArgs) = this()
  def this(name: String, args: FirewallArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The Amazon Resource Name (ARN) that identifies the firewall.
    */
  val arn: Output_[String] = js.native
  
  /**
    * A boolean flag indicating whether it is possible to delete the firewall. Defaults to `false`.
    */
  val deleteProtection: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * A friendly description of the firewall.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the VPC Firewall policy.
    */
  val firewallPolicyArn: Output_[String] = js.native
  
  /**
    * A boolean flag indicating whether it is possible to change the associated firewall policy. Defaults to `false`.
    */
  val firewallPolicyChangeProtection: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * A friendly name of the firewall.
    */
  val name: Output_[String] = js.native
  
  /**
    * A boolean flag indicating whether it is possible to change the associated subnet(s). Defaults to `false`.
    */
  val subnetChangeProtection: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * Set of configuration blocks describing the public subnets. Each subnet must belong to a different Availability Zone in the VPC. AWS Network Firewall creates a firewall endpoint in each subnet. See Subnet Mapping below for details.
    */
  val subnetMappings: Output_[js.Array[FirewallSubnetMapping]] = js.native
  
  /**
    * The key:value pairs to associate with the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * A string token used when updating a firewall.
    */
  val updateToken: Output_[String] = js.native
  
  /**
    * The unique identifier of the VPC where AWS Network Firewall should create the firewall.
    */
  val vpcId: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/networkfirewall/firewall", "Firewall")
@js.native
object Firewall extends js.Object {
  
  /**
    * Get an existing Firewall resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Firewall = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Firewall = js.native
  def get(name: String, id: Input[ID], state: FirewallState): Firewall = js.native
  def get(name: String, id: Input[ID], state: FirewallState, opts: CustomResourceOptions): Firewall = js.native
  
  /**
    * Returns true if the given object is an instance of Firewall.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/networkfirewall/firewall.Firewall */ Boolean = js.native
}
