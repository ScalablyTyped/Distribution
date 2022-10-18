package typings.reapop

import typings.reapop.distReducersNotificationsTypesMod.NewNotification
import typings.reapop.distReducersNotificationsTypesMod.NotificationButton
import typings.reapop.distReducersNotificationsTypesMod.Position
import typings.reapop.distReducersNotificationsTypesMod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DismissNotification extends StObject {
    
    var dismissNotification: typings.reapop.distComponentsNotificationsSystemMod.DismissNotification
    
    var notification: typings.reapop.distReducersNotificationsTypesMod.Notification
  }
  object DismissNotification {
    
    inline def apply(
      dismissNotification: /* id */ String => Unit,
      notification: typings.reapop.distReducersNotificationsTypesMod.Notification
    ): DismissNotification = {
      val __obj = js.Dynamic.literal(dismissNotification = js.Any.fromFunction1(dismissNotification), notification = notification.asInstanceOf[js.Any])
      __obj.asInstanceOf[DismissNotification]
    }
    
    extension [Self <: DismissNotification](x: Self) {
      
      inline def setDismissNotification(value: /* id */ String => Unit): Self = StObject.set(x, "dismissNotification", js.Any.fromFunction1(value))
      
      inline def setNotification(value: typings.reapop.distReducersNotificationsTypesMod.Notification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    }
  }
  
  trait Duration extends StObject {
    
    var duration: js.UndefOr[Double] = js.undefined
  }
  object Duration {
    
    inline def apply(): Duration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Duration]
    }
    
    extension [Self <: Duration](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [Partial<Notification> | string, Partial<Notification> | Status | undefined, Partial<Notification> | undefined] is not an array type */ args: js.Tuple3[
          PartialNotification | String, 
          js.UndefOr[PartialNotification | Status], 
          js.UndefOr[PartialNotification]
        ]
    ): typings.reapop.distReducersNotificationsTypesMod.Notification = js.native
    def apply(message: String): typings.reapop.distReducersNotificationsTypesMod.Notification = js.native
    def apply(message: String, options: PartialNotification): typings.reapop.distReducersNotificationsTypesMod.Notification = js.native
    def apply(message: String, status: Status): typings.reapop.distReducersNotificationsTypesMod.Notification = js.native
    def apply(message: String, status: Status, options: PartialNotification): typings.reapop.distReducersNotificationsTypesMod.Notification = js.native
    def apply(notification: PartialNotification): typings.reapop.distReducersNotificationsTypesMod.Notification = js.native
  }
  
  trait Notification extends StObject {
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var notification: typings.reapop.distReducersNotificationsTypesMod.Notification
  }
  object Notification {
    
    inline def apply(notification: typings.reapop.distReducersNotificationsTypesMod.Notification): Notification = {
      val __obj = js.Dynamic.literal(notification = notification.asInstanceOf[js.Any])
      __obj.asInstanceOf[Notification]
    }
    
    extension [Self <: Notification](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setNotification(value: typings.reapop.distReducersNotificationsTypesMod.Notification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<reapop.reapop/dist/reducers/notifications/types.Notification> */
  trait PartialNotification extends StObject {
    
    var allowHTML: js.UndefOr[Boolean] = js.undefined
    
    var buttons: js.UndefOr[js.Array[NotificationButton]] = js.undefined
    
    var dismissAfter: js.UndefOr[Double] = js.undefined
    
    var dismissible: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var image: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var onAdd: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    var onDismiss: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    var position: js.UndefOr[Position] = js.undefined
    
    var showDismissButton: js.UndefOr[Boolean] = js.undefined
    
    var status: js.UndefOr[Status] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object PartialNotification {
    
    inline def apply(): PartialNotification = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialNotification]
    }
    
    extension [Self <: PartialNotification](x: Self) {
      
      inline def setAllowHTML(value: Boolean): Self = StObject.set(x, "allowHTML", value.asInstanceOf[js.Any])
      
      inline def setAllowHTMLUndefined: Self = StObject.set(x, "allowHTML", js.undefined)
      
      inline def setButtons(value: js.Array[NotificationButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: NotificationButton*): Self = StObject.set(x, "buttons", js.Array(value*))
      
      inline def setDismissAfter(value: Double): Self = StObject.set(x, "dismissAfter", value.asInstanceOf[js.Any])
      
      inline def setDismissAfterUndefined: Self = StObject.set(x, "dismissAfter", js.undefined)
      
      inline def setDismissible(value: Boolean): Self = StObject.set(x, "dismissible", value.asInstanceOf[js.Any])
      
      inline def setDismissibleUndefined: Self = StObject.set(x, "dismissible", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOnAdd(value: /* repeated */ Any => Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
      
      inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
      
      inline def setOnDismiss(value: /* repeated */ Any => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setShowDismissButton(value: Boolean): Self = StObject.set(x, "showDismissButton", value.asInstanceOf[js.Any])
      
      inline def setShowDismissButtonUndefined: Self = StObject.set(x, "showDismissButton", js.undefined)
      
      inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Inlined std.Partial<reapop.reapop/dist/constants.NotificationConfig> */
  trait PartialNotificationConfig extends StObject {
    
    var customizeNotification: js.UndefOr[(js.Function1[/* notification */ NewNotification, Unit]) | Null] = js.undefined
    
    var defaultProps: js.UndefOr[PartialNotification] = js.undefined
    
    var generateId: js.UndefOr[(js.Function1[/* notification */ NewNotification, String]) | Null] = js.undefined
  }
  object PartialNotificationConfig {
    
    inline def apply(): PartialNotificationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialNotificationConfig]
    }
    
    extension [Self <: PartialNotificationConfig](x: Self) {
      
      inline def setCustomizeNotification(value: /* notification */ NewNotification => Unit): Self = StObject.set(x, "customizeNotification", js.Any.fromFunction1(value))
      
      inline def setCustomizeNotificationNull: Self = StObject.set(x, "customizeNotification", null)
      
      inline def setCustomizeNotificationUndefined: Self = StObject.set(x, "customizeNotification", js.undefined)
      
      inline def setDefaultProps(value: PartialNotification): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
      
      inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
      
      inline def setGenerateId(value: /* notification */ NewNotification => String): Self = StObject.set(x, "generateId", js.Any.fromFunction1(value))
      
      inline def setGenerateIdNull: Self = StObject.set(x, "generateId", null)
      
      inline def setGenerateIdUndefined: Self = StObject.set(x, "generateId", js.undefined)
    }
  }
}
