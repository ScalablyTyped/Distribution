package typings
package atPulumiAwsLib.sesActiveReceiptRuleSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveReceiptRuleSetState extends js.Object {
  /**
    * The name of the rule set
    */
  val ruleSetName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object ActiveReceiptRuleSetState {
  @scala.inline
  def apply(ruleSetName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null): ActiveReceiptRuleSetState = {
    val __obj = js.Dynamic.literal()
    if (ruleSetName != null) __obj.updateDynamic("ruleSetName")(ruleSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveReceiptRuleSetState]
  }
}

