package typings.routeNode

import typings.routeNode.distRouteNodeMod.BuildOptions
import typings.routeNode.distRouteNodeMod.MatchResponse
import typings.routeNode.distRouteNodeMod.RouteNode
import typings.routeNode.distRouteNodeMod.RouteNodeState
import typings.routeNode.distRouteNodeMod.RouteNodeStateMeta
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersMod {
  
  @JSImport("route-node/dist/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildPathFromSegments(segments: js.Array[RouteNode]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildPathFromSegments")(segments.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def buildPathFromSegments(segments: js.Array[RouteNode], params: Unit, options: BuildOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPathFromSegments")(segments.asInstanceOf[js.Any], params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def buildPathFromSegments(segments: js.Array[RouteNode], params: Record[String, Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPathFromSegments")(segments.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def buildPathFromSegments(segments: js.Array[RouteNode], params: Record[String, Any], options: BuildOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPathFromSegments")(segments.asInstanceOf[js.Any], params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def buildStateFromMatch(`match`: MatchResponse): RouteNodeState | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("buildStateFromMatch")(`match`.asInstanceOf[js.Any]).asInstanceOf[RouteNodeState | Null]
  
  inline def getMetaFromSegments(segments: js.Array[RouteNode]): RouteNodeStateMeta = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetaFromSegments")(segments.asInstanceOf[js.Any]).asInstanceOf[RouteNodeStateMeta]
  
  inline def getPathFromSegments(segments: js.Array[RouteNode]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathFromSegments")(segments.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
