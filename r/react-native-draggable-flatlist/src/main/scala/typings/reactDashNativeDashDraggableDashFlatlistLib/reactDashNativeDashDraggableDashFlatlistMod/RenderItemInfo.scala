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
    move: () => scala.Unit,
    moveEnd: () => scala.Unit
  ): RenderItemInfo[ItemR] = {
    val __obj = js.Dynamic.literal(index = index, isActive = isActive, item = item.asInstanceOf[js.Any], move = js.Any.fromFunction0(move), moveEnd = js.Any.fromFunction0(moveEnd))
  
    __obj.asInstanceOf[RenderItemInfo[ItemR]]
  }
}

