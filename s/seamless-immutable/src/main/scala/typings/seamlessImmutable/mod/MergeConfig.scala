package typings.seamlessImmutable.mod

import typings.seamlessImmutable.seamlessImmutableStrings.merge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeConfig extends js.Object {
  var deep: js.UndefOr[Boolean] = js.undefined
  var merger: js.UndefOr[js.Function3[/* a */ js.Any, /* b */ js.Any, /* config */ js.Any, _]] = js.undefined
  var mode: js.UndefOr[typings.seamlessImmutable.seamlessImmutableStrings.replace | merge] = js.undefined
}

object MergeConfig {
  @scala.inline
  def apply(
    deep: js.UndefOr[Boolean] = js.undefined,
    merger: (/* a */ js.Any, /* b */ js.Any, /* config */ js.Any) => _ = null,
    mode: typings.seamlessImmutable.seamlessImmutableStrings.replace | merge = null
  ): MergeConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep.asInstanceOf[js.Any])
    if (merger != null) __obj.updateDynamic("merger")(js.Any.fromFunction3(merger))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeConfig]
  }
}

