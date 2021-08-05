package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientStatusGetResponse.IPeer
import typings.sawtoothSdk.protobufMod.ClientStatusGetResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientStatusGetResponse extends StObject {
  
  /** ClientStatusGetResponse endpoint */
  var endpoint: js.UndefOr[String | Null] = js.undefined
  
  /** ClientStatusGetResponse peers */
  var peers: js.UndefOr[js.Array[IPeer] | Null] = js.undefined
  
  /** ClientStatusGetResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object IClientStatusGetResponse {
  
  inline def apply(): IClientStatusGetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientStatusGetResponse]
  }
  
  extension [Self <: IClientStatusGetResponse](x: Self) {
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointNull: Self = StObject.set(x, "endpoint", null)
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setPeers(value: js.Array[IPeer]): Self = StObject.set(x, "peers", value.asInstanceOf[js.Any])
    
    inline def setPeersNull: Self = StObject.set(x, "peers", null)
    
    inline def setPeersUndefined: Self = StObject.set(x, "peers", js.undefined)
    
    inline def setPeersVarargs(value: IPeer*): Self = StObject.set(x, "peers", js.Array(value :_*))
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
