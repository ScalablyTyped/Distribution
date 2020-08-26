package typings.pulumiAws.elasticloadbalancingv2GetListenerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetListenerArgs extends js.Object {
  /**
    * The arn of the listener. Required if `loadBalancerArn` and `port` is not set.
    */
  val arn: js.UndefOr[String] = js.native
  /**
    * The arn of the load balancer. Required if `arn` is not set.
    */
  val loadBalancerArn: js.UndefOr[String] = js.native
  /**
    * The port of the listener. Required if `arn` is not set.
    */
  val port: js.UndefOr[Double] = js.native
}

object GetListenerArgs {
  @scala.inline
  def apply(): GetListenerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetListenerArgs]
  }
  @scala.inline
  implicit class GetListenerArgsOps[Self <: GetListenerArgs] (val x: Self) extends AnyVal {
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setLoadBalancerArn(value: String): Self = this.set("loadBalancerArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadBalancerArn: Self = this.set("loadBalancerArn", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
  
}

