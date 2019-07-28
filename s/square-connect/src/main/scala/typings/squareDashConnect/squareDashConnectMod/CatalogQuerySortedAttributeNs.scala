package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.CatalogQuerySortedAttributeNs.SortOrderEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogQuerySortedAttribute")
@js.native
object CatalogQuerySortedAttributeNs extends js.Object {
  @js.native
  sealed trait SortOrderEnum extends js.Object
  
  @js.native
  object SortOrderEnum extends js.Object {
    @js.native
    sealed trait ASC extends SortOrderEnum
    
    @js.native
    sealed trait DESC extends SortOrderEnum
    
    /* "ASC" */ val ASC: typings.squareDashConnect.squareDashConnectMod.CatalogQuerySortedAttributeNs.SortOrderEnum.ASC with String = js.native
    /* "DESC" */ val DESC: typings.squareDashConnect.squareDashConnectMod.CatalogQuerySortedAttributeNs.SortOrderEnum.DESC with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SortOrderEnum with String] = js.native
  }
  
}

