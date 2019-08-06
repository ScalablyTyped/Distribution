package typings.rdflib.rdflibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "Statement")
@js.native
class Statement protected () extends js.Object {
  /**
    * Initializes this statement
    * @param subject The statement's subject
    * @param predicate The statement's predicate
    * @param object The statement's object
    * @param graph The graph the contains this statement
    */
  def this(subject: ValueType, predicate: ValueType, `object`: ValueType, graph: ValueType) = this()
  /**
    * The graph the contains this statement
    */
  var graph: ValueType = js.native
  /**
    * The statement's object
    */
  var `object`: Node = js.native
  /**
    * The statement's predicate
    */
  var predicate: Node = js.native
  /**
    * The statement's subject
    */
  var subject: Node = js.native
  /**
    * The origin of this statement
    */
  var why: ValueType = js.native
  /**
    * Gets whether two statements are the same
    * @param other The other statement
    */
  def equals(other: Statement): Boolean = js.native
  /**
    * Gets this statement with the bindings substituted
    * @param bindings The bindings
    */
  def substitute(bindings: Bindings): Statement = js.native
  /**
    * Gets the canonical string representation of this statement
    */
  def toCanonical(): String = js.native
  /**
    * Gets the n-triples string representation of this statement
    */
  def toNT(): String = js.native
}

