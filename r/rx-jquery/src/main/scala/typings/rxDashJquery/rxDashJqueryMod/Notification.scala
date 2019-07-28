package typings.rxDashJquery.rxDashJqueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Notifications
@JSImport("rx-jquery", "Notification")
@js.native
class Notification[T] ()
  extends typings.rxDashLite.RxNs.Notification[T]

/* static members */
@JSImport("rx-jquery", "Notification")
@js.native
object Notification extends js.Object {
  def createOnCompleted[T](): typings.rxDashLite.RxNs.Notification[T] = js.native
  def createOnError[T](exception: js.Any): typings.rxDashLite.RxNs.Notification[T] = js.native
  def createOnNext[T](value: T): typings.rxDashLite.RxNs.Notification[T] = js.native
}

