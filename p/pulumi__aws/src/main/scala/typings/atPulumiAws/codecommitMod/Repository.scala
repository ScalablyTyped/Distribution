package typings.atPulumiAws.codecommitMod

import typings.atPulumiAws.codecommitRepositoryMod.RepositoryArgs
import typings.atPulumiAws.codecommitRepositoryMod.RepositoryState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/codecommit", "Repository")
@js.native
class Repository protected ()
  extends typings.atPulumiAws.codecommitRepositoryMod.Repository {
  /**
    * Create a Repository resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RepositoryArgs) = this()
  def this(name: String, args: RepositoryArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/codecommit", "Repository")
@js.native
object Repository extends js.Object {
  /**
    * Get an existing Repository resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.codecommitRepositoryMod.Repository = js.native
  def get(name: String, id: Input[ID], state: RepositoryState): typings.atPulumiAws.codecommitRepositoryMod.Repository = js.native
  def get(name: String, id: Input[ID], state: RepositoryState, opts: CustomResourceOptions): typings.atPulumiAws.codecommitRepositoryMod.Repository = js.native
  /**
    * Returns true if the given object is an instance of Repository.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codecommit/repository.Repository */ Boolean = js.native
}

