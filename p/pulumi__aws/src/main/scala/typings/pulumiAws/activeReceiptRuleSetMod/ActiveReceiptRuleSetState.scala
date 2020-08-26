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
  def apply(): ActiveReceiptRuleSetState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveReceiptRuleSetState]
  }
  @scala.inline
  implicit class ActiveReceiptRuleSetStateOps[Self <: ActiveReceiptRuleSetState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRuleSetName(value: Input[String]): Self = this.set("ruleSetName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleSetName: Self = this.set("ruleSetName", js.undefined)
  }
  
}

