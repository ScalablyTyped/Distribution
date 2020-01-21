package typings.reactUltimatePagination.mod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ITEM_TYPES with String] = js.native
  /* "ELLIPSIS" */ @js.native
  object ELLIPSIS extends TopLevel[ELLIPSIS with String]
  
  /* "FIRST_PAGE_LINK" */ @js.native
  object FIRST_PAGE_LINK extends TopLevel[FIRST_PAGE_LINK with String]
  
  /* "LAST_PAGE_LINK" */ @js.native
  object LAST_PAGE_LINK extends TopLevel[LAST_PAGE_LINK with String]
  
  /* "NEXT_PAGE_LINK" */ @js.native
  object NEXT_PAGE_LINK extends TopLevel[NEXT_PAGE_LINK with String]
  
  /* "PAGE" */ @js.native
  object PAGE extends TopLevel[PAGE with String]
  
  /* "PREVIOUS_PAGE_LINK" */ @js.native
  object PREVIOUS_PAGE_LINK extends TopLevel[PREVIOUS_PAGE_LINK with String]
  
}

