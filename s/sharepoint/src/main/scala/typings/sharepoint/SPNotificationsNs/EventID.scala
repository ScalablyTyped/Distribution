package typings.sharepoint.SPNotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventID extends js.Object

@JSGlobal("SPNotifications.EventID")
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
  
  /* 2 */ val OnDisplayNotification: typings.sharepoint.SPNotificationsNs.EventID.OnDisplayNotification with Double = js.native
  /* 1 */ val OnHide: typings.sharepoint.SPNotificationsNs.EventID.OnHide with Double = js.native
  /* 4 */ val OnNotificationCountChanged: typings.sharepoint.SPNotificationsNs.EventID.OnNotificationCountChanged with Double = js.native
  /* 3 */ val OnRemoveNotification: typings.sharepoint.SPNotificationsNs.EventID.OnRemoveNotification with Double = js.native
  /* 0 */ val OnShow: typings.sharepoint.SPNotificationsNs.EventID.OnShow with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventID with Double] = js.native
}

