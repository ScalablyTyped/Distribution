package typings.atPulumiAws.sesActiveReceiptRuleSetMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveReceiptRuleSetArgs extends js.Object {
  /**
    * The name of the rule set
    */
  val ruleSetName: Input[String]
}

object ActiveReceiptRuleSetArgs {
  @scala.inline
  def apply(ruleSetName: Input[String]): ActiveReceiptRuleSetArgs = {
    val __obj = js.Dynamic.literal(ruleSetName = ruleSetName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActiveReceiptRuleSetArgs]
  }
}

