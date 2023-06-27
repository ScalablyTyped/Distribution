package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildNode
  extends StObject
     with Node {
  
  /**
    * Inserts nodes just after node, while replacing strings in nodes with equivalent Text nodes.
    *
    * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/after)
    */
  /* standard dom */
  def after(nodes: (Node | java.lang.String)*): Unit = js.native
  
  /**
    * Inserts nodes just before node, while replacing strings in nodes with equivalent Text nodes.
    *
    * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/before)
    */
  /* standard dom */
  def before(nodes: (Node | java.lang.String)*): Unit = js.native
  
  /**
    * Removes node.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/remove)
    */
  /* standard dom */
  def remove(): Unit = js.native
  
  /**
    * Replaces node with nodes, while replacing strings in nodes with equivalent Text nodes.
    *
    * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/replaceWith)
    */
  /* standard dom */
  def replaceWith(nodes: (Node | java.lang.String)*): Unit = js.native
}
