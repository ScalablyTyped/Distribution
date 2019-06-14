package typings
package sharepointLib.SPNotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventID extends js.Object

@JSGlobal("SPNotifications.EventID")
@js.native
object EventID extends js.Object {
  @js.native
  sealed trait OnDisplayNotification
    extends sharepointLib.SPNotificationsNs.EventID
  
  @js.native
  sealed trait OnHide
    extends sharepointLib.SPNotificationsNs.EventID
  
  @js.native
  sealed trait OnNotificationCountChanged
    extends sharepointLib.SPNotificationsNs.EventID
  
  @js.native
  sealed trait OnRemoveNotification
    extends sharepointLib.SPNotificationsNs.EventID
  
  @js.native
  sealed trait OnShow
    extends sharepointLib.SPNotificationsNs.EventID
  
  /* 2 */ val OnDisplayNotification: OnDisplayNotification with scala.Double = js.native
  /* 1 */ val OnHide: OnHide with scala.Double = js.native
  /* 4 */ val OnNotificationCountChanged: OnNotificationCountChanged with scala.Double = js.native
  /* 3 */ val OnRemoveNotification: OnRemoveNotification with scala.Double = js.native
  /* 0 */ val OnShow: OnShow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNotificationsNs.EventID with scala.Double] = js.native
}

