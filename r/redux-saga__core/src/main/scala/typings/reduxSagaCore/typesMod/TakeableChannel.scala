package typings.reduxSagaCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TakeableChannel[T] extends js.Object {
  def take(cb: js.Function1[/* message */ T | END, Unit]): Unit
}

object TakeableChannel {
  @scala.inline
  def apply[T](take: js.Function1[/* message */ T | END, Unit] => Unit): TakeableChannel[T] = {
    val __obj = js.Dynamic.literal(take = js.Any.fromFunction1(take))
  
    __obj.asInstanceOf[TakeableChannel[T]]
  }
}

