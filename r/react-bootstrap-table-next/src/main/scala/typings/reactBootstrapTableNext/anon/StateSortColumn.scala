package typings.reactBootstrapTableNext.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateSortColumn[T /* <: js.Object */] extends js.Object {
  var state: SortColumn[T] = js.native
}

object StateSortColumn {
  @scala.inline
  def apply[/* <: js.Object */ T](state: SortColumn[T]): StateSortColumn[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateSortColumn[T]]
  }
  @scala.inline
  implicit class StateSortColumnOps[Self <: StateSortColumn[_], /* <: js.Object */ T] (val x: Self with StateSortColumn[T]) extends AnyVal {
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
    def setState(value: SortColumn[T]): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

