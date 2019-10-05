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
object PerformanceNavigationTiming extends Instantiable0[PerformanceNavigationTiming]

