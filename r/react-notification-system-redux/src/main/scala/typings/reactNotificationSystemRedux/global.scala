package typings.reactNotificationSystemRedux

import typings.reactNotificationSystem.mod.Notification
import typings.reactNotificationSystemRedux.mod.NotificationLevel
import typings.reactNotificationSystemRedux.mod.NotificationShow
import typings.reactNotificationSystemRedux.mod.NotificationsReducer
import typings.redux.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Notifications {
    
    @JSGlobal("Notifications")
    @js.native
    open class ^ ()
      extends typings.reactNotificationSystemRedux.mod.^
    
    @JSGlobal("Notifications")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Notifications.error")
    @js.native
    val error: NotificationShow = js.native
    
    inline def hide(): Action[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[Action[Any]]
    inline def hide(opts: String): Action[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")(opts.asInstanceOf[js.Any]).asInstanceOf[Action[Any]]
    inline def hide(opts: Double): Action[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")(opts.asInstanceOf[js.Any]).asInstanceOf[Action[Any]]
    inline def hide(opts: Notification): Action[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")(opts.asInstanceOf[js.Any]).asInstanceOf[Action[Any]]
    
    @JSGlobal("Notifications.info")
    @js.native
    val info: NotificationShow = js.native
    
    @JSGlobal("Notifications.reducer")
    @js.native
    val reducer: NotificationsReducer[Any] = js.native
    
    inline def removeAll(): Action[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")().asInstanceOf[Action[Any]]
    
    inline def show(): Action[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("show")().asInstanceOf[Action[Any]]
    inline def show(opts: Unit, level: NotificationLevel): Action[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(opts.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Action[Any]]
    inline def show(opts: Notification): Action[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(opts.asInstanceOf[js.Any]).asInstanceOf[Action[Any]]
    inline def show(opts: Notification, level: NotificationLevel): Action[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(opts.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Action[Any]]
    
    @JSGlobal("Notifications.success")
    @js.native
    val success: NotificationShow = js.native
    
    @JSGlobal("Notifications.warning")
    @js.native
    val warning: NotificationShow = js.native
  }
}
