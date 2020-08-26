package typings.reduxSagaCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TakeableChannel[T] extends js.Object {
  def take(cb: js.Function1[/* message */ T | END, Unit]): Unit = js.native
}

object TakeableChannel {
  @scala.inline
  def apply[T](take: js.Function1[/* message */ T | END, Unit] => Unit): TakeableChannel[T] = {
    val __obj = js.Dynamic.literal(take = js.Any.fromFunction1(take))
    __obj.asInstanceOf[TakeableChannel[T]]
  }
  @scala.inline
  implicit class TakeableChannelOps[Self <: TakeableChannel[_], T] (val x: Self with TakeableChannel[T]) extends AnyVal {
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
    def setTake(value: js.Function1[/* message */ T | END, Unit] => Unit): Self = this.set("take", js.Any.fromFunction1(value))
  }
  
}

