package typings.routeNode

import typings.routeNode.mod.BuildOptions
import typings.routeNode.mod.MatchResponse
import typings.routeNode.mod.RouteNodeState
import typings.routeNode.mod.RouteNodeStateMeta
import typings.routeNode.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("route-node/typings/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  def buildPathFromSegments(): String = js.native
  def buildPathFromSegments(segments: js.Array[default]): String = js.native
  def buildPathFromSegments(segments: js.Array[default], params: js.Object): String = js.native
  def buildPathFromSegments(segments: js.Array[default], params: js.Object, options: BuildOptions): String = js.native
  def buildStateFromMatch(`match`: MatchResponse): RouteNodeState = js.native
  def getMetaFromSegments(segments: js.Array[default]): RouteNodeStateMeta = js.native
  def getPathFromSegments(segments: js.Array[default]): String = js.native
}

