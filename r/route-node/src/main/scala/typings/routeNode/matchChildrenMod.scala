package typings.routeNode

import typings.routeNode.mod.MatchOptions
import typings.routeNode.mod.MatchResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("route-node/typings/matchChildren", JSImport.Namespace)
@js.native
object matchChildrenMod extends js.Object {
  def default(nodes: js.Array[typings.routeNode.mod.default], pathSegment: String, currentMatch: MatchResponse): js.Any = js.native
  def default(
    nodes: js.Array[typings.routeNode.mod.default],
    pathSegment: String,
    currentMatch: MatchResponse,
    options: MatchOptions
  ): js.Any = js.native
  def default(
    nodes: js.Array[typings.routeNode.mod.default],
    pathSegment: String,
    currentMatch: MatchResponse,
    options: MatchOptions,
    consumedBefore: String
  ): js.Any = js.native
}

