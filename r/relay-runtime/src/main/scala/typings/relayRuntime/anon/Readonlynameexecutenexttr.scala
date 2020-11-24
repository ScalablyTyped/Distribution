package typings.relayRuntime.anon

import typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.relayNetworkTypesMod.GraphQLSingularResponse
import typings.relayRuntime.relayRuntimeStrings.executeDotnext
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'execute.next',   transactionID :number,   response :relay-runtime.relay-runtime/lib/network/RelayNetworkTypes.GraphQLResponse}> */
@js.native
trait Readonlynameexecutenexttr extends LogEvent {
  
  val name: executeDotnext = js.native
  
  val response: GraphQLResponse = js.native
  
  val transactionID: Double = js.native
}
object Readonlynameexecutenexttr {
  
  @scala.inline
  def apply(name: executeDotnext, response: GraphQLResponse, transactionID: Double): Readonlynameexecutenexttr = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynameexecutenexttr]
  }
  
  @scala.inline
  implicit class ReadonlynameexecutenexttrOps[Self <: Readonlynameexecutenexttr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: executeDotnext): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseVarargs(value: GraphQLSingularResponse*): Self = this.set("response", js.Array(value :_*))
    
    @scala.inline
    def setResponse(value: GraphQLResponse): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionID(value: Double): Self = this.set("transactionID", value.asInstanceOf[js.Any])
  }
}
