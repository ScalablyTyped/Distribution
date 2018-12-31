package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildNode extends Node {
  /**
    * Inserts nodes just after node, while replacing strings in nodes with equivalent Text nodes.
    * Throws a "HierarchyRequestError" DOMException if the constraints of
    * the node tree are violated.
    */
  def after(nodes: (Node | java.lang.String)*): scala.Unit = js.native
  /**
    * Inserts nodes just before node, while replacing strings in nodes with equivalent Text nodes.
    * Throws a "HierarchyRequestError" DOMException if the constraints of
    * the node tree are violated.
    */
  def before(nodes: (Node | java.lang.String)*): scala.Unit = js.native
  /**
    * Removes node.
    */
  def remove(): scala.Unit = js.native
  /**
    * Replaces node with nodes, while replacing strings in nodes with equivalent Text nodes.
    * Throws a "HierarchyRequestError" DOMException if the constraints of
    * the node tree are violated.
    */
  def replaceWith(nodes: (Node | java.lang.String)*): scala.Unit = js.native
}

