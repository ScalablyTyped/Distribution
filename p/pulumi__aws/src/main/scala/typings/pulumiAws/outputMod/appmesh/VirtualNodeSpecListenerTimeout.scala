package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpecListenerTimeout extends js.Object {
  
  /**
    * Timeouts for gRPC listeners.
    */
  var grpc: js.UndefOr[VirtualNodeSpecListenerTimeoutGrpc] = js.native
  
  /**
    * Timeouts for HTTP listeners.
    */
  var http: js.UndefOr[VirtualNodeSpecListenerTimeoutHttp] = js.native
  
  /**
    * Timeouts for HTTP2 listeners.
    */
  var http2: js.UndefOr[VirtualNodeSpecListenerTimeoutHttp2] = js.native
  
  /**
    * Timeouts for TCP listeners.
    */
  var tcp: js.UndefOr[VirtualNodeSpecListenerTimeoutTcp] = js.native
}
object VirtualNodeSpecListenerTimeout {
  
  @scala.inline
  def apply(): VirtualNodeSpecListenerTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpecListenerTimeout]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecListenerTimeoutOps[Self <: VirtualNodeSpecListenerTimeout] (val x: Self) extends AnyVal {
    
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
    def setGrpc(value: VirtualNodeSpecListenerTimeoutGrpc): Self = this.set("grpc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrpc: Self = this.set("grpc", js.undefined)
    
    @scala.inline
    def setHttp(value: VirtualNodeSpecListenerTimeoutHttp): Self = this.set("http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttp: Self = this.set("http", js.undefined)
    
    @scala.inline
    def setHttp2(value: VirtualNodeSpecListenerTimeoutHttp2): Self = this.set("http2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttp2: Self = this.set("http2", js.undefined)
    
    @scala.inline
    def setTcp(value: VirtualNodeSpecListenerTimeoutTcp): Self = this.set("tcp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTcp: Self = this.set("tcp", js.undefined)
  }
}
