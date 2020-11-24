package typings.pulumiAws.firewallPolicyMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.networkfirewall.FirewallPolicyFirewallPolicy
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/networkfirewall/firewallPolicy", "FirewallPolicy")
@js.native
class FirewallPolicy protected () extends CustomResource {
  /**
    * Create a FirewallPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: FirewallPolicyArgs) = this()
  def this(name: String, args: FirewallPolicyArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The Amazon Resource Name (ARN) that identifies the firewall policy.
    */
  val arn: Output_[String] = js.native
  
  /**
    * A friendly description of the firewall policy.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * A configuration block describing the rule groups and policy actions to use in the firewall policy. See Firewall Policy below for details.
    */
  val firewallPolicy: Output_[FirewallPolicyFirewallPolicy] = js.native
  
  /**
    * A friendly name of the firewall policy.
    */
  val name: Output_[String] = js.native
  
  /**
    * An array of key:value pairs to associate with the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * A string token used when updating a firewall policy.
    */
  val updateToken: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/networkfirewall/firewallPolicy", "FirewallPolicy")
@js.native
object FirewallPolicy extends js.Object {
  
  /**
    * Get an existing FirewallPolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): FirewallPolicy = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): FirewallPolicy = js.native
  def get(name: String, id: Input[ID], state: FirewallPolicyState): FirewallPolicy = js.native
  def get(name: String, id: Input[ID], state: FirewallPolicyState, opts: CustomResourceOptions): FirewallPolicy = js.native
  
  /**
    * Returns true if the given object is an instance of FirewallPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/networkfirewall/firewallPolicy.FirewallPolicy */ Boolean = js.native
}
