package typings
package atPulumiAwsLib.codebuildWebhookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/codebuild/webhook", "Webhook")
@js.native
class Webhook protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a Webhook resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: WebhookArgs) = this()
  def this(name: java.lang.String, args: WebhookArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * A regular expression used to determine which branches get built. Default is all branches are built.
    */
  val branchFilter: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The CodeBuild endpoint where webhook events are sent.
    */
  val payloadUrl: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The name of the build project.
    */
  val projectName: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The secret token of the associated repository. Not returned by the CodeBuild API for all source types.
    */
  val secret: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The URL to the webhook.
    */
  val url: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
}

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
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.codebuildWebhookMod.Webhook = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.codebuildWebhookMod.WebhookState
  ): atPulumiAwsLib.codebuildWebhookMod.Webhook = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.codebuildWebhookMod.WebhookState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.codebuildWebhookMod.Webhook = js.native
}

