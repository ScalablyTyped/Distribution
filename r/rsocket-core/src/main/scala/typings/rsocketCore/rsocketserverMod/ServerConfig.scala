package typings.rsocketCore.rsocketserverMod

import typings.rsocketCore.rsocketleaseMod.Leases
import typings.rsocketCore.rsocketserializationMod.PayloadSerializers
import typings.rsocketTypes.reactiveSocketTypesMod.Payload
import typings.rsocketTypes.reactiveSocketTypesMod.ReactiveSocket
import typings.rsocketTypes.reactiveSocketTypesMod.Responder
import typings.std.Error
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerConfig[D, M] extends js.Object {
  
  var errorHandler: js.UndefOr[js.Function1[/* e */ Error, Unit]] = js.native
  
  def getRequestHandler(socket: ReactiveSocket[D, M], payload: Payload[D, M]): Partial[Responder[D, M]] = js.native
  
  var leases: js.UndefOr[js.Function0[Leases[_]]] = js.native
  
  var serializers: js.UndefOr[PayloadSerializers[D, M]] = js.native
  
  var transport: TransportServer = js.native
}
object ServerConfig {
  
  @scala.inline
  def apply[D, M](
    getRequestHandler: (ReactiveSocket[D, M], Payload[D, M]) => Partial[Responder[D, M]],
    transport: TransportServer
  ): ServerConfig[D, M] = {
    val __obj = js.Dynamic.literal(getRequestHandler = js.Any.fromFunction2(getRequestHandler), transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerConfig[D, M]]
  }
  
  @scala.inline
  implicit class ServerConfigOps[Self <: ServerConfig[_, _], D, M] (val x: Self with (ServerConfig[D, M])) extends AnyVal {
    
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
    def setGetRequestHandler(value: (ReactiveSocket[D, M], Payload[D, M]) => Partial[Responder[D, M]]): Self = this.set("getRequestHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTransport(value: TransportServer): Self = this.set("transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorHandler(value: /* e */ Error => Unit): Self = this.set("errorHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteErrorHandler: Self = this.set("errorHandler", js.undefined)
    
    @scala.inline
    def setLeases(value: () => Leases[_]): Self = this.set("leases", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteLeases: Self = this.set("leases", js.undefined)
    
    @scala.inline
    def setSerializers(value: PayloadSerializers[D, M]): Self = this.set("serializers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerializers: Self = this.set("serializers", js.undefined)
  }
}
