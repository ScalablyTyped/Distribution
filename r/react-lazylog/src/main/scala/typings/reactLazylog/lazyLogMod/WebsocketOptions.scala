package typings.reactLazylog.lazyLogMod

import typings.std.CloseEvent
import typings.std.Event
import typings.std.WebSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebsocketOptions extends js.Object {
  
  var formatMessage: js.UndefOr[js.Function1[/* message */ js.Any, String]] = js.native
  
  var onClose: js.UndefOr[js.Function1[/* e */ CloseEvent, Unit]] = js.native
  
  var onError: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
  
  var onOpen: js.UndefOr[js.Function2[/* e */ Event, /* socket */ WebSocket, Unit]] = js.native
}
object WebsocketOptions {
  
  @scala.inline
  def apply(): WebsocketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebsocketOptions]
  }
  
  @scala.inline
  implicit class WebsocketOptionsOps[Self <: WebsocketOptions] (val x: Self) extends AnyVal {
    
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
    def setFormatMessage(value: /* message */ js.Any => String): Self = this.set("formatMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormatMessage: Self = this.set("formatMessage", js.undefined)
    
    @scala.inline
    def setOnClose(value: /* e */ CloseEvent => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnError(value: /* e */ Event => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnOpen(value: (/* e */ Event, /* socket */ WebSocket) => Unit): Self = this.set("onOpen", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
  }
}
