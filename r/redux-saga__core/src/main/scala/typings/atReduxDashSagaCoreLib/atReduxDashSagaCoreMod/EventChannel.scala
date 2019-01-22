package typings
package atReduxDashSagaCoreLib.atReduxDashSagaCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventChannel[T] extends js.Object {
  def close(): scala.Unit
  def flush(cb: js.Function1[/* items */ js.Array[T] | END, scala.Unit]): scala.Unit
  def take(cb: js.Function1[/* message */ T | END, scala.Unit]): scala.Unit
}

