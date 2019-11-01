package typings.relayDashRuntime.libHandlersConnectionRelayConnectionHandlerMod

import typings.relayDashRuntime.libStoreRelayStoreTypesMod.ReadOnlyRecordProxy
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.RecordProxy
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/handlers/connection/RelayConnectionHandler", "getConnection")
@js.native
object getConnection extends js.Object {
  def apply(record: ReadOnlyRecordProxy, key: String): js.UndefOr[RecordProxy[js.Object] | Null] = js.native
  def apply(record: ReadOnlyRecordProxy, key: String, filters: Variables): js.UndefOr[RecordProxy[js.Object] | Null] = js.native
}

