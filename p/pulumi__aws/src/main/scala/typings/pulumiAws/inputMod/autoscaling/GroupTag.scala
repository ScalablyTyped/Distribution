package typings.pulumiAws.inputMod.autoscaling

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupTag extends js.Object {
  /**
    * Key
    */
  var key: Input[String] = js.native
  /**
    * Enables propagation of the tag to
    * Amazon EC2 instances launched via this ASG
    */
  var propagateAtLaunch: Input[Boolean] = js.native
  /**
    * Value
    */
  var value: Input[String] = js.native
}

object GroupTag {
  @scala.inline
  def apply(key: Input[String], propagateAtLaunch: Input[Boolean], value: Input[String]): GroupTag = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], propagateAtLaunch = propagateAtLaunch.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupTag]
  }
  @scala.inline
  implicit class GroupTagOps[Self <: GroupTag] (val x: Self) extends AnyVal {
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
    def setKey(value: Input[String]): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropagateAtLaunch(value: Input[Boolean]): Self = this.set("propagateAtLaunch", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Input[String]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

