package typings.rcNotification

import typings.rcNotification.anon.NoticePropstimesnumberund
import typings.rcNotification.esUseNotificationMod.NotificationAPI
import typings.rcNotification.esUseNotificationMod.NotificationConfig
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-notification", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-notification", "Notice")
  @js.native
  val Notice: ForwardRefExoticComponent[NoticePropstimesnumberund] = js.native
  
  inline def useNotification(): js.Tuple2[NotificationAPI, ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNotification")().asInstanceOf[js.Tuple2[NotificationAPI, ReactElement]]
  inline def useNotification(rootConfig: NotificationConfig): js.Tuple2[NotificationAPI, ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNotification")(rootConfig.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[NotificationAPI, ReactElement]]
}
