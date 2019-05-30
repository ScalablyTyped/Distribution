package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods and properties to store and retrieve metrics regarding the browser's document navigation events. For example, this interface can be used to determine how much time it takes to load or unload a document. */
trait PerformanceNavigationTiming extends PerformanceResourceTiming {
  val domComplete: scala.Double
  val domContentLoadedEventEnd: scala.Double
  val domContentLoadedEventStart: scala.Double
  val domInteractive: scala.Double
  val loadEventEnd: scala.Double
  val loadEventStart: scala.Double
  val redirectCount: scala.Double
  val `type`: NavigationType
  val unloadEventEnd: scala.Double
  val unloadEventStart: scala.Double
}

@JSGlobal("PerformanceNavigationTiming")
@js.native
class PerformanceNavigationTimingCls () extends PerformanceNavigationTiming {
  /* CompleteClass */
  override val connectEnd: scala.Double = js.native
  /* CompleteClass */
  override val connectStart: scala.Double = js.native
  /* CompleteClass */
  override val decodedBodySize: scala.Double = js.native
  /* CompleteClass */
  override val domComplete: scala.Double = js.native
  /* CompleteClass */
  override val domContentLoadedEventEnd: scala.Double = js.native
  /* CompleteClass */
  override val domContentLoadedEventStart: scala.Double = js.native
  /* CompleteClass */
  override val domInteractive: scala.Double = js.native
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
  override val loadEventEnd: scala.Double = js.native
  /* CompleteClass */
  override val loadEventStart: scala.Double = js.native
  /* CompleteClass */
  override val name: java.lang.String = js.native
  /* CompleteClass */
  override val nextHopProtocol: java.lang.String = js.native
  /* CompleteClass */
  override val redirectCount: scala.Double = js.native
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
  override val `type`: NavigationType = js.native
  /* CompleteClass */
  override val unloadEventEnd: scala.Double = js.native
  /* CompleteClass */
  override val unloadEventStart: scala.Double = js.native
  /* CompleteClass */
  override val workerStart: scala.Double = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

@JSGlobal("PerformanceNavigationTiming")
@js.native
object PerformanceNavigationTiming
  extends org.scalablytyped.runtime.Instantiable0[PerformanceNavigationTiming]

