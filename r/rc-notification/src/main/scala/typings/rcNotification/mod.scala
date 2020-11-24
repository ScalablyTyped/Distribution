package typings.rcNotification

import typings.rcNotification.anon.Animation
import typings.rcNotification.anon.NotificationPropsgetConta
import typings.rcNotification.notificationMod.NotificationInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-notification", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class default ()
    extends typings.rcNotification.notificationMod.default
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: Animation = js.native
    
    def newInstance(
      properties: NotificationPropsgetConta,
      callback: js.Function1[/* instance */ NotificationInstance, Unit]
    ): Unit = js.native
  }
}
