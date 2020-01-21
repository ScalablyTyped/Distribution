package typings.pulumiAws.ecrRepositoryMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ecr.RepositoryImageScanningConfiguration
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ecr/repository", "Repository")
@js.native
class Repository protected () extends CustomResource {
  /**
    * Create a Repository resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: RepositoryArgs) = this()
  def this(name: String, args: RepositoryArgs, opts: CustomResourceOptions) = this()
  /**
    * Full ARN of the repository.
    */
  val arn: Output_[String] = js.native
  /**
    * Configuration block that defines image scanning configuration for the repository. By default, image scanning must be manually triggered. See the [ECR User Guide](https://docs.aws.amazon.com/AmazonECR/latest/userguide/image-scanning.html) for more information about image scanning.
    */
  val imageScanningConfiguration: Output_[js.UndefOr[RepositoryImageScanningConfiguration]] = js.native
  /**
    * The tag mutability setting for the repository. Must be one of: `MUTABLE` or `IMMUTABLE`. Defaults to `MUTABLE`.
    */
  val imageTagMutability: Output_[js.UndefOr[String]] = js.native
  /**
    * Name of the repository.
    */
  val name: Output_[String] = js.native
  /**
    * The registry ID where the repository was created.
    */
  val registryId: Output_[String] = js.native
  /**
    * The URL of the repository (in the form `aws_account_id.dkr.ecr.region.amazonaws.com/repositoryName`
    */
  val repositoryUrl: Output_[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ecr/repository", "Repository")
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
  def get(name: String, id: Input[ID]): Repository = js.native
  def get(name: String, id: Input[ID], state: RepositoryState): Repository = js.native
  def get(name: String, id: Input[ID], state: RepositoryState, opts: CustomResourceOptions): Repository = js.native
  /**
    * Returns true if the given object is an instance of Repository.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecr/repository.Repository */ Boolean = js.native
}

