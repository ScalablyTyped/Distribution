package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientPeersGetResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientPeersGetResponse extends StObject {
  
  /** ClientPeersGetResponse peers */
  var peers: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** ClientPeersGetResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object IClientPeersGetResponse {
  
  inline def apply(): IClientPeersGetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientPeersGetResponse]
  }
  
  extension [Self <: IClientPeersGetResponse](x: Self) {
    
    inline def setPeers(value: js.Array[String]): Self = StObject.set(x, "peers", value.asInstanceOf[js.Any])
    
    inline def setPeersNull: Self = StObject.set(x, "peers", null)
    
    inline def setPeersUndefined: Self = StObject.set(x, "peers", js.undefined)
    
    inline def setPeersVarargs(value: String*): Self = StObject.set(x, "peers", js.Array(value :_*))
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
