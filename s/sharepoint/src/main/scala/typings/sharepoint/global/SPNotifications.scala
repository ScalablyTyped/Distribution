package typings.sharepoint.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SPNotifications {
  
  @JSGlobal("SPNotifications.ContainerID")
  @js.native
  object ContainerID extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SPNotifications.ContainerID with Double] = js.native
    
    /* 0 */ val Basic: typings.sharepoint.SPNotifications.ContainerID.Basic with Double = js.native
    
    /* 1 */ val Status: typings.sharepoint.SPNotifications.ContainerID.Status with Double = js.native
  }
  
  @JSGlobal("SPNotifications.EventID")
  @js.native
  object EventID extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SPNotifications.EventID with Double] = js.native
    
    /* 2 */ val OnDisplayNotification: typings.sharepoint.SPNotifications.EventID.OnDisplayNotification with Double = js.native
    
    /* 1 */ val OnHide: typings.sharepoint.SPNotifications.EventID.OnHide with Double = js.native
    
    /* 4 */ val OnNotificationCountChanged: typings.sharepoint.SPNotifications.EventID.OnNotificationCountChanged with Double = js.native
    
    /* 3 */ val OnRemoveNotification: typings.sharepoint.SPNotifications.EventID.OnRemoveNotification with Double = js.native
    
    /* 0 */ val OnShow: typings.sharepoint.SPNotifications.EventID.OnShow with Double = js.native
  }
}
