package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.NotificationOptions
import typings.std.NotificationPermission
import typings.std.NotificationPermissionCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Notification")
@js.native
class Notification protected ()
  extends typings.std.Notification {
  def this(title: java.lang.String) = this()
  def this(title: java.lang.String, options: NotificationOptions) = this()
}

@JSGlobal("Notification")
@js.native
object Notification
  extends Instantiable1[/* title */ java.lang.String, typings.std.Notification]
     with Instantiable2[
      /* title */ java.lang.String, 
      /* options */ NotificationOptions, 
      typings.std.Notification
    ] {
  val maxActions: Double = js.native
  val permission: NotificationPermission = js.native
  def requestPermission(): js.Promise[NotificationPermission] = js.native
  def requestPermission(deprecatedCallback: NotificationPermissionCallback): js.Promise[NotificationPermission] = js.native
}

