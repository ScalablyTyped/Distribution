package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.ShiftSort.FieldEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ShiftSort")
@js.native
class ShiftSort () extends js.Object {
  /**
    * The field to sort on. See [ShiftSortField](#type-shiftsortfield) for possible values.
    */
  var field: js.UndefOr[FieldEnum] = js.native
  /**
    * The order in which results are returned. Defaults to DESC. See [SortOrder](#type-sortorder) for possible values.
    */
  var order: js.UndefOr[SortOrderEnum] = js.native
}

@JSImport("square-connect", "ShiftSort")
@js.native
object ShiftSort extends js.Object {
  @js.native
  sealed trait FieldEnum extends js.Object
  
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
    
    /* "CREATED_AT" */ val CREATED_AT: typings.squareDashConnect.squareDashConnectMod.ShiftSort.FieldEnum.CREATED_AT with String = js.native
    /* "END_AT" */ val END_AT: typings.squareDashConnect.squareDashConnectMod.ShiftSort.FieldEnum.END_AT with String = js.native
    /* "START_AT" */ val START_AT: typings.squareDashConnect.squareDashConnectMod.ShiftSort.FieldEnum.START_AT with String = js.native
    /* "UPDATED_AT" */ val UPDATED_AT: typings.squareDashConnect.squareDashConnectMod.ShiftSort.FieldEnum.UPDATED_AT with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FieldEnum with String] = js.native
  }
  
}

