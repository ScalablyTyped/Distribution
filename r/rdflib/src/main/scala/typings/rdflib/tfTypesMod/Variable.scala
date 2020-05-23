package typings.rdflib.tfTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.rdflib.factoryTypesMod._TFIDFactoryTypes because Already inherited
- typings.rdflib.tfTypesMod.QuadObject because Already inherited */ trait Variable
  extends Term
     with QuadGraph
     with QuadPredicate
     with QuadSubject {
  /** Contains the constant "Variable". */
  @JSName("termType")
  var termType_Variable: typings.rdflib.rdflibStrings.Variable
}

object Variable {
  @scala.inline
  def apply(equals: Term => Boolean, termType: typings.rdflib.rdflibStrings.Variable, value: String): Variable = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variable]
  }
}

