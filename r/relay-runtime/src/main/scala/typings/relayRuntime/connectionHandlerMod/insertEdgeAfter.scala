package typings.relayRuntime.connectionHandlerMod

import typings.relayRuntime.relayStoreTypesMod.RecordProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/handlers/connection/ConnectionHandler", "insertEdgeAfter")
@js.native
object insertEdgeAfter extends js.Object {
  def apply(record: RecordProxy[js.Object], newEdge: RecordProxy[js.Object]): Unit = js.native
  def apply(record: RecordProxy[js.Object], newEdge: RecordProxy[js.Object], cursor: String): Unit = js.native
}

