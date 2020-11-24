package typings.rdfJs.mod

import typings.rdfJs.rdfJsStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseQuad extends _Term {
  
  /**
    * @param other The term to compare with.
    * @return True if and only if the argument is a) of the same type b) has all components equal.
    */
  def equals(): Boolean = js.native
  def equals(other: Term): Boolean = js.native
  
  /**
    * The named graph.
    * @see Quad_Graph
    */
  var graph: Term = js.native
  
  /**
    * The object.
    * @see Quad_Object
    */
  var `object`: Term = js.native
  
  /**
    * The predicate.
    * @see Quad_Predicate
    */
  var predicate: Term = js.native
  
  /**
    * The subject.
    * @see Quad_Subject
    */
  var subject: Term = js.native
  
  /**
    * Contains the constant "Quad".
    */
  var termType: typings.rdfJs.rdfJsStrings.Quad = js.native
  
  /**
    * Contains an empty string as constant value.
    */
  var value: _empty = js.native
}
