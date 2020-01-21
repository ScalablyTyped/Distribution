package typings.promClient.mod

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
    val __obj = js.Dynamic.literal(aggregator = aggregator.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[metric]
  }
}

