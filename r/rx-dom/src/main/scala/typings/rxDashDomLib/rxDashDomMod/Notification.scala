package typings
package rxDashDomLib.rxDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Notifications
@JSImport("rx-dom", "Notification")
@js.native
class Notification[T] ()
  extends rxLib.rxMod.Notification[T]

// Notifications
@JSImport("rx-dom", "Notification")
@js.native
object Notification extends js.Object {
  def createOnCompleted[T](): rxDashLiteLib.RxNs.Notification[T] = js.native
  def createOnError[T](exception: js.Any): rxDashLiteLib.RxNs.Notification[T] = js.native
  def createOnNext[T](value: T): rxDashLiteLib.RxNs.Notification[T] = js.native
}

