package typings
package rdfDashJsLib.rdfDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BlankNode extends js.Object {
  /**
       * Contains the constant "BlankNode".
       */
  var termType: rdfDashJsLib.rdfDashJsLibStrings.BlankNode
  /**
       * Blank node name as a string, without any serialization specific prefixes,
       * e.g. when parsing,
       * if the data was sourced from Turtle, remove _:,
       * if it was sourced from RDF/XML, do not change the blank node name (example: blank3).
       */
  var value: java.lang.String
  /**
       * @param other The term to compare with.
       * @return True if and only if other has termType "BlankNode" and the same `value`.
       */
  def equals(other: Term): scala.Boolean
}

