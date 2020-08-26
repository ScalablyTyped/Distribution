package typings.pulumiAws.outputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup extends js.Object {
  /**
    * Name of the target group.
    */
  var name: String = js.native
}

object DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup {
  @scala.inline
  def apply(name: String): DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup]
  }
  @scala.inline
  implicit class DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupOps[Self <: DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

