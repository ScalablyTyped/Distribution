package typings.rcNotification

import typings.rcNotification.notificationMod.NotificationInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-notification/lib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default ()
    extends typings.rcNotification.notificationMod.default
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: AnonAnimation = js.native
    def newInstance(
      properties: NotificationPropsgetConta,
      callback: js.Function1[/* instance */ NotificationInstance, Unit]
    ): Unit = js.native
  }
  
}

