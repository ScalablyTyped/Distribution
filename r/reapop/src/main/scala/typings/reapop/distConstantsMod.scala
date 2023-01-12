package typings.reapop

import typings.reapop.anon.PartialNotification
import typings.reapop.distReducersNotificationsTypesMod.NewNotification
import typings.reapop.distReducersNotificationsTypesMod.Notification
import typings.reapop.distReducersNotificationsTypesMod.Position
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConstantsMod {
  
  @JSImport("reapop/dist/constants", "CONFIG")
  @js.native
  val CONFIG: NotificationConfig = js.native
  
  object POSITIONS {
    
    @JSImport("reapop/dist/constants", "POSITIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("reapop/dist/constants", "POSITIONS.bottomCenter")
    @js.native
    def bottomCenter: `bottom-center` = js.native
    inline def bottomCenter_=(x: `bottom-center`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomCenter")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "POSITIONS.bottomLeft")
    @js.native
    def bottomLeft: `bottom-left` = js.native
    inline def bottomLeft_=(x: `bottom-left`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomLeft")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "POSITIONS.bottomRight")
    @js.native
    def bottomRight: `bottom-right` = js.native
    inline def bottomRight_=(x: `bottom-right`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomRight")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "POSITIONS.topCenter")
    @js.native
    def topCenter: `top-center` = js.native
    inline def topCenter_=(x: `top-center`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topCenter")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "POSITIONS.topLeft")
    @js.native
    def topLeft: `top-left` = js.native
    inline def topLeft_=(x: `top-left`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topLeft")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "POSITIONS.topRight")
    @js.native
    def topRight: `top-right` = js.native
    inline def topRight_=(x: `top-right`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topRight")(x.asInstanceOf[js.Any])
  }
  
  object STATUSES {
    
    @JSImport("reapop/dist/constants", "STATUSES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("reapop/dist/constants", "STATUSES.error")
    @js.native
    def error: typings.reapop.reapopStrings.error = js.native
    inline def error_=(x: error): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "STATUSES.info")
    @js.native
    def info: typings.reapop.reapopStrings.info = js.native
    inline def info_=(x: info): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "STATUSES.loading")
    @js.native
    def loading: typings.reapop.reapopStrings.loading = js.native
    inline def loading_=(x: loading): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loading")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "STATUSES.none")
    @js.native
    def none: typings.reapop.reapopStrings.none = js.native
    inline def none_=(x: none): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "STATUSES.success")
    @js.native
    def success: typings.reapop.reapopStrings.success = js.native
    inline def success_=(x: success): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("success")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "STATUSES.warning")
    @js.native
    def warning: typings.reapop.reapopStrings.warning = js.native
    inline def warning_=(x: warning): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warning")(x.asInstanceOf[js.Any])
  }
  
  object classnames {
    
    @JSImport("reapop/dist/constants", "classnames")
    @js.native
    val ^ : js.Any = js.native
    
    inline def container(position: Position, singleContainer: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("container")(position.asInstanceOf[js.Any], singleContainer.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    inline def notification(notification: Notification): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("notification")(notification.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    @JSImport("reapop/dist/constants", "classnames.notificationButton")
    @js.native
    def notificationButton: String = js.native
    
    @JSImport("reapop/dist/constants", "classnames.notificationButtonText")
    @js.native
    def notificationButtonText: String = js.native
    inline def notificationButtonText_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notificationButtonText")(x.asInstanceOf[js.Any])
    
    inline def notificationButton_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notificationButton")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "classnames.notificationButtons")
    @js.native
    def notificationButtons: String = js.native
    inline def notificationButtons_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notificationButtons")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "classnames.notificationDismissIcon")
    @js.native
    def notificationDismissIcon: String = js.native
    inline def notificationDismissIcon_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notificationDismissIcon")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "classnames.notificationIcon")
    @js.native
    def notificationIcon: String = js.native
    inline def notificationIcon_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notificationIcon")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "classnames.notificationImage")
    @js.native
    def notificationImage: String = js.native
    
    @JSImport("reapop/dist/constants", "classnames.notificationImageContainer")
    @js.native
    def notificationImageContainer: String = js.native
    inline def notificationImageContainer_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notificationImageContainer")(x.asInstanceOf[js.Any])
    
    inline def notificationImage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notificationImage")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "classnames.notificationMessage")
    @js.native
    def notificationMessage: String = js.native
    inline def notificationMessage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notificationMessage")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "classnames.notificationMeta")
    @js.native
    def notificationMeta: String = js.native
    inline def notificationMeta_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notificationMeta")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop/dist/constants", "classnames.notificationTitle")
    @js.native
    def notificationTitle: String = js.native
    inline def notificationTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notificationTitle")(x.asInstanceOf[js.Any])
  }
  
  trait NotificationConfig extends StObject {
    
    var customizeNotification: (js.Function1[/* notification */ NewNotification, Unit]) | Null
    
    var defaultProps: PartialNotification
    
    var generateId: (js.Function1[/* notification */ NewNotification, String]) | Null
  }
  object NotificationConfig {
    
    inline def apply(defaultProps: PartialNotification): NotificationConfig = {
      val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any], customizeNotification = null, generateId = null)
      __obj.asInstanceOf[NotificationConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotificationConfig] (val x: Self) extends AnyVal {
      
      inline def setCustomizeNotification(value: /* notification */ NewNotification => Unit): Self = StObject.set(x, "customizeNotification", js.Any.fromFunction1(value))
      
      inline def setCustomizeNotificationNull: Self = StObject.set(x, "customizeNotification", null)
      
      inline def setDefaultProps(value: PartialNotification): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
      
      inline def setGenerateId(value: /* notification */ NewNotification => String): Self = StObject.set(x, "generateId", js.Any.fromFunction1(value))
      
      inline def setGenerateIdNull: Self = StObject.set(x, "generateId", null)
    }
  }
}
