package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1TimecardEventNs.EventTypeEnum
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
    sealed trait API_CREATE extends EventTypeEnum
    
    @js.native
    sealed trait API_DELETE extends EventTypeEnum
    
    @js.native
    sealed trait API_EDIT extends EventTypeEnum
    
    @js.native
    sealed trait DASHBOARD_DELETE extends EventTypeEnum
    
    @js.native
    sealed trait DASHBOARD_EDIT extends EventTypeEnum
    
    @js.native
    sealed trait DASHBOARD_SUPERVISOR_CLOSE extends EventTypeEnum
    
    @js.native
    sealed trait REGISTER_CLOCKIN extends EventTypeEnum
    
    @js.native
    sealed trait REGISTER_CLOCKOUT extends EventTypeEnum
    
    /* "API_CREATE" */ val API_CREATE: typings.squareDashConnect.squareDashConnectMod.V1TimecardEventNs.EventTypeEnum.API_CREATE with String = js.native
    /* "API_DELETE" */ val API_DELETE: typings.squareDashConnect.squareDashConnectMod.V1TimecardEventNs.EventTypeEnum.API_DELETE with String = js.native
    /* "API_EDIT" */ val API_EDIT: typings.squareDashConnect.squareDashConnectMod.V1TimecardEventNs.EventTypeEnum.API_EDIT with String = js.native
    /* "DASHBOARD_DELETE" */ val DASHBOARD_DELETE: typings.squareDashConnect.squareDashConnectMod.V1TimecardEventNs.EventTypeEnum.DASHBOARD_DELETE with String = js.native
    /* "DASHBOARD_EDIT" */ val DASHBOARD_EDIT: typings.squareDashConnect.squareDashConnectMod.V1TimecardEventNs.EventTypeEnum.DASHBOARD_EDIT with String = js.native
    /* "DASHBOARD_SUPERVISOR_CLOSE" */ val DASHBOARD_SUPERVISOR_CLOSE: typings.squareDashConnect.squareDashConnectMod.V1TimecardEventNs.EventTypeEnum.DASHBOARD_SUPERVISOR_CLOSE with String = js.native
    /* "REGISTER_CLOCKIN" */ val REGISTER_CLOCKIN: typings.squareDashConnect.squareDashConnectMod.V1TimecardEventNs.EventTypeEnum.REGISTER_CLOCKIN with String = js.native
    /* "REGISTER_CLOCKOUT" */ val REGISTER_CLOCKOUT: typings.squareDashConnect.squareDashConnectMod.V1TimecardEventNs.EventTypeEnum.REGISTER_CLOCKOUT with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EventTypeEnum with String] = js.native
  }
  
}

