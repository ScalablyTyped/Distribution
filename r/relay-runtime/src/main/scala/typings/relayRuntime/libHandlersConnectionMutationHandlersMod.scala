package typings.relayRuntime

import typings.relayRuntime.libStoreRelayStoreTypesMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHandlersConnectionMutationHandlersMod {
  
  object MutationHandlers {
    
    @JSImport("relay-runtime/lib/handlers/connection/MutationHandlers", "MutationHandlers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("relay-runtime/lib/handlers/connection/MutationHandlers", "MutationHandlers.AppendEdgeHandler")
    @js.native
    def AppendEdgeHandler: Handler = js.native
    inline def AppendEdgeHandler_=(x: Handler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AppendEdgeHandler")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/handlers/connection/MutationHandlers", "MutationHandlers.AppendNodeHandler")
    @js.native
    def AppendNodeHandler: Handler = js.native
    inline def AppendNodeHandler_=(x: Handler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AppendNodeHandler")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/handlers/connection/MutationHandlers", "MutationHandlers.DeleteEdgeHandler")
    @js.native
    def DeleteEdgeHandler: Handler = js.native
    inline def DeleteEdgeHandler_=(x: Handler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeleteEdgeHandler")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/handlers/connection/MutationHandlers", "MutationHandlers.DeleteRecordHandler")
    @js.native
    def DeleteRecordHandler: Handler = js.native
    inline def DeleteRecordHandler_=(x: Handler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeleteRecordHandler")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/handlers/connection/MutationHandlers", "MutationHandlers.PrependEdgeHandler")
    @js.native
    def PrependEdgeHandler: Handler = js.native
    inline def PrependEdgeHandler_=(x: Handler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PrependEdgeHandler")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/handlers/connection/MutationHandlers", "MutationHandlers.PrependNodeHandler")
    @js.native
    def PrependNodeHandler: Handler = js.native
    inline def PrependNodeHandler_=(x: Handler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PrependNodeHandler")(x.asInstanceOf[js.Any])
  }
}
