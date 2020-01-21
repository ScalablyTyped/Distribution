package typings.requireDir.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait options extends js.Object {
  var duplicates: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[js.Any] = js.undefined
  var mapKey: js.UndefOr[js.Any] = js.undefined
  var mapValue: js.UndefOr[js.Any] = js.undefined
  var recurse: js.UndefOr[Boolean] = js.undefined
}

object options {
  @scala.inline
  def apply(
    duplicates: js.UndefOr[Boolean] = js.undefined,
    filter: js.Any = null,
    mapKey: js.Any = null,
    mapValue: js.Any = null,
    recurse: js.UndefOr[Boolean] = js.undefined
  ): options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duplicates)) __obj.updateDynamic("duplicates")(duplicates.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (mapKey != null) __obj.updateDynamic("mapKey")(mapKey.asInstanceOf[js.Any])
    if (mapValue != null) __obj.updateDynamic("mapValue")(mapValue.asInstanceOf[js.Any])
    if (!js.isUndefined(recurse)) __obj.updateDynamic("recurse")(recurse.asInstanceOf[js.Any])
    __obj.asInstanceOf[options]
  }
}

