package typings.reduxSagaCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlushableChannel[T] extends js.Object {
  def flush(cb: js.Function1[/* items */ js.Array[T] | END, Unit]): Unit
}

object FlushableChannel {
  @scala.inline
  def apply[T](flush: js.Function1[/* items */ js.Array[T] | END, Unit] => Unit): FlushableChannel[T] = {
    val __obj = js.Dynamic.literal(flush = js.Any.fromFunction1(flush))
  
    __obj.asInstanceOf[FlushableChannel[T]]
  }
}

