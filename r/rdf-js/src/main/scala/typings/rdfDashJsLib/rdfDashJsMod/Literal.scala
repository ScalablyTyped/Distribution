package typings
package rdfDashJsLib.rdfDashJsMod

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
  var language: java.lang.String
  /**
    * Contains the constant "Literal".
    */
  var termType: rdfDashJsLib.rdfDashJsLibStrings.Literal
  /**
    * The text value, unescaped, without language or type (example: Brad Pitt).
    */
  var value: java.lang.String
  /**
    * @param other The term to compare with.
    * @return True if and only if other has termType "Literal"
    *                   and the same `value`, `language`, and `datatype`.
    */
  def equals(other: Term): scala.Boolean
}

object Literal {
  @scala.inline
  def apply(
    datatype: NamedNode,
    equals: js.Function1[Term, scala.Boolean],
    language: java.lang.String,
    termType: rdfDashJsLib.rdfDashJsLibStrings.Literal,
    value: java.lang.String
  ): Literal = {
    val __obj = js.Dynamic.literal(datatype = datatype, equals = equals, language = language, termType = termType, value = value)
  
    __obj.asInstanceOf[Literal]
  }
}

