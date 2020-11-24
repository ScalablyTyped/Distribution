package typings.reapop

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("reapop/dist/reducers/notifications/constants", JSImport.Namespace)
@js.native
object notificationsConstantsMod extends js.Object {
  
  @js.native
  sealed trait NotificationAction extends js.Object
  @js.native
  object NotificationAction extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[NotificationAction with String] = js.native
    
    @js.native
    sealed trait DismissNotification extends NotificationAction
    /* "reapop/dismissNotification" */ @js.native
    object DismissNotification extends TopLevel[DismissNotification with String]
    
    @js.native
    sealed trait DismissNotifications extends NotificationAction
    /* "reapop/dismissNotifications" */ @js.native
    object DismissNotifications extends TopLevel[DismissNotifications with String]
    
    @js.native
    sealed trait UpsertNotification extends NotificationAction
    /* "reapop/upsertNotification" */ @js.native
    object UpsertNotification extends TopLevel[UpsertNotification with String]
  }
}
