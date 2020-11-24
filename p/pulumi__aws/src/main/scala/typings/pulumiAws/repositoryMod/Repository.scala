package typings.pulumiAws.repositoryMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.codeartifact.RepositoryExternalConnections
import typings.pulumiAws.outputMod.codeartifact.RepositoryUpstream
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/codeartifact/repository", "Repository")
@js.native
class Repository protected () extends CustomResource {
  /**
    * Create a Repository resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RepositoryArgs) = this()
  def this(name: String, args: RepositoryArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The account number of the AWS account that manages the repository.
    */
  val administratorAccount: Output_[String] = js.native
  
  /**
    * The ARN of the repository.
    */
  val arn: Output_[String] = js.native
  
  /**
    * The description of the repository.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The domain that contains the created repository.
    */
  val domain: Output_[String] = js.native
  
  /**
    * The account number of the AWS account that owns the domain.
    */
  val domainOwner: Output_[String] = js.native
  
  /**
    * An array of external connections associated with the repository. Only one external connection can be set per repository. see External Connections.
    */
  val externalConnections: Output_[js.UndefOr[RepositoryExternalConnections]] = js.native
  
  /**
    * The name of the repository to create.
    */
  val repository: Output_[String] = js.native
  
  /**
    * Key-value map of resource tags.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * A list of upstream repositories to associate with the repository. The order of the upstream repositories in the list determines their priority order when AWS CodeArtifact looks for a requested package version. see Upstream
    */
  val upstreams: Output_[js.UndefOr[js.Array[RepositoryUpstream]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/codeartifact/repository", "Repository")
@js.native
object Repository extends js.Object {
  
  /**
    * Get an existing Repository resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Repository = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Repository = js.native
  def get(name: String, id: Input[ID], state: RepositoryState): Repository = js.native
  def get(name: String, id: Input[ID], state: RepositoryState, opts: CustomResourceOptions): Repository = js.native
  
  /**
    * Returns true if the given object is an instance of Repository.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codeartifact/repository.Repository */ Boolean = js.native
}
