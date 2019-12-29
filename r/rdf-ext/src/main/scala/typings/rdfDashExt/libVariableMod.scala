package typings.rdfDashExt

import typings.rdfDashJs.rdfDashJsMod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-ext/lib/Variable", JSImport.Namespace)
@js.native
object libVariableMod extends js.Object {
  @js.native
  trait VariableExt extends Variable {
    def toCanonical(): String = js.native
    def toJSON(): Anon_TermTypeValuePropType = js.native
  }
  
}

