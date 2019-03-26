package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeRanges extends js.Object {
  val length: scala.Double
  def end(index: scala.Double): scala.Double
  def start(index: scala.Double): scala.Double
}

@JSGlobal("TimeRanges")
@js.native
class TimeRangesCls () extends TimeRanges {
  /* CompleteClass */
  override val length: scala.Double = js.native
  /* CompleteClass */
  override def end(index: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def start(index: scala.Double): scala.Double = js.native
}

@JSGlobal("TimeRanges")
@js.native
object TimeRanges
  extends org.scalablytyped.runtime.Instantiable0[TimeRanges]

