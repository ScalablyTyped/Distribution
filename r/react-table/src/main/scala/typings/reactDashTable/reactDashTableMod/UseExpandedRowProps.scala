package typings.reactDashTable.reactDashTableMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseExpandedRowProps[D /* <: js.Object */] extends js.Object {
  var canExpand: Boolean = js.native
  var isExpanded: Boolean = js.native
  var subRows: js.Array[Row[D]] = js.native
  def getExpandedToggleProps(): TableExpandedToggleProps = js.native
  def getExpandedToggleProps(props: Partial[TableExpandedToggleProps]): TableExpandedToggleProps = js.native
  def toggleExpanded(): Unit = js.native
  def toggleExpanded(isExpanded: Boolean): Unit = js.native
}

