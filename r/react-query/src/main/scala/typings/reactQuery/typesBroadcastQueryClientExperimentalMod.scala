package typings.reactQuery

import typings.reactQuery.typesCoreMod.QueryClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBroadcastQueryClientExperimentalMod {
  
  @JSImport("react-query/types/broadcastQueryClient-experimental", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def broadcastQueryClient(param0: BroadcastQueryClientOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("broadcastQueryClient")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait BroadcastQueryClientOptions extends StObject {
    
    var broadcastChannel: js.UndefOr[String] = js.undefined
    
    var queryClient: QueryClient
  }
  object BroadcastQueryClientOptions {
    
    inline def apply(queryClient: QueryClient): BroadcastQueryClientOptions = {
      val __obj = js.Dynamic.literal(queryClient = queryClient.asInstanceOf[js.Any])
      __obj.asInstanceOf[BroadcastQueryClientOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BroadcastQueryClientOptions] (val x: Self) extends AnyVal {
      
      inline def setBroadcastChannel(value: String): Self = StObject.set(x, "broadcastChannel", value.asInstanceOf[js.Any])
      
      inline def setBroadcastChannelUndefined: Self = StObject.set(x, "broadcastChannel", js.undefined)
      
      inline def setQueryClient(value: QueryClient): Self = StObject.set(x, "queryClient", value.asInstanceOf[js.Any])
    }
  }
}
