package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods and properties to store and retrieve metrics regarding the browser's document navigation events. For example, this interface can be used to determine how much time it takes to load or unload a document. */
trait PerformanceNavigationTiming extends PerformanceResourceTiming {
  val domComplete: Double
  val domContentLoadedEventEnd: Double
  val domContentLoadedEventStart: Double
  val domInteractive: Double
  val loadEventEnd: Double
  val loadEventStart: Double
  val redirectCount: Double
  val `type`: NavigationType
  val unloadEventEnd: Double
  val unloadEventStart: Double
}

@JSGlobal("PerformanceNavigationTiming")
@js.native
class PerformanceNavigationTimingCls () extends PerformanceNavigationTiming {
  /* CompleteClass */
  override val connectEnd: Double = js.native
  /* CompleteClass */
  override val connectStart: Double = js.native
  /* CompleteClass */
  override val decodedBodySize: Double = js.native
  /* CompleteClass */
  override val domComplete: Double = js.native
  /* CompleteClass */
  override val domContentLoadedEventEnd: Double = js.native
  /* CompleteClass */
  override val domContentLoadedEventStart: Double = js.native
  /* CompleteClass */
  override val domInteractive: Double = js.native
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
  override val loadEventEnd: Double = js.native
  /* CompleteClass */
  override val loadEventStart: Double = js.native
  /* CompleteClass */
  override val name: java.lang.String = js.native
  /* CompleteClass */
  override val nextHopProtocol: java.lang.String = js.native
  /* CompleteClass */
  override val redirectCount: Double = js.native
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
  override val `type`: NavigationType = js.native
  /* CompleteClass */
  override val unloadEventEnd: Double = js.native
  /* CompleteClass */
  override val unloadEventStart: Double = js.native
  /* CompleteClass */
  override val workerStart: Double = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

@JSGlobal("PerformanceNavigationTiming")
@js.native
object PerformanceNavigationTiming extends Instantiable0[PerformanceNavigationTiming]

