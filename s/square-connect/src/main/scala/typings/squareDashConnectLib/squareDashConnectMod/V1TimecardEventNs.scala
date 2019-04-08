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
    sealed trait APICREATE
      extends squareDashConnectLib.squareDashConnectMod.V1TimecardEventNs.EventTypeEnum
    
    @js.native
    sealed trait APIDELETE
      extends squareDashConnectLib.squareDashConnectMod.V1TimecardEventNs.EventTypeEnum
    
    @js.native
    sealed trait APIEDIT
      extends squareDashConnectLib.squareDashConnectMod.V1TimecardEventNs.EventTypeEnum
    
    @js.native
    sealed trait DASHBOARDDELETE
      extends squareDashConnectLib.squareDashConnectMod.V1TimecardEventNs.EventTypeEnum
    
    @js.native
    sealed trait DASHBOARDEDIT
      extends squareDashConnectLib.squareDashConnectMod.V1TimecardEventNs.EventTypeEnum
    
    @js.native
    sealed trait DASHBOARDSUPERVISORCLOSE
      extends squareDashConnectLib.squareDashConnectMod.V1TimecardEventNs.EventTypeEnum
    
    @js.native
    sealed trait REGISTERCLOCKIN
      extends squareDashConnectLib.squareDashConnectMod.V1TimecardEventNs.EventTypeEnum
    
    @js.native
    sealed trait REGISTERCLOCKOUT
      extends squareDashConnectLib.squareDashConnectMod.V1TimecardEventNs.EventTypeEnum
    
    /* "API_CREATE" */ val APICREATE: APICREATE with java.lang.String = js.native
    /* "API_DELETE" */ val APIDELETE: APIDELETE with java.lang.String = js.native
    /* "API_EDIT" */ val APIEDIT: APIEDIT with java.lang.String = js.native
    /* "DASHBOARD_DELETE" */ val DASHBOARDDELETE: DASHBOARDDELETE with java.lang.String = js.native
    /* "DASHBOARD_EDIT" */ val DASHBOARDEDIT: DASHBOARDEDIT with java.lang.String = js.native
    /* "DASHBOARD_SUPERVISOR_CLOSE" */ val DASHBOARDSUPERVISORCLOSE: DASHBOARDSUPERVISORCLOSE with java.lang.String = js.native
    /* "REGISTER_CLOCKIN" */ val REGISTERCLOCKIN: REGISTERCLOCKIN with java.lang.String = js.native
    /* "REGISTER_CLOCKOUT" */ val REGISTERCLOCKOUT: REGISTERCLOCKOUT with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1TimecardEventNs.EventTypeEnum with java.lang.String
      ] = js.native
  }
  
}

