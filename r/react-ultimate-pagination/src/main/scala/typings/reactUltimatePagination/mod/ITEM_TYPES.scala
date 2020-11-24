package typings.reactUltimatePagination.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ITEM_TYPES extends js.Object
@JSImport("react-ultimate-pagination", "ITEM_TYPES")
@js.native
object ITEM_TYPES extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ITEM_TYPES with String] = js.native
  
  @js.native
  sealed trait ELLIPSIS extends ITEM_TYPES
  /* "ELLIPSIS" */ @js.native
  object ELLIPSIS extends TopLevel[ELLIPSIS with String]
  
  @js.native
  sealed trait FIRST_PAGE_LINK extends ITEM_TYPES
  /* "FIRST_PAGE_LINK" */ @js.native
  object FIRST_PAGE_LINK extends TopLevel[FIRST_PAGE_LINK with String]
  
  @js.native
  sealed trait LAST_PAGE_LINK extends ITEM_TYPES
  /* "LAST_PAGE_LINK" */ @js.native
  object LAST_PAGE_LINK extends TopLevel[LAST_PAGE_LINK with String]
  
  @js.native
  sealed trait NEXT_PAGE_LINK extends ITEM_TYPES
  /* "NEXT_PAGE_LINK" */ @js.native
  object NEXT_PAGE_LINK extends TopLevel[NEXT_PAGE_LINK with String]
  
  @js.native
  sealed trait PAGE extends ITEM_TYPES
  /* "PAGE" */ @js.native
  object PAGE extends TopLevel[PAGE with String]
  
  @js.native
  sealed trait PREVIOUS_PAGE_LINK extends ITEM_TYPES
  /* "PREVIOUS_PAGE_LINK" */ @js.native
  object PREVIOUS_PAGE_LINK extends TopLevel[PREVIOUS_PAGE_LINK with String]
}
