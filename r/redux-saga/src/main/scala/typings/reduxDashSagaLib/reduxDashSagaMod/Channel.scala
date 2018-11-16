package typings
package reduxDashSagaLib.reduxDashSagaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel[T] extends js.Object {
  def close(): scala.Unit = js.native
  def flush(): scala.Unit = js.native
  def put(message: T): scala.Unit = js.native
  def put(message: END): scala.Unit = js.native
  def take(cb: js.Function1[/* message */ T | END, scala.Unit]): scala.Unit = js.native
}

