package typings.sharepoint

import typings.sharepoint.SPNotifications.ContainerID
import typings.sharepoint.SPNotifications.EventID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SPNotifications")
@js.native
object SPNotifications extends js.Object {
  @js.native
  sealed trait ContainerID extends js.Object
  
  @js.native
  sealed trait EventID extends js.Object
  
  @js.native
  object ContainerID extends js.Object {
    @js.native
    sealed trait Basic extends ContainerID
    
    @js.native
    sealed trait Status extends ContainerID
    
    /* 0 */ val Basic: typings.sharepoint.SPNotifications.ContainerID.Basic with Double = js.native
    /* 1 */ val Status: typings.sharepoint.SPNotifications.ContainerID.Status with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ContainerID with Double] = js.native
  }
  
  @js.native
  object EventID extends js.Object {
    @js.native
    sealed trait OnDisplayNotification extends EventID
    
    @js.native
    sealed trait OnHide extends EventID
    
    @js.native
    sealed trait OnNotificationCountChanged extends EventID
    
    @js.native
    sealed trait OnRemoveNotification extends EventID
    
    @js.native
    sealed trait OnShow extends EventID
    
    /* 2 */ val OnDisplayNotification: typings.sharepoint.SPNotifications.EventID.OnDisplayNotification with Double = js.native
    /* 1 */ val OnHide: typings.sharepoint.SPNotifications.EventID.OnHide with Double = js.native
    /* 4 */ val OnNotificationCountChanged: typings.sharepoint.SPNotifications.EventID.OnNotificationCountChanged with Double = js.native
    /* 3 */ val OnRemoveNotification: typings.sharepoint.SPNotifications.EventID.OnRemoveNotification with Double = js.native
    /* 0 */ val OnShow: typings.sharepoint.SPNotifications.EventID.OnShow with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EventID with Double] = js.native
  }
  
}

