package typings.reactBootstrapTable2Paginator.anon

import typings.react.mod.ReactElement
import typings.reactBootstrapTable2Paginator.mod.PaginationCtxOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children extends js.Object {
  var pagination: js.UndefOr[PaginationCtxOptions] = js.undefined
  def children(childProps: PaginationProps): ReactElement | Null
}

object Children {
  @scala.inline
  def apply(children: PaginationProps => ReactElement | Null, pagination: PaginationCtxOptions = null): Children = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (pagination != null) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
}

