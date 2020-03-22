package typings.standardVersion.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<'bump' | 'changelog' | 'commit' | 'tag', boolean>> */
trait Skip extends js.Object {
  var bump: js.UndefOr[Boolean] = js.undefined
  var changelog: js.UndefOr[Boolean] = js.undefined
  var commit: js.UndefOr[Boolean] = js.undefined
  var tag: js.UndefOr[Boolean] = js.undefined
}

object Skip {
  @scala.inline
  def apply(
    bump: js.UndefOr[Boolean] = js.undefined,
    changelog: js.UndefOr[Boolean] = js.undefined,
    commit: js.UndefOr[Boolean] = js.undefined,
    tag: js.UndefOr[Boolean] = js.undefined
  ): Skip = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bump)) __obj.updateDynamic("bump")(bump.asInstanceOf[js.Any])
    if (!js.isUndefined(changelog)) __obj.updateDynamic("changelog")(changelog.asInstanceOf[js.Any])
    if (!js.isUndefined(commit)) __obj.updateDynamic("commit")(commit.asInstanceOf[js.Any])
    if (!js.isUndefined(tag)) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Skip]
  }
}

