package typings
package atReduxDashSagaCoreLib.atReduxDashSagaCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlushableChannel[T] extends js.Object {
  def flush(cb: js.Function1[/* items */ js.Array[T] | END, scala.Unit]): scala.Unit
}

