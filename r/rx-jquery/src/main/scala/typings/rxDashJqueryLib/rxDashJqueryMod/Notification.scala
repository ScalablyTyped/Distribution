package typings
package rxDashJqueryLib.rxDashJqueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Notifications
@JSImport("rx-jquery", "Notification")
@js.native
class Notification[T] ()
  extends rxDashLiteLib.RxNs.Notification[T]

// Notifications
@JSImport("rx-jquery", "Notification")
@js.native
object Notification extends js.Object {
  def createOnCompleted[T](): rxDashLiteLib.RxNs.Notification[T] = js.native
  def createOnError[T](exception: js.Any): rxDashLiteLib.RxNs.Notification[T] = js.native
  def createOnNext[T](value: T): rxDashLiteLib.RxNs.Notification[T] = js.native
}

