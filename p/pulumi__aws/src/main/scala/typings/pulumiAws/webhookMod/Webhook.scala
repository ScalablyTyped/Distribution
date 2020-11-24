package typings.pulumiAws.webhookMod

import typings.pulumiAws.outputMod.codebuild.WebhookFilterGroup
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/codebuild/webhook", "Webhook")
@js.native
class Webhook protected () extends CustomResource {
  /**
    * Create a Webhook resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: WebhookArgs) = this()
  def this(name: String, args: WebhookArgs, opts: CustomResourceOptions) = this()
  
  /**
    * A regular expression used to determine which branches get built. Default is all branches are built. It is recommended to use `filterGroup` over `branchFilter`.
    */
  val branchFilter: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Information about the webhook's trigger. Filter group blocks are documented below.
    */
  val filterGroups: Output_[js.UndefOr[js.Array[WebhookFilterGroup]]] = js.native
  
  /**
    * The CodeBuild endpoint where webhook events are sent.
    */
  val payloadUrl: Output_[String] = js.native
  
  /**
    * The name of the build project.
    */
  val projectName: Output_[String] = js.native
  
  /**
    * The secret token of the associated repository. Not returned by the CodeBuild API for all source types.
    */
  val secret: Output_[String] = js.native
  
  /**
    * The URL to the webhook.
    */
  val url: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/codebuild/webhook", "Webhook")
@js.native
object Webhook extends js.Object {
  
  /**
    * Get an existing Webhook resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Webhook = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Webhook = js.native
  def get(name: String, id: Input[ID], state: WebhookState): Webhook = js.native
  def get(name: String, id: Input[ID], state: WebhookState, opts: CustomResourceOptions): Webhook = js.native
  
  /**
    * Returns true if the given object is an instance of Webhook.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codebuild/webhook.Webhook */ Boolean = js.native
}
