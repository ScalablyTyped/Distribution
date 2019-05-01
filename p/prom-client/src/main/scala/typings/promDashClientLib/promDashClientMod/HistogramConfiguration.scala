package typings
package promDashClientLib.promDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistogramConfiguration extends js.Object {
  var aggregator: js.UndefOr[Aggregator] = js.undefined
  var buckets: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var help: java.lang.String
  var labelNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var name: java.lang.String
  var registers: js.UndefOr[js.Array[Registry]] = js.undefined
}

object HistogramConfiguration {
  @scala.inline
  def apply(
    help: java.lang.String,
    name: java.lang.String,
    aggregator: Aggregator = null,
    buckets: js.Array[scala.Double] = null,
    labelNames: js.Array[java.lang.String] = null,
    registers: js.Array[Registry] = null
  ): HistogramConfiguration = {
    val __obj = js.Dynamic.literal(help = help, name = name)
    if (aggregator != null) __obj.updateDynamic("aggregator")(aggregator)
    if (buckets != null) __obj.updateDynamic("buckets")(buckets)
    if (labelNames != null) __obj.updateDynamic("labelNames")(labelNames)
    if (registers != null) __obj.updateDynamic("registers")(registers)
    __obj.asInstanceOf[HistogramConfiguration]
  }
}

