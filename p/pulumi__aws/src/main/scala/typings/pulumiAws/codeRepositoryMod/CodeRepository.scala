package typings.pulumiAws.codeRepositoryMod

import typings.pulumiAws.outputMod.sagemaker.CodeRepositoryGitConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/sagemaker/codeRepository", "CodeRepository")
@js.native
class CodeRepository protected () extends CustomResource {
  /**
    * Create a CodeRepository resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: CodeRepositoryArgs) = this()
  def this(name: String, args: CodeRepositoryArgs, opts: CustomResourceOptions) = this()
  
  val arn: Output_[String] = js.native
  
  val codeRepositoryName: Output_[String] = js.native
  
  val gitConfig: Output_[CodeRepositoryGitConfig] = js.native
}
/* static members */
@JSImport("@pulumi/aws/sagemaker/codeRepository", "CodeRepository")
@js.native
object CodeRepository extends js.Object {
  
  /**
    * Get an existing CodeRepository resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): CodeRepository = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): CodeRepository = js.native
  def get(name: String, id: Input[ID], state: CodeRepositoryState): CodeRepository = js.native
  def get(name: String, id: Input[ID], state: CodeRepositoryState, opts: CustomResourceOptions): CodeRepository = js.native
  
  /**
    * Returns true if the given object is an instance of CodeRepository.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/codeRepository.CodeRepository */ Boolean = js.native
}
