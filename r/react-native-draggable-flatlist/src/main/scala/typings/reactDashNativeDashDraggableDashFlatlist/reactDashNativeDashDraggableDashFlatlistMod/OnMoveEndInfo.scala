package typings.reactDashNativeDashDraggableDashFlatlist.reactDashNativeDashDraggableDashFlatlistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnMoveEndInfo[ItemM] extends js.Object {
  var data: js.Array[ItemM] | Null
  var from: Double
  var row: ItemM
  var to: Double
}

object OnMoveEndInfo {
  @scala.inline
  def apply[ItemM](from: Double, row: ItemM, to: Double, data: js.Array[ItemM] = null): OnMoveEndInfo[ItemM] = {
    val __obj = js.Dynamic.literal(from = from, row = row.asInstanceOf[js.Any], to = to)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[OnMoveEndInfo[ItemM]]
  }
}

