package typings.relayRuntime.relayConnectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.relayRuntimeStrings.fetch
import typings.relayRuntime.relayRuntimeStrings.insert
import typings.relayRuntime.relayRuntimeStrings.update
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.anon.Edges[TEdge]
  - typings.relayRuntime.anon.EdgeData[TEdge]
  - typings.relayRuntime.anon.Edge[TEdge]
*/
trait ConnectionEvent[TEdge] extends js.Object

object ConnectionEvent {
  @scala.inline
  def Edges[TEdge](args: Variables, edges: js.Array[TEdge], kind: fetch, pageInfo: PageInfo): ConnectionEvent[TEdge] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], pageInfo = pageInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionEvent[TEdge]]
  }
  @scala.inline
  def EdgeData[TEdge](edgeData: StringDictionary[TEdge], kind: update): ConnectionEvent[TEdge] = {
    val __obj = js.Dynamic.literal(edgeData = edgeData.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionEvent[TEdge]]
  }
  @scala.inline
  def Edge[TEdge](args: Variables, edge: TEdge, kind: insert): ConnectionEvent[TEdge] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionEvent[TEdge]]
  }
}

