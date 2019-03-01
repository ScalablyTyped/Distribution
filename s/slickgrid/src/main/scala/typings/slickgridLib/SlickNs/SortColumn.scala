package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortColumn[T /* <: SlickData */] extends js.Object {
  var sortAsc: scala.Boolean
  var sortCol: Column[T]
}

object SortColumn {
  @scala.inline
  def apply[T /* <: SlickData */](sortAsc: scala.Boolean, sortCol: Column[T]): SortColumn[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sortAsc")(sortAsc)
    __obj.updateDynamic("sortCol")(sortCol)
    __obj.asInstanceOf[SortColumn[T]]
  }
}

