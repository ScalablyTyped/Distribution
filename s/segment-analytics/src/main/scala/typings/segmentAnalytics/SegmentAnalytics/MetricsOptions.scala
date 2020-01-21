package typings.segmentAnalytics.SegmentAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsOptions extends js.Object {
  var flushTimer: js.UndefOr[Double] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var maxQueueSize: js.UndefOr[Double] = js.undefined
  var sampleRate: js.UndefOr[Double] = js.undefined
}

object MetricsOptions {
  @scala.inline
  def apply(
    flushTimer: Int | Double = null,
    host: String = null,
    maxQueueSize: Int | Double = null,
    sampleRate: Int | Double = null
  ): MetricsOptions = {
    val __obj = js.Dynamic.literal()
    if (flushTimer != null) __obj.updateDynamic("flushTimer")(flushTimer.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (maxQueueSize != null) __obj.updateDynamic("maxQueueSize")(maxQueueSize.asInstanceOf[js.Any])
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricsOptions]
  }
}

