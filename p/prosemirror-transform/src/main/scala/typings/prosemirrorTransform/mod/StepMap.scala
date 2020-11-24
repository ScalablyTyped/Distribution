package typings.prosemirrorTransform.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prosemirror-transform", "StepMap")
@js.native
class StepMap protected () extends Mappable {
  /**
    * Create a position map. The modifications to the document are
    * represented as an array of numbers, in which each group of three
    * represents a modified chunk as `[start, oldSize, newSize]`.
    */
  def this(ranges: js.Array[Double]) = this()
  
  /**
    * Calls the given function on each of the changed ranges included in
    * this map.
    */
  def forEach(
    f: js.Function4[
      /* oldStart */ Double, 
      /* oldEnd */ Double, 
      /* newStart */ Double, 
      /* newEnd */ Double, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Create an inverted version of this map. The result can be used to
    * map positions in the post-step document to the pre-step document.
    */
  def invert(): StepMap = js.native
}
/* static members */
@JSImport("prosemirror-transform", "StepMap")
@js.native
object StepMap extends js.Object {
  
  /**
    * Create a map that moves all positions by offset `n` (which may be
    * negative). This can be useful when applying steps meant for a
    * sub-document to a larger document, or vice-versa.
    */
  def offset(n: Double): StepMap = js.native
}
