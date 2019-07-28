package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.ListAdditionalRecipientReceivableRefundsRequestNs.SortOrderEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ListAdditionalRecipientReceivableRefundsRequest")
@js.native
object ListAdditionalRecipientReceivableRefundsRequestNs extends js.Object {
  @js.native
  sealed trait SortOrderEnum extends js.Object
  
  @js.native
  object SortOrderEnum extends js.Object {
    @js.native
    sealed trait ASC extends SortOrderEnum
    
    @js.native
    sealed trait DESC extends SortOrderEnum
    
    /* "ASC" */ val ASC: typings.squareDashConnect.squareDashConnectMod.ListAdditionalRecipientReceivableRefundsRequestNs.SortOrderEnum.ASC with String = js.native
    /* "DESC" */ val DESC: typings.squareDashConnect.squareDashConnectMod.ListAdditionalRecipientReceivableRefundsRequestNs.SortOrderEnum.DESC with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SortOrderEnum with String] = js.native
  }
  
}

