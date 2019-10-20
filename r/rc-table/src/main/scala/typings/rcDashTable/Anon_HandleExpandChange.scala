package typings.rcDashTable

import typings.rcDashTable.esExpandableTableMod.ExpandChangeEventHandler
import typings.rcDashTable.esExpandableTableMod.ExpandableTableProps
import typings.rcDashTable.esExpandableTableMod.RenderExpandIndentCell
import typings.rcDashTable.esExpandableTableMod.RenderTableRows
import typings.rcDashTable.esInterfaceMod.Cell
import typings.rcDashTable.esInterfaceMod.FixedType
import typings.rcDashTable.esInterfaceMod.Key
import typings.rcDashTable.esInterfaceMod.RenderRows
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HandleExpandChange[ValueType] extends js.Object {
  var handleExpandChange: ExpandChangeEventHandler[ValueType]
  var needIndentSpaced: Boolean
  var props: ExpandableTableProps[ValueType]
  var renderExpandIndentCell: RenderExpandIndentCell
  var renderRows: RenderTableRows[ValueType]
}

object Anon_HandleExpandChange {
  @scala.inline
  def apply[ValueType](
    handleExpandChange: (/* expanded */ Boolean, ValueType, /* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* rowKey */ Key, /* destroy */ Boolean) => Unit,
    needIndentSpaced: Boolean,
    props: ExpandableTableProps[ValueType],
    renderExpandIndentCell: (/* rows */ js.Array[js.Array[Cell]], /* fixed */ FixedType) => Unit,
    renderRows: (/* renderRows */ RenderRows[ValueType], /* rows */ js.Array[ReactElement], ValueType, /* index */ Double, /* indent */ Double, /* fixed */ FixedType, /* parentKey */ Key, /* ancestorKeys */ js.Array[Key]) => Unit
  ): Anon_HandleExpandChange[ValueType] = {
    val __obj = js.Dynamic.literal(handleExpandChange = js.Any.fromFunction5(handleExpandChange), needIndentSpaced = needIndentSpaced, props = props, renderExpandIndentCell = js.Any.fromFunction2(renderExpandIndentCell), renderRows = js.Any.fromFunction8(renderRows))
  
    __obj.asInstanceOf[Anon_HandleExpandChange[ValueType]]
  }
}

