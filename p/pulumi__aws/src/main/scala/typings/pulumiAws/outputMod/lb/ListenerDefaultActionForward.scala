package typings.pulumiAws.outputMod.lb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerDefaultActionForward extends js.Object {
  /**
    * The target group stickiness for the rule.
    */
  var stickiness: js.UndefOr[ListenerDefaultActionForwardStickiness] = js.native
  /**
    * One or more target groups block.
    */
  var targetGroups: js.Array[ListenerDefaultActionForwardTargetGroup] = js.native
}

object ListenerDefaultActionForward {
  @scala.inline
  def apply(targetGroups: js.Array[ListenerDefaultActionForwardTargetGroup]): ListenerDefaultActionForward = {
    val __obj = js.Dynamic.literal(targetGroups = targetGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerDefaultActionForward]
  }
  @scala.inline
  implicit class ListenerDefaultActionForwardOps[Self <: ListenerDefaultActionForward] (val x: Self) extends AnyVal {
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
    def setTargetGroupsVarargs(value: ListenerDefaultActionForwardTargetGroup*): Self = this.set("targetGroups", js.Array(value :_*))
    @scala.inline
    def setTargetGroups(value: js.Array[ListenerDefaultActionForwardTargetGroup]): Self = this.set("targetGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def setStickiness(value: ListenerDefaultActionForwardStickiness): Self = this.set("stickiness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStickiness: Self = this.set("stickiness", js.undefined)
  }
  
}

