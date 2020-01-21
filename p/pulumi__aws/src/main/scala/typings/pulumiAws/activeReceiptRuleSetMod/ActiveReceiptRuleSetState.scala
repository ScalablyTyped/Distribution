package typings.pulumiAws.activeReceiptRuleSetMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveReceiptRuleSetState extends js.Object {
  /**
    * The name of the rule set
    */
  val ruleSetName: js.UndefOr[Input[String]] = js.native
}

object ActiveReceiptRuleSetState {
  @scala.inline
  def apply(ruleSetName: Input[String] = null): ActiveReceiptRuleSetState = {
    val __obj = js.Dynamic.literal()
    if (ruleSetName != null) __obj.updateDynamic("ruleSetName")(ruleSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveReceiptRuleSetState]
  }
}

