package typings.rdflib.rdflibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "Node")
@js.native
class Node () extends js.Object {
  /**
    * The class order for this node
    */
  var classOrder: Double = js.native
  /**
    * Whether this node is a variable
    */
  var isVar: Boolean = js.native
  /**
    * The type of node
    */
  var termType: String = js.native
  /**
    * The nod's value
    */
  var value: String = js.native
  /**
    * Compares this node with another
    * @param term The other node
    */
  def compareTerm(term: Node): Double = js.native
  /**
    * Gets whether the two nodes are equal
    * @param other The other node
    */
  def equals(other: Node): Boolean = js.native
  /**
    * Gets a hash for this node
    */
  def hashString(): String = js.native
  /**
    * Gets whether this node is the same as the other one
    * @param other Another node
    */
  def sameTerm(other: Node): Boolean = js.native
  /**
    * Gets the substituted node for this one, according to the specified bindings
    * @param bindings Bindings of identifiers to nodes
    */
  def substitute(bindings: Bindings): Node = js.native
  /**
    * Gets the canonical string representation of this node
    */
  def toCanonical(): String = js.native
  /**
    * Gets the n-triples string representation of this node
    */
  def toNT(): String = js.native
}

/* static members */
@JSImport("rdflib", "Node")
@js.native
object Node extends js.Object {
  /**
    * Gets a node for the specifed input
    * @param value An input value
    */
  def fromValue(value: ValueType): Node | ValueType = js.native
  /**
    * Gets the javascript object equivalent to a node
    * @param term The RDF node
    */
  def toJS(term: Node): js.Any = js.native
}

