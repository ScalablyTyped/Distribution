package typings
package rdflibLib.rdflibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "Variable")
@js.native
class Variable protected () extends Node {
  /**
    * Initializes this variable
    * @param name The variable's name
    */
  def this(name: java.lang.String) = this()
  /**
    * The base string for a variable's name
    */
  var base: java.lang.String = js.native
  /**
    * The unique identifier of this variable
    */
  var uri: java.lang.String = js.native
}

@JSImport("rdflib", "Variable")
@js.native
object Variable extends js.Object {
  var termType: java.lang.String = js.native
}

