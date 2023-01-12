package typings.relayRuntime.anon

import typings.relayRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.libNetworkRelayNetworkTypesMod.GraphQLSingularResponse
import typings.relayRuntime.libStoreRelayStoreTypesMod.LogEvent
import typings.relayRuntime.relayRuntimeStrings.executeDotnext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'execute.next',   executeId :number,   response :relay-runtime.relay-runtime/lib/network/RelayNetworkTypes.GraphQLResponse,   duration :number}> */
trait Readonlynameexecutenextex
  extends StObject
     with LogEvent {
  
  val duration: Double
  
  val executeId: Double
  
  val name: executeDotnext
  
  val response: GraphQLResponse
}
object Readonlynameexecutenextex {
  
  inline def apply(duration: Double, executeId: Double, response: GraphQLResponse): Readonlynameexecutenextex = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], executeId = executeId.asInstanceOf[js.Any], name = "execute.next", response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynameexecutenextex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Readonlynameexecutenextex] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setExecuteId(value: Double): Self = StObject.set(x, "executeId", value.asInstanceOf[js.Any])
    
    inline def setName(value: executeDotnext): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: GraphQLResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseVarargs(value: GraphQLSingularResponse*): Self = StObject.set(x, "response", js.Array(value*))
  }
}
