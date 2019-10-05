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
object PerformanceTiming extends Instantiable0[PerformanceTiming]

