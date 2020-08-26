package typings.pulumiAws.standardsSubscriptionMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StandardsSubscriptionState extends js.Object {
  /**
    * The ARN of a standard - see below.
    */
  val standardsArn: js.UndefOr[Input[String]] = js.native
}

object StandardsSubscriptionState {
  @scala.inline
  def apply(): StandardsSubscriptionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardsSubscriptionState]
  }
  @scala.inline
  implicit class StandardsSubscriptionStateOps[Self <: StandardsSubscriptionState] (val x: Self) extends AnyVal {
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
    def setStandardsArn(value: Input[String]): Self = this.set("standardsArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandardsArn: Self = this.set("standardsArn", js.undefined)
  }
  
}

