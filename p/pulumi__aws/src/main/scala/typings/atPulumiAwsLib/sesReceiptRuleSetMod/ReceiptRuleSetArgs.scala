package typings
package atPulumiAwsLib.sesReceiptRuleSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiptRuleSetArgs extends js.Object {
  /**
    * The name of the rule set
    */
  val ruleSetName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object ReceiptRuleSetArgs {
  @scala.inline
  def apply(ruleSetName: atPulumiPulumiLib.outputMod.Input[java.lang.String]): ReceiptRuleSetArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ruleSetName")(ruleSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptRuleSetArgs]
  }
}

