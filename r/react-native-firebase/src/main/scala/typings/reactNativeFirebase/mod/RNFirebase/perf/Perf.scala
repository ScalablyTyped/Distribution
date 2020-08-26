package typings.reactNativeFirebase.mod.RNFirebase.perf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Perf extends js.Object {
  /**
    * Returns a new HTTP Metric instance.
    */
  def newHttpMetric(url: String, httpMethod: HttpMethod): HttpMetric = js.native
  /**
    * Returns a new Trace instance.
    */
  def newTrace(trace: String): Trace = js.native
  /**
    * Globally enable or disable performance monitoring.
    */
  def setPerformanceCollectionEnabled(enabled: Boolean): Unit = js.native
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
  @scala.inline
  implicit class PerfOps[Self <: Perf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNewHttpMetric(value: (String, HttpMethod) => HttpMetric): Self = this.set("newHttpMetric", js.Any.fromFunction2(value))
    @scala.inline
    def setNewTrace(value: String => Trace): Self = this.set("newTrace", js.Any.fromFunction1(value))
    @scala.inline
    def setSetPerformanceCollectionEnabled(value: Boolean => Unit): Self = this.set("setPerformanceCollectionEnabled", js.Any.fromFunction1(value))
  }
  
}

