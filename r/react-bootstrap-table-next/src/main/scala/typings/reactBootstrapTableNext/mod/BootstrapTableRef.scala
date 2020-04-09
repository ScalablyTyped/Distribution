package typings.reactBootstrapTableNext.mod

import typings.reactBootstrapTableNext.AnonCurrFilters
import typings.reactBootstrapTableNext.AnonCurrPage
import typings.reactBootstrapTableNext.AnonProps
import typings.reactBootstrapTableNext.AnonSelected
import typings.reactBootstrapTableNext.AnonStartEditing
import typings.reactBootstrapTableNext.AnonState
import typings.reactBootstrapTableNext.AnonStateAnonSortColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapTableRef[T /* <: js.Object */] extends js.Object {
  var cellEditContext: js.UndefOr[AnonStartEditing] = js.undefined
  var filterContext: js.UndefOr[AnonCurrFilters] = js.undefined
  var paginationContext: js.UndefOr[AnonCurrPage] = js.undefined
  var rowExpandContext: js.UndefOr[AnonState] = js.undefined
  var selectionContext: js.UndefOr[AnonSelected] = js.undefined
  var sortContext: js.UndefOr[AnonStateAnonSortColumn[T]] = js.undefined
  var table: AnonProps[T]
}

object BootstrapTableRef {
  @scala.inline
  def apply[T /* <: js.Object */](
    table: AnonProps[T],
    cellEditContext: AnonStartEditing = null,
    filterContext: AnonCurrFilters = null,
    paginationContext: AnonCurrPage = null,
    rowExpandContext: AnonState = null,
    selectionContext: AnonSelected = null,
    sortContext: AnonStateAnonSortColumn[T] = null
  ): BootstrapTableRef[T] = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
    if (cellEditContext != null) __obj.updateDynamic("cellEditContext")(cellEditContext.asInstanceOf[js.Any])
    if (filterContext != null) __obj.updateDynamic("filterContext")(filterContext.asInstanceOf[js.Any])
    if (paginationContext != null) __obj.updateDynamic("paginationContext")(paginationContext.asInstanceOf[js.Any])
    if (rowExpandContext != null) __obj.updateDynamic("rowExpandContext")(rowExpandContext.asInstanceOf[js.Any])
    if (selectionContext != null) __obj.updateDynamic("selectionContext")(selectionContext.asInstanceOf[js.Any])
    if (sortContext != null) __obj.updateDynamic("sortContext")(sortContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapTableRef[T]]
  }
}

