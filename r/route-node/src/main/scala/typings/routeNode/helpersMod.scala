package typings.routeNode

import typings.routeNode.routeNodeMod.BuildOptions
import typings.routeNode.routeNodeMod.MatchResponse
import typings.routeNode.routeNodeMod.RouteNode
import typings.routeNode.routeNodeMod.RouteNodeState
import typings.routeNode.routeNodeMod.RouteNodeStateMeta
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("route-node/dist/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  def buildPathFromSegments(segments: js.Array[RouteNode]): String = js.native
  def buildPathFromSegments(segments: js.Array[RouteNode], params: js.UndefOr[scala.Nothing], options: BuildOptions): String = js.native
  def buildPathFromSegments(segments: js.Array[RouteNode], params: Record[String, _]): String = js.native
  def buildPathFromSegments(segments: js.Array[RouteNode], params: Record[String, _], options: BuildOptions): String = js.native
  def buildStateFromMatch(`match`: MatchResponse): RouteNodeState | Null = js.native
  def getMetaFromSegments(segments: js.Array[RouteNode]): RouteNodeStateMeta = js.native
  def getPathFromSegments(segments: js.Array[RouteNode]): String | Null = js.native
}

