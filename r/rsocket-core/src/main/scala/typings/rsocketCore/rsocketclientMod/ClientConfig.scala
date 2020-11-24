package typings.rsocketCore.rsocketclientMod

import typings.rsocketCore.anon.DataMimeType
import typings.rsocketCore.rsocketleaseMod.Leases
import typings.rsocketCore.rsocketserializationMod.PayloadSerializers
import typings.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import typings.rsocketTypes.reactiveSocketTypesMod.Responder
import typings.std.Error
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientConfig[D, M] extends js.Object {
  
  var errorHandler: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
  
  var leases: js.UndefOr[js.Function0[Leases[_]]] = js.native
  
  var responder: js.UndefOr[Partial[Responder[D, M]]] = js.native
  
  var serializers: js.UndefOr[PayloadSerializers[D, M]] = js.native
  
  var setup: DataMimeType[D, M] = js.native
  
  var transport: DuplexConnection = js.native
}
object ClientConfig {
  
  @scala.inline
  def apply[D, M](setup: DataMimeType[D, M], transport: DuplexConnection): ClientConfig[D, M] = {
    val __obj = js.Dynamic.literal(setup = setup.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConfig[D, M]]
  }
  
  @scala.inline
  implicit class ClientConfigOps[Self <: ClientConfig[_, _], D, M] (val x: Self with (ClientConfig[D, M])) extends AnyVal {
    
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
    def setSetup(value: DataMimeType[D, M]): Self = this.set("setup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransport(value: DuplexConnection): Self = this.set("transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorHandler(value: /* error */ Error => Unit): Self = this.set("errorHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteErrorHandler: Self = this.set("errorHandler", js.undefined)
    
    @scala.inline
    def setLeases(value: () => Leases[_]): Self = this.set("leases", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteLeases: Self = this.set("leases", js.undefined)
    
    @scala.inline
    def setResponder(value: Partial[Responder[D, M]]): Self = this.set("responder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponder: Self = this.set("responder", js.undefined)
    
    @scala.inline
    def setSerializers(value: PayloadSerializers[D, M]): Self = this.set("serializers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerializers: Self = this.set("serializers", js.undefined)
  }
}
