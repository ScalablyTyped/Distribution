package typings.pulumiAws.inputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAutoscalingGroupsFilter extends js.Object {
  /**
    * The name of the filter. The valid values are: `auto-scaling-group`, `key`, `value`, and `propagate-at-launch`.
    */
  var name: String = js.native
  /**
    * The value of the filter.
    */
  var values: js.Array[String] = js.native
}

object GetAutoscalingGroupsFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetAutoscalingGroupsFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetAutoscalingGroupsFilter]
  }
}

