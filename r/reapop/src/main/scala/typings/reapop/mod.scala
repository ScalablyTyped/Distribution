package typings.reapop

import typings.react.mod.CSSProperties
import typings.react.mod.global.JSX.Element
import typings.reapop.actionsMod.DismissNotificationAction
import typings.reapop.actionsMod.DismissNotificationsAction
import typings.reapop.actionsMod.NotificationActions
import typings.reapop.anon.DismissNotification
import typings.reapop.anon.PartialNotificationConfig
import typings.reapop.fadeTransitionMod.Props
import typings.reapop.reapopStrings.`bottom-center`
import typings.reapop.reapopStrings.`bottom-left`
import typings.reapop.reapopStrings.`bottom-right`
import typings.reapop.reapopStrings.`top-center`
import typings.reapop.reapopStrings.`top-left`
import typings.reapop.reapopStrings.`top-right`
import typings.reapop.reducerMod.InitReduxAction
import typings.reapop.themesTypesMod.Theme
import typings.reapop.typesMod.Notification
import typings.reapop.typesMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("reapop", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def FadeTransition(props: Props): Element = js.native
  
  def GrowTransition(props: typings.reapop.growTransitionMod.Props): Element = js.native
  
  def NotificationsProvider(props: typings.reapop.notificationsProviderMod.Props): Element = js.native
  
  def SlideTransition(props: typings.reapop.slideTransitionMod.Props): Element = js.native
  
  val atalhoTheme: Theme = js.native
  
  val bootstrapTheme: Theme = js.native
  
  def default(props: typings.reapop.notificationsSystemMod.Props): Element = js.native
  
  def dismissNotification(notificationId: String): DismissNotificationAction = js.native
  
  def dismissNotifications(): DismissNotificationsAction = js.native
  
  def reducer(): js.Function2[
    /* state */ js.UndefOr[js.Array[Notification]], 
    /* action */ NotificationActions | InitReduxAction, 
    js.Array[Notification]
  ] = js.native
  
  def setUpNotifications(props: PartialNotificationConfig): Unit = js.native
  
  def useNotifications(): DismissNotification = js.native
  
  val wyboTheme: Theme = js.native
  
  @js.native
  object POSITIONS extends js.Object {
    
    var bottomCenter: `bottom-center` = js.native
    
    var bottomLeft: `bottom-left` = js.native
    
    var bottomRight: `bottom-right` = js.native
    
    var topCenter: `top-center` = js.native
    
    var topLeft: `top-left` = js.native
    
    var topRight: `top-right` = js.native
  }
  
  @js.native
  object STATUSES extends js.Object {
    
    var error: typings.reapop.reapopStrings.error = js.native
    
    var info: typings.reapop.reapopStrings.info = js.native
    
    var loading: typings.reapop.reapopStrings.loading = js.native
    
    var none: typings.reapop.reapopStrings.none = js.native
    
    var success: typings.reapop.reapopStrings.success = js.native
    
    var warning: typings.reapop.reapopStrings.warning = js.native
  }
  
  @js.native
  object baseTheme extends js.Object {
    
    def container(position: Position): CSSProperties = js.native
  }
}
