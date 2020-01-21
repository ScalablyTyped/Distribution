package typings.pulumiAws.activeReceiptRuleSetMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveReceiptRuleSetArgs extends js.Object {
  /**
    * The name of the rule set
    */
  val ruleSetName: Input[String] = js.native
}

object ActiveReceiptRuleSetArgs {
  @scala.inline
  def apply(ruleSetName: Input[String]): ActiveReceiptRuleSetArgs = {
    val __obj = js.Dynamic.literal(ruleSetName = ruleSetName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActiveReceiptRuleSetArgs]
  }
}

