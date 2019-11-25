package typings.relayDashRuntime

import typings.relayDashRuntime.libStoreRelayConnectionMod.ConnectionEvent
import typings.relayDashRuntime.libStoreRelayConnectionMod.PageInfo
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import typings.relayDashRuntime.relayDashRuntimeStrings.fetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsEdges[TEdge] extends ConnectionEvent[TEdge] {
  var args: Variables
  var edges: js.Array[TEdge]
  var kind: fetch
  var pageInfo: PageInfo
}

object Anon_ArgsEdges {
  @scala.inline
  def apply[TEdge](args: Variables, edges: js.Array[TEdge], kind: fetch, pageInfo: PageInfo): Anon_ArgsEdges[TEdge] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], pageInfo = pageInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ArgsEdges[TEdge]]
  }
}

