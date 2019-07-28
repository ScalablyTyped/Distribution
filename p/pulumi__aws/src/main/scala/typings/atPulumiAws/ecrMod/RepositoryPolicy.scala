package typings.atPulumiAws.ecrMod

import typings.atPulumiAws.ecrRepositoryPolicyMod.RepositoryPolicyArgs
import typings.atPulumiAws.ecrRepositoryPolicyMod.RepositoryPolicyState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ecr", "RepositoryPolicy")
@js.native
class RepositoryPolicy protected ()
  extends typings.atPulumiAws.ecrRepositoryPolicyMod.RepositoryPolicy {
  /**
    * Create a RepositoryPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RepositoryPolicyArgs) = this()
  def this(name: String, args: RepositoryPolicyArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ecr", "RepositoryPolicy")
@js.native
object RepositoryPolicy extends js.Object {
  /**
    * Get an existing RepositoryPolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.ecrRepositoryPolicyMod.RepositoryPolicy = js.native
  def get(name: String, id: Input[ID], state: RepositoryPolicyState): typings.atPulumiAws.ecrRepositoryPolicyMod.RepositoryPolicy = js.native
  def get(name: String, id: Input[ID], state: RepositoryPolicyState, opts: CustomResourceOptions): typings.atPulumiAws.ecrRepositoryPolicyMod.RepositoryPolicy = js.native
  /**
    * Returns true if the given object is an instance of RepositoryPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecr/repositoryPolicy.RepositoryPolicy */ Boolean = js.native
}

