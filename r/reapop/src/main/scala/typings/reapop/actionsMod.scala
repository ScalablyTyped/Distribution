package typings.reapop

import typings.reapop.anon.PartialNotification
import typings.reapop.notificationsConstantsMod.NotificationAction.DismissNotification
import typings.reapop.notificationsConstantsMod.NotificationAction.DismissNotifications
import typings.reapop.notificationsConstantsMod.NotificationAction.UpsertNotification
import typings.reapop.typesMod.Notification
import typings.reapop.typesMod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsMod {
  
  @JSImport("reapop/dist/reducers/notifications/actions", "dismissNotification")
  @js.native
  def dismissNotification(notificationId: String): DismissNotificationAction = js.native
  
  @JSImport("reapop/dist/reducers/notifications/actions", "dismissNotifications")
  @js.native
  def dismissNotifications(): DismissNotificationsAction = js.native
  
  @JSImport("reapop/dist/reducers/notifications/actions", "notify")
  @js.native
  def notify_(message: String): UpsertNotificationAction = js.native
  @JSImport("reapop/dist/reducers/notifications/actions", "notify")
  @js.native
  def notify_(message: String, options: PartialNotification): UpsertNotificationAction = js.native
  @JSImport("reapop/dist/reducers/notifications/actions", "notify")
  @js.native
  def notify_(message: String, status: Status): UpsertNotificationAction = js.native
  @JSImport("reapop/dist/reducers/notifications/actions", "notify")
  @js.native
  def notify_(message: String, status: Status, options: PartialNotification): UpsertNotificationAction = js.native
  @JSImport("reapop/dist/reducers/notifications/actions", "notify")
  @js.native
  def notify_(notification: PartialNotification): UpsertNotificationAction = js.native
  
  @js.native
  trait DismissNotificationAction extends NotificationActions {
    
    var payload: String = js.native
    
    var `type`: DismissNotification = js.native
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
  
  @js.native
  trait DismissNotificationsAction extends NotificationActions {
    
    var `type`: DismissNotifications = js.native
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
  
  @js.native
  trait UpsertNotificationAction extends NotificationActions {
    
    var payload: Notification = js.native
    
    var `type`: UpsertNotification = js.native
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
