package typings.relayRuntime.relayQueryResponseCacheMod

import typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelayQueryResponseCache extends js.Object {
  
  def clear(): Unit = js.native
  
  def get(queryID: String, variables: Variables): GraphQLResponse | Null = js.native
  
  def set(queryID: String, variables: Variables, payload: GraphQLResponse): Unit = js.native
}
object RelayQueryResponseCache {
  
  @scala.inline
  def apply(
    clear: () => Unit,
    get: (String, Variables) => GraphQLResponse | Null,
    set: (String, Variables, GraphQLResponse) => Unit
  ): RelayQueryResponseCache = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction2(get), set = js.Any.fromFunction3(set))
    __obj.asInstanceOf[RelayQueryResponseCache]
  }
  
  @scala.inline
  implicit class RelayQueryResponseCacheOps[Self <: RelayQueryResponseCache] (val x: Self) extends AnyVal {
    
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
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet(value: (String, Variables) => GraphQLResponse | Null): Self = this.set("get", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSet(value: (String, Variables, GraphQLResponse) => Unit): Self = this.set("set", js.Any.fromFunction3(value))
  }
}
