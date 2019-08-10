package typings.atPulumiAws.applicationloadbalancingGetListenerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetListenerArgs extends js.Object {
  /**
    * The arn of the listener. Required if `loadBalancerArn` and `port` is not set.
    */
  val arn: js.UndefOr[String] = js.undefined
  /**
    * The arn of the load balancer. Required if `arn` is not set.
    */
  val loadBalancerArn: js.UndefOr[String] = js.undefined
  /**
    * The port of the listener. Required if `arn` is not set.
    */
  val port: js.UndefOr[Double] = js.undefined
}

object GetListenerArgs {
  @scala.inline
  def apply(arn: String = null, loadBalancerArn: String = null, port: Int | Double = null): GetListenerArgs = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (loadBalancerArn != null) __obj.updateDynamic("loadBalancerArn")(loadBalancerArn)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetListenerArgs]
  }
}

