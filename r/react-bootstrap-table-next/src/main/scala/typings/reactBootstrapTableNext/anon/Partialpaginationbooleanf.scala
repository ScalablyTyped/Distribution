package typings.reactBootstrapTableNext.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  pagination :boolean,   filter :boolean,   sort :boolean,   cellEdit :boolean,   search :boolean}> */
@js.native
trait Partialpaginationbooleanf extends js.Object {
  var cellEdit: js.UndefOr[Boolean] = js.native
  var filter: js.UndefOr[Boolean] = js.native
  var pagination: js.UndefOr[Boolean] = js.native
  var search: js.UndefOr[Boolean] = js.native
  var sort: js.UndefOr[Boolean] = js.native
}

object Partialpaginationbooleanf {
  @scala.inline
  def apply(): Partialpaginationbooleanf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialpaginationbooleanf]
  }
  @scala.inline
  implicit class PartialpaginationbooleanfOps[Self <: Partialpaginationbooleanf] (val x: Self) extends AnyVal {
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
    def setCellEdit(value: Boolean): Self = this.set("cellEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellEdit: Self = this.set("cellEdit", js.undefined)
    @scala.inline
    def setFilter(value: Boolean): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setPagination(value: Boolean): Self = this.set("pagination", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePagination: Self = this.set("pagination", js.undefined)
    @scala.inline
    def setSearch(value: Boolean): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    @scala.inline
    def setSort(value: Boolean): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
  
}

