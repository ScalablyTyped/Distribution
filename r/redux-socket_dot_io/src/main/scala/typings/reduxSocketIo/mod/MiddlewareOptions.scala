package typings.reduxSocketIo.mod

import typings.redux.mod.Action
import typings.redux.mod.Dispatch
import typings.socketIoClient.SocketIOClient.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MiddlewareOptions extends js.Object {
  
  var eventName: js.UndefOr[String] = js.native
  
  var execute: js.UndefOr[
    js.Function4[
      /* action */ Action[_], 
      /* emitBound */ Socket, 
      /* next */ Dispatch[_], 
      /* dispatch */ Dispatch[_], 
      _
    ]
  ] = js.native
}
object MiddlewareOptions {
  
  @scala.inline
  def apply(): MiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MiddlewareOptions]
  }
  
  @scala.inline
  implicit class MiddlewareOptionsOps[Self <: MiddlewareOptions] (val x: Self) extends AnyVal {
    
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
    def setEventName(value: String): Self = this.set("eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventName: Self = this.set("eventName", js.undefined)
    
    @scala.inline
    def setExecute(
      value: (/* action */ Action[_], /* emitBound */ Socket, /* next */ Dispatch[_], /* dispatch */ Dispatch[_]) => _
    ): Self = this.set("execute", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteExecute: Self = this.set("execute", js.undefined)
  }
}
