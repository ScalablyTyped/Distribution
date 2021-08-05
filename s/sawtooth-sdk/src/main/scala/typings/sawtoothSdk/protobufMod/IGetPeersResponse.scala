package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGetPeersResponse extends StObject {
  
  /** GetPeersResponse peerEndpoints */
  var peerEndpoints: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object IGetPeersResponse {
  
  inline def apply(): IGetPeersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetPeersResponse]
  }
  
  extension [Self <: IGetPeersResponse](x: Self) {
    
    inline def setPeerEndpoints(value: js.Array[String]): Self = StObject.set(x, "peerEndpoints", value.asInstanceOf[js.Any])
    
    inline def setPeerEndpointsNull: Self = StObject.set(x, "peerEndpoints", null)
    
    inline def setPeerEndpointsUndefined: Self = StObject.set(x, "peerEndpoints", js.undefined)
    
    inline def setPeerEndpointsVarargs(value: String*): Self = StObject.set(x, "peerEndpoints", js.Array(value :_*))
  }
}
