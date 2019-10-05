package typings.relayDashRuntime.relayDashRuntimeMod

import org.scalablytyped.runtime.Instantiable1
import typings.relayDashRuntime.libNetworkCreateRelayNetworkLoggerMod.NetworkLogger
import typings.relayDashRuntime.libNetworkRelayNetworkLoggerTransactionMod.LoggerTransactionConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "createRelayNetworkLogger")
@js.native
object createRelayNetworkLogger extends js.Object {
  def apply(
    LoggerTransaction: Instantiable1[
      /* config */ LoggerTransactionConfig, 
      typings.relayDashRuntime.libNetworkRelayNetworkLoggerTransactionMod.RelayNetworkLoggerTransaction
    ]
  ): NetworkLogger = js.native
}

