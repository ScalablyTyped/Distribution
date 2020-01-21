package typings.reactNativeFirebase.mod.RNFirebase.perf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Perf extends js.Object {
  /**
    * Returns a new HTTP Metric instance.
    */
  def newHttpMetric(url: String, httpMethod: HttpMethod): HttpMetric
  /**
    * Returns a new Trace instance.
    */
  def newTrace(trace: String): Trace
  /**
    * Globally enable or disable performance monitoring.
    */
  def setPerformanceCollectionEnabled(enabled: Boolean): Unit
}

object Perf {
  @scala.inline
  def apply(
    newHttpMetric: (String, HttpMethod) => HttpMetric,
    newTrace: String => Trace,
    setPerformanceCollectionEnabled: Boolean => Unit
  ): Perf = {
    val __obj = js.Dynamic.literal(newHttpMetric = js.Any.fromFunction2(newHttpMetric), newTrace = js.Any.fromFunction1(newTrace), setPerformanceCollectionEnabled = js.Any.fromFunction1(setPerformanceCollectionEnabled))
  
    __obj.asInstanceOf[Perf]
  }
}

