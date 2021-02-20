package typings.sigmajs.SigmaJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Graph extends StObject {
  
  def addEdge(edge: Edge): Graph = js.native
  
  def addMethod(name: String, method: js.Function1[/* input */ js.Any, _]): Unit = js.native
  
  def addNode(node: Node): Graph = js.native
  
  def clear(): Graph = js.native
  
  def degree(id: String): Double = js.native
  def degree(id: String, `type`: String): Double = js.native
  def degree(ids: js.Array[String]): js.Array[Double] = js.native
  def degree(ids: js.Array[String], `type`: String): js.Array[Double] = js.native
  
  def dropEdge(id: String): Graph = js.native
  
  def dropNode(id: String): Graph = js.native
  
  def edges(): js.Array[Edge] = js.native
  def edges(id: String): Edge = js.native
  def edges(ids: js.Array[String]): js.Array[Edge] = js.native
  
  def kill(): Graph = js.native
  
  def nodes(): js.Array[Node] = js.native
  def nodes(id: String): Node = js.native
  def nodes(ids: js.Array[String]): js.Array[Node] = js.native
}
