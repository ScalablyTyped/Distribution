package typings.pulumiAws.iamMod

import typings.pulumiAws.groupPolicyMod.GroupPolicyArgs
import typings.pulumiAws.groupPolicyMod.GroupPolicyState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/iam", "GroupPolicy")
@js.native
class GroupPolicy protected ()
  extends typings.pulumiAws.groupPolicyMod.GroupPolicy {
  /**
    * Create a GroupPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: GroupPolicyArgs) = this()
  def this(name: String, args: GroupPolicyArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object GroupPolicy {
  
  /**
    * Get an existing GroupPolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws/iam", "GroupPolicy.get")
  @js.native
  def get(name: String, id: Input[ID]): typings.pulumiAws.groupPolicyMod.GroupPolicy = js.native
  @JSImport("@pulumi/aws/iam", "GroupPolicy.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.groupPolicyMod.GroupPolicy = js.native
  @JSImport("@pulumi/aws/iam", "GroupPolicy.get")
  @js.native
  def get(name: String, id: Input[ID], state: GroupPolicyState): typings.pulumiAws.groupPolicyMod.GroupPolicy = js.native
  @JSImport("@pulumi/aws/iam", "GroupPolicy.get")
  @js.native
  def get(name: String, id: Input[ID], state: GroupPolicyState, opts: CustomResourceOptions): typings.pulumiAws.groupPolicyMod.GroupPolicy = js.native
  
  /**
    * Returns true if the given object is an instance of GroupPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws/iam", "GroupPolicy.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/groupPolicy.GroupPolicy */ Boolean = js.native
}
