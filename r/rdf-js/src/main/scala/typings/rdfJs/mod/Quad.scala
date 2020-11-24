package typings.rdfJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Quad
  extends BaseQuad
     with _QuadObject
     with _QuadSubject {
  
  /**
    * The named graph.
    * @see Quad_Graph
    */
  @JSName("graph")
  var graph_Quad: QuadGraph = js.native
  
  /**
    * The object.
    * @see Quad_Object
    */
  @JSName("object")
  var object_Quad: QuadObject = js.native
  
  /**
    * The predicate.
    * @see Quad_Predicate
    */
  @JSName("predicate")
  var predicate_Quad: QuadPredicate = js.native
  
  /**
    * The subject.
    * @see Quad_Subject
    */
  @JSName("subject")
  var subject_Quad: QuadSubject = js.native
}
