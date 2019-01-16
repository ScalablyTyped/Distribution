package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerformanceTiming extends js.Object {
  val connectEnd: scala.Double
  val connectStart: scala.Double
  val domComplete: scala.Double
  val domContentLoadedEventEnd: scala.Double
  val domContentLoadedEventStart: scala.Double
  val domInteractive: scala.Double
  val domLoading: scala.Double
  val domainLookupEnd: scala.Double
  val domainLookupStart: scala.Double
  val fetchStart: scala.Double
  val loadEventEnd: scala.Double
  val loadEventStart: scala.Double
  val navigationStart: scala.Double
  val redirectEnd: scala.Double
  val redirectStart: scala.Double
  val requestStart: scala.Double
  val responseEnd: scala.Double
  val responseStart: scala.Double
  val secureConnectionStart: scala.Double
  val unloadEventEnd: scala.Double
  val unloadEventStart: scala.Double
  def toJSON(): js.Any
}

@JSGlobal("PerformanceTiming")
@js.native
object PerformanceTiming
  extends org.scalablytyped.runtime.Instantiable0[PerformanceTiming]

