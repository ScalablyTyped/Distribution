package typings
package squareDashConnectLib.squareDashConnectMod

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
    sealed trait CREATED_AT
      extends squareDashConnectLib.squareDashConnectMod.ShiftSortNs.FieldEnum
    
    @js.native
    sealed trait END_AT
      extends squareDashConnectLib.squareDashConnectMod.ShiftSortNs.FieldEnum
    
    @js.native
    sealed trait START_AT
      extends squareDashConnectLib.squareDashConnectMod.ShiftSortNs.FieldEnum
    
    @js.native
    sealed trait UPDATED_AT
      extends squareDashConnectLib.squareDashConnectMod.ShiftSortNs.FieldEnum
    
    /* "CREATED_AT" */ val CREATED_AT: CREATED_AT with java.lang.String = js.native
    /* "END_AT" */ val END_AT: END_AT with java.lang.String = js.native
    /* "START_AT" */ val START_AT: START_AT with java.lang.String = js.native
    /* "UPDATED_AT" */ val UPDATED_AT: UPDATED_AT with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.ShiftSortNs.FieldEnum with java.lang.String
      ] = js.native
  }
  
  @js.native
  object OrderEnum extends js.Object {
    @js.native
    sealed trait ASC
      extends squareDashConnectLib.squareDashConnectMod.ShiftSortNs.OrderEnum
    
    @js.native
    sealed trait DESC
      extends squareDashConnectLib.squareDashConnectMod.ShiftSortNs.OrderEnum
    
    /* "ASC" */ val ASC: ASC with java.lang.String = js.native
    /* "DESC" */ val DESC: DESC with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.ShiftSortNs.OrderEnum with java.lang.String
      ] = js.native
  }
  
}

