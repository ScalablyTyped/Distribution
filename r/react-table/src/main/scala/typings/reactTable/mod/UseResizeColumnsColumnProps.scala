package typings.reactTable.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseResizeColumnsColumnProps[D /* <: js.Object */] extends js.Object {
  var canResize: Boolean = js.native
  var isResizing: Boolean = js.native
  def getResizerProps(): TableResizerProps = js.native
  def getResizerProps(props: Partial[TableResizerProps]): TableResizerProps = js.native
}

