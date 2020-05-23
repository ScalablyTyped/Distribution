package typings.rdflib.tfTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.rdflib.factoryTypesMod._TFIDFactoryTypes because Already inherited
- typings.rdflib.factoryTypesMod._Comparable because Already inherited
- typings.rdflib.tfTypesMod.QuadObject because Already inherited */ trait Literal extends Term {
  /** A NamedNode whose IRI represents the datatype of the literal. */
  var datatype: NamedNode
  /**
    * The language as lowercase BCP-47 [BCP47] string (examples: "en", "en-gb")
    * or an empty string if the literal has no language.
    */
  var language: String
  /** Contains the constant "Literal". */
  @JSName("termType")
  var termType_Literal: typings.rdflib.rdflibStrings.Literal
}

object Literal {
  @scala.inline
  def apply(
    datatype: NamedNode,
    equals: Term => Boolean,
    language: String,
    termType: typings.rdflib.rdflibStrings.Literal,
    value: String
  ): Literal = {
    val __obj = js.Dynamic.literal(datatype = datatype.asInstanceOf[js.Any], equals = js.Any.fromFunction1(equals), language = language.asInstanceOf[js.Any], termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
}

