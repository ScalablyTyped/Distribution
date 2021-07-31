package typings.sharepoint.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SPNotifications {
  
  @JSGlobal("SPNotifications.ContainerID")
  @js.native
  object ContainerID extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SPNotifications.ContainerID & Double] = js.native
    
    /* 0 */ val Basic: typings.sharepoint.SPNotifications.ContainerID.Basic & Double = js.native
    
    /* 1 */ val Status: typings.sharepoint.SPNotifications.ContainerID.Status & Double = js.native
  }
  
  @JSGlobal("SPNotifications.EventID")
  @js.native
  object EventID extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SPNotifications.EventID & Double] = js.native
    
    /* 2 */ val OnDisplayNotification: typings.sharepoint.SPNotifications.EventID.OnDisplayNotification & Double = js.native
    
    /* 1 */ val OnHide: typings.sharepoint.SPNotifications.EventID.OnHide & Double = js.native
    
    /* 4 */ val OnNotificationCountChanged: typings.sharepoint.SPNotifications.EventID.OnNotificationCountChanged & Double = js.native
    
    /* 3 */ val OnRemoveNotification: typings.sharepoint.SPNotifications.EventID.OnRemoveNotification & Double = js.native
    
    /* 0 */ val OnShow: typings.sharepoint.SPNotifications.EventID.OnShow & Double = js.native
  }
}
