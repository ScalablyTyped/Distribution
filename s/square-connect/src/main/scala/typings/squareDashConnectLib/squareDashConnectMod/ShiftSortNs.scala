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
    sealed trait CREATEDAT
      extends squareDashConnectLib.squareDashConnectMod.ShiftSortNs.FieldEnum
    
    @js.native
    sealed trait ENDAT
      extends squareDashConnectLib.squareDashConnectMod.ShiftSortNs.FieldEnum
    
    @js.native
    sealed trait STARTAT
      extends squareDashConnectLib.squareDashConnectMod.ShiftSortNs.FieldEnum
    
    @js.native
    sealed trait UPDATEDAT
      extends squareDashConnectLib.squareDashConnectMod.ShiftSortNs.FieldEnum
    
    /* "CREATED_AT" */ val CREATEDAT: CREATEDAT with java.lang.String = js.native
    /* "END_AT" */ val ENDAT: ENDAT with java.lang.String = js.native
    /* "START_AT" */ val STARTAT: STARTAT with java.lang.String = js.native
    /* "UPDATED_AT" */ val UPDATEDAT: UPDATEDAT with java.lang.String = js.native
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

