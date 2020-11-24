package typings.rdfJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Variable
  extends _QuadGraph
     with _QuadObject
     with _QuadSubject
     with _Term {
  
  /**
    * @param other The term to compare with.
    * @return True if and only if other has termType "Variable" and the same `value`.
    */
  def equals(): Boolean = js.native
  def equals(other: Term): Boolean = js.native
  
  /**
    * Contains the constant "Variable".
    */
  var termType: typings.rdfJs.rdfJsStrings.Variable = js.native
  
  /**
    * The name of the variable *without* leading ? (example: a).
    */
  var value: String = js.native
}
