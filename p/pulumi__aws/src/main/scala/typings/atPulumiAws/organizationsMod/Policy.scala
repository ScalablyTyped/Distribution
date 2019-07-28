package typings.atPulumiAws.organizationsMod

import typings.atPulumiAws.organizationsPolicyMod.PolicyArgs
import typings.atPulumiAws.organizationsPolicyMod.PolicyState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/organizations", "Policy")
@js.native
class Policy protected ()
  extends typings.atPulumiAws.organizationsPolicyMod.Policy {
  /**
    * Create a Policy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PolicyArgs) = this()
  def this(name: String, args: PolicyArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/organizations", "Policy")
@js.native
object Policy extends js.Object {
  /**
    * Get an existing Policy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.organizationsPolicyMod.Policy = js.native
  def get(name: String, id: Input[ID], state: PolicyState): typings.atPulumiAws.organizationsPolicyMod.Policy = js.native
  def get(name: String, id: Input[ID], state: PolicyState, opts: CustomResourceOptions): typings.atPulumiAws.organizationsPolicyMod.Policy = js.native
  /**
    * Returns true if the given object is an instance of Policy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/organizations/policy.Policy */ Boolean = js.native
}

