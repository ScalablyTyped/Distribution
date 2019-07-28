package typings.reactDashUltimateDashPagination.reactDashUltimateDashPaginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ITEM_TYPES extends js.Object

@JSImport("react-ultimate-pagination", "ITEM_TYPES")
@js.native
object ITEM_TYPES extends js.Object {
  @js.native
  sealed trait ELLIPSIS extends ITEM_TYPES
  
  @js.native
  sealed trait FIRST_PAGE_LINK extends ITEM_TYPES
  
  @js.native
  sealed trait LAST_PAGE_LINK extends ITEM_TYPES
  
  @js.native
  sealed trait NEXT_PAGE_LINK extends ITEM_TYPES
  
  @js.native
  sealed trait PAGE extends ITEM_TYPES
  
  @js.native
  sealed trait PREVIOUS_PAGE_LINK extends ITEM_TYPES
  
  /* "ELLIPSIS" */ val ELLIPSIS: typings.reactDashUltimateDashPagination.reactDashUltimateDashPaginationMod.ITEM_TYPES.ELLIPSIS with String = js.native
  /* "FIRST_PAGE_LINK" */ val FIRST_PAGE_LINK: typings.reactDashUltimateDashPagination.reactDashUltimateDashPaginationMod.ITEM_TYPES.FIRST_PAGE_LINK with String = js.native
  /* "LAST_PAGE_LINK" */ val LAST_PAGE_LINK: typings.reactDashUltimateDashPagination.reactDashUltimateDashPaginationMod.ITEM_TYPES.LAST_PAGE_LINK with String = js.native
  /* "NEXT_PAGE_LINK" */ val NEXT_PAGE_LINK: typings.reactDashUltimateDashPagination.reactDashUltimateDashPaginationMod.ITEM_TYPES.NEXT_PAGE_LINK with String = js.native
  /* "PAGE" */ val PAGE: typings.reactDashUltimateDashPagination.reactDashUltimateDashPaginationMod.ITEM_TYPES.PAGE with String = js.native
  /* "PREVIOUS_PAGE_LINK" */ val PREVIOUS_PAGE_LINK: typings.reactDashUltimateDashPagination.reactDashUltimateDashPaginationMod.ITEM_TYPES.PREVIOUS_PAGE_LINK with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ITEM_TYPES with String] = js.native
}

