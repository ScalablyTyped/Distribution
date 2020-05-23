package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupTotals[T] extends NonDataRow {
  /***
    * Parent Group.
    * @param group
    * @type {Group}
    */
  var group: Group[T]
}

object GroupTotals {
  @scala.inline
  def apply[T](group: Group[T]): GroupTotals[T] = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupTotals[T]]
  }
}

