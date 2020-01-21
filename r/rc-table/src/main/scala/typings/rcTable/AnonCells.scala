package typings.rcTable

import typings.rcTable.interfaceMod.LegacyFunction
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCells[ValueType] extends js.Object {
  var expanded: Boolean
  var indentSize: Double
  var onRowClick: LegacyFunction[ValueType]
  def hasExpandIcon(index: Double): Boolean
  def renderExpandIcon(): ReactNode
  def renderExpandIconCell(cells: js.Array[ReactElement]): Unit
}

object AnonCells {
  @scala.inline
  def apply[ValueType](
    expanded: Boolean,
    hasExpandIcon: Double => Boolean,
    indentSize: Double,
    onRowClick: (ValueType, /* index */ Double, /* event */ SyntheticEvent[Element, Event_]) => Unit,
    renderExpandIcon: () => ReactNode,
    renderExpandIconCell: js.Array[ReactElement] => Unit
  ): AnonCells[ValueType] = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], hasExpandIcon = js.Any.fromFunction1(hasExpandIcon), indentSize = indentSize.asInstanceOf[js.Any], onRowClick = js.Any.fromFunction3(onRowClick), renderExpandIcon = js.Any.fromFunction0(renderExpandIcon), renderExpandIconCell = js.Any.fromFunction1(renderExpandIconCell))
  
    __obj.asInstanceOf[AnonCells[ValueType]]
  }
}

