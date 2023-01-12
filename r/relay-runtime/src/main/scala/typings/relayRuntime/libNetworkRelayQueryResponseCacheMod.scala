package typings.relayRuntime

import typings.relayRuntime.anon.Size
import typings.relayRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNetworkRelayQueryResponseCacheMod {
  
  @JSImport("relay-runtime/lib/network/RelayQueryResponseCache", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with RelayQueryResponseCache {
    def this(config: Size) = this()
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def get(queryID: String, variables: Variables): GraphQLResponse | Null = js.native
    
    /* CompleteClass */
    override def set(queryID: String, variables: Variables, payload: GraphQLResponse): Unit = js.native
  }
  
  trait RelayQueryResponseCache extends StObject {
    
    def clear(): Unit
    
    def get(queryID: String, variables: Variables): GraphQLResponse | Null
    
    def set(queryID: String, variables: Variables, payload: GraphQLResponse): Unit
  }
  object RelayQueryResponseCache {
    
    inline def apply(
      clear: () => Unit,
      get: (String, Variables) => GraphQLResponse | Null,
      set: (String, Variables, GraphQLResponse) => Unit
    ): RelayQueryResponseCache = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction2(get), set = js.Any.fromFunction3(set))
      __obj.asInstanceOf[RelayQueryResponseCache]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RelayQueryResponseCache] (val x: Self) extends AnyVal {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setGet(value: (String, Variables) => GraphQLResponse | Null): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      inline def setSet(value: (String, Variables, GraphQLResponse) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
    }
  }
}
