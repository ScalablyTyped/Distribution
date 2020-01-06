package typings.atPulumiAws.sesReceiptRuleSetMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiptRuleSetArgs extends js.Object {
  /**
    * The name of the rule set
    */
  val ruleSetName: Input[String] = js.native
}

object ReceiptRuleSetArgs {
  @scala.inline
  def apply(ruleSetName: Input[String]): ReceiptRuleSetArgs = {
    val __obj = js.Dynamic.literal(ruleSetName = ruleSetName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReceiptRuleSetArgs]
  }
}

