package typings
package atPulumiAwsLib.codebuildWebhookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookArgs extends js.Object {
  /**
    * A regular expression used to determine which branches get built. Default is all branches are built.
    */
  val branchFilter: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the build project.
    */
  val projectName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object WebhookArgs {
  @scala.inline
  def apply(
    projectName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    branchFilter: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): WebhookArgs = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    if (branchFilter != null) __obj.updateDynamic("branchFilter")(branchFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookArgs]
  }
}

