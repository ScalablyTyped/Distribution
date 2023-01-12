package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPeerRegisterRequest extends StObject {
  
  /** PeerRegisterRequest endpoint */
  var endpoint: js.UndefOr[String | Null] = js.undefined
  
  /** PeerRegisterRequest protocolVersion */
  var protocolVersion: js.UndefOr[Double | Null] = js.undefined
}
object IPeerRegisterRequest {
  
  inline def apply(): IPeerRegisterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPeerRegisterRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPeerRegisterRequest] (val x: Self) extends AnyVal {
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointNull: Self = StObject.set(x, "endpoint", null)
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setProtocolVersion(value: Double): Self = StObject.set(x, "protocolVersion", value.asInstanceOf[js.Any])
    
    inline def setProtocolVersionNull: Self = StObject.set(x, "protocolVersion", null)
    
    inline def setProtocolVersionUndefined: Self = StObject.set(x, "protocolVersion", js.undefined)
  }
}
