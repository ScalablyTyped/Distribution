package typings.rdfJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Literal
  extends QuadObject
     with Term {
  /**
    * A NamedNode whose IRI represents the datatype of the literal.
    */
  var datatype: NamedNode = js.native
  /**
    * the language as lowercase BCP47 string (examples: en, en-gb)
    * or an empty string if the literal has no language.
    * @link http://tools.ietf.org/html/bcp47
    */
  var language: String = js.native
  /**
    * Contains the constant "Literal".
    */
  var termType: typings.rdfJs.rdfJsStrings.Literal = js.native
  /**
    * The text value, unescaped, without language or type (example: Brad Pitt).
    */
  var value: String = js.native
  def equals(): Boolean = js.native
  /**
    * @param other The term to compare with.
    * @return True if and only if other has termType "Literal"
    *                   and the same `value`, `language`, and `datatype`.
    */
  def equals(other: Term): Boolean = js.native
}

