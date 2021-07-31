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
  
  @scala.inline
  def apply(): IPeerRegisterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPeerRegisterRequest]
  }
  
  @scala.inline
  implicit class IPeerRegisterRequestMutableBuilder[Self <: IPeerRegisterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointNull: Self = StObject.set(x, "endpoint", null)
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    @scala.inline
    def setProtocolVersion(value: Double): Self = StObject.set(x, "protocolVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolVersionNull: Self = StObject.set(x, "protocolVersion", null)
    
    @scala.inline
    def setProtocolVersionUndefined: Self = StObject.set(x, "protocolVersion", js.undefined)
  }
}
