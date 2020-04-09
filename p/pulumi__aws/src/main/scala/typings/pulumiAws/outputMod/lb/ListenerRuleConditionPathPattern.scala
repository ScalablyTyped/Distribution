package typings.pulumiAws.outputMod.lb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerRuleConditionPathPattern extends js.Object {
  /**
    * List of exactly one pattern to match. Required when `field` is set.
    */
  var values: js.Array[String] = js.native
}

object ListenerRuleConditionPathPattern {
  @scala.inline
  def apply(values: js.Array[String]): ListenerRuleConditionPathPattern = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListenerRuleConditionPathPattern]
  }
}

