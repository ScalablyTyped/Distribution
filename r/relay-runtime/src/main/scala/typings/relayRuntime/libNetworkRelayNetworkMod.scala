package typings.relayRuntime

import typings.relayRuntime.libNetworkRelayNetworkTypesMod.FetchFunction
import typings.relayRuntime.libNetworkRelayNetworkTypesMod.Network
import typings.relayRuntime.libNetworkRelayNetworkTypesMod.SubscribeFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNetworkRelayNetworkMod {
  
  object RelayNetwork {
    
    @JSImport("relay-runtime/lib/network/RelayNetwork", "RelayNetwork")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(fetchFn: FetchFunction): Network = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(fetchFn.asInstanceOf[js.Any]).asInstanceOf[Network]
    inline def create(fetchFn: FetchFunction, subscribeFn: SubscribeFunction): Network = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(fetchFn.asInstanceOf[js.Any], subscribeFn.asInstanceOf[js.Any])).asInstanceOf[Network]
  }
}
