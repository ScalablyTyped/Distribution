package typings.routeNode

import typings.routeNode.routeNodeMod.BuildOptions
import typings.routeNode.routeNodeMod.MatchResponse
import typings.routeNode.routeNodeMod.RouteNode
import typings.routeNode.routeNodeMod.RouteNodeState
import typings.routeNode.routeNodeMod.RouteNodeStateMeta
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("route-node/dist/helpers", "buildPathFromSegments")
  @js.native
  def buildPathFromSegments(segments: js.Array[RouteNode]): String = js.native
  @JSImport("route-node/dist/helpers", "buildPathFromSegments")
  @js.native
  def buildPathFromSegments(segments: js.Array[RouteNode], params: js.UndefOr[scala.Nothing], options: BuildOptions): String = js.native
  @JSImport("route-node/dist/helpers", "buildPathFromSegments")
  @js.native
  def buildPathFromSegments(segments: js.Array[RouteNode], params: Record[String, _]): String = js.native
  @JSImport("route-node/dist/helpers", "buildPathFromSegments")
  @js.native
  def buildPathFromSegments(segments: js.Array[RouteNode], params: Record[String, _], options: BuildOptions): String = js.native
  
  @JSImport("route-node/dist/helpers", "buildStateFromMatch")
  @js.native
  def buildStateFromMatch(`match`: MatchResponse): RouteNodeState | Null = js.native
  
  @JSImport("route-node/dist/helpers", "getMetaFromSegments")
  @js.native
  def getMetaFromSegments(segments: js.Array[RouteNode]): RouteNodeStateMeta = js.native
  
  @JSImport("route-node/dist/helpers", "getPathFromSegments")
  @js.native
  def getPathFromSegments(segments: js.Array[RouteNode]): String | Null = js.native
}
