package typings.atPulumiAws.typesOutputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAutoscalingGroupsFilter extends js.Object {
  /**
    * The name of the filter. The valid values are: `auto-scaling-group`, `key`, `value`, and `propagate-at-launch`.
    */
  var name: String
  /**
    * The value of the filter.
    */
  var values: js.Array[String]
}

object GetAutoscalingGroupsFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetAutoscalingGroupsFilter = {
    val __obj = js.Dynamic.literal(name = name, values = values)
  
    __obj.asInstanceOf[GetAutoscalingGroupsFilter]
  }
}

