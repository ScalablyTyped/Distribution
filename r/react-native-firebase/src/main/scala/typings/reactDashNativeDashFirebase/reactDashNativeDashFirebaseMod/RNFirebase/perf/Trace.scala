package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.perf

import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseNumbers.`false`
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trace extends js.Object {
  /**
    * Return an attribute by name, or null if it does not exist.
    */
  def getAttribute(attribute: String): js.Promise[String | Null]
  /**
    * Return an object of key-value attributes.
    */
  def getAttributes(): js.Promise[js.Object]
  /**
    * Get a metric by name. Returns 0 if it does not exist.
    */
  def getMetric(metricName: String): js.Promise[Double]
  /**
    * Increment a metric by name and value.
    */
  def incrementMetric(metricName: String, incrementBy: Double): js.Promise[Null]
  /**
    * Set an attribute. Returns true if it was set, false if it was not.
    */
  def putAttribute(attribute: String, value: String): js.Promise[`true` | `false`]
  /**
    * Set a metric.
    */
  def putMetric(metricName: String, value: Double): js.Promise[Null]
  /**
    * Remove an attribute by name.
    */
  def removeAttribute(attribute: String): js.Promise[Null]
  /**
    * Start a Trace instance.
    */
  def start(): js.Promise[Null]
  /**
    * Stop a Trace instance.
    */
  def stop(): js.Promise[Null]
}

object Trace {
  @scala.inline
  def apply(
    getAttribute: String => js.Promise[String | Null],
    getAttributes: () => js.Promise[js.Object],
    getMetric: String => js.Promise[Double],
    incrementMetric: (String, Double) => js.Promise[Null],
    putAttribute: (String, String) => js.Promise[`true` | `false`],
    putMetric: (String, Double) => js.Promise[Null],
    removeAttribute: String => js.Promise[Null],
    start: () => js.Promise[Null],
    stop: () => js.Promise[Null]
  ): Trace = {
    val __obj = js.Dynamic.literal(getAttribute = js.Any.fromFunction1(getAttribute), getAttributes = js.Any.fromFunction0(getAttributes), getMetric = js.Any.fromFunction1(getMetric), incrementMetric = js.Any.fromFunction2(incrementMetric), putAttribute = js.Any.fromFunction2(putAttribute), putMetric = js.Any.fromFunction2(putMetric), removeAttribute = js.Any.fromFunction1(removeAttribute), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[Trace]
  }
}

