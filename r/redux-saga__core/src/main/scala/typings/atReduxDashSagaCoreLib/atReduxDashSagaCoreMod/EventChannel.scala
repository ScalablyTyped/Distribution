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

object EventChannel {
  @scala.inline
  def apply[T](
    close: () => scala.Unit,
    flush: js.Function1[/* items */ js.Array[T] | END, scala.Unit] => scala.Unit,
    take: js.Function1[/* message */ T | END, scala.Unit] => scala.Unit
  ): EventChannel[T] = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), flush = js.Any.fromFunction1(flush), take = js.Any.fromFunction1(take))
  
    __obj.asInstanceOf[EventChannel[T]]
  }
}

