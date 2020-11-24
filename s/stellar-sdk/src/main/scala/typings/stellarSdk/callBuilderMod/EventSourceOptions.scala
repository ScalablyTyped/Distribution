package typings.stellarSdk.callBuilderMod

import typings.std.MessageEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventSourceOptions[T] extends js.Object {
  
  var onerror: js.UndefOr[js.Function1[/* event */ MessageEvent[_], Unit]] = js.native
  
  var onmessage: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.native
  
  var reconnectTimeout: js.UndefOr[Double] = js.native
}
object EventSourceOptions {
  
  @scala.inline
  def apply[T](): EventSourceOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSourceOptions[T]]
  }
  
  @scala.inline
  implicit class EventSourceOptionsOps[Self <: EventSourceOptions[_], T] (val x: Self with EventSourceOptions[T]) extends AnyVal {
    
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
    def setOnerror(value: /* event */ MessageEvent[_] => Unit): Self = this.set("onerror", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnerror: Self = this.set("onerror", js.undefined)
    
    @scala.inline
    def setOnmessage(value: /* value */ T => Unit): Self = this.set("onmessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnmessage: Self = this.set("onmessage", js.undefined)
    
    @scala.inline
    def setReconnectTimeout(value: Double): Self = this.set("reconnectTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnectTimeout: Self = this.set("reconnectTimeout", js.undefined)
  }
}
