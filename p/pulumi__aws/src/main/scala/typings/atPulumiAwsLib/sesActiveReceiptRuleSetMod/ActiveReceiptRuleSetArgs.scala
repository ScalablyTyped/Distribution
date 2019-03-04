package typings
package atPulumiAwsLib.sesActiveReceiptRuleSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveReceiptRuleSetArgs extends js.Object {
  /**
    * The name of the rule set
    */
  val ruleSetName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object ActiveReceiptRuleSetArgs {
  @scala.inline
  def apply(ruleSetName: atPulumiPulumiLib.outputMod.Input[java.lang.String]): ActiveReceiptRuleSetArgs = {
    val __obj = js.Dynamic.literal(ruleSetName = ruleSetName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActiveReceiptRuleSetArgs]
  }
}

