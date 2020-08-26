package typings.rdflib.tfTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.rdflib.factoryTypesMod._TFIDFactoryTypes because Already inherited
- typings.rdflib.tfTypesMod.QuadObject because Already inherited */ @js.native
trait Variable
  extends Term
     with QuadGraph
     with QuadPredicate
     with QuadSubject {
  /** Contains the constant "Variable". */
  @JSName("termType")
  var termType_Variable: typings.rdflib.rdflibStrings.Variable = js.native
}

object Variable {
  @scala.inline
  def apply(equals: Term => Boolean, termType: typings.rdflib.rdflibStrings.Variable, value: String): Variable = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variable]
  }
  @scala.inline
  implicit class VariableOps[Self <: Variable] (val x: Self) extends AnyVal {
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
    def setTermType(value: typings.rdflib.rdflibStrings.Variable): Self = this.set("termType", value.asInstanceOf[js.Any])
  }
  
}

