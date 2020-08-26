package typings.pulumiAws.inputMod.ecs

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceLoadBalancer extends js.Object {
  /**
    * The name of the container to associate with the load balancer (as it appears in a container definition).
    */
  var containerName: Input[String] = js.native
  /**
    * The port on the container to associate with the load balancer.
    */
  var containerPort: Input[Double] = js.native
  /**
    * The name of the ELB (Classic) to associate with the service.
    */
  var elbName: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the Load Balancer target group to associate with the service.
    */
  var targetGroupArn: js.UndefOr[Input[String]] = js.native
}

object ServiceLoadBalancer {
  @scala.inline
  def apply(containerName: Input[String], containerPort: Input[Double]): ServiceLoadBalancer = {
    val __obj = js.Dynamic.literal(containerName = containerName.asInstanceOf[js.Any], containerPort = containerPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceLoadBalancer]
  }
  @scala.inline
  implicit class ServiceLoadBalancerOps[Self <: ServiceLoadBalancer] (val x: Self) extends AnyVal {
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
    def setContainerName(value: Input[String]): Self = this.set("containerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerPort(value: Input[Double]): Self = this.set("containerPort", value.asInstanceOf[js.Any])
    @scala.inline
    def setElbName(value: Input[String]): Self = this.set("elbName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElbName: Self = this.set("elbName", js.undefined)
    @scala.inline
    def setTargetGroupArn(value: Input[String]): Self = this.set("targetGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetGroupArn: Self = this.set("targetGroupArn", js.undefined)
  }
  
}

