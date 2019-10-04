package typings.relayDashRuntime.libNetworkRelayNetworkLoggerTransactionMod

import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponse
import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.UploadableMap
import typings.relayDashRuntime.libUtilRelayConcreteNodeMod.RequestParameters
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.CacheConfig
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/network/RelayNetworkLoggerTransaction", "RelayNetworkLoggerTransaction")
@js.native
class RelayNetworkLoggerTransaction protected () extends js.Object {
  def this(config: LoggerTransactionConfig) = this()
  def addLog(label: String, values: js.Any*): Unit = js.native
  def commitLogs(error: Error, payload: GraphQLResponse): Unit = js.native
  def commitLogs(error: Error, payload: GraphQLResponse, status: String): Unit = js.native
  def flushLogs(error: Error, payload: GraphQLResponse): Unit = js.native
  def flushLogs(error: Error, payload: GraphQLResponse, status: String): Unit = js.native
  def getCacheConfig(): CacheConfig = js.native
  def getIdentifier(): String = js.native
  def getLogsToPrint(): js.Array[RelayNetworkLog] = js.native
  def getRequest(): RequestParameters = js.native
  def getUploadables(): UploadableMap = js.native
  def getVariables(): Variables = js.native
  def markCommitted(): Unit = js.native
  def timerEnd(): Unit = js.native
  def timerStart(): Unit = js.native
}

