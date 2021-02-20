package typings.relayRuntime

import typings.relayRuntime.anon.Size
import typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayQueryResponseCacheMod {
  
  @JSImport("relay-runtime/lib/network/RelayQueryResponseCache", JSImport.Default)
  @js.native
  class default protected () extends RelayQueryResponseCache {
    def this(config: Size) = this()
  }
  
  @js.native
  trait RelayQueryResponseCache extends StObject {
    
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
    implicit class RelayQueryResponseCacheMutableBuilder[Self <: RelayQueryResponseCache] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet(value: (String, Variables) => GraphQLResponse | Null): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSet(value: (String, Variables, GraphQLResponse) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
    }
  }
}
