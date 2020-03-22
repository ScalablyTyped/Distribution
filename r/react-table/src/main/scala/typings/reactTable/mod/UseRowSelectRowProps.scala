package typings.reactTable.mod

import typings.reactTable.PartialTableToggleRowsSel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseRowSelectRowProps[D /* <: js.Object */] extends js.Object {
  var isSelected: Boolean = js.native
  var isSomeSelected: Boolean = js.native
  def getToggleRowSelectedProps(): TableToggleRowsSelectedProps = js.native
  def getToggleRowSelectedProps(props: PartialTableToggleRowsSel): TableToggleRowsSelectedProps = js.native
  def toggleRowSelected(): Unit = js.native
  def toggleRowSelected(set: Boolean): Unit = js.native
}

