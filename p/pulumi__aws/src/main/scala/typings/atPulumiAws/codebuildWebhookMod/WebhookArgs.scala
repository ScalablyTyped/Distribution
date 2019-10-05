package typings.atPulumiAws.codebuildWebhookMod

import typings.atPulumiAws.typesInputMod.codebuild.WebhookFilterGroup
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookArgs extends js.Object {
  /**
    * A regular expression used to determine which branches get built. Default is all branches are built. It is recommended to use `filterGroup` over `branchFilter`.
    */
  val branchFilter: js.UndefOr[Input[String]] = js.undefined
  /**
    * Information about the webhook's trigger. Filter group blocks are documented below.
    */
  val filterGroups: js.UndefOr[Input[js.Array[Input[WebhookFilterGroup]]]] = js.undefined
  /**
    * The name of the build project.
    */
  val projectName: Input[String]
}

object WebhookArgs {
  @scala.inline
  def apply(
    projectName: Input[String],
    branchFilter: Input[String] = null,
    filterGroups: Input[js.Array[Input[WebhookFilterGroup]]] = null
  ): WebhookArgs = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    if (branchFilter != null) __obj.updateDynamic("branchFilter")(branchFilter.asInstanceOf[js.Any])
    if (filterGroups != null) __obj.updateDynamic("filterGroups")(filterGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookArgs]
  }
}

