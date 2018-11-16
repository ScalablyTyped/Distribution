package typings
package rdflibLib.rdflibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "Collection")
@js.native
class Collection protected () extends Node {
  /**
       * Initializes this collection
       * @param initial The initial elements
       */
  def this(initial: js.Array[ValueType]) = this()
  /**
       * Whether this collection is closed
       */
  var closed: scala.Boolean = js.native
  /**
       * The nodes in this collection
       */
  var elements: js.Array[Node] = js.native
  /**
       * The identifier for this collection
       */
  var id: java.lang.String = js.native
  /**
       * Appends an element to this collection
       * @param element The new element
       */
  def append(element: Node): scala.Double = js.native
  /**
       * Closes this collection
       */
  def close(): scala.Boolean = js.native
  /**
       * Removes the first element from the collection (and return it)
       */
  def shift(): Node = js.native
  /**
       * Preprends the specified element to the colelction's front
       * @param element The element to preprend
       */
  def unshift(element: Node): scala.Double = js.native
}

@JSImport("rdflib", "Collection")
@js.native
object Collection extends js.Object {
  var termType: java.lang.String = js.native
}

