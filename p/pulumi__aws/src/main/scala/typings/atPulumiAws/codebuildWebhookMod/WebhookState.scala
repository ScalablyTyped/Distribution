package typings.atPulumiAws.codebuildWebhookMod

import typings.atPulumiAws.typesInputMod.codebuildNs.WebhookFilterGroup
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookState extends js.Object {
  /**
    * A regular expression used to determine which branches get built. Default is all branches are built. It is recommended to use `filterGroup` over `branchFilter`.
    */
  val branchFilter: js.UndefOr[Input[String]] = js.undefined
  /**
    * Information about the webhook's trigger. Filter group blocks are documented below.
    */
  val filterGroups: js.UndefOr[Input[js.Array[Input[WebhookFilterGroup]]]] = js.undefined
  /**
    * The CodeBuild endpoint where webhook events are sent.
    */
  val payloadUrl: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the build project.
    */
  val projectName: js.UndefOr[Input[String]] = js.undefined
  /**
    * The secret token of the associated repository. Not returned by the CodeBuild API for all source types.
    */
  val secret: js.UndefOr[Input[String]] = js.undefined
  /**
    * The URL to the webhook.
    */
  val url: js.UndefOr[Input[String]] = js.undefined
}

object WebhookState {
  @scala.inline
  def apply(
    branchFilter: Input[String] = null,
    filterGroups: Input[js.Array[Input[WebhookFilterGroup]]] = null,
    payloadUrl: Input[String] = null,
    projectName: Input[String] = null,
    secret: Input[String] = null,
    url: Input[String] = null
  ): WebhookState = {
    val __obj = js.Dynamic.literal()
    if (branchFilter != null) __obj.updateDynamic("branchFilter")(branchFilter.asInstanceOf[js.Any])
    if (filterGroups != null) __obj.updateDynamic("filterGroups")(filterGroups.asInstanceOf[js.Any])
    if (payloadUrl != null) __obj.updateDynamic("payloadUrl")(payloadUrl.asInstanceOf[js.Any])
    if (projectName != null) __obj.updateDynamic("projectName")(projectName.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookState]
  }
}

