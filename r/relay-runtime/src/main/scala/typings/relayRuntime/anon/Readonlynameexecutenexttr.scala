package typings.relayRuntime.anon

import typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.relayNetworkTypesMod.GraphQLSingularResponse
import typings.relayRuntime.relayRuntimeStrings.executeDotnext
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'execute.next',   transactionID :number,   response :relay-runtime.relay-runtime/lib/network/RelayNetworkTypes.GraphQLResponse}> */
trait Readonlynameexecutenexttr
  extends StObject
     with LogEvent {
  
  val name: executeDotnext
  
  val response: GraphQLResponse
  
  val transactionID: Double
}
object Readonlynameexecutenexttr {
  
  @scala.inline
  def apply(response: GraphQLResponse, transactionID: Double): Readonlynameexecutenexttr = {
    val __obj = js.Dynamic.literal(name = "execute.next", response = response.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynameexecutenexttr]
  }
  
  @scala.inline
  implicit class ReadonlynameexecutenexttrMutableBuilder[Self <: Readonlynameexecutenexttr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: executeDotnext): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: GraphQLResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseVarargs(value: GraphQLSingularResponse*): Self = StObject.set(x, "response", js.Array(value :_*))
    
    @scala.inline
    def setTransactionID(value: Double): Self = StObject.set(x, "transactionID", value.asInstanceOf[js.Any])
  }
}
