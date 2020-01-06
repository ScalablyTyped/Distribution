package typings.atPulumiAws.codepipelineWebhookMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.codepipeline.WebhookAuthenticationConfiguration
import typings.atPulumiAws.typesInputMod.codepipeline.WebhookFilter
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookState extends js.Object {
  /**
    * The type of authentication  to use. One of `IP`, `GITHUB_HMAC`, or `UNAUTHENTICATED`.
    */
  val authentication: js.UndefOr[Input[String]] = js.native
  /**
    * An `auth` block. Required for `IP` and `GITHUB_HMAC`. Auth blocks are documented below.
    */
  val authenticationConfiguration: js.UndefOr[Input[WebhookAuthenticationConfiguration]] = js.native
  /**
    * One or more `filter` blocks. Filter blocks are documented below.
    */
  val filters: js.UndefOr[Input[js.Array[Input[WebhookFilter]]]] = js.native
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
  val targetAction: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the pipeline.
    */
  val targetPipeline: js.UndefOr[Input[String]] = js.native
  /**
    * The CodePipeline webhook's URL. POST events to this endpoint to trigger the target.
    */
  val url: js.UndefOr[Input[String]] = js.native
}

object WebhookState {
  @scala.inline
  def apply(
    authentication: Input[String] = null,
    authenticationConfiguration: Input[WebhookAuthenticationConfiguration] = null,
    filters: Input[js.Array[Input[WebhookFilter]]] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    targetAction: Input[String] = null,
    targetPipeline: Input[String] = null,
    url: Input[String] = null
  ): WebhookState = {
    val __obj = js.Dynamic.literal()
    if (authentication != null) __obj.updateDynamic("authentication")(authentication.asInstanceOf[js.Any])
    if (authenticationConfiguration != null) __obj.updateDynamic("authenticationConfiguration")(authenticationConfiguration.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (targetAction != null) __obj.updateDynamic("targetAction")(targetAction.asInstanceOf[js.Any])
    if (targetPipeline != null) __obj.updateDynamic("targetPipeline")(targetPipeline.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookState]
  }
}

