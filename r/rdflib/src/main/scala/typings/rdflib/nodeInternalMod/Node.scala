package typings.rdflib.nodeInternalMod

import typings.rdflib.tfTypesMod.Term
import typings.rdflib.typesMod.Bindings
import typings.rdflib.typesMod.TermType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  /** The class order for this node */
  var classOrder: Double = js.native
  /** The type of node */
  var termType: TermType = js.native
  /** The node's value */
  var value: String = js.native
  /**
    * Compares this node with another
    * @see {equals} to check if two nodes are equal
    * @param other - The other node
    */
  def compareTerm(other: Node): Double = js.native
  /**
    * Compares whether the two nodes are equal
    * @param other The other node
    */
  def equals(other: Term): Boolean = js.native
  /**
    * Creates a hash for this node
    * @deprecated use {rdfFactory.id} instead if possible
    */
  def hashString(): String = js.native
  /**
    * Compares whether this node is the same as the other one
    * @param other - Another node
    */
  def sameTerm(other: Node): Boolean = js.native
  /**
    * Creates the substituted node for this one, according to the specified bindings
    * @param bindings - Bindings of identifiers to nodes
    */
  def substitute[T /* <: Node */](bindings: Bindings): T = js.native
  /**
    * Creates a canonical string representation of this node
    */
  def toCanonical(): String = js.native
  /**
    * Creates a n-quads string representation of this node
    */
  def toNQ(): String = js.native
  /**
    * Creates a n-triples string representation of this node
    */
  def toNT(): String = js.native
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
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClassOrder(value: Double): Self = this.set("classOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompareTerm(value: Node => Double): Self = this.set("compareTerm", js.Any.fromFunction1(value))
    @scala.inline
    def setEquals(value: Term => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    @scala.inline
    def setHashString(value: () => String): Self = this.set("hashString", js.Any.fromFunction0(value))
    @scala.inline
    def setSameTerm(value: Node => Boolean): Self = this.set("sameTerm", js.Any.fromFunction1(value))
    @scala.inline
    def setSubstitute(value: Bindings => js.Any): Self = this.set("substitute", js.Any.fromFunction1(value))
    @scala.inline
    def setTermType(value: TermType): Self = this.set("termType", value.asInstanceOf[js.Any])
    @scala.inline
    def setToCanonical(value: () => String): Self = this.set("toCanonical", js.Any.fromFunction0(value))
    @scala.inline
    def setToNQ(value: () => String): Self = this.set("toNQ", js.Any.fromFunction0(value))
    @scala.inline
    def setToNT(value: () => String): Self = this.set("toNT", js.Any.fromFunction0(value))
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

