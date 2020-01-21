package typings.pulumiAws.inputMod.wafregional

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RulePredicate extends js.Object {
  var dataId: Input[String] = js.native
  var negated: Input[Boolean] = js.native
  var `type`: Input[String] = js.native
}

object RulePredicate {
  @scala.inline
  def apply(dataId: Input[String], negated: Input[Boolean], `type`: Input[String]): RulePredicate = {
    val __obj = js.Dynamic.literal(dataId = dataId.asInstanceOf[js.Any], negated = negated.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulePredicate]
  }
}

