package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLSlotElement extends HTMLElement {
  
  def assignedElements(): js.Array[Element] = js.native
  def assignedElements(options: AssignedNodesOptions): js.Array[Element] = js.native
  
  def assignedNodes(): js.Array[Node] = js.native
  def assignedNodes(options: AssignedNodesOptions): js.Array[Node] = js.native
  
  var name: java.lang.String = js.native
}
