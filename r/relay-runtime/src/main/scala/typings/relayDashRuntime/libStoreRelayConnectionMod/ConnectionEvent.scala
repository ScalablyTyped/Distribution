package typings.relayDashRuntime.libStoreRelayConnectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import typings.relayDashRuntime.relayDashRuntimeStrings.fetch
import typings.relayDashRuntime.relayDashRuntimeStrings.insert
import typings.relayDashRuntime.relayDashRuntimeStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayDashRuntime.Anon_ArgsEdges[TEdge]
  - typings.relayDashRuntime.Anon_EdgeData[TEdge]
  - typings.relayDashRuntime.Anon_ArgsEdge[TEdge]
*/
trait ConnectionEvent[TEdge] extends js.Object

object ConnectionEvent {
  @scala.inline
  def Anon_ArgsEdges[TEdge](args: Variables, edges: js.Array[TEdge], kind: fetch, pageInfo: PageInfo): ConnectionEvent[TEdge] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], pageInfo = pageInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionEvent[TEdge]]
  }
  @scala.inline
  def Anon_EdgeData[TEdge](edgeData: StringDictionary[TEdge], kind: update): ConnectionEvent[TEdge] = {
    val __obj = js.Dynamic.literal(edgeData = edgeData.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionEvent[TEdge]]
  }
  @scala.inline
  def Anon_ArgsEdge[TEdge](args: Variables, edge: TEdge, kind: insert): ConnectionEvent[TEdge] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionEvent[TEdge]]
  }
}

