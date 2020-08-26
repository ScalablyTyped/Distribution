package typings.reactBootstrapTable2Paginator.anon

import typings.react.mod.ReactElement
import typings.reactBootstrapTable2Paginator.mod.PaginationCtxOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Children extends js.Object {
  var pagination: js.UndefOr[PaginationCtxOptions] = js.native
  def children(childProps: PaginationProps): ReactElement | Null = js.native
}

object Children {
  @scala.inline
  def apply(children: PaginationProps => ReactElement | Null): Children = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[Children]
  }
  @scala.inline
  implicit class ChildrenOps[Self <: Children] (val x: Self) extends AnyVal {
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
    def setChildren(value: PaginationProps => ReactElement | Null): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setPagination(value: PaginationCtxOptions): Self = this.set("pagination", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePagination: Self = this.set("pagination", js.undefined)
  }
  
}

