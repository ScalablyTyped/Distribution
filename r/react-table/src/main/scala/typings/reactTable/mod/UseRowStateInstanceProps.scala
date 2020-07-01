package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseRowStateInstanceProps[D /* <: js.Object */] extends js.Object {
  def setCellState(rowPath: js.Array[String], columnId: IdType[D], updater: UseRowUpdater[_]): Unit
  def setRowState(rowPath: js.Array[String], updater: UseRowUpdater[_]): Unit
}

object UseRowStateInstanceProps {
  @scala.inline
  def apply[/* <: js.Object */ D](
    setCellState: (js.Array[String], IdType[D], UseRowUpdater[_]) => Unit,
    setRowState: (js.Array[String], UseRowUpdater[_]) => Unit
  ): UseRowStateInstanceProps[D] = {
    val __obj = js.Dynamic.literal(setCellState = js.Any.fromFunction3(setCellState), setRowState = js.Any.fromFunction2(setRowState))
    __obj.asInstanceOf[UseRowStateInstanceProps[D]]
  }
}

