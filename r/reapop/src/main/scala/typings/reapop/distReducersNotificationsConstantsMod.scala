package typings.reapop

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distReducersNotificationsConstantsMod {
  
  @js.native
  sealed trait NotificationAction extends StObject
  @JSImport("reapop/dist/reducers/notifications/constants", "NotificationAction")
  @js.native
  object NotificationAction extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[NotificationAction & String] = js.native
    
    @js.native
    sealed trait DismissNotification
      extends StObject
         with NotificationAction
    /* "reapop/dismissNotification" */ val DismissNotification: typings.reapop.distReducersNotificationsConstantsMod.NotificationAction.DismissNotification & String = js.native
    
    @js.native
    sealed trait DismissNotifications
      extends StObject
         with NotificationAction
    /* "reapop/dismissNotifications" */ val DismissNotifications: typings.reapop.distReducersNotificationsConstantsMod.NotificationAction.DismissNotifications & String = js.native
    
    @js.native
    sealed trait UpsertNotification
      extends StObject
         with NotificationAction
    /* "reapop/upsertNotification" */ val UpsertNotification: typings.reapop.distReducersNotificationsConstantsMod.NotificationAction.UpsertNotification & String = js.native
  }
}
