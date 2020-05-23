package typings.rdflib.tfTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.rdflib.factoryTypesMod._TFIDFactoryTypes because Already inherited
- typings.rdflib.factoryTypesMod._Comparable because Already inherited
- typings.rdflib.tfTypesMod.QuadObject because Already inherited */ trait NamedNode
  extends Term
     with QuadGraph
     with QuadPredicate
     with QuadSubject {
  @JSName("termType")
  var termType_NamedNode: typings.rdflib.rdflibStrings.NamedNode
}

object NamedNode {
  @scala.inline
  def apply(equals: Term => Boolean, termType: typings.rdflib.rdflibStrings.NamedNode, value: String): NamedNode = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedNode]
  }
}

