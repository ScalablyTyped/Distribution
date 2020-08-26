package typings.reduxSagaCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventChannel_[T] extends js.Object {
  def close(): Unit = js.native
  def flush(cb: js.Function1[/* items */ js.Array[T] | END, Unit]): Unit = js.native
  def take(cb: js.Function1[/* message */ T | END, Unit]): Unit = js.native
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
  @scala.inline
  implicit class EventChannel_Ops[Self <: EventChannel_[_], T] (val x: Self with EventChannel_[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setFlush(value: js.Function1[/* items */ js.Array[T] | END, Unit] => Unit): Self = this.set("flush", js.Any.fromFunction1(value))
    @scala.inline
    def setTake(value: js.Function1[/* message */ T | END, Unit] => Unit): Self = this.set("take", js.Any.fromFunction1(value))
  }
  
}

