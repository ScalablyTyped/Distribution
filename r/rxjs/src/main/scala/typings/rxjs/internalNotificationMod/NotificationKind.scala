package typings.rxjs.internalNotificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NotificationKind extends js.Object

@JSImport("rxjs/internal/Notification", "NotificationKind")
@js.native
object NotificationKind extends js.Object {
  @js.native
  sealed trait COMPLETE extends NotificationKind
  
  @js.native
  sealed trait ERROR extends NotificationKind
  
  @js.native
  sealed trait NEXT extends NotificationKind
  
  /* "C" */ val COMPLETE: typings.rxjs.internalNotificationMod.NotificationKind.COMPLETE with String = js.native
  /* "E" */ val ERROR: typings.rxjs.internalNotificationMod.NotificationKind.ERROR with String = js.native
  /* "N" */ val NEXT: typings.rxjs.internalNotificationMod.NotificationKind.NEXT with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NotificationKind with String] = js.native
}

