package typings.reduxSagaCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventChannel_[T] extends js.Object {
  def close(): Unit
  def flush(cb: js.Function1[/* items */ js.Array[T] | END, Unit]): Unit
  def take(cb: js.Function1[/* message */ T | END, Unit]): Unit
}

object EventChannel_ {
  @scala.inline
  def apply[T](
    close: () => Unit,
    flush: js.Function1[/* items */ js.Array[T] | END, Unit] => Unit,
    take: js.Function1[/* message */ T | END, Unit] => Unit
  ): EventChannel_[T] = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), flush = js.Any.fromFunction1(flush), take = js.Any.fromFunction1(take))
    __obj.asInstanceOf[EventChannel_[T]]
  }
}

