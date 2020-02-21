package typings.rdflib.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "Variable")
@js.native
/**
  * Initializes this variable
  * @param name The variable's name
  */
class Variable_ () extends Node {
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
object Variable_ extends js.Object {
  var termType: String = js.native
}

