package typings.pulumiAws.repositoryPolicyMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ecr/repositoryPolicy", "RepositoryPolicy")
@js.native
class RepositoryPolicy protected () extends CustomResource {
  /**
    * Create a RepositoryPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RepositoryPolicyArgs) = this()
  def this(name: String, args: RepositoryPolicyArgs, opts: CustomResourceOptions) = this()
  /**
    * The policy document. This is a JSON formatted string.
    */
  val policy: Output_[String] = js.native
  /**
    * The registry ID where the repository was created.
    */
  val registryId: Output_[String] = js.native
  /**
    * Name of the repository to apply the policy.
    */
  val repository: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ecr/repositoryPolicy", "RepositoryPolicy")
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
  def get(name: String, id: Input[ID]): RepositoryPolicy = js.native
  def get(name: String, id: Input[ID], state: RepositoryPolicyState): RepositoryPolicy = js.native
  def get(name: String, id: Input[ID], state: RepositoryPolicyState, opts: CustomResourceOptions): RepositoryPolicy = js.native
  /**
    * Returns true if the given object is an instance of RepositoryPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecr/repositoryPolicy.RepositoryPolicy */ Boolean = js.native
}

