package typings.routeNode

import typings.routeNode.routeNodeMod.MatchOptions
import typings.routeNode.routeNodeMod.MatchResponse
import typings.routeNode.routeNodeMod.RouteNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchChildrenMod {
  
  @JSImport("route-node/dist/matchChildren", JSImport.Default)
  @js.native
  def default(nodes: js.Array[RouteNode], pathSegment: String, currentMatch: MatchResponse): MatchResponse | Null = js.native
  @JSImport("route-node/dist/matchChildren", JSImport.Default)
  @js.native
  def default(
    nodes: js.Array[RouteNode],
    pathSegment: String,
    currentMatch: MatchResponse,
    options: js.UndefOr[scala.Nothing],
    consumedBefore: String
  ): MatchResponse | Null = js.native
  @JSImport("route-node/dist/matchChildren", JSImport.Default)
  @js.native
  def default(
    nodes: js.Array[RouteNode],
    pathSegment: String,
    currentMatch: MatchResponse,
    options: MatchOptions
  ): MatchResponse | Null = js.native
  @JSImport("route-node/dist/matchChildren", JSImport.Default)
  @js.native
  def default(
    nodes: js.Array[RouteNode],
    pathSegment: String,
    currentMatch: MatchResponse,
    options: MatchOptions,
    consumedBefore: String
  ): MatchResponse | Null = js.native
}
