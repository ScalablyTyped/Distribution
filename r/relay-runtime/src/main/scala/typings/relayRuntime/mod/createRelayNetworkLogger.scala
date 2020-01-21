package typings.relayRuntime.mod

import org.scalablytyped.runtime.Instantiable1
import typings.relayRuntime.createRelayNetworkLoggerMod.NetworkLogger
import typings.relayRuntime.relayNetworkLoggerTransactionMod.LoggerTransactionConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "createRelayNetworkLogger")
@js.native
object createRelayNetworkLogger extends js.Object {
  def apply(
    LoggerTransaction: Instantiable1[
      /* config */ LoggerTransactionConfig, 
      typings.relayRuntime.relayNetworkLoggerTransactionMod.RelayNetworkLoggerTransaction
    ]
  ): NetworkLogger = js.native
}

