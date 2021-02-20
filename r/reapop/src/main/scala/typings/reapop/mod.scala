package typings.reapop

import typings.react.mod.CSSProperties
import typings.react.mod.global.JSX.Element
import typings.reapop.actionsMod.DismissNotificationAction
import typings.reapop.actionsMod.DismissNotificationsAction
import typings.reapop.actionsMod.NotificationActions
import typings.reapop.actionsMod.UpsertNotificationAction
import typings.reapop.anon.DismissNotification
import typings.reapop.anon.PartialNotification
import typings.reapop.anon.PartialNotificationConfig
import typings.reapop.notificationsSystemMod.Props
import typings.reapop.reapopStrings.`bottom-center`
import typings.reapop.reapopStrings.`bottom-left`
import typings.reapop.reapopStrings.`bottom-right`
import typings.reapop.reapopStrings.`top-center`
import typings.reapop.reapopStrings.`top-left`
import typings.reapop.reapopStrings.`top-right`
import typings.reapop.reapopStrings.error
import typings.reapop.reapopStrings.info
import typings.reapop.reapopStrings.loading
import typings.reapop.reapopStrings.none
import typings.reapop.reapopStrings.success
import typings.reapop.reapopStrings.warning
import typings.reapop.reducerMod.InitReduxAction
import typings.reapop.themesTypesMod.Theme
import typings.reapop.typesMod.Notification
import typings.reapop.typesMod.Position
import typings.reapop.typesMod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("reapop", JSImport.Default)
  @js.native
  def default(props: Props): Element = js.native
  
  @JSImport("reapop", "FadeTransition")
  @js.native
  def FadeTransition(props: typings.reapop.fadeTransitionMod.Props): Element = js.native
  
  @JSImport("reapop", "GrowTransition")
  @js.native
  def GrowTransition(props: typings.reapop.growTransitionMod.Props): Element = js.native
  
  @JSImport("reapop", "NotificationsProvider")
  @js.native
  def NotificationsProvider(props: typings.reapop.notificationsProviderMod.Props): Element = js.native
  
  object POSITIONS {
    
    @JSImport("reapop", "POSITIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("reapop", "POSITIONS.bottomCenter")
    @js.native
    def bottomCenter: `bottom-center` = js.native
    @scala.inline
    def bottomCenter_=(x: `bottom-center`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomCenter")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop", "POSITIONS.bottomLeft")
    @js.native
    def bottomLeft: `bottom-left` = js.native
    @scala.inline
    def bottomLeft_=(x: `bottom-left`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomLeft")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop", "POSITIONS.bottomRight")
    @js.native
    def bottomRight: `bottom-right` = js.native
    @scala.inline
    def bottomRight_=(x: `bottom-right`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomRight")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop", "POSITIONS.topCenter")
    @js.native
    def topCenter: `top-center` = js.native
    @scala.inline
    def topCenter_=(x: `top-center`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topCenter")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop", "POSITIONS.topLeft")
    @js.native
    def topLeft: `top-left` = js.native
    @scala.inline
    def topLeft_=(x: `top-left`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topLeft")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop", "POSITIONS.topRight")
    @js.native
    def topRight: `top-right` = js.native
    @scala.inline
    def topRight_=(x: `top-right`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topRight")(x.asInstanceOf[js.Any])
  }
  
  object STATUSES {
    
    @JSImport("reapop", "STATUSES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("reapop", "STATUSES.error")
    @js.native
    def error: typings.reapop.reapopStrings.error = js.native
    @scala.inline
    def error_=(x: error): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop", "STATUSES.info")
    @js.native
    def info: typings.reapop.reapopStrings.info = js.native
    @scala.inline
    def info_=(x: info): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop", "STATUSES.loading")
    @js.native
    def loading: typings.reapop.reapopStrings.loading = js.native
    @scala.inline
    def loading_=(x: loading): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loading")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop", "STATUSES.none")
    @js.native
    def none: typings.reapop.reapopStrings.none = js.native
    @scala.inline
    def none_=(x: none): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop", "STATUSES.success")
    @js.native
    def success: typings.reapop.reapopStrings.success = js.native
    @scala.inline
    def success_=(x: success): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("success")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop", "STATUSES.warning")
    @js.native
    def warning: typings.reapop.reapopStrings.warning = js.native
    @scala.inline
    def warning_=(x: warning): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warning")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("reapop", "SlideTransition")
  @js.native
  def SlideTransition(props: typings.reapop.slideTransitionMod.Props): Element = js.native
  
  @JSImport("reapop", "atalhoTheme")
  @js.native
  val atalhoTheme: Theme = js.native
  
  object baseTheme {
    
    @JSImport("reapop", "baseTheme.container")
    @js.native
    def container(position: Position): CSSProperties = js.native
  }
  
  @JSImport("reapop", "bootstrapTheme")
  @js.native
  val bootstrapTheme: Theme = js.native
  
  @JSImport("reapop", "dismissNotification")
  @js.native
  def dismissNotification(notificationId: String): DismissNotificationAction = js.native
  
  @JSImport("reapop", "dismissNotifications")
  @js.native
  def dismissNotifications(): DismissNotificationsAction = js.native
  
  @JSImport("reapop", "notify")
  @js.native
  def notify_(message: String): UpsertNotificationAction = js.native
  @JSImport("reapop", "notify")
  @js.native
  def notify_(message: String, options: PartialNotification): UpsertNotificationAction = js.native
  @JSImport("reapop", "notify")
  @js.native
  def notify_(message: String, status: Status): UpsertNotificationAction = js.native
  @JSImport("reapop", "notify")
  @js.native
  def notify_(message: String, status: Status, options: PartialNotification): UpsertNotificationAction = js.native
  @JSImport("reapop", "notify")
  @js.native
  def notify_(notification: PartialNotification): UpsertNotificationAction = js.native
  
  @JSImport("reapop", "reducer")
  @js.native
  def reducer(): js.Function2[
    /* state */ js.UndefOr[js.Array[Notification]], 
    /* action */ NotificationActions | InitReduxAction, 
    js.Array[Notification]
  ] = js.native
  
  @JSImport("reapop", "setUpNotifications")
  @js.native
  def setUpNotifications(props: PartialNotificationConfig): Unit = js.native
  
  @JSImport("reapop", "useNotifications")
  @js.native
  def useNotifications(): DismissNotification = js.native
  
  @JSImport("reapop", "wyboTheme")
  @js.native
  val wyboTheme: Theme = js.native
}
