package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Filter Options
@js.native
trait FilterOptions[T /* <: FindConstant */] extends js.Object {
  var filter: FilterFunction[T] | FilterObject | String = js.native
}

object FilterOptions {
  @scala.inline
  def apply[/* <: typings.screeps.FindConstant */ T](filter: FilterFunction[T] | FilterObject | String): FilterOptions[T] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOptions[T]]
  }
  @scala.inline
  implicit class FilterOptionsOps[Self <: FilterOptions[_], /* <: typings.screeps.FindConstant */ T] (val x: Self with FilterOptions[T]) extends AnyVal {
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
    def setFilterFunction1(
      value: /* import warning: importer.ImportType#apply Failed type conversion: screeps.FindTypes[T] */ /* object */ js.Any => Boolean
    ): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def setFilter(value: FilterFunction[T] | FilterObject | String): Self = this.set("filter", value.asInstanceOf[js.Any])
  }
  
}

