package typings.pulumiAws.route53Mod

import typings.pulumiAws.delegationSetMod.DelegationSetArgs
import typings.pulumiAws.delegationSetMod.DelegationSetState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/route53", "DelegationSet")
@js.native
class DelegationSet protected ()
  extends typings.pulumiAws.delegationSetMod.DelegationSet {
  /**
    * Create a DelegationSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: DelegationSetArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: DelegationSetArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/aws/route53", "DelegationSet")
@js.native
object DelegationSet extends js.Object {
  
  /**
    * Get an existing DelegationSet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.delegationSetMod.DelegationSet = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.delegationSetMod.DelegationSet = js.native
  def get(name: String, id: Input[ID], state: DelegationSetState): typings.pulumiAws.delegationSetMod.DelegationSet = js.native
  def get(name: String, id: Input[ID], state: DelegationSetState, opts: CustomResourceOptions): typings.pulumiAws.delegationSetMod.DelegationSet = js.native
  
  /**
    * Returns true if the given object is an instance of DelegationSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/delegationSet.DelegationSet */ Boolean = js.native
}
