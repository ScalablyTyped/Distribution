package typings.rcNotification

import typings.rcNotification.esNotificationMod.NoticeFunc
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUseNotificationMod {
  
  @JSImport("rc-notification/es/useNotification", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(notificationInstance: typings.rcNotification.esNotificationMod.default): js.Tuple2[NoticeFunc, ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(notificationInstance.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[NoticeFunc, ReactElement]]
}
