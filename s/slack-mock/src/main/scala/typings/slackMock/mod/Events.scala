package typings.slackMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Events[T] extends js.Object {
  
  var calls: js.Array[EventCall[T]] = js.native
  
  def reset(): Unit = js.native
  
  def send(targetUrl: EventUrl, body: T): js.Promise[Unit] = js.native
}
object Events {
  
  @scala.inline
  def apply[T](calls: js.Array[EventCall[T]], reset: () => Unit, send: (EventUrl, T) => js.Promise[Unit]): Events[T] = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), send = js.Any.fromFunction2(send))
    __obj.asInstanceOf[Events[T]]
  }
  
  @scala.inline
  implicit class EventsOps[Self <: Events[_], T] (val x: Self with Events[T]) extends AnyVal {
    
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
    def setCallsVarargs(value: EventCall[T]*): Self = this.set("calls", js.Array(value :_*))
    
    @scala.inline
    def setCalls(value: js.Array[EventCall[T]]): Self = this.set("calls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSend(value: (EventUrl, T) => js.Promise[Unit]): Self = this.set("send", js.Any.fromFunction2(value))
  }
}
