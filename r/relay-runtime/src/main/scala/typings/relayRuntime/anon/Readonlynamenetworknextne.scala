package typings.relayRuntime.anon

import typings.relayRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.libNetworkRelayNetworkTypesMod.GraphQLSingularResponse
import typings.relayRuntime.libStoreRelayStoreTypesMod.LogEvent
import typings.relayRuntime.relayRuntimeStrings.networkDotnext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'network.next',   networkRequestId :number,   response :relay-runtime.relay-runtime/lib/network/RelayNetworkTypes.GraphQLResponse}> */
trait Readonlynamenetworknextne
  extends StObject
     with LogEvent {
  
  val name: networkDotnext
  
  val networkRequestId: Double
  
  val response: GraphQLResponse
}
object Readonlynamenetworknextne {
  
  inline def apply(networkRequestId: Double, response: GraphQLResponse): Readonlynamenetworknextne = {
    val __obj = js.Dynamic.literal(name = "network.next", networkRequestId = networkRequestId.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynamenetworknextne]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Readonlynamenetworknextne] (val x: Self) extends AnyVal {
    
    inline def setName(value: networkDotnext): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNetworkRequestId(value: Double): Self = StObject.set(x, "networkRequestId", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: GraphQLResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseVarargs(value: GraphQLSingularResponse*): Self = StObject.set(x, "response", js.Array(value*))
  }
}
