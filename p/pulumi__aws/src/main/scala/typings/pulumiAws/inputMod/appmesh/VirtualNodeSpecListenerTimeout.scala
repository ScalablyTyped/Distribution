package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecListenerTimeout extends StObject {
  
  /**
    * Timeouts for gRPC listeners.
    */
  var grpc: js.UndefOr[Input[VirtualNodeSpecListenerTimeoutGrpc]] = js.undefined
  
  /**
    * Timeouts for HTTP listeners.
    */
  var http: js.UndefOr[Input[VirtualNodeSpecListenerTimeoutHttp]] = js.undefined
  
  /**
    * Timeouts for HTTP2 listeners.
    */
  var http2: js.UndefOr[Input[VirtualNodeSpecListenerTimeoutHttp2]] = js.undefined
  
  /**
    * Timeouts for TCP listeners.
    */
  var tcp: js.UndefOr[Input[VirtualNodeSpecListenerTimeoutTcp]] = js.undefined
}
object VirtualNodeSpecListenerTimeout {
  
  @scala.inline
  def apply(): VirtualNodeSpecListenerTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpecListenerTimeout]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecListenerTimeoutMutableBuilder[Self <: VirtualNodeSpecListenerTimeout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrpc(value: Input[VirtualNodeSpecListenerTimeoutGrpc]): Self = StObject.set(x, "grpc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrpcUndefined: Self = StObject.set(x, "grpc", js.undefined)
    
    @scala.inline
    def setHttp(value: Input[VirtualNodeSpecListenerTimeoutHttp]): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttp2(value: Input[VirtualNodeSpecListenerTimeoutHttp2]): Self = StObject.set(x, "http2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttp2Undefined: Self = StObject.set(x, "http2", js.undefined)
    
    @scala.inline
    def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
    
    @scala.inline
    def setTcp(value: Input[VirtualNodeSpecListenerTimeoutTcp]): Self = StObject.set(x, "tcp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcpUndefined: Self = StObject.set(x, "tcp", js.undefined)
  }
}
