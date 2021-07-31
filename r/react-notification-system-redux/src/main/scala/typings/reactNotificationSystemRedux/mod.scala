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
  class ^ ()
    extends Component[NotificationsProps, js.Object, js.Any]
  @JSImport("react-notification-system-redux", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-notification-system-redux", "error")
  @js.native
  val error: NotificationShow = js.native
  
  @scala.inline
  def hide(): Action[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[Action[js.Any]]
  @scala.inline
  def hide(opts: String): Action[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")(opts.asInstanceOf[js.Any]).asInstanceOf[Action[js.Any]]
  @scala.inline
  def hide(opts: Double): Action[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")(opts.asInstanceOf[js.Any]).asInstanceOf[Action[js.Any]]
  @scala.inline
  def hide(opts: Notification): Action[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")(opts.asInstanceOf[js.Any]).asInstanceOf[Action[js.Any]]
  
  @JSImport("react-notification-system-redux", "info")
  @js.native
  val info: NotificationShow = js.native
  
  @JSImport("react-notification-system-redux", "reducer")
  @js.native
  val reducer: NotificationsReducer[js.Any] = js.native
  
  @scala.inline
  def removeAll(): Action[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")().asInstanceOf[Action[js.Any]]
  
  @scala.inline
  def show(): Action[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("show")().asInstanceOf[Action[js.Any]]
  @scala.inline
  def show(opts: Unit, level: NotificationLevel): Action[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(opts.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Action[js.Any]]
  @scala.inline
  def show(opts: Notification): Action[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(opts.asInstanceOf[js.Any]).asInstanceOf[Action[js.Any]]
  @scala.inline
  def show(opts: Notification, level: NotificationLevel): Action[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(opts.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Action[js.Any]]
  
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
    
    @scala.inline
    def error: typings.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.error = "error".asInstanceOf[typings.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.error]
    
    @scala.inline
    def info: typings.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.info = "info".asInstanceOf[typings.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.info]
    
    @scala.inline
    def success: typings.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.success = "success".asInstanceOf[typings.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.success]
    
    @scala.inline
    def warning: typings.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.warning = "warning".asInstanceOf[typings.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.warning]
  }
  
  type NotificationShow = js.Function1[/* opts */ js.UndefOr[Notification], Action[js.Any]]
  
  type Notifications = Component[NotificationsProps, js.Object, js.Any]
  
  trait NotificationsProps
    extends StObject
       with Attributes {
    
    var notifications: js.UndefOr[js.Array[Notification]] = js.undefined
  }
  object NotificationsProps {
    
    @scala.inline
    def apply(): NotificationsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationsProps]
    }
    
    @scala.inline
    implicit class NotificationsPropsMutableBuilder[Self <: NotificationsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNotifications(value: js.Array[Notification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
      
      @scala.inline
      def setNotificationsVarargs(value: Notification*): Self = StObject.set(x, "notifications", js.Array(value :_*))
    }
  }
  
  type NotificationsReducer[A /* <: Action[js.Any] */] = js.Function2[/* state */ NotificationsState, /* action */ A, NotificationsState]
  
  type NotificationsState = js.Array[Notification]
}
