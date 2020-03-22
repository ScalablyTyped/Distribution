package typings.rcTable

import typings.rcTable.interfaceMod.ColumnsType
import typings.rcTable.interfaceMod.GetRowKey
import typings.rcTable.interfaceMod.Key
import typings.rcTable.interfaceMod.RenderExpandIcon
import typings.rcTable.interfaceMod.RenderExpandIconProps
import typings.rcTable.interfaceMod.TriggerEventHandler
import typings.rcTable.rcTableStrings.ltr
import typings.rcTable.rcTableStrings.rtl
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumns[RecordType] extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var columns: js.UndefOr[ColumnsType[RecordType]] = js.undefined
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  var expandIcon: js.UndefOr[RenderExpandIcon[RecordType]] = js.undefined
  var expandIconColumnIndex: js.UndefOr[Double] = js.undefined
  var expandable: Boolean
  var expandedKeys: Set[Key]
  var getRowKey: GetRowKey[RecordType]
  var onTriggerExpand: TriggerEventHandler[RecordType]
  var prefixCls: js.UndefOr[String] = js.undefined
  var rowExpandable: js.UndefOr[js.Function1[/* record */ RecordType, Boolean]] = js.undefined
}

object AnonColumns {
  @scala.inline
  def apply[RecordType](
    expandable: Boolean,
    expandedKeys: Set[Key],
    getRowKey: (RecordType, /* index */ js.UndefOr[Double]) => Key,
    onTriggerExpand: (RecordType, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit,
    children: ReactNode = null,
    columns: ColumnsType[RecordType] = null,
    direction: ltr | rtl = null,
    expandIcon: /* props */ RenderExpandIconProps[RecordType] => ReactNode = null,
    expandIconColumnIndex: Int | Double = null,
    prefixCls: String = null,
    rowExpandable: /* record */ RecordType => Boolean = null
  ): AnonColumns[RecordType] = {
    val __obj = js.Dynamic.literal(expandable = expandable.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], getRowKey = js.Any.fromFunction2(getRowKey), onTriggerExpand = js.Any.fromFunction2(onTriggerExpand))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(js.Any.fromFunction1(expandIcon))
    if (expandIconColumnIndex != null) __obj.updateDynamic("expandIconColumnIndex")(expandIconColumnIndex.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (rowExpandable != null) __obj.updateDynamic("rowExpandable")(js.Any.fromFunction1(rowExpandable))
    __obj.asInstanceOf[AnonColumns[RecordType]]
  }
}

