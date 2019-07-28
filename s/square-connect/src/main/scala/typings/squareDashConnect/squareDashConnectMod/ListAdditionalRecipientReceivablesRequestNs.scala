package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.ListAdditionalRecipientReceivablesRequestNs.SortOrderEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ListAdditionalRecipientReceivablesRequest")
@js.native
object ListAdditionalRecipientReceivablesRequestNs extends js.Object {
  @js.native
  sealed trait SortOrderEnum extends js.Object
  
  @js.native
  object SortOrderEnum extends js.Object {
    @js.native
    sealed trait ASC extends SortOrderEnum
    
    @js.native
    sealed trait DESC extends SortOrderEnum
    
    /* "ASC" */ val ASC: typings.squareDashConnect.squareDashConnectMod.ListAdditionalRecipientReceivablesRequestNs.SortOrderEnum.ASC with String = js.native
    /* "DESC" */ val DESC: typings.squareDashConnect.squareDashConnectMod.ListAdditionalRecipientReceivablesRequestNs.SortOrderEnum.DESC with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SortOrderEnum with String] = js.native
  }
  
}

