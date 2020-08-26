package typings.pulumiAws.inputMod.applicationloadbalancing

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerDefaultActionForwardTargetGroup extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var arn: Input[String] = js.native
  /**
    * The weight. The range is 0 to 999.
    */
  var weight: js.UndefOr[Input[Double]] = js.native
}

object ListenerDefaultActionForwardTargetGroup {
  @scala.inline
  def apply(arn: Input[String]): ListenerDefaultActionForwardTargetGroup = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerDefaultActionForwardTargetGroup]
  }
  @scala.inline
  implicit class ListenerDefaultActionForwardTargetGroupOps[Self <: ListenerDefaultActionForwardTargetGroup] (val x: Self) extends AnyVal {
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeight(value: Input[Double]): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
  
}

