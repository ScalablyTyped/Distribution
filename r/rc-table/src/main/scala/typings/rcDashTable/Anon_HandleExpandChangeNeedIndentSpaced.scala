package typings.rcDashTable

import typings.rcDashTable.libExpandableTableMod.ExpandChangeEventHandler
import typings.rcDashTable.libExpandableTableMod.ExpandableTableProps
import typings.rcDashTable.libExpandableTableMod.RenderExpandIndentCell
import typings.rcDashTable.libExpandableTableMod.RenderTableRows
import typings.rcDashTable.libInterfaceMod.Cell
import typings.rcDashTable.libInterfaceMod.FixedType
import typings.rcDashTable.libInterfaceMod.Key
import typings.rcDashTable.libInterfaceMod.RenderRows
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HandleExpandChangeNeedIndentSpaced[ValueType] extends js.Object {
  var handleExpandChange: ExpandChangeEventHandler[ValueType]
  var needIndentSpaced: Boolean
  var props: ExpandableTableProps[ValueType]
  var renderExpandIndentCell: RenderExpandIndentCell
  var renderRows: RenderTableRows[ValueType]
}

object Anon_HandleExpandChangeNeedIndentSpaced {
  @scala.inline
  def apply[ValueType](
    handleExpandChange: (/* expanded */ Boolean, ValueType, /* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* rowKey */ Key, /* destroy */ Boolean) => Unit,
    needIndentSpaced: Boolean,
    props: ExpandableTableProps[ValueType],
    renderExpandIndentCell: (/* rows */ js.Array[js.Array[Cell]], /* fixed */ FixedType) => Unit,
    renderRows: (/* renderRows */ RenderRows[ValueType], /* rows */ js.Array[ReactElement], ValueType, /* index */ Double, /* indent */ Double, /* fixed */ FixedType, /* parentKey */ Key, /* ancestorKeys */ js.Array[Key]) => Unit
  ): Anon_HandleExpandChangeNeedIndentSpaced[ValueType] = {
    val __obj = js.Dynamic.literal(handleExpandChange = js.Any.fromFunction5(handleExpandChange), needIndentSpaced = needIndentSpaced, props = props, renderExpandIndentCell = js.Any.fromFunction2(renderExpandIndentCell), renderRows = js.Any.fromFunction8(renderRows))
  
    __obj.asInstanceOf[Anon_HandleExpandChangeNeedIndentSpaced[ValueType]]
  }
}

