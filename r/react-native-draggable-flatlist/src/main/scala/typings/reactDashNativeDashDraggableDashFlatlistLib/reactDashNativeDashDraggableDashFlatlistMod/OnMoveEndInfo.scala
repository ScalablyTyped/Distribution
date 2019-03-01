package typings
package reactDashNativeDashDraggableDashFlatlistLib.reactDashNativeDashDraggableDashFlatlistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnMoveEndInfo[ItemM] extends js.Object {
  var data: js.Array[ItemM] | scala.Null
  var from: scala.Double
  var row: ItemM
  var to: scala.Double
}

object OnMoveEndInfo {
  @scala.inline
  def apply[ItemM](from: scala.Double, row: ItemM, to: scala.Double, data: js.Array[ItemM] = null): OnMoveEndInfo[ItemM] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.updateDynamic("to")(to)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[OnMoveEndInfo[ItemM]]
  }
}

