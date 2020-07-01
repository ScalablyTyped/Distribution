package typings.slickgrid.Slick.Controls

import typings.slickgrid.Slick.Column
import typings.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnPicker[T /* <: SlickData */] extends js.Object {
  def destroy(): Unit
  def getAllColumns(): js.Array[Column[T]]
}

object ColumnPicker {
  @scala.inline
  def apply[/* <: typings.slickgrid.Slick.SlickData */ T](destroy: () => Unit, getAllColumns: () => js.Array[Column[T]]): ColumnPicker[T] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getAllColumns = js.Any.fromFunction0(getAllColumns))
    __obj.asInstanceOf[ColumnPicker[T]]
  }
}

