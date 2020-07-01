package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortColumn[T /* <: SlickData */] extends js.Object {
  var sortAsc: Boolean
  var sortCol: Column[T]
}

object SortColumn {
  @scala.inline
  def apply[/* <: typings.slickgrid.Slick.SlickData */ T](sortAsc: Boolean, sortCol: Column[T]): SortColumn[T] = {
    val __obj = js.Dynamic.literal(sortAsc = sortAsc.asInstanceOf[js.Any], sortCol = sortCol.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortColumn[T]]
  }
}

