package typings.rxDom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Notifications
@JSImport("rx-dom", "Notification")
@js.native
class Notification[T] ()
  extends typings.rx.mod.Notification[T]

/* static members */
@JSImport("rx-dom", "Notification")
@js.native
object Notification extends js.Object {
  def createOnCompleted[T](): typings.rxLite.Rx.Notification[T] = js.native
  def createOnError[T](exception: js.Any): typings.rxLite.Rx.Notification[T] = js.native
  def createOnNext[T](value: T): typings.rxLite.Rx.Notification[T] = js.native
}

