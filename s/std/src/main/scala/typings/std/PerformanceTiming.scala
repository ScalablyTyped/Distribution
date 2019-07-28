package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A legacy interface kept for backwards compatibility and contains properties that offer performance timing information for various events which occur during the loading and use of the current page. You get a PerformanceTiming object describing your page using the window.performance.timing property. */
trait PerformanceTiming extends js.Object {
  val connectEnd: Double
  val connectStart: Double
  val domComplete: Double
  val domContentLoadedEventEnd: Double
  val domContentLoadedEventStart: Double
  val domInteractive: Double
  val domLoading: Double
  val domainLookupEnd: Double
  val domainLookupStart: Double
  val fetchStart: Double
  val loadEventEnd: Double
  val loadEventStart: Double
  val navigationStart: Double
  val redirectEnd: Double
  val redirectStart: Double
  val requestStart: Double
  val responseEnd: Double
  val responseStart: Double
  val secureConnectionStart: Double
  val unloadEventEnd: Double
  val unloadEventStart: Double
  def toJSON(): js.Any
}

@JSGlobal("PerformanceTiming")
@js.native
class PerformanceTimingCls () extends PerformanceTiming {
  /* CompleteClass */
  override val connectEnd: Double = js.native
  /* CompleteClass */
  override val connectStart: Double = js.native
  /* CompleteClass */
  override val domComplete: Double = js.native
  /* CompleteClass */
  override val domContentLoadedEventEnd: Double = js.native
  /* CompleteClass */
  override val domContentLoadedEventStart: Double = js.native
  /* CompleteClass */
  override val domInteractive: Double = js.native
  /* CompleteClass */
  override val domLoading: Double = js.native
  /* CompleteClass */
  override val domainLookupEnd: Double = js.native
  /* CompleteClass */
  override val domainLookupStart: Double = js.native
  /* CompleteClass */
  override val fetchStart: Double = js.native
  /* CompleteClass */
  override val loadEventEnd: Double = js.native
  /* CompleteClass */
  override val loadEventStart: Double = js.native
  /* CompleteClass */
  override val navigationStart: Double = js.native
  /* CompleteClass */
  override val redirectEnd: Double = js.native
  /* CompleteClass */
  override val redirectStart: Double = js.native
  /* CompleteClass */
  override val requestStart: Double = js.native
  /* CompleteClass */
  override val responseEnd: Double = js.native
  /* CompleteClass */
  override val responseStart: Double = js.native
  /* CompleteClass */
  override val secureConnectionStart: Double = js.native
  /* CompleteClass */
  override val unloadEventEnd: Double = js.native
  /* CompleteClass */
  override val unloadEventStart: Double = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

@JSGlobal("PerformanceTiming")
@js.native
object PerformanceTiming extends Instantiable0[PerformanceTiming]

