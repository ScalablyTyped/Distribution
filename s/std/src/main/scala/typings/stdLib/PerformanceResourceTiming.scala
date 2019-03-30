package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The PerformanceResourceTiming interface enables retrieval and analysis of detailed network timing data regarding the loading of an application's resources. An application can use the timing metrics to determine, for example, the length of time it takes to fetch a specific resource, such as an XMLHttpRequest, <SVG>, image, or script. */
trait PerformanceResourceTiming extends PerformanceEntry {
  val connectEnd: scala.Double
  val connectStart: scala.Double
  val decodedBodySize: scala.Double
  val domainLookupEnd: scala.Double
  val domainLookupStart: scala.Double
  val encodedBodySize: scala.Double
  val fetchStart: scala.Double
  val initiatorType: java.lang.String
  val nextHopProtocol: java.lang.String
  val redirectEnd: scala.Double
  val redirectStart: scala.Double
  val requestStart: scala.Double
  val responseEnd: scala.Double
  val responseStart: scala.Double
  val secureConnectionStart: scala.Double
  val transferSize: scala.Double
  val workerStart: scala.Double
}

@JSGlobal("PerformanceResourceTiming")
@js.native
class PerformanceResourceTimingCls () extends PerformanceResourceTiming {
  /* CompleteClass */
  override val connectEnd: scala.Double = js.native
  /* CompleteClass */
  override val connectStart: scala.Double = js.native
  /* CompleteClass */
  override val decodedBodySize: scala.Double = js.native
  /* CompleteClass */
  override val domainLookupEnd: scala.Double = js.native
  /* CompleteClass */
  override val domainLookupStart: scala.Double = js.native
  /* CompleteClass */
  override val duration: scala.Double = js.native
  /* CompleteClass */
  override val encodedBodySize: scala.Double = js.native
  /* CompleteClass */
  override val entryType: java.lang.String = js.native
  /* CompleteClass */
  override val fetchStart: scala.Double = js.native
  /* CompleteClass */
  override val initiatorType: java.lang.String = js.native
  /* CompleteClass */
  override val name: java.lang.String = js.native
  /* CompleteClass */
  override val nextHopProtocol: java.lang.String = js.native
  /* CompleteClass */
  override val redirectEnd: scala.Double = js.native
  /* CompleteClass */
  override val redirectStart: scala.Double = js.native
  /* CompleteClass */
  override val requestStart: scala.Double = js.native
  /* CompleteClass */
  override val responseEnd: scala.Double = js.native
  /* CompleteClass */
  override val responseStart: scala.Double = js.native
  /* CompleteClass */
  override val secureConnectionStart: scala.Double = js.native
  /* CompleteClass */
  override val startTime: scala.Double = js.native
  /* CompleteClass */
  override val transferSize: scala.Double = js.native
  /* CompleteClass */
  override val workerStart: scala.Double = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

@JSGlobal("PerformanceResourceTiming")
@js.native
object PerformanceResourceTiming
  extends org.scalablytyped.runtime.Instantiable0[PerformanceResourceTiming]

