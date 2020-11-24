package typings.reduxSagaCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlushableChannel[T] extends js.Object {
  
  def flush(cb: js.Function1[/* items */ js.Array[T] | END, Unit]): Unit = js.native
}
object FlushableChannel {
  
  @scala.inline
  def apply[T](flush: js.Function1[/* items */ js.Array[T] | END, Unit] => Unit): FlushableChannel[T] = {
    val __obj = js.Dynamic.literal(flush = js.Any.fromFunction1(flush))
    __obj.asInstanceOf[FlushableChannel[T]]
  }
  
  @scala.inline
  implicit class FlushableChannelOps[Self <: FlushableChannel[_], T] (val x: Self with FlushableChannel[T]) extends AnyVal {
    
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
    def setFlush(value: js.Function1[/* items */ js.Array[T] | END, Unit] => Unit): Self = this.set("flush", js.Any.fromFunction1(value))
  }
}
