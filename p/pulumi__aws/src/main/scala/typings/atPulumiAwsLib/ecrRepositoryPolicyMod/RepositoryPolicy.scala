package typings
package atPulumiAwsLib.ecrRepositoryPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ecr/repositoryPolicy", "RepositoryPolicy")
@js.native
class RepositoryPolicy protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a RepositoryPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: RepositoryPolicyArgs) = this()
  def this(name: java.lang.String, args: RepositoryPolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  val policy: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The registry ID where the repository was created.
    */
  val registryId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Name of the repository to apply the policy.
    */
  val repository: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ecrRepositoryPolicyMod.RepositoryPolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ecrRepositoryPolicyMod.RepositoryPolicyState
  ): atPulumiAwsLib.ecrRepositoryPolicyMod.RepositoryPolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ecrRepositoryPolicyMod.RepositoryPolicyState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ecrRepositoryPolicyMod.RepositoryPolicy = js.native
  /**
    * Returns true if the given object is an instance of RepositoryPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecr/repositoryPolicy.RepositoryPolicy */ scala.Boolean = js.native
}

