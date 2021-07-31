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
  
  @scala.inline
  def apply(): IClientStatusGetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientStatusGetResponse]
  }
  
  @scala.inline
  implicit class IClientStatusGetResponseMutableBuilder[Self <: IClientStatusGetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointNull: Self = StObject.set(x, "endpoint", null)
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    @scala.inline
    def setPeers(value: js.Array[IPeer]): Self = StObject.set(x, "peers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeersNull: Self = StObject.set(x, "peers", null)
    
    @scala.inline
    def setPeersUndefined: Self = StObject.set(x, "peers", js.undefined)
    
    @scala.inline
    def setPeersVarargs(value: IPeer*): Self = StObject.set(x, "peers", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
