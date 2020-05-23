package typings.rdflib.nodeInternalMod

import typings.rdflib.tfTypesMod.Term
import typings.rdflib.typesMod.Bindings
import typings.rdflib.typesMod.TermType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  /** The class order for this node */
  var classOrder: Double
  /** The type of node */
  var termType: TermType
  /** The node's value */
  var value: String
  /**
    * Compares this node with another
    * @see {equals} to check if two nodes are equal
    * @param other - The other node
    */
  def compareTerm(other: Node): Double
  /**
    * Compares whether the two nodes are equal
    * @param other The other node
    */
  def equals(other: Term): Boolean
  /**
    * Creates a hash for this node
    * @deprecated use {rdfFactory.id} instead if possible
    */
  def hashString(): String
  /**
    * Compares whether this node is the same as the other one
    * @param other - Another node
    */
  def sameTerm(other: Node): Boolean
  /**
    * Creates the substituted node for this one, according to the specified bindings
    * @param bindings - Bindings of identifiers to nodes
    */
  def substitute[T /* <: Node */](bindings: Bindings): T
  /**
    * Creates a canonical string representation of this node
    */
  def toCanonical(): String
  /**
    * Creates a n-quads string representation of this node
    */
  def toNQ(): String
  /**
    * Creates a n-triples string representation of this node
    */
  def toNT(): String
}

object Node {
  @scala.inline
  def apply(
    classOrder: Double,
    compareTerm: Node => Double,
    equals: Term => Boolean,
    hashString: () => String,
    sameTerm: Node => Boolean,
    substitute: Bindings => js.Any,
    termType: TermType,
    toCanonical: () => String,
    toNQ: () => String,
    toNT: () => String,
    value: String
  ): Node = {
    val __obj = js.Dynamic.literal(classOrder = classOrder.asInstanceOf[js.Any], compareTerm = js.Any.fromFunction1(compareTerm), equals = js.Any.fromFunction1(equals), hashString = js.Any.fromFunction0(hashString), sameTerm = js.Any.fromFunction1(sameTerm), substitute = js.Any.fromFunction1(substitute), termType = termType.asInstanceOf[js.Any], toCanonical = js.Any.fromFunction0(toCanonical), toNQ = js.Any.fromFunction0(toNQ), toNT = js.Any.fromFunction0(toNT), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

