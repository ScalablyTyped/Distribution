package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TimeRanges")
@js.native
class TimeRanges ()
  extends typings.std.TimeRanges {
  /**
    * Returns the number of ranges in the object.
    */
  /* CompleteClass */
  override val length: Double = js.native
  /**
    * Returns the time for the end of the range with the given index.
    * 
    * Throws an "IndexSizeError" DOMException if the index is out of range.
    */
  /* CompleteClass */
  override def end(index: Double): Double = js.native
  /**
    * Returns the time for the start of the range with the given index.
    * 
    * Throws an "IndexSizeError" DOMException if the index is out of range.
    */
  /* CompleteClass */
  override def start(index: Double): Double = js.native
}

@JSGlobal("TimeRanges")
@js.native
object TimeRanges
  extends Instantiable0[typings.std.TimeRanges]

