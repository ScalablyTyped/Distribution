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
  
  val OnDisplayNotification: OnDisplayNotification with java.lang.String = js.native
  val OnHide: OnHide with java.lang.String = js.native
  val OnNotificationCountChanged: OnNotificationCountChanged with java.lang.String = js.native
  val OnRemoveNotification: OnRemoveNotification with java.lang.String = js.native
  val OnShow: OnShow with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNotificationsNs.EventID with java.lang.String] = js.native
}

