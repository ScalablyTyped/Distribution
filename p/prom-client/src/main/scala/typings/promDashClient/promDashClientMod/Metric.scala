package typings.promDashClient.promDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.promDashClient.promDashClientMod.Counter
  - typings.promDashClient.promDashClientMod.Gauge
  - typings.promDashClient.promDashClientMod.Summary
  - typings.promDashClient.promDashClientMod.Histogram
*/
trait Metric extends js.Object

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

