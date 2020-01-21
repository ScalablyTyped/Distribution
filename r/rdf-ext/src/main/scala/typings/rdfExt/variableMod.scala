package typings.rdfExt

import typings.rdfJs.mod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-ext/lib/Variable", JSImport.Namespace)
@js.native
object variableMod extends js.Object {
  @js.native
  trait VariableExt extends Variable {
    def toCanonical(): String = js.native
    def toJSON(): AnonTermTypeValuePropType = js.native
  }
  
}

