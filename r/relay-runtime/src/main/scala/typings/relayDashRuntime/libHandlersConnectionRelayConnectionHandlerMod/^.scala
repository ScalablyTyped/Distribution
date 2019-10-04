package typings.relayDashRuntime.libHandlersConnectionRelayConnectionHandlerMod

import typings.relayDashRuntime.libStoreRelayStoreTypesMod.HandleFieldPayload
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.ReadOnlyRecordProxy
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.RecordProxy
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.RecordSourceProxy
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.DataID
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/handlers/connection/RelayConnectionHandler", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def buildConnectionEdge(store: RecordSourceProxy, connection: RecordProxy): js.UndefOr[RecordProxy | Null] = js.native
  def buildConnectionEdge(store: RecordSourceProxy, connection: RecordProxy, edge: RecordProxy): js.UndefOr[RecordProxy | Null] = js.native
  def createEdge(store: RecordSourceProxy, record: RecordProxy, node: RecordProxy, edgeType: String): RecordProxy = js.native
  def deleteNode(record: RecordProxy, nodeID: DataID): Unit = js.native
  def getConnection(record: ReadOnlyRecordProxy, key: String): js.UndefOr[RecordProxy | Null] = js.native
  def getConnection(record: ReadOnlyRecordProxy, key: String, filters: Variables): js.UndefOr[RecordProxy | Null] = js.native
  def insertEdgeAfter(record: RecordProxy, newEdge: RecordProxy): Unit = js.native
  def insertEdgeAfter(record: RecordProxy, newEdge: RecordProxy, cursor: String): Unit = js.native
  def insertEdgeBefore(record: RecordProxy, newEdge: RecordProxy): Unit = js.native
  def insertEdgeBefore(record: RecordProxy, newEdge: RecordProxy, cursor: String): Unit = js.native
  def update(store: RecordSourceProxy, payload: HandleFieldPayload): Unit = js.native
}

