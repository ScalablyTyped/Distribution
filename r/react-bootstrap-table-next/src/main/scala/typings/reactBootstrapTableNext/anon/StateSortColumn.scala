package typings.reactBootstrapTableNext.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateSortColumn[T /* <: js.Object */] extends js.Object {
  var state: SortColumn[T]
}

object StateSortColumn {
  @scala.inline
  def apply[/* <: js.Object */ T](state: SortColumn[T]): StateSortColumn[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateSortColumn[T]]
  }
}

