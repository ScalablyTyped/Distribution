package typings.pulumiAws.codepipelineWebhookMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.codepipeline.WebhookAuthenticationConfiguration
import typings.pulumiAws.inputMod.codepipeline.WebhookFilter
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookArgs extends js.Object {
  /**
    * The type of authentication  to use. One of `IP`, `GITHUB_HMAC`, or `UNAUTHENTICATED`.
    */
  val authentication: Input[String] = js.native
  /**
    * An `auth` block. Required for `IP` and `GITHUB_HMAC`. Auth blocks are documented below.
    */
  val authenticationConfiguration: js.UndefOr[Input[WebhookAuthenticationConfiguration]] = js.native
  /**
    * One or more `filter` blocks. Filter blocks are documented below.
    */
  val filters: Input[js.Array[Input[WebhookFilter]]] = js.native
  /**
    * The name of the webhook.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The name of the action in a pipeline you want to connect to the webhook. The action must be from the source (first) stage of the pipeline.
    */
  val targetAction: Input[String] = js.native
  /**
    * The name of the pipeline.
    */
  val targetPipeline: Input[String] = js.native
}

object WebhookArgs {
  @scala.inline
  def apply(
    authentication: Input[String],
    filters: Input[js.Array[Input[WebhookFilter]]],
    targetAction: Input[String],
    targetPipeline: Input[String],
    authenticationConfiguration: Input[WebhookAuthenticationConfiguration] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): WebhookArgs = {
    val __obj = js.Dynamic.literal(authentication = authentication.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], targetAction = targetAction.asInstanceOf[js.Any], targetPipeline = targetPipeline.asInstanceOf[js.Any])
    if (authenticationConfiguration != null) __obj.updateDynamic("authenticationConfiguration")(authenticationConfiguration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookArgs]
  }
}

