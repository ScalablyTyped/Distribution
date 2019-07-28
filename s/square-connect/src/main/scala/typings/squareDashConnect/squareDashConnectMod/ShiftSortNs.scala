package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.ShiftSortNs.FieldEnum
import typings.squareDashConnect.squareDashConnectMod.ShiftSortNs.OrderEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ShiftSort")
@js.native
object ShiftSortNs extends js.Object {
  @js.native
  sealed trait FieldEnum extends js.Object
  
  @js.native
  sealed trait OrderEnum extends js.Object
  
  @js.native
  object FieldEnum extends js.Object {
    @js.native
    sealed trait CREATED_AT extends FieldEnum
    
    @js.native
    sealed trait END_AT extends FieldEnum
    
    @js.native
    sealed trait START_AT extends FieldEnum
    
    @js.native
    sealed trait UPDATED_AT extends FieldEnum
    
    /* "CREATED_AT" */ val CREATED_AT: typings.squareDashConnect.squareDashConnectMod.ShiftSortNs.FieldEnum.CREATED_AT with String = js.native
    /* "END_AT" */ val END_AT: typings.squareDashConnect.squareDashConnectMod.ShiftSortNs.FieldEnum.END_AT with String = js.native
    /* "START_AT" */ val START_AT: typings.squareDashConnect.squareDashConnectMod.ShiftSortNs.FieldEnum.START_AT with String = js.native
    /* "UPDATED_AT" */ val UPDATED_AT: typings.squareDashConnect.squareDashConnectMod.ShiftSortNs.FieldEnum.UPDATED_AT with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FieldEnum with String] = js.native
  }
  
  @js.native
  object OrderEnum extends js.Object {
    @js.native
    sealed trait ASC extends OrderEnum
    
    @js.native
    sealed trait DESC extends OrderEnum
    
    /* "ASC" */ val ASC: typings.squareDashConnect.squareDashConnectMod.ShiftSortNs.OrderEnum.ASC with String = js.native
    /* "DESC" */ val DESC: typings.squareDashConnect.squareDashConnectMod.ShiftSortNs.OrderEnum.DESC with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[OrderEnum with String] = js.native
  }
  
}

