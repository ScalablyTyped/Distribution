package typings.rdflib.mod

import typings.rdflib.variableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "Variable")
@js.native
/**
  * Initializes this variable
  * @param name The variable's name
  */
class Variable () extends default {
  def this(name: String) = this()
}

/* static members */
@JSImport("rdflib", "Variable")
@js.native
object Variable extends js.Object {
  def toString(variable: js.Any): String = js.native
}

