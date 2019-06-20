package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ./handlers/connection/RelayConnectionHandler
@js.native
trait RelayConnectionHandler extends js.Object {
  def buildConnectionEdge(store: RecordSourceProxy, connection: RecordProxy): js.UndefOr[RecordProxy | scala.Null] = js.native
  def buildConnectionEdge(store: RecordSourceProxy, connection: RecordProxy, edge: RecordProxy): js.UndefOr[RecordProxy | scala.Null] = js.native
  def createEdge(store: RecordSourceProxy, record: RecordProxy, node: RecordProxy, edgeType: java.lang.String): RecordProxy = js.native
  def deleteNode(record: RecordProxy, nodeID: DataID): scala.Unit = js.native
  def getConnection(record: ReadonlyRecordProxy, key: java.lang.String): js.UndefOr[RecordProxy | scala.Null] = js.native
  def getConnection(record: ReadonlyRecordProxy, key: java.lang.String, filters: Variables): js.UndefOr[RecordProxy | scala.Null] = js.native
  def insertEdgeAfter(record: RecordProxy, newEdge: RecordProxy): scala.Unit = js.native
  def insertEdgeAfter(record: RecordProxy, newEdge: RecordProxy, cursor: java.lang.String): scala.Unit = js.native
  def insertEdgeBefore(record: RecordProxy, newEdge: RecordProxy): scala.Unit = js.native
  def insertEdgeBefore(record: RecordProxy, newEdge: RecordProxy, cursor: java.lang.String): scala.Unit = js.native
  def update(store: RecordSourceProxy, payload: HandleFieldPayload): scala.Unit = js.native
}

