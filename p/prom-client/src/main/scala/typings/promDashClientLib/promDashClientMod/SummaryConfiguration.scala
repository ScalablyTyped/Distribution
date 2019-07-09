package typings
package promDashClientLib.promDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummaryConfiguration extends js.Object {
  var ageBuckets: js.UndefOr[scala.Double] = js.undefined
  var aggregator: js.UndefOr[Aggregator] = js.undefined
  var compressCount: js.UndefOr[scala.Double] = js.undefined
  var help: java.lang.String
  var labelNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var maxAgeSeconds: js.UndefOr[scala.Double] = js.undefined
  var name: java.lang.String
  var percentiles: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var registers: js.UndefOr[js.Array[Registry]] = js.undefined
}

object SummaryConfiguration {
  @scala.inline
  def apply(
    help: java.lang.String,
    name: java.lang.String,
    ageBuckets: scala.Int | scala.Double = null,
    aggregator: Aggregator = null,
    compressCount: scala.Int | scala.Double = null,
    labelNames: js.Array[java.lang.String] = null,
    maxAgeSeconds: scala.Int | scala.Double = null,
    percentiles: js.Array[scala.Double] = null,
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

