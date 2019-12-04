package typings.snabbdom

import typings.snabbdom.htmldomapiMod.DOMAPI
import typings.snabbdom.vnodeMod.VNode
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snabbdom/tovnode", JSImport.Namespace)
@js.native
object tovnodeMod extends js.Object {
  def default(node: Node): VNode = js.native
  def default(node: Node, domApi: DOMAPI): VNode = js.native
  def toVNode(node: Node): VNode = js.native
  def toVNode(node: Node, domApi: DOMAPI): VNode = js.native
}

