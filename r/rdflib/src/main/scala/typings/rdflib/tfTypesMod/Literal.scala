package typings.rdflib.tfTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.rdflib.factoryTypesMod._TFIDFactoryTypes because Already inherited
- typings.rdflib.factoryTypesMod._Comparable because Already inherited
- typings.rdflib.tfTypesMod.QuadObject because Already inherited */ @js.native
trait Literal extends Term {
  /** A NamedNode whose IRI represents the datatype of the literal. */
  var datatype: NamedNode = js.native
  /**
    * The language as lowercase BCP-47 [BCP47] string (examples: "en", "en-gb")
    * or an empty string if the literal has no language.
    */
  var language: String = js.native
  /** Contains the constant "Literal". */
  @JSName("termType")
  var termType_Literal: typings.rdflib.rdflibStrings.Literal = js.native
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
  @scala.inline
  implicit class LiteralOps[Self <: Literal] (val x: Self) extends AnyVal {
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
    def setDatatype(value: NamedNode): Self = this.set("datatype", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setTermType(value: typings.rdflib.rdflibStrings.Literal): Self = this.set("termType", value.asInstanceOf[js.Any])
  }
  
}

