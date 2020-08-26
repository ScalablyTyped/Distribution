package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseRowStateInstanceProps[D /* <: js.Object */] extends js.Object {
  def setCellState(rowPath: js.Array[String], columnId: IdType[D], updater: UseRowUpdater[_]): Unit = js.native
  def setRowState(rowPath: js.Array[String], updater: UseRowUpdater[_]): Unit = js.native
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
  @scala.inline
  implicit class UseRowStateInstancePropsOps[Self <: UseRowStateInstanceProps[_], /* <: js.Object */ D] (val x: Self with UseRowStateInstanceProps[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSetCellState(value: (js.Array[String], IdType[D], UseRowUpdater[_]) => Unit): Self = this.set("setCellState", js.Any.fromFunction3(value))
    @scala.inline
    def setSetRowState(value: (js.Array[String], UseRowUpdater[_]) => Unit): Self = this.set("setRowState", js.Any.fromFunction2(value))
  }
  
}

