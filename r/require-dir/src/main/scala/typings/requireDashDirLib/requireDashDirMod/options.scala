package typings
package requireDashDirLib.requireDashDirMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait options extends js.Object {
  var duplicates: js.UndefOr[scala.Boolean] = js.undefined
  var filter: js.UndefOr[js.Any] = js.undefined
  var mapKey: js.UndefOr[js.Any] = js.undefined
  var mapValue: js.UndefOr[js.Any] = js.undefined
  var recurse: js.UndefOr[scala.Boolean] = js.undefined
}

object options {
  @scala.inline
  def apply(
    duplicates: js.UndefOr[scala.Boolean] = js.undefined,
    filter: js.Any = null,
    mapKey: js.Any = null,
    mapValue: js.Any = null,
    recurse: js.UndefOr[scala.Boolean] = js.undefined
  ): options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duplicates)) __obj.updateDynamic("duplicates")(duplicates)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (mapKey != null) __obj.updateDynamic("mapKey")(mapKey)
    if (mapValue != null) __obj.updateDynamic("mapValue")(mapValue)
    if (!js.isUndefined(recurse)) __obj.updateDynamic("recurse")(recurse)
    __obj.asInstanceOf[options]
  }
}

