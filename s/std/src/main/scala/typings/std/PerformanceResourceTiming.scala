package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables retrieval and analysis of detailed network timing data regarding the loading of an application's resources. An application can use the timing metrics to determine, for example, the length of time it takes to fetch a specific resource, such as an XMLHttpRequest, <SVG>, image, or script. */
trait PerformanceResourceTiming extends PerformanceEntry {
  val connectEnd: Double
  val connectStart: Double
  val decodedBodySize: Double
  val domainLookupEnd: Double
  val domainLookupStart: Double
  val encodedBodySize: Double
  val fetchStart: Double
  val initiatorType: java.lang.String
  val nextHopProtocol: java.lang.String
  val redirectEnd: Double
  val redirectStart: Double
  val requestStart: Double
  val responseEnd: Double
  val responseStart: Double
  val secureConnectionStart: Double
  val transferSize: Double
  val workerStart: Double
}

@JSGlobal("PerformanceResourceTiming")
@js.native
object PerformanceResourceTiming extends Instantiable0[PerformanceResourceTiming]

