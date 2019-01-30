package typings
package rxjsLib.internalNotificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NotificationKind extends js.Object

@JSImport("rxjs/internal/Notification", "NotificationKind")
@js.native
object NotificationKind extends js.Object {
  @js.native
  sealed trait COMPLETE
    extends rxjsLib.internalNotificationMod.NotificationKind
  
  @js.native
  sealed trait ERROR
    extends rxjsLib.internalNotificationMod.NotificationKind
  
  @js.native
  sealed trait NEXT
    extends rxjsLib.internalNotificationMod.NotificationKind
  
  /* "C" */ val COMPLETE: COMPLETE with java.lang.String = js.native
  /* "E" */ val ERROR: ERROR with java.lang.String = js.native
  /* "N" */ val NEXT: NEXT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[rxjsLib.internalNotificationMod.NotificationKind with java.lang.String] = js.native
}

