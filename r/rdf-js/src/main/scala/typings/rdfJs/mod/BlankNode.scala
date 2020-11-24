package typings.rdfJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlankNode
  extends _QuadGraph
     with _QuadObject
     with _QuadSubject
     with _Term {
  
  /**
    * @param other The term to compare with.
    * @return True if and only if other has termType "BlankNode" and the same `value`.
    */
  def equals(): Boolean = js.native
  def equals(other: Term): Boolean = js.native
  
  /**
    * Contains the constant "BlankNode".
    */
  var termType: typings.rdfJs.rdfJsStrings.BlankNode = js.native
  
  /**
    * Blank node name as a string, without any serialization specific prefixes,
    * e.g. when parsing,
    * if the data was sourced from Turtle, remove _:,
    * if it was sourced from RDF/XML, do not change the blank node name (example: blank3).
    */
  var value: String = js.native
}
