package typings.rxJquery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Notifications
@JSImport("rx-jquery", "Notification")
@js.native
class Notification[T] ()
  extends typings.rxLite.Rx.Notification[T]

/* static members */
@JSImport("rx-jquery", "Notification")
@js.native
object Notification extends js.Object {
  def createOnCompleted[T](): typings.rxLite.Rx.Notification[T] = js.native
  def createOnError[T](exception: js.Any): typings.rxLite.Rx.Notification[T] = js.native
  def createOnNext[T](value: T): typings.rxLite.Rx.Notification[T] = js.native
}

