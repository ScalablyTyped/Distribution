package typings.rxjsDashCompat.notificationMod

import typings.std.NotificationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/Notification", "Notification")
@js.native
class NotificationCls protected ()
  extends typings.std.Notification {
  def this(title: String) = this()
  def this(title: String, options: NotificationOptions) = this()
}

