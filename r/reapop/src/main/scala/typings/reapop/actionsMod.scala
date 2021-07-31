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
  
  @scala.inline
  def dismissNotification(notificationId: String): DismissNotificationAction = ^.asInstanceOf[js.Dynamic].applyDynamic("dismissNotification")(notificationId.asInstanceOf[js.Any]).asInstanceOf[DismissNotificationAction]
  
  @scala.inline
  def dismissNotifications(): DismissNotificationsAction = ^.asInstanceOf[js.Dynamic].applyDynamic("dismissNotifications")().asInstanceOf[DismissNotificationsAction]
  
  @scala.inline
  def notify_(message: String): UpsertNotificationAction = ^.asInstanceOf[js.Dynamic].applyDynamic("notify")(message.asInstanceOf[js.Any]).asInstanceOf[UpsertNotificationAction]
  @scala.inline
  def notify_(message: String, options: PartialNotification): UpsertNotificationAction = (^.asInstanceOf[js.Dynamic].applyDynamic("notify")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UpsertNotificationAction]
  @scala.inline
  def notify_(message: String, status: Status): UpsertNotificationAction = (^.asInstanceOf[js.Dynamic].applyDynamic("notify")(message.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[UpsertNotificationAction]
  @scala.inline
  def notify_(message: String, status: Status, options: PartialNotification): UpsertNotificationAction = (^.asInstanceOf[js.Dynamic].applyDynamic("notify")(message.asInstanceOf[js.Any], status.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UpsertNotificationAction]
  @scala.inline
  def notify_(notification: PartialNotification): UpsertNotificationAction = ^.asInstanceOf[js.Dynamic].applyDynamic("notify")(notification.asInstanceOf[js.Any]).asInstanceOf[UpsertNotificationAction]
  
  trait DismissNotificationAction
    extends StObject
       with NotificationActions {
    
    var payload: String
    
    var `type`: DismissNotification
  }
  object DismissNotificationAction {
    
    @scala.inline
    def apply(payload: String, `type`: DismissNotification): DismissNotificationAction = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DismissNotificationAction]
    }
    
    @scala.inline
    implicit class DismissNotificationActionMutableBuilder[Self <: DismissNotificationAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: DismissNotification): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DismissNotificationsAction
    extends StObject
       with NotificationActions {
    
    var `type`: DismissNotifications
  }
  object DismissNotificationsAction {
    
    @scala.inline
    def apply(`type`: DismissNotifications): DismissNotificationsAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DismissNotificationsAction]
    }
    
    @scala.inline
    implicit class DismissNotificationsActionMutableBuilder[Self <: DismissNotificationsAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: DismissNotifications): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reapop.actionsMod.UpsertNotificationAction
    - typings.reapop.actionsMod.DismissNotificationAction
    - typings.reapop.actionsMod.DismissNotificationsAction
  */
  trait NotificationActions extends StObject
  object NotificationActions {
    
    @scala.inline
    def DismissNotificationAction(payload: String, `type`: DismissNotification): typings.reapop.actionsMod.DismissNotificationAction = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reapop.actionsMod.DismissNotificationAction]
    }
    
    @scala.inline
    def DismissNotificationsAction(`type`: DismissNotifications): typings.reapop.actionsMod.DismissNotificationsAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reapop.actionsMod.DismissNotificationsAction]
    }
    
    @scala.inline
    def UpsertNotificationAction(payload: Notification, `type`: UpsertNotification): typings.reapop.actionsMod.UpsertNotificationAction = {
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
    
    @scala.inline
    def apply(payload: Notification, `type`: UpsertNotification): UpsertNotificationAction = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpsertNotificationAction]
    }
    
    @scala.inline
    implicit class UpsertNotificationActionMutableBuilder[Self <: UpsertNotificationAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: Notification): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: UpsertNotification): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
