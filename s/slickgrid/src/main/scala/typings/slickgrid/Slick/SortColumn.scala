package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortColumn[T /* <: SlickData */] extends js.Object {
  var sortAsc: Boolean = js.native
  var sortCol: Column[T] = js.native
}

object SortColumn {
  @scala.inline
  def apply[/* <: typings.slickgrid.Slick.SlickData */ T](sortAsc: Boolean, sortCol: Column[T]): SortColumn[T] = {
    val __obj = js.Dynamic.literal(sortAsc = sortAsc.asInstanceOf[js.Any], sortCol = sortCol.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortColumn[T]]
  }
  @scala.inline
  implicit class SortColumnOps[Self <: SortColumn[_], /* <: typings.slickgrid.Slick.SlickData */ T] (val x: Self with SortColumn[T]) extends AnyVal {
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
    def setSortAsc(value: Boolean): Self = this.set("sortAsc", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortCol(value: Column[T]): Self = this.set("sortCol", value.asInstanceOf[js.Any])
  }
  
}

