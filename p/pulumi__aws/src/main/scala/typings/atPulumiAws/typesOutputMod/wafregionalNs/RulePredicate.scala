package typings.atPulumiAws.typesOutputMod.wafregionalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RulePredicate extends js.Object {
  var dataId: String
  var negated: Boolean
  var `type`: String
}

object RulePredicate {
  @scala.inline
  def apply(dataId: String, negated: Boolean, `type`: String): RulePredicate = {
    val __obj = js.Dynamic.literal(dataId = dataId, negated = negated)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RulePredicate]
  }
}

