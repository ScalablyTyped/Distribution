package typings.relayRuntime.connectionHandlerMod

import typings.relayRuntime.relayStoreTypesMod.RecordProxy
import typings.relayRuntime.relayStoreTypesMod.RecordSourceProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/handlers/connection/ConnectionHandler", "createEdge")
@js.native
object createEdge extends js.Object {
  def apply(
    store: RecordSourceProxy,
    record: RecordProxy[js.Object],
    node: RecordProxy[js.Object],
    edgeType: String
  ): RecordProxy[js.Object] = js.native
}

