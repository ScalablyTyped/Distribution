package typings.relayDashRuntime

import typings.relayDashRuntime.libStoreRelayConnectionMod.ConnectionEvent
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import typings.relayDashRuntime.relayDashRuntimeStrings.insert
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsEdge[TEdge] extends ConnectionEvent[TEdge] {
  var args: Variables
  var edge: TEdge
  var kind: insert
}

object Anon_ArgsEdge {
  @scala.inline
  def apply[TEdge](args: Variables, edge: TEdge, kind: insert): Anon_ArgsEdge[TEdge] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ArgsEdge[TEdge]]
  }
}

