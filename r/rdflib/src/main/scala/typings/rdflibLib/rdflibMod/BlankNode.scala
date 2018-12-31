package typings
package rdflibLib.rdflibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "BlankNode")
@js.native
class BlankNode protected () extends Node {
  /**
    * Initializes this node
    * @param id The identifier for the blank node
    */
  def this(id: java.lang.String) = this()
  /**
    * The identifier for the blank node
    */
  var id: java.lang.String = js.native
  /**
    * Whether this is a blank node
    */
  var isBlank: scala.Boolean = js.native
  /**
    * Gets a copy of this blank node in the specified formula
    * @param formula The formula
    */
  def copy(formula: Formula): BlankNode = js.native
}

@JSImport("rdflib", "BlankNode")
@js.native
object BlankNode extends js.Object {
  var NTAnonymousNodePrefix: java.lang.String = js.native
  /**
    * The next unique identifier for blank nodes
    */
  var nextId: scala.Double = js.native
  var termType: java.lang.String = js.native
}

