package typings.atPulumiAws.typesOutputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerPredicate extends js.Object {
  /**
    * A list of the conditions that determine when the trigger will fire. Defined below.
    */
  var conditions: js.Array[TriggerPredicateCondition]
  /**
    * How to handle multiple conditions. Defaults to `AND`. Valid values are `AND` or `ANY`.
    */
  var logical: js.UndefOr[String] = js.undefined
}

object TriggerPredicate {
  @scala.inline
  def apply(conditions: js.Array[TriggerPredicateCondition], logical: String = null): TriggerPredicate = {
    val __obj = js.Dynamic.literal(conditions = conditions)
    if (logical != null) __obj.updateDynamic("logical")(logical)
    __obj.asInstanceOf[TriggerPredicate]
  }
}

