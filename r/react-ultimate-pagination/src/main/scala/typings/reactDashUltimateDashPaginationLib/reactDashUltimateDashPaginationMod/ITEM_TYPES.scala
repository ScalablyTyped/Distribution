package typings
package reactDashUltimateDashPaginationLib.reactDashUltimateDashPaginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ITEM_TYPES extends js.Object

@JSImport("react-ultimate-pagination", "ITEM_TYPES")
@js.native
object ITEM_TYPES extends js.Object {
  @js.native
  sealed trait ELLIPSIS
    extends reactDashUltimateDashPaginationLib.reactDashUltimateDashPaginationMod.ITEM_TYPES
  
  @js.native
  sealed trait FIRST_PAGE_LINK
    extends reactDashUltimateDashPaginationLib.reactDashUltimateDashPaginationMod.ITEM_TYPES
  
  @js.native
  sealed trait LAST_PAGE_LINK
    extends reactDashUltimateDashPaginationLib.reactDashUltimateDashPaginationMod.ITEM_TYPES
  
  @js.native
  sealed trait NEXT_PAGE_LINK
    extends reactDashUltimateDashPaginationLib.reactDashUltimateDashPaginationMod.ITEM_TYPES
  
  @js.native
  sealed trait PAGE
    extends reactDashUltimateDashPaginationLib.reactDashUltimateDashPaginationMod.ITEM_TYPES
  
  @js.native
  sealed trait PREVIOUS_PAGE_LINK
    extends reactDashUltimateDashPaginationLib.reactDashUltimateDashPaginationMod.ITEM_TYPES
  
  /* "ELLIPSIS" */ val ELLIPSIS: ELLIPSIS with java.lang.String = js.native
  /* "FIRST_PAGE_LINK" */ val FIRST_PAGE_LINK: FIRST_PAGE_LINK with java.lang.String = js.native
  /* "LAST_PAGE_LINK" */ val LAST_PAGE_LINK: LAST_PAGE_LINK with java.lang.String = js.native
  /* "NEXT_PAGE_LINK" */ val NEXT_PAGE_LINK: NEXT_PAGE_LINK with java.lang.String = js.native
  /* "PAGE" */ val PAGE: PAGE with java.lang.String = js.native
  /* "PREVIOUS_PAGE_LINK" */ val PREVIOUS_PAGE_LINK: PREVIOUS_PAGE_LINK with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    reactDashUltimateDashPaginationLib.reactDashUltimateDashPaginationMod.ITEM_TYPES with java.lang.String
  ] = js.native
}

