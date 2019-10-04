package typings.atPulumiAws.typesOutputMod.codebuildNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookFilterGroupFilter extends js.Object {
  /**
    * If set to `true`, the specified filter does *not* trigger a build. Defaults to `false`.
    */
  var excludeMatchedPattern: js.UndefOr[Boolean] = js.undefined
  /**
    * For a filter that uses `EVENT` type, a comma-separated string that specifies one event: `PUSH`, `PULL_REQUEST_CREATED`, `PULL_REQUEST_UPDATED`, `PULL_REQUEST_REOPENED`. `PULL_REQUEST_MERGED` works with GitHub & GitHub Enterprise only. For a filter that uses any of the other filter types, a regular expression.
    */
  var pattern: String
  /**
    * The webhook filter group's type. Valid values for this parameter are: `EVENT`, `BASE_REF`, `HEAD_REF`, `ACTOR_ACCOUNT_ID`, `FILE_PATH`. At least one filter group must specify `EVENT` as its type.
    */
  var `type`: String
}

object WebhookFilterGroupFilter {
  @scala.inline
  def apply(pattern: String, `type`: String, excludeMatchedPattern: js.UndefOr[Boolean] = js.undefined): WebhookFilterGroupFilter = {
    val __obj = js.Dynamic.literal(pattern = pattern)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(excludeMatchedPattern)) __obj.updateDynamic("excludeMatchedPattern")(excludeMatchedPattern)
    __obj.asInstanceOf[WebhookFilterGroupFilter]
  }
}

