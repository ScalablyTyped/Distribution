package typings.reapop

import typings.reapop.anon.PartialNotification
import typings.reapop.notificationsConstantsMod.NotificationAction.DismissNotification
import typings.reapop.notificationsConstantsMod.NotificationAction.DismissNotifications
import typings.reapop.notificationsConstantsMod.NotificationAction.UpsertNotification
import typings.reapop.typesMod.Notification
import typings.reapop.typesMod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsMod {
  
  @JSImport("reapop/dist/reducers/notifications/actions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dismissNotification(notificationId: String): DismissNotificationAction = ^.asInstanceOf[js.Dynamic].applyDynamic("dismissNotification")(notificationId.asInstanceOf[js.Any]).asInstanceOf[DismissNotificationAction]
  
  inline def dismissNotifications(): DismissNotificationsAction = ^.asInstanceOf[js.Dynamic].applyDynamic("dismissNotifications")().asInstanceOf[DismissNotificationsAction]
  
  inline def notify_(message: String): UpsertNotificationAction = ^.asInstanceOf[js.Dynamic].applyDynamic("notify")(message.asInstanceOf[js.Any]).asInstanceOf[UpsertNotificationAction]
  inline def notify_(message: String, options: PartialNotification): UpsertNotificationAction = (^.asInstanceOf[js.Dynamic].applyDynamic("notify")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UpsertNotificationAction]
  inline def notify_(message: String, status: Status): UpsertNotificationAction = (^.asInstanceOf[js.Dynamic].applyDynamic("notify")(message.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[UpsertNotificationAction]
  inline def notify_(message: String, status: Status, options: PartialNotification): UpsertNotificationAction = (^.asInstanceOf[js.Dynamic].applyDynamic("notify")(message.asInstanceOf[js.Any], status.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UpsertNotificationAction]
  inline def notify_(notification: PartialNotification): UpsertNotificationAction = ^.asInstanceOf[js.Dynamic].applyDynamic("notify")(notification.asInstanceOf[js.Any]).asInstanceOf[UpsertNotificationAction]
  
  trait DismissNotificationAction
    extends StObject
       with NotificationActions {
    
    var payload: String
    
    var `type`: DismissNotification
  }
  object DismissNotificationAction {
    
    inline def apply(payload: String, `type`: DismissNotification): DismissNotificationAction = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DismissNotificationAction]
    }
    
    extension [Self <: DismissNotificationAction](x: Self) {
      
      inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setType(value: DismissNotification): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DismissNotificationsAction
    extends StObject
       with NotificationActions {
    
    var `type`: DismissNotifications
  }
  object DismissNotificationsAction {
    
    inline def apply(`type`: DismissNotifications): DismissNotificationsAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DismissNotificationsAction]
    }
    
    extension [Self <: DismissNotificationsAction](x: Self) {
      
      inline def setType(value: DismissNotifications): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reapop.actionsMod.UpsertNotificationAction
    - typings.reapop.actionsMod.DismissNotificationAction
    - typings.reapop.actionsMod.DismissNotificationsAction
  */
  trait NotificationActions extends StObject
  object NotificationActions {
    
    inline def DismissNotificationAction(payload: String, `type`: DismissNotification): typings.reapop.actionsMod.DismissNotificationAction = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reapop.actionsMod.DismissNotificationAction]
    }
    
    inline def DismissNotificationsAction(`type`: DismissNotifications): typings.reapop.actionsMod.DismissNotificationsAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reapop.actionsMod.DismissNotificationsAction]
    }
    
    inline def UpsertNotificationAction(payload: Notification, `type`: UpsertNotification): typings.reapop.actionsMod.UpsertNotificationAction = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reapop.actionsMod.UpsertNotificationAction]
    }
  }
  
  trait UpsertNotificationAction
    extends StObject
       with NotificationActions {
    
    var payload: Notification
    
    var `type`: UpsertNotification
  }
  object UpsertNotificationAction {
    
    inline def apply(payload: Notification, `type`: UpsertNotification): UpsertNotificationAction = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpsertNotificationAction]
    }
    
    extension [Self <: UpsertNotificationAction](x: Self) {
      
      inline def setPayload(value: Notification): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setType(value: UpsertNotification): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
