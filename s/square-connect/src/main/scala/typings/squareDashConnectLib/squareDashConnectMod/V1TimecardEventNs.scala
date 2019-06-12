package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1TimecardEvent")
@js.native
object V1TimecardEventNs extends js.Object {
  @js.native
  sealed trait EventTypeEnum extends js.Object
  
  @js.native
  object EventTypeEnum extends js.Object {
    @js.native
    sealed trait API_CREATE
      extends squareDashConnectLib.squareDashConnectMod.V1TimecardEventNs.EventTypeEnum
    
    @js.native
    sealed trait API_DELETE
      extends squareDashConnectLib.squareDashConnectMod.V1TimecardEventNs.EventTypeEnum
    
    @js.native
    sealed trait API_EDIT
      extends squareDashConnectLib.squareDashConnectMod.V1TimecardEventNs.EventTypeEnum
    
    @js.native
    sealed trait DASHBOARD_DELETE
      extends squareDashConnectLib.squareDashConnectMod.V1TimecardEventNs.EventTypeEnum
    
    @js.native
    sealed trait DASHBOARD_EDIT
      extends squareDashConnectLib.squareDashConnectMod.V1TimecardEventNs.EventTypeEnum
    
    @js.native
    sealed trait DASHBOARD_SUPERVISOR_CLOSE
      extends squareDashConnectLib.squareDashConnectMod.V1TimecardEventNs.EventTypeEnum
    
    @js.native
    sealed trait REGISTER_CLOCKIN
      extends squareDashConnectLib.squareDashConnectMod.V1TimecardEventNs.EventTypeEnum
    
    @js.native
    sealed trait REGISTER_CLOCKOUT
      extends squareDashConnectLib.squareDashConnectMod.V1TimecardEventNs.EventTypeEnum
    
    /* "API_CREATE" */ val API_CREATE: API_CREATE with java.lang.String = js.native
    /* "API_DELETE" */ val API_DELETE: API_DELETE with java.lang.String = js.native
    /* "API_EDIT" */ val API_EDIT: API_EDIT with java.lang.String = js.native
    /* "DASHBOARD_DELETE" */ val DASHBOARD_DELETE: DASHBOARD_DELETE with java.lang.String = js.native
    /* "DASHBOARD_EDIT" */ val DASHBOARD_EDIT: DASHBOARD_EDIT with java.lang.String = js.native
    /* "DASHBOARD_SUPERVISOR_CLOSE" */ val DASHBOARD_SUPERVISOR_CLOSE: DASHBOARD_SUPERVISOR_CLOSE with java.lang.String = js.native
    /* "REGISTER_CLOCKIN" */ val REGISTER_CLOCKIN: REGISTER_CLOCKIN with java.lang.String = js.native
    /* "REGISTER_CLOCKOUT" */ val REGISTER_CLOCKOUT: REGISTER_CLOCKOUT with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1TimecardEventNs.EventTypeEnum with java.lang.String
      ] = js.native
  }
  
}

