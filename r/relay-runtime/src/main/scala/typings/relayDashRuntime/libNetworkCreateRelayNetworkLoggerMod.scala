package typings.relayDashRuntime

import org.scalablytyped.runtime.Instantiable1
import typings.relayDashRuntime.libNetworkCreateRelayNetworkLoggerMod.GraphiQLPrinter
import typings.relayDashRuntime.libNetworkCreateRelayNetworkLoggerMod.NetworkLogger
import typings.relayDashRuntime.libNetworkRelayNetworkLoggerTransactionMod.LoggerTransactionConfig
import typings.relayDashRuntime.libNetworkRelayNetworkLoggerTransactionMod.RelayNetworkLoggerTransaction
import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.FetchFunction
import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.SubscribeFunction
import typings.relayDashRuntime.libUtilRelayConcreteNodeMod.RequestParameters
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/network/createRelayNetworkLogger", JSImport.Namespace)
@js.native
object libNetworkCreateRelayNetworkLoggerMod extends js.Object {
  @js.native
  trait NetworkLogger extends js.Object {
    def wrapFetch(fetch: FetchFunction): FetchFunction = js.native
    def wrapFetch(fetch: FetchFunction, graphiQLPrinter: GraphiQLPrinter): FetchFunction = js.native
    def wrapSubscribe(subscribe: SubscribeFunction): SubscribeFunction = js.native
    def wrapSubscribe(subscribe: SubscribeFunction, graphiQLPrinter: GraphiQLPrinter): SubscribeFunction = js.native
  }
  
  def createRelayNetworkLogger(
    LoggerTransaction: Instantiable1[/* config */ LoggerTransactionConfig, RelayNetworkLoggerTransaction]
  ): NetworkLogger = js.native
  type GraphiQLPrinter = js.Function2[/* request */ RequestParameters, /* variables */ Variables, String]
}

