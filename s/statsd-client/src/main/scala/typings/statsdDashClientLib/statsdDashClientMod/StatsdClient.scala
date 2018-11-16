package typings
package statsdDashClientLib.statsdDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatsdClient extends js.Object {
  var helpers: statsdDashClientLib.Anon_GetExpressMiddleware = js.native
  def close(): this.type = js.native
  def counter(metric: java.lang.String, delta: scala.Double): this.type = js.native
  def counter(metric: java.lang.String, delta: scala.Double, tags: Tags): this.type = js.native
  def decrement(metric: java.lang.String): this.type = js.native
  def decrement(metric: java.lang.String, delta: scala.Double): this.type = js.native
  def decrement(metric: java.lang.String, delta: scala.Double, tags: Tags): this.type = js.native
  def formatTags(): java.lang.String = js.native
  def formatTags(tags: Tags): java.lang.String = js.native
  def gauge(name: java.lang.String, value: scala.Double): this.type = js.native
  def gauge(name: java.lang.String, value: scala.Double, tags: Tags): this.type = js.native
  def gaugeDelta(name: java.lang.String, delta: scala.Double): this.type = js.native
  def gaugeDelta(name: java.lang.String, delta: scala.Double, tags: Tags): this.type = js.native
  def getChildClient(name: java.lang.String): StatsdClient = js.native
  def histogram(name: java.lang.String, value: scala.Double): this.type = js.native
  def histogram(name: java.lang.String, value: scala.Double, tags: Tags): this.type = js.native
  def increment(metric: java.lang.String): this.type = js.native
  def increment(metric: java.lang.String, delta: scala.Double): this.type = js.native
  def increment(metric: java.lang.String, delta: scala.Double, tags: Tags): this.type = js.native
  def raw(rawData: java.lang.String): this.type = js.native
  def set(name: java.lang.String, value: scala.Double): this.type = js.native
  def set(name: java.lang.String, value: scala.Double, tags: Tags): this.type = js.native
  def timing(name: java.lang.String, startOrDuration: scala.Double): this.type = js.native
  def timing(name: java.lang.String, startOrDuration: scala.Double, tags: Tags): this.type = js.native
  def timing(name: java.lang.String, startOrDuration: stdLib.Date): this.type = js.native
  def timing(name: java.lang.String, startOrDuration: stdLib.Date, tags: Tags): this.type = js.native
}

