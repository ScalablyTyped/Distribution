package typings.reapop

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationsConstantsMod {
  
  @js.native
  sealed trait NotificationAction extends StObject
  @JSImport("reapop/dist/reducers/notifications/constants", "NotificationAction")
  @js.native
  object NotificationAction extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[NotificationAction with String] = js.native
    
    @js.native
    sealed trait DismissNotification extends NotificationAction
    /* "reapop/dismissNotification" */ val DismissNotification: typings.reapop.notificationsConstantsMod.NotificationAction.DismissNotification with String = js.native
    
    @js.native
    sealed trait DismissNotifications extends NotificationAction
    /* "reapop/dismissNotifications" */ val DismissNotifications: typings.reapop.notificationsConstantsMod.NotificationAction.DismissNotifications with String = js.native
    
    @js.native
    sealed trait UpsertNotification extends NotificationAction
    /* "reapop/upsertNotification" */ val UpsertNotification: typings.reapop.notificationsConstantsMod.NotificationAction.UpsertNotification with String = js.native
  }
}
