package typings.promDashClient.promDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaugeConfiguration extends js.Object {
  var aggregator: js.UndefOr[Aggregator] = js.undefined
  var help: String
  var labelNames: js.UndefOr[js.Array[String]] = js.undefined
  var name: String
  var registers: js.UndefOr[js.Array[Registry]] = js.undefined
}

object GaugeConfiguration {
  @scala.inline
  def apply(
    help: String,
    name: String,
    aggregator: Aggregator = null,
    labelNames: js.Array[String] = null,
    registers: js.Array[Registry] = null
  ): GaugeConfiguration = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (aggregator != null) __obj.updateDynamic("aggregator")(aggregator.asInstanceOf[js.Any])
    if (labelNames != null) __obj.updateDynamic("labelNames")(labelNames.asInstanceOf[js.Any])
    if (registers != null) __obj.updateDynamic("registers")(registers.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaugeConfiguration]
  }
}

