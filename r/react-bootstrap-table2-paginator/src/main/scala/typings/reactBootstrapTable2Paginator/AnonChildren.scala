package typings.reactBootstrapTable2Paginator

import typings.react.mod.ReactElement
import typings.reactBootstrapTableNext.mod.PaginationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var pagination: js.UndefOr[PaginationOptions] = js.undefined
  def children(childProps: AnonPaginationProps): ReactElement | Null
}

object AnonChildren {
  @scala.inline
  def apply(children: AnonPaginationProps => ReactElement | Null, pagination: PaginationOptions = null): AnonChildren = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (pagination != null) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren]
  }
}

