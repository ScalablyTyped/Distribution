package typings.rcTable

import typings.rcTable.interfaceMod.ExpandedRowRender
import typings.rcTable.interfaceMod.FixedType
import typings.rcTable.interfaceMod.Key
import typings.rcTable.interfaceMod.LegacyFunction
import typings.rcTable.interfaceMod.RenderExpandIcon
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-table/lib/ExpandableRow", JSImport.Namespace)
@js.native
object expandableRowMod extends js.Object {
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
    def children(info: AnonCells[ValueType]): ReactNode = js.native
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

