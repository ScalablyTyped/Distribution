package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseGroupByColumnProps[D /* <: js.Object */] extends js.Object {
  var canGroupBy: Boolean = js.native
  var groupedIndex: Double = js.native
  var isGrouped: Boolean = js.native
  def getGroupByToggleProps(): TableGroupByToggleProps = js.native
  def getGroupByToggleProps(props: js.Object): TableGroupByToggleProps = js.native
  def toggleGroupBy(): Unit = js.native
}

