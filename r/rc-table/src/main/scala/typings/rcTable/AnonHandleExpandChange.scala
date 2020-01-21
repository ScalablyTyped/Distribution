package typings.rcTable

import typings.rcTable.expandableTableMod.ExpandChangeEventHandler
import typings.rcTable.expandableTableMod.ExpandableTableProps
import typings.rcTable.expandableTableMod.RenderExpandIndentCell
import typings.rcTable.expandableTableMod.RenderTableRows
import typings.rcTable.interfaceMod.Cell
import typings.rcTable.interfaceMod.FixedType
import typings.rcTable.interfaceMod.Key
import typings.rcTable.interfaceMod.RenderRows
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHandleExpandChange[ValueType] extends js.Object {
  var handleExpandChange: ExpandChangeEventHandler[ValueType]
  var needIndentSpaced: Boolean
  var props: ExpandableTableProps[ValueType]
  var renderExpandIndentCell: RenderExpandIndentCell
  var renderRows: RenderTableRows[ValueType]
}

object AnonHandleExpandChange {
  @scala.inline
  def apply[ValueType](
    handleExpandChange: (/* expanded */ Boolean, ValueType, /* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* rowKey */ Key, /* destroy */ Boolean) => Unit,
    needIndentSpaced: Boolean,
    props: ExpandableTableProps[ValueType],
    renderExpandIndentCell: (/* rows */ js.Array[js.Array[Cell]], /* fixed */ FixedType) => Unit,
    renderRows: (/* renderRows */ RenderRows[ValueType], /* rows */ js.Array[ReactElement], ValueType, /* index */ Double, /* indent */ Double, /* fixed */ FixedType, /* parentKey */ Key, /* ancestorKeys */ js.Array[Key]) => Unit
  ): AnonHandleExpandChange[ValueType] = {
    val __obj = js.Dynamic.literal(handleExpandChange = js.Any.fromFunction5(handleExpandChange), needIndentSpaced = needIndentSpaced.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], renderExpandIndentCell = js.Any.fromFunction2(renderExpandIndentCell), renderRows = js.Any.fromFunction8(renderRows))
  
    __obj.asInstanceOf[AnonHandleExpandChange[ValueType]]
  }
}

