package typings.promDashClient.promDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait metric extends js.Object {
  var aggregator: Aggregator
  var help: String
  var name: String
  var `type`: MetricType
}

object metric {
  @scala.inline
  def apply(aggregator: Aggregator, help: String, name: String, `type`: MetricType): metric = {
    val __obj = js.Dynamic.literal(aggregator = aggregator, help = help, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[metric]
  }
}

