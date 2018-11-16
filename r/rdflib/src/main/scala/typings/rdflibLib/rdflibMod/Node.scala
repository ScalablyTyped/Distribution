package typings
package rdflibLib.rdflibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "Node")
@js.native
class Node () extends js.Object {
  /**
       * The class order for this node
       */
  var classOrder: scala.Double = js.native
  /**
       * Whether this node is a variable
       */
  var isVar: scala.Boolean = js.native
  /**
       * The type of node
       */
  var termType: java.lang.String = js.native
  /**
       * The nod's value
       */
  var value: java.lang.String = js.native
  /**
       * Compares this node with another
       * @param term The other node
       */
  def compareTerm(term: Node): scala.Double = js.native
  /**
       * Gets whether the two nodes are equal
       * @param other The other node
       */
  def equals(other: Node): scala.Boolean = js.native
  /**
       * Gets a hash for this node
       */
  def hashString(): java.lang.String = js.native
  /**
       * Gets whether this node is the same as the other one
       * @param other Another node
       */
  def sameTerm(other: Node): scala.Boolean = js.native
  /**
       * Gets the substituted node for this one, according to the specified bindings
       * @param bindings Bindings of identifiers to nodes
       */
  def substitute(bindings: ScalablyTyped.runtime.StringDictionary[Node]): Node = js.native
  /**
       * Gets the canonical string representation of this node
       */
  def toCanonical(): java.lang.String = js.native
  /**
       * Gets the n-triples string representation of this node
       */
  def toNT(): java.lang.String = js.native
}

@JSImport("rdflib", "Node")
@js.native
object Node extends js.Object {
  /**
       * Gets a node for the specifed input
       * @param value An input value
       */
  def fromValue(value: rdflibLib.rdflibMod.ValueType): rdflibLib.rdflibMod.Node | rdflibLib.rdflibMod.ValueType = js.native
  /**
       * Gets the javascript object equivalent to a node
       * @param term The RDF node
       */
  def toJS(term: rdflibLib.rdflibMod.Node): js.Any = js.native
}

