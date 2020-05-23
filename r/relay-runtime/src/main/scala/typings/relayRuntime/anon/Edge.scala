package typings.relayRuntime.anon

import typings.relayRuntime.relayConnectionMod.ConnectionEvent
import typings.relayRuntime.relayRuntimeStrings.insert
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edge[TEdge] extends ConnectionEvent[TEdge] {
  var args: Variables
  var edge: TEdge
  var kind: insert
}

object Edge {
  @scala.inline
  def apply[TEdge](args: Variables, edge: TEdge, kind: insert): Edge[TEdge] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge[TEdge]]
  }
}

