package typings.reactNotificationSystemRedux

import typings.react.mod.Component
import typings.reactNotificationSystem.mod.Attributes
import typings.reactNotificationSystem.mod.Notification
import typings.redux.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-notification-system-redux", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[NotificationsProps, js.Object, js.Any]
  
  @JSImport("react-notification-system-redux", "error")
  @js.native
  val error: NotificationShow = js.native
  
  @JSImport("react-notification-system-redux", "hide")
  @js.native
  def hide(): Action[_] = js.native
  @JSImport("react-notification-system-redux", "hide")
  @js.native
  def hide(opts: String): Action[_] = js.native
  @JSImport("react-notification-system-redux", "hide")
  @js.native
  def hide(opts: Double): Action[_] = js.native
  @JSImport("react-notification-system-redux", "hide")
  @js.native
  def hide(opts: Notification): Action[_] = js.native
  
  @JSImport("react-notification-system-redux", "info")
  @js.native
  val info: NotificationShow = js.native
  
  @JSImport("react-notification-system-redux", "reducer")
  @js.native
  val reducer: NotificationsReducer[js.Any] = js.native
  
  @JSImport("react-notification-system-redux", "removeAll")
  @js.native
  def removeAll(): Action[_] = js.native
  
  @JSImport("react-notification-system-redux", "show")
  @js.native
  def show(): Action[_] = js.native
  @JSImport("react-notification-system-redux", "show")
  @js.native
  def show(opts: js.UndefOr[scala.Nothing], level: NotificationLevel): Action[_] = js.native
  @JSImport("react-notification-system-redux", "show")
  @js.native
  def show(opts: Notification): Action[_] = js.native
  @JSImport("react-notification-system-redux", "show")
  @js.native
  def show(opts: Notification, level: NotificationLevel): Action[_] = js.native
  
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
  
  @js.native
  trait NotificationsProps extends Attributes {
    
    var notifications: js.UndefOr[js.Array[Notification]] = js.native
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
  
  type NotificationsReducer[A /* <: Action[_] */] = js.Function2[/* state */ NotificationsState, /* action */ A, NotificationsState]
  
  type NotificationsState = js.Array[Notification]
}
