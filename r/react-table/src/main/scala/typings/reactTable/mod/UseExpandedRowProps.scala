package typings.reactTable.mod

import typings.reactTable.anon.PartialTableExpandedToggl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseExpandedRowProps[D /* <: js.Object */] extends js.Object {
  var canExpand: Boolean = js.native
  var isExpanded: Boolean = js.native
  var subRows: js.Array[Row[D]] = js.native
  def getToggleRowExpandedProps(): TableExpandedToggleProps = js.native
  def getToggleRowExpandedProps(props: PartialTableExpandedToggl): TableExpandedToggleProps = js.native
  def toggleRowExpanded(): Unit = js.native
  def toggleRowExpanded(value: Boolean): Unit = js.native
}

