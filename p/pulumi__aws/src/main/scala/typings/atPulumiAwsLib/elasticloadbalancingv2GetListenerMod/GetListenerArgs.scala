package typings
package atPulumiAwsLib.elasticloadbalancingv2GetListenerMod

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

