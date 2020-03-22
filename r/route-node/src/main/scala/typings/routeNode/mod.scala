package typings.routeNode

import typings.routeNode.routeNodeMod.Route
import typings.routeNode.routeNodeMod.RouteNodeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("route-node", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class RouteNode ()
    extends typings.routeNode.routeNodeMod.RouteNode {
    def this(name: String) = this()
    def this(name: String, path: String) = this()
    def this(name: String, path: String, childRoutes: js.Array[Route]) = this()
    def this(name: String, path: String, childRoutes: js.Array[Route], options: RouteNodeOptions) = this()
  }
  
}

