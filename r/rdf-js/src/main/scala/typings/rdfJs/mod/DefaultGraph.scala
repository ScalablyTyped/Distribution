package typings.rdfJs.mod

import typings.rdfJs.rdfJsStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultGraph
  extends _QuadGraph
     with _Term {
  
  /**
    * @param other The term to compare with.
    * @return True if and only if other has termType "DefaultGraph".
    */
  def equals(): Boolean = js.native
  def equals(other: Term): Boolean = js.native
  
  /**
    * Contains the constant "DefaultGraph".
    */
  var termType: typings.rdfJs.rdfJsStrings.DefaultGraph = js.native
  
  /**
    * Contains an empty string as constant value.
    */
  var value: _empty = js.native
}
