package typings
package reactDashDraggableDashListLib.reactDashDraggableDashListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateProps[I, C] extends js.Object {
  var anySelected: scala.Double
  var commonProps: C
  var dragHandleProps: js.Object
  var item: I
  var itemSelected: scala.Double
}

object TemplateProps {
  @scala.inline
  def apply[I, C](
    anySelected: scala.Double,
    commonProps: C,
    dragHandleProps: js.Object,
    item: I,
    itemSelected: scala.Double
  ): TemplateProps[I, C] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("anySelected")(anySelected)
    __obj.updateDynamic("commonProps")(commonProps.asInstanceOf[js.Any])
    __obj.updateDynamic("dragHandleProps")(dragHandleProps)
    __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    __obj.updateDynamic("itemSelected")(itemSelected)
    __obj.asInstanceOf[TemplateProps[I, C]]
  }
}

