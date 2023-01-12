package typings.reactNotificationSystemRedux

import typings.react.mod.Component
import typings.reactNotificationSystem.mod.Attributes
import typings.reactNotificationSystem.mod.Notification
import typings.redux.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-notification-system-redux", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[NotificationsProps, js.Object, Any]
  @JSImport("react-notification-system-redux", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-notification-system-redux", "error")
  @js.native
  val error: NotificationShow = js.native
  
  inline def hide(): Action[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[Action[Any]]
  inline def hide(opts: String): Action[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")(opts.asInstanceOf[js.Any]).asInstanceOf[Action[Any]]
  inline def hide(opts: Double): Action[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")(opts.asInstanceOf[js.Any]).asInstanceOf[Action[Any]]
  inline def hide(opts: Notification): Action[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")(opts.asInstanceOf[js.Any]).asInstanceOf[Action[Any]]
  
  @JSImport("react-notification-system-redux", "info")
  @js.native
  val info: NotificationShow = js.native
  
  @JSImport("react-notification-system-redux", "reducer")
  @js.native
  val reducer: NotificationsReducer[Any] = js.native
  
  inline def removeAll(): Action[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")().asInstanceOf[Action[Any]]
  
  inline def show(): Action[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("show")().asInstanceOf[Action[Any]]
  inline def show(opts: Unit, level: NotificationLevel): Action[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(opts.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Action[Any]]
  inline def show(opts: Notification): Action[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(opts.asInstanceOf[js.Any]).asInstanceOf[Action[Any]]
  inline def show(opts: Notification, level: NotificationLevel): Action[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(opts.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Action[Any]]
  
  @JSImport("react-notification-system-redux", "success")
  @js.native
  val success: NotificationShow = js.native
  
  @JSImport("react-notification-system-redux", "warning")
  @js.native
  val warning: NotificationShow = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.error
    - typings.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.warning
    - typings.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.info
    - typings.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.success
  */
  trait NotificationLevel extends StObject
  object NotificationLevel {
    
    inline def error: typings.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.error = "error".asInstanceOf[typings.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.error]
    
    inline def info: typings.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.info = "info".asInstanceOf[typings.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.info]
    
    inline def success: typings.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.success = "success".asInstanceOf[typings.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.success]
    
    inline def warning: typings.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.warning = "warning".asInstanceOf[typings.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.warning]
  }
  
  type NotificationShow = js.Function1[/* opts */ js.UndefOr[Notification], Action[Any]]
  
  type Notifications = Component[NotificationsProps, js.Object, Any]
  
  trait NotificationsProps
    extends StObject
       with Attributes {
    
    var notifications: js.UndefOr[js.Array[Notification]] = js.undefined
  }
  object NotificationsProps {
    
    inline def apply(): NotificationsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotificationsProps] (val x: Self) extends AnyVal {
      
      inline def setNotifications(value: js.Array[Notification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      inline def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
      
      inline def setNotificationsVarargs(value: Notification*): Self = StObject.set(x, "notifications", js.Array(value*))
    }
  }
  
  type NotificationsReducer[A /* <: Action[Any] */] = js.Function2[/* state */ NotificationsState, /* action */ A, NotificationsState]
  
  type NotificationsState = js.Array[Notification]
}
