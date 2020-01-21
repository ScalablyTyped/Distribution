package typings.pulumiAws.inputMod.codebuild

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookFilterGroupFilter extends js.Object {
  /**
    * If set to `true`, the specified filter does *not* trigger a build. Defaults to `false`.
    */
  var excludeMatchedPattern: js.UndefOr[Input[Boolean]] = js.native
  /**
    * For a filter that uses `EVENT` type, a comma-separated string that specifies one event: `PUSH`, `PULL_REQUEST_CREATED`, `PULL_REQUEST_UPDATED`, `PULL_REQUEST_REOPENED`. `PULL_REQUEST_MERGED` works with GitHub & GitHub Enterprise only. For a filter that uses any of the other filter types, a regular expression.
    */
  var pattern: Input[String] = js.native
  /**
    * The webhook filter group's type. Valid values for this parameter are: `EVENT`, `BASE_REF`, `HEAD_REF`, `ACTOR_ACCOUNT_ID`, `FILE_PATH`. At least one filter group must specify `EVENT` as its type.
    */
  var `type`: Input[String] = js.native
}

object WebhookFilterGroupFilter {
  @scala.inline
  def apply(pattern: Input[String], `type`: Input[String], excludeMatchedPattern: Input[Boolean] = null): WebhookFilterGroupFilter = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (excludeMatchedPattern != null) __obj.updateDynamic("excludeMatchedPattern")(excludeMatchedPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookFilterGroupFilter]
  }
}

