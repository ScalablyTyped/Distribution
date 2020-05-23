package typings.reduxFirstRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionMetaLocation extends js.Object {
  var current: Location
  var history: Nullable[HistoryData]
  var kind: Nullable[String]
  var prev: Location
}

object ActionMetaLocation {
  @scala.inline
  def apply(
    current: Location,
    prev: Location,
    history: js.UndefOr[Null | Nullable[HistoryData]] = js.undefined,
    kind: js.UndefOr[Null | Nullable[String]] = js.undefined
  ): ActionMetaLocation = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
    if (!js.isUndefined(history)) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (!js.isUndefined(kind)) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionMetaLocation]
  }
}

