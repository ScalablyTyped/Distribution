package typings.relayRuntime

import typings.relayRuntime.relayNetworkTypesMod.FetchFunction
import typings.relayRuntime.relayNetworkTypesMod.Network
import typings.relayRuntime.relayNetworkTypesMod.SubscribeFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayNetworkMod {
  
  object RelayNetwork {
    
    @JSImport("relay-runtime/lib/network/RelayNetwork", "RelayNetwork.create")
    @js.native
    def create(fetchFn: FetchFunction): Network = js.native
    @JSImport("relay-runtime/lib/network/RelayNetwork", "RelayNetwork.create")
    @js.native
    def create(fetchFn: FetchFunction, subscribeFn: SubscribeFunction): Network = js.native
  }
}
