package typings.rcDashTable

import typings.rcDashTable.libInterfaceMod.LegacyFunction
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.react.reactMod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cells[ValueType] extends js.Object {
  var expanded: Boolean
  var indentSize: Double
  var onRowClick: LegacyFunction[ValueType]
  def hasExpandIcon(index: Double): Boolean
  def renderExpandIcon(): ReactNode
  def renderExpandIconCell(cells: js.Array[ReactElement]): Unit
}

object Anon_Cells {
  @scala.inline
  def apply[ValueType](
    expanded: Boolean,
    hasExpandIcon: Double => Boolean,
    indentSize: Double,
    onRowClick: (ValueType, /* index */ Double, /* event */ SyntheticEvent[Element, Event]) => Unit,
    renderExpandIcon: () => ReactNode,
    renderExpandIconCell: js.Array[ReactElement] => Unit
  ): Anon_Cells[ValueType] = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], hasExpandIcon = js.Any.fromFunction1(hasExpandIcon), indentSize = indentSize.asInstanceOf[js.Any], onRowClick = js.Any.fromFunction3(onRowClick), renderExpandIcon = js.Any.fromFunction0(renderExpandIcon), renderExpandIconCell = js.Any.fromFunction1(renderExpandIconCell))
  
    __obj.asInstanceOf[Anon_Cells[ValueType]]
  }
}

