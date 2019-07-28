package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to represent a set of time ranges, primarily for the purpose of tracking which portions of media have been buffered when loading it for use by the <audio> and <video> elements. */
trait TimeRanges extends js.Object {
  val length: Double
  def end(index: Double): Double
  def start(index: Double): Double
}

@JSGlobal("TimeRanges")
@js.native
class TimeRangesCls () extends TimeRanges {
  /* CompleteClass */
  override val length: Double = js.native
  /* CompleteClass */
  override def end(index: Double): Double = js.native
  /* CompleteClass */
  override def start(index: Double): Double = js.native
}

@JSGlobal("TimeRanges")
@js.native
object TimeRanges extends Instantiable0[TimeRanges]

