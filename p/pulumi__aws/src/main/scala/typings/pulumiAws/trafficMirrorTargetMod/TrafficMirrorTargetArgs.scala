package typings.pulumiAws.trafficMirrorTargetMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficMirrorTargetArgs extends js.Object {
  /**
    * A description of the traffic mirror session.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The network interface ID that is associated with the target.
    */
  val networkInterfaceId: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
    */
  val networkLoadBalancerArn: js.UndefOr[Input[String]] = js.native
}

object TrafficMirrorTargetArgs {
  @scala.inline
  def apply(
    description: Input[String] = null,
    networkInterfaceId: Input[String] = null,
    networkLoadBalancerArn: Input[String] = null
  ): TrafficMirrorTargetArgs = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (networkInterfaceId != null) __obj.updateDynamic("networkInterfaceId")(networkInterfaceId.asInstanceOf[js.Any])
    if (networkLoadBalancerArn != null) __obj.updateDynamic("networkLoadBalancerArn")(networkLoadBalancerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficMirrorTargetArgs]
  }
}

