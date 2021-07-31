package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGetPeersResponse extends StObject {
  
  /** GetPeersResponse peerEndpoints */
  var peerEndpoints: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object IGetPeersResponse {
  
  @scala.inline
  def apply(): IGetPeersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetPeersResponse]
  }
  
  @scala.inline
  implicit class IGetPeersResponseMutableBuilder[Self <: IGetPeersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPeerEndpoints(value: js.Array[String]): Self = StObject.set(x, "peerEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerEndpointsNull: Self = StObject.set(x, "peerEndpoints", null)
    
    @scala.inline
    def setPeerEndpointsUndefined: Self = StObject.set(x, "peerEndpoints", js.undefined)
    
    @scala.inline
    def setPeerEndpointsVarargs(value: String*): Self = StObject.set(x, "peerEndpoints", js.Array(value :_*))
  }
}
