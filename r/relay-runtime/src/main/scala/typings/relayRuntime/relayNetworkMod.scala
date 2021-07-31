package typings.relayRuntime

import typings.relayRuntime.relayNetworkTypesMod.FetchFunction
import typings.relayRuntime.relayNetworkTypesMod.Network
import typings.relayRuntime.relayNetworkTypesMod.SubscribeFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayNetworkMod {
  
  object RelayNetwork {
    
    @JSImport("relay-runtime/lib/network/RelayNetwork", "RelayNetwork")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(fetchFn: FetchFunction): Network = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(fetchFn.asInstanceOf[js.Any]).asInstanceOf[Network]
    @scala.inline
    def create(fetchFn: FetchFunction, subscribeFn: SubscribeFunction): Network = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(fetchFn.asInstanceOf[js.Any], subscribeFn.asInstanceOf[js.Any])).asInstanceOf[Network]
  }
}
