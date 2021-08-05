package typings.snabbdom

import typings.snabbdom.htmldomapiMod.DOMAPI
import typings.snabbdom.vnodeMod.VNode_
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tovnodeMod {
  
  @JSImport("snabbdom/build/package/tovnode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toVNode(node: Node): VNode_ = ^.asInstanceOf[js.Dynamic].applyDynamic("toVNode")(node.asInstanceOf[js.Any]).asInstanceOf[VNode_]
  inline def toVNode(node: Node, domApi: DOMAPI): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("toVNode")(node.asInstanceOf[js.Any], domApi.asInstanceOf[js.Any])).asInstanceOf[VNode_]
}
