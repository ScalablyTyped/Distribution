package typings.atPulumiAws.sesReceiptRuleSetMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiptRuleSetState extends js.Object {
  /**
    * The name of the rule set
    */
  val ruleSetName: js.UndefOr[Input[String]] = js.native
}

object ReceiptRuleSetState {
  @scala.inline
  def apply(ruleSetName: Input[String] = null): ReceiptRuleSetState = {
    val __obj = js.Dynamic.literal()
    if (ruleSetName != null) __obj.updateDynamic("ruleSetName")(ruleSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptRuleSetState]
  }
}

