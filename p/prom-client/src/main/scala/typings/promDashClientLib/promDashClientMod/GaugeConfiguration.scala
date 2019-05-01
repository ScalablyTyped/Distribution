package typings
package promDashClientLib.promDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaugeConfiguration extends js.Object {
  var aggregator: js.UndefOr[Aggregator] = js.undefined
  var help: java.lang.String
  var labelNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var name: java.lang.String
  var registers: js.UndefOr[js.Array[Registry]] = js.undefined
}

object GaugeConfiguration {
  @scala.inline
  def apply(
    help: java.lang.String,
    name: java.lang.String,
    aggregator: Aggregator = null,
    labelNames: js.Array[java.lang.String] = null,
    registers: js.Array[Registry] = null
  ): GaugeConfiguration = {
    val __obj = js.Dynamic.literal(help = help, name = name)
    if (aggregator != null) __obj.updateDynamic("aggregator")(aggregator)
    if (labelNames != null) __obj.updateDynamic("labelNames")(labelNames)
    if (registers != null) __obj.updateDynamic("registers")(registers)
    __obj.asInstanceOf[GaugeConfiguration]
  }
}

