package typings
package atPulumiAwsLib.applicationloadbalancingGetListenerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetListenerArgs extends js.Object {
  /**
    * The arn of the listener. Required if `load_balancer_arn` and `port` is not set.
    */
  val arn: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The arn of the load balancer. Required if `arn` is not set.
    */
  val loadBalancerArn: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The port of the listener. Required if `arn` is not set.
    */
  val port: js.UndefOr[scala.Double] = js.undefined
}

object GetListenerArgs {
  @scala.inline
  def apply(
    arn: java.lang.String = null,
    loadBalancerArn: java.lang.String = null,
    port: scala.Int | scala.Double = null
  ): GetListenerArgs = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (loadBalancerArn != null) __obj.updateDynamic("loadBalancerArn")(loadBalancerArn)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetListenerArgs]
  }
}

