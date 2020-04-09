package typings.rcTable.expandedRowMod

import typings.rcTable.interfaceMod.CustomizeComponent
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandedRowProps[RecordType] extends js.Object {
  var cellComponent: CustomizeComponent
  var children: ReactNode
  var className: String
  var colSpan: Double
  var component: CustomizeComponent
  var componentWidth: Double
  var expanded: Boolean
  var fixColumn: Boolean
  var fixHeader: Boolean
  var horizonScroll: Boolean
  var prefixCls: String
}

object ExpandedRowProps {
  @scala.inline
  def apply[RecordType](
    cellComponent: CustomizeComponent,
    className: String,
    colSpan: Double,
    component: CustomizeComponent,
    componentWidth: Double,
    expanded: Boolean,
    fixColumn: Boolean,
    fixHeader: Boolean,
    horizonScroll: Boolean,
    prefixCls: String,
    children: ReactNode = null
  ): ExpandedRowProps[RecordType] = {
    val __obj = js.Dynamic.literal(cellComponent = cellComponent.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], colSpan = colSpan.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], componentWidth = componentWidth.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], fixColumn = fixColumn.asInstanceOf[js.Any], fixHeader = fixHeader.asInstanceOf[js.Any], horizonScroll = horizonScroll.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandedRowProps[RecordType]]
  }
}

