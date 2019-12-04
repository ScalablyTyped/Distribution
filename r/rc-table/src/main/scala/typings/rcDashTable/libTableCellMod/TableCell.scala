package typings.rcDashTable.libTableCellMod

import typings.react.reactMod.Component
import typings.react.reactMod.MouseEventHandler
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableCell[ValueType]
  extends Component[TableCellProps[ValueType], js.Object, js.Any] {
  var handleClick: MouseEventHandler[HTMLElement] = js.native
}

