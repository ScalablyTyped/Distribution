package typings.rxjs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.NotificationOptions
import typings.std.NotificationPermission
import typings.std.NotificationPermissionCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/Notification", JSImport.Namespace)
@js.native
object notificationMod extends js.Object {
  @js.native
  class NotificationCls protected ()
    extends typings.rxjsDashCompat.notificationMod.NotificationCls {
    def this(title: String) = this()
    def this(title: String, options: NotificationOptions) = this()
  }
  
  @js.native
  object Notification
    extends Instantiable1[/* title */ String, typings.std.Notification]
       with Instantiable2[/* title */ String, /* options */ NotificationOptions, typings.std.Notification] {
    val maxActions: Double = js.native
    val permission: NotificationPermission = js.native
    def requestPermission(): js.Promise[NotificationPermission] = js.native
    def requestPermission(deprecatedCallback: NotificationPermissionCallback): js.Promise[NotificationPermission] = js.native
  }
  
}

