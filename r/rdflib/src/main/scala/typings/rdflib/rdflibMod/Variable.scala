package typings.rdflib.rdflibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "Variable")
@js.native
/**
  * Initializes this variable
  * @param name The variable's name
  */
class Variable () extends Node {
  def this(name: String) = this()
  /**
    * The base string for a variable's name
    */
  var base: String = js.native
  /**
    * The unique identifier of this variable
    */
  var uri: String = js.native
}

/* static members */
@JSImport("rdflib", "Variable")
@js.native
object Variable extends js.Object {
  var termType: String = js.native
}

