package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Range")
@js.native
class Range ()
  extends typings.std.Range {
  /**
    * Returns true if range is collapsed, and false otherwise.
    */
  /* CompleteClass */
  override val collapsed: scala.Boolean = js.native
  /**
    * Returns range's end node.
    */
  /* CompleteClass */
  override val endContainer: typings.std.Node = js.native
  /**
    * Returns range's end offset.
    */
  /* CompleteClass */
  override val endOffset: Double = js.native
  /**
    * Returns range's start node.
    */
  /* CompleteClass */
  override val startContainer: typings.std.Node = js.native
  /**
    * Returns range's start offset.
    */
  /* CompleteClass */
  override val startOffset: Double = js.native
}

@JSGlobal("Range")
@js.native
object Range
  extends Instantiable0[typings.std.Range] {
  val END_TO_END: Double = js.native
  val END_TO_START: Double = js.native
  val START_TO_END: Double = js.native
  val START_TO_START: Double = js.native
}

