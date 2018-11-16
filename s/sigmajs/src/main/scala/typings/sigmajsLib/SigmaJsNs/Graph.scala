package typings
package sigmajsLib.SigmaJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Graph extends js.Object {
  def addEdge(edge: Edge): Graph = js.native
  def addMethod(name: java.lang.String, method: js.Function1[/* input */ js.Any, _]): scala.Unit = js.native
  def addNode(node: Node): Graph = js.native
  def clear(): Graph = js.native
  def degree(id: java.lang.String): scala.Double = js.native
  def degree(id: java.lang.String, `type`: java.lang.String): scala.Double = js.native
  def degree(ids: js.Array[java.lang.String]): js.Array[scala.Double] = js.native
  def degree(ids: js.Array[java.lang.String], `type`: java.lang.String): js.Array[scala.Double] = js.native
  def dropEdge(id: java.lang.String): Graph = js.native
  def dropNode(id: java.lang.String): Graph = js.native
  def edges(): js.Array[Edge] = js.native
  def edges(id: java.lang.String): Edge = js.native
  def edges(ids: js.Array[java.lang.String]): js.Array[Edge] = js.native
  def kill(): Graph = js.native
  def nodes(): js.Array[Node] = js.native
  def nodes(id: java.lang.String): Node = js.native
  def nodes(ids: js.Array[java.lang.String]): js.Array[Node] = js.native
}

