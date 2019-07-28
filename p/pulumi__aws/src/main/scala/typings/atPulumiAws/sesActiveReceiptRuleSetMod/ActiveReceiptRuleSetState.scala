package typings.atPulumiAws.sesActiveReceiptRuleSetMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveReceiptRuleSetState extends js.Object {
  /**
    * The name of the rule set
    */
  val ruleSetName: js.UndefOr[Input[String]] = js.undefined
}

object ActiveReceiptRuleSetState {
  @scala.inline
  def apply(ruleSetName: Input[String] = null): ActiveReceiptRuleSetState = {
    val __obj = js.Dynamic.literal()
    if (ruleSetName != null) __obj.updateDynamic("ruleSetName")(ruleSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveReceiptRuleSetState]
  }
}

