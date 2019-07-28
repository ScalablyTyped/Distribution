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
class PerformanceResourceTimingCls () extends PerformanceResourceTiming {
  /* CompleteClass */
  override val connectEnd: Double = js.native
  /* CompleteClass */
  override val connectStart: Double = js.native
  /* CompleteClass */
  override val decodedBodySize: Double = js.native
  /* CompleteClass */
  override val domainLookupEnd: Double = js.native
  /* CompleteClass */
  override val domainLookupStart: Double = js.native
  /* CompleteClass */
  override val duration: Double = js.native
  /* CompleteClass */
  override val encodedBodySize: Double = js.native
  /* CompleteClass */
  override val entryType: java.lang.String = js.native
  /* CompleteClass */
  override val fetchStart: Double = js.native
  /* CompleteClass */
  override val initiatorType: java.lang.String = js.native
  /* CompleteClass */
  override val name: java.lang.String = js.native
  /* CompleteClass */
  override val nextHopProtocol: java.lang.String = js.native
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
  override val startTime: Double = js.native
  /* CompleteClass */
  override val transferSize: Double = js.native
  /* CompleteClass */
  override val workerStart: Double = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

@JSGlobal("PerformanceResourceTiming")
@js.native
object PerformanceResourceTiming extends Instantiable0[PerformanceResourceTiming]

