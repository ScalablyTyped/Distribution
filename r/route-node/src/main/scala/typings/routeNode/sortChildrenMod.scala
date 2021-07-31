package typings.routeNode

import typings.routeNode.routeNodeMod.RouteNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortChildrenMod {
  
  @JSImport("route-node/dist/sortChildren", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(children: js.Array[RouteNode]): js.Array[RouteNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[RouteNode]]
}
