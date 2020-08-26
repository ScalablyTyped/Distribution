package typings.rcTable.anon

import typings.rcTable.interfaceMod.ColumnGroupType
import typings.rcTable.interfaceMod.ColumnType
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

@js.native
trait Columns[RecordType] extends js.Object {
  var children: js.UndefOr[ReactNode] = js.native
  var columns: js.UndefOr[ColumnsType[RecordType]] = js.native
  var direction: js.UndefOr[ltr | rtl] = js.native
  var expandIcon: js.UndefOr[RenderExpandIcon[RecordType]] = js.native
  var expandIconColumnIndex: js.UndefOr[Double] = js.native
  var expandRowByClick: js.UndefOr[Boolean] = js.native
  var expandable: Boolean = js.native
  var expandedKeys: Set[Key] = js.native
  var getRowKey: GetRowKey[RecordType] = js.native
  var onTriggerExpand: TriggerEventHandler[RecordType] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var rowExpandable: js.UndefOr[js.Function1[/* record */ RecordType, Boolean]] = js.native
}

object Columns {
  @scala.inline
  def apply[RecordType](
    expandable: Boolean,
    expandedKeys: Set[Key],
    getRowKey: (RecordType, /* index */ js.UndefOr[Double]) => Key,
    onTriggerExpand: (RecordType, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
  ): Columns[RecordType] = {
    val __obj = js.Dynamic.literal(expandable = expandable.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], getRowKey = js.Any.fromFunction2(getRowKey), onTriggerExpand = js.Any.fromFunction2(onTriggerExpand))
    __obj.asInstanceOf[Columns[RecordType]]
  }
  @scala.inline
  implicit class ColumnsOps[Self <: Columns[_], RecordType] (val x: Self with Columns[RecordType]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExpandable(value: Boolean): Self = this.set("expandable", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandedKeys(value: Set[Key]): Self = this.set("expandedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetRowKey(value: (RecordType, /* index */ js.UndefOr[Double]) => Key): Self = this.set("getRowKey", js.Any.fromFunction2(value))
    @scala.inline
    def setOnTriggerExpand(value: (RecordType, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = this.set("onTriggerExpand", js.Any.fromFunction2(value))
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: (ColumnGroupType[RecordType] | ColumnType[RecordType])*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: ColumnsType[RecordType]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setDirection(value: ltr | rtl): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setExpandIcon(value: /* props */ RenderExpandIconProps[RecordType] => ReactNode): Self = this.set("expandIcon", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExpandIcon: Self = this.set("expandIcon", js.undefined)
    @scala.inline
    def setExpandIconColumnIndex(value: Double): Self = this.set("expandIconColumnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandIconColumnIndex: Self = this.set("expandIconColumnIndex", js.undefined)
    @scala.inline
    def setExpandRowByClick(value: Boolean): Self = this.set("expandRowByClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandRowByClick: Self = this.set("expandRowByClick", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setRowExpandable(value: /* record */ RecordType => Boolean): Self = this.set("rowExpandable", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRowExpandable: Self = this.set("rowExpandable", js.undefined)
  }
  
}

