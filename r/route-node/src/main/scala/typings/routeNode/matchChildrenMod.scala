package typings.routeNode

import typings.routeNode.routeNodeMod.MatchOptions
import typings.routeNode.routeNodeMod.MatchResponse
import typings.routeNode.routeNodeMod.RouteNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchChildrenMod {
  
  @JSImport("route-node/dist/matchChildren", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(nodes: js.Array[RouteNode], pathSegment: String, currentMatch: MatchResponse): MatchResponse | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(nodes.asInstanceOf[js.Any], pathSegment.asInstanceOf[js.Any], currentMatch.asInstanceOf[js.Any])).asInstanceOf[MatchResponse | Null]
  @scala.inline
  def default(
    nodes: js.Array[RouteNode],
    pathSegment: String,
    currentMatch: MatchResponse,
    options: Unit,
    consumedBefore: String
  ): MatchResponse | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(nodes.asInstanceOf[js.Any], pathSegment.asInstanceOf[js.Any], currentMatch.asInstanceOf[js.Any], options.asInstanceOf[js.Any], consumedBefore.asInstanceOf[js.Any])).asInstanceOf[MatchResponse | Null]
  @scala.inline
  def default(
    nodes: js.Array[RouteNode],
    pathSegment: String,
    currentMatch: MatchResponse,
    options: MatchOptions
  ): MatchResponse | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(nodes.asInstanceOf[js.Any], pathSegment.asInstanceOf[js.Any], currentMatch.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MatchResponse | Null]
  @scala.inline
  def default(
    nodes: js.Array[RouteNode],
    pathSegment: String,
    currentMatch: MatchResponse,
    options: MatchOptions,
    consumedBefore: String
  ): MatchResponse | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(nodes.asInstanceOf[js.Any], pathSegment.asInstanceOf[js.Any], currentMatch.asInstanceOf[js.Any], options.asInstanceOf[js.Any], consumedBefore.asInstanceOf[js.Any])).asInstanceOf[MatchResponse | Null]
}
