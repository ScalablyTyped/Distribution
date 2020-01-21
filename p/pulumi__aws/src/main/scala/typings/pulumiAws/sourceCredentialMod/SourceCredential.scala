package typings.pulumiAws.sourceCredentialMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/codebuild/sourceCredential", "SourceCredential")
@js.native
class SourceCredential protected () extends CustomResource {
  /**
    * Create a SourceCredential resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SourceCredentialArgs) = this()
  def this(name: String, args: SourceCredentialArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of Source Credential.
    */
  val arn: Output_[String] = js.native
  /**
    * The type of authentication used to connect to a GitHub, GitHub Enterprise, or Bitbucket repository. An OAUTH connection is not supported by the API.
    */
  val authType: Output_[String] = js.native
  /**
    * The source provider used for this project.
    */
  val serverType: Output_[String] = js.native
  /**
    * For `GitHub` or `GitHub Enterprise`, this is the personal access token. For `Bitbucket`, this is the app password.
    */
  val token: Output_[String] = js.native
  /**
    * The Bitbucket username when the authType is `BASIC_AUTH`. This parameter is not valid for other types of source providers or connections.
    */
  val userName: Output_[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/codebuild/sourceCredential", "SourceCredential")
@js.native
object SourceCredential extends js.Object {
  /**
    * Get an existing SourceCredential resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): SourceCredential = js.native
  def get(name: String, id: Input[ID], state: SourceCredentialState): SourceCredential = js.native
  def get(name: String, id: Input[ID], state: SourceCredentialState, opts: CustomResourceOptions): SourceCredential = js.native
  /**
    * Returns true if the given object is an instance of SourceCredential.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codebuild/sourceCredential.SourceCredential */ Boolean = js.native
}

