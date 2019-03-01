package typings
package reactDashNativeDashDraggableDashFlatlistLib.reactDashNativeDashDraggableDashFlatlistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderItemInfo[ItemR] extends js.Object {
  var index: scala.Double
  var isActive: scala.Boolean
  var item: ItemR
  def move(): scala.Unit
  def moveEnd(): scala.Unit
}

object RenderItemInfo {
  @scala.inline
  def apply[ItemR](
    index: scala.Double,
    isActive: scala.Boolean,
    item: ItemR,
    move: js.Function0[scala.Unit],
    moveEnd: js.Function0[scala.Unit]
  ): RenderItemInfo[ItemR] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("isActive")(isActive)
    __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    __obj.updateDynamic("move")(move)
    __obj.updateDynamic("moveEnd")(moveEnd)
    __obj.asInstanceOf[RenderItemInfo[ItemR]]
  }
}

