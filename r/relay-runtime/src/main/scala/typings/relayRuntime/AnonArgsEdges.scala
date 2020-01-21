package typings.relayRuntime

import typings.relayRuntime.relayConnectionMod.ConnectionEvent
import typings.relayRuntime.relayConnectionMod.PageInfo
import typings.relayRuntime.relayRuntimeStrings.fetch
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgsEdges[TEdge] extends ConnectionEvent[TEdge] {
  var args: Variables
  var edges: js.Array[TEdge]
  var kind: fetch
  var pageInfo: PageInfo
}

object AnonArgsEdges {
  @scala.inline
  def apply[TEdge](args: Variables, edges: js.Array[TEdge], kind: fetch, pageInfo: PageInfo): AnonArgsEdges[TEdge] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], pageInfo = pageInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArgsEdges[TEdge]]
  }
}

