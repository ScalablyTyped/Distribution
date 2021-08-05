package typings.routeNode

import typings.routeNode.routeNodeMod.BuildOptions
import typings.routeNode.routeNodeMod.MatchResponse
import typings.routeNode.routeNodeMod.RouteNode
import typings.routeNode.routeNodeMod.RouteNodeState
import typings.routeNode.routeNodeMod.RouteNodeStateMeta
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("route-node/dist/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildPathFromSegments(segments: js.Array[RouteNode]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildPathFromSegments")(segments.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def buildPathFromSegments(segments: js.Array[RouteNode], params: Unit, options: BuildOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPathFromSegments")(segments.asInstanceOf[js.Any], params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def buildPathFromSegments(segments: js.Array[RouteNode], params: Record[String, js.Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPathFromSegments")(segments.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def buildPathFromSegments(segments: js.Array[RouteNode], params: Record[String, js.Any], options: BuildOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPathFromSegments")(segments.asInstanceOf[js.Any], params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def buildStateFromMatch(`match`: MatchResponse): RouteNodeState | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("buildStateFromMatch")(`match`.asInstanceOf[js.Any]).asInstanceOf[RouteNodeState | Null]
  
  inline def getMetaFromSegments(segments: js.Array[RouteNode]): RouteNodeStateMeta = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetaFromSegments")(segments.asInstanceOf[js.Any]).asInstanceOf[RouteNodeStateMeta]
  
  inline def getPathFromSegments(segments: js.Array[RouteNode]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathFromSegments")(segments.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
