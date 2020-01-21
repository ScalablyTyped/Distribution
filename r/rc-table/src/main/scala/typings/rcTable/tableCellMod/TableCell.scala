package typings.rcTable.tableCellMod

import typings.react.mod.Component
import typings.react.mod.MouseEventHandler
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableCell[ValueType]
  extends Component[TableCellProps[ValueType], js.Object, js.Any] {
  var handleClick: MouseEventHandler[HTMLElement] = js.native
}

