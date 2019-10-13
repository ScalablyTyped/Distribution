package typings.atSentryWebpackDashPlugin.atSentryWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetCommitsOptions extends js.Object {
  var auto: js.UndefOr[Boolean] = js.undefined
  var commit: js.UndefOr[String] = js.undefined
  var previousCommit: js.UndefOr[String] = js.undefined
  var repo: String
}

object SetCommitsOptions {
  @scala.inline
  def apply(
    repo: String,
    auto: js.UndefOr[Boolean] = js.undefined,
    commit: String = null,
    previousCommit: String = null
  ): SetCommitsOptions = {
    val __obj = js.Dynamic.literal(repo = repo)
    if (!js.isUndefined(auto)) __obj.updateDynamic("auto")(auto)
    if (commit != null) __obj.updateDynamic("commit")(commit)
    if (previousCommit != null) __obj.updateDynamic("previousCommit")(previousCommit)
    __obj.asInstanceOf[SetCommitsOptions]
  }
}

