package typings.rcDashTable

import typings.rcDashTable.libInterfaceMod.ExpandedRowRender
import typings.rcDashTable.libInterfaceMod.FixedType
import typings.rcDashTable.libInterfaceMod.Key
import typings.rcDashTable.libInterfaceMod.LegacyFunction
import typings.rcDashTable.libInterfaceMod.RenderExpandIcon
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-table/lib/ExpandableRow", JSImport.Namespace)
@js.native
object libExpandableRowMod extends js.Object {
  @js.native
  trait ExpandableRowProps[ValueType] extends js.Object {
    var childrenColumnName: js.UndefOr[String] = js.native
    var expandIcon: js.UndefOr[RenderExpandIcon[ValueType]] = js.native
    var expandIconAsCell: js.UndefOr[Boolean] = js.native
    var expandIconColumnIndex: js.UndefOr[Double] = js.native
    var expandRowByClick: js.UndefOr[Boolean] = js.native
    var expanded: Boolean = js.native
    var expandedRowRender: js.UndefOr[ExpandedRowRender[ValueType]] = js.native
    var fixed: js.UndefOr[FixedType] = js.native
    var indentSize: js.UndefOr[Double] = js.native
    var needIndentSpaced: Boolean = js.native
    var onRowClick: js.UndefOr[LegacyFunction[ValueType]] = js.native
    var prefixCls: String = js.native
    var record: ValueType = js.native
    var rowKey: Key = js.native
    def children(info: Anon_Cells[ValueType]): ReactNode = js.native
    def onExpandedChange(
      expanded: Boolean,
      record: ValueType,
      event: MouseEvent[HTMLElement, NativeMouseEvent],
      rowKey: Key
    ): Unit = js.native
    def onExpandedChange(
      expanded: Boolean,
      record: ValueType,
      event: MouseEvent[HTMLElement, NativeMouseEvent],
      rowKey: Key,
      destroy: Boolean
    ): Unit = js.native
  }
  
  val default: js.Any = js.native
}

