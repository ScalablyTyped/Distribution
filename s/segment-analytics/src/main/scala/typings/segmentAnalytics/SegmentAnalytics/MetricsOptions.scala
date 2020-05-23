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
    flushTimer: js.UndefOr[Double] = js.undefined,
    host: String = null,
    maxQueueSize: js.UndefOr[Double] = js.undefined,
    sampleRate: js.UndefOr[Double] = js.undefined
  ): MetricsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flushTimer)) __obj.updateDynamic("flushTimer")(flushTimer.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(maxQueueSize)) __obj.updateDynamic("maxQueueSize")(maxQueueSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleRate)) __obj.updateDynamic("sampleRate")(sampleRate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricsOptions]
  }
}

