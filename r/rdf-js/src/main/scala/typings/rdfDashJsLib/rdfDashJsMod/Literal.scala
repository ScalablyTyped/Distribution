package typings
package rdfDashJsLib.rdfDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Literal extends js.Object {
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

