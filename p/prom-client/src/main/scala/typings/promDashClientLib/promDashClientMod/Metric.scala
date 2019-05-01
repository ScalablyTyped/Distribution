package typings
package promDashClientLib.promDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - Counter
  - Gauge
  - Summary
  - Histogram
*/
trait Metric extends js.Object

trait metric extends js.Object {
  var aggregator: Aggregator
  var help: java.lang.String
  var name: java.lang.String
  var `type`: MetricType
}

object metric {
  @scala.inline
  def apply(aggregator: Aggregator, help: java.lang.String, name: java.lang.String, `type`: MetricType): metric = {
    val __obj = js.Dynamic.literal(aggregator = aggregator, help = help, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[metric]
  }
}

