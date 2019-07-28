package typings.rdfDashJs.rdfDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Literal
  extends Quad_Object
     with Term {
  /**
    * A NamedNode whose IRI represents the datatype of the literal.
    */
  var datatype: NamedNode
  /**
    * the language as lowercase BCP47 string (examples: en, en-gb)
    * or an empty string if the literal has no language.
    * @link http://tools.ietf.org/html/bcp47
    */
  var language: String
  /**
    * Contains the constant "Literal".
    */
  var termType: typings.rdfDashJs.rdfDashJsStrings.Literal
  /**
    * The text value, unescaped, without language or type (example: Brad Pitt).
    */
  var value: String
  /**
    * @param other The term to compare with.
    * @return True if and only if other has termType "Literal"
    *                   and the same `value`, `language`, and `datatype`.
    */
  def equals(other: Term): Boolean
}

object Literal {
  @scala.inline
  def apply(
    datatype: NamedNode,
    equals: Term => Boolean,
    language: String,
    termType: typings.rdfDashJs.rdfDashJsStrings.Literal,
    value: String
  ): Literal = {
    val __obj = js.Dynamic.literal(datatype = datatype, equals = js.Any.fromFunction1(equals), language = language, termType = termType, value = value)
  
    __obj.asInstanceOf[Literal]
  }
}

