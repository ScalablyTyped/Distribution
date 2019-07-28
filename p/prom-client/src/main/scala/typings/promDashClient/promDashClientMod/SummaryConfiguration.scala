package typings.promDashClient.promDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummaryConfiguration extends js.Object {
  var ageBuckets: js.UndefOr[Double] = js.undefined
  var aggregator: js.UndefOr[Aggregator] = js.undefined
  var compressCount: js.UndefOr[Double] = js.undefined
  var help: String
  var labelNames: js.UndefOr[js.Array[String]] = js.undefined
  var maxAgeSeconds: js.UndefOr[Double] = js.undefined
  var name: String
  var percentiles: js.UndefOr[js.Array[Double]] = js.undefined
  var registers: js.UndefOr[js.Array[Registry]] = js.undefined
}

object SummaryConfiguration {
  @scala.inline
  def apply(
    help: String,
    name: String,
    ageBuckets: Int | Double = null,
    aggregator: Aggregator = null,
    compressCount: Int | Double = null,
    labelNames: js.Array[String] = null,
    maxAgeSeconds: Int | Double = null,
    percentiles: js.Array[Double] = null,
    registers: js.Array[Registry] = null
  ): SummaryConfiguration = {
    val __obj = js.Dynamic.literal(help = help, name = name)
    if (ageBuckets != null) __obj.updateDynamic("ageBuckets")(ageBuckets.asInstanceOf[js.Any])
    if (aggregator != null) __obj.updateDynamic("aggregator")(aggregator)
    if (compressCount != null) __obj.updateDynamic("compressCount")(compressCount.asInstanceOf[js.Any])
    if (labelNames != null) __obj.updateDynamic("labelNames")(labelNames)
    if (maxAgeSeconds != null) __obj.updateDynamic("maxAgeSeconds")(maxAgeSeconds.asInstanceOf[js.Any])
    if (percentiles != null) __obj.updateDynamic("percentiles")(percentiles)
    if (registers != null) __obj.updateDynamic("registers")(registers)
    __obj.asInstanceOf[SummaryConfiguration]
  }
}

