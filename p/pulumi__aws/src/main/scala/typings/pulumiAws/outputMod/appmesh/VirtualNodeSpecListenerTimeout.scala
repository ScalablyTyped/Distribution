package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecListenerTimeout extends StObject {
  
  /**
    * Timeouts for gRPC listeners.
    */
  var grpc: js.UndefOr[VirtualNodeSpecListenerTimeoutGrpc] = js.undefined
  
  /**
    * Timeouts for HTTP listeners.
    */
  var http: js.UndefOr[VirtualNodeSpecListenerTimeoutHttp] = js.undefined
  
  /**
    * Timeouts for HTTP2 listeners.
    */
  var http2: js.UndefOr[VirtualNodeSpecListenerTimeoutHttp2] = js.undefined
  
  /**
    * Timeouts for TCP listeners.
    */
  var tcp: js.UndefOr[VirtualNodeSpecListenerTimeoutTcp] = js.undefined
}
object VirtualNodeSpecListenerTimeout {
  
  inline def apply(): VirtualNodeSpecListenerTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpecListenerTimeout]
  }
  
  extension [Self <: VirtualNodeSpecListenerTimeout](x: Self) {
    
    inline def setGrpc(value: VirtualNodeSpecListenerTimeoutGrpc): Self = StObject.set(x, "grpc", value.asInstanceOf[js.Any])
    
    inline def setGrpcUndefined: Self = StObject.set(x, "grpc", js.undefined)
    
    inline def setHttp(value: VirtualNodeSpecListenerTimeoutHttp): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setHttp2(value: VirtualNodeSpecListenerTimeoutHttp2): Self = StObject.set(x, "http2", value.asInstanceOf[js.Any])
    
    inline def setHttp2Undefined: Self = StObject.set(x, "http2", js.undefined)
    
    inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
    
    inline def setTcp(value: VirtualNodeSpecListenerTimeoutTcp): Self = StObject.set(x, "tcp", value.asInstanceOf[js.Any])
    
    inline def setTcpUndefined: Self = StObject.set(x, "tcp", js.undefined)
  }
}
