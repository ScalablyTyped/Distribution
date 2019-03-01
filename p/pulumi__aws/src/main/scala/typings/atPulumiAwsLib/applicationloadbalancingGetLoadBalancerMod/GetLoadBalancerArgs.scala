package typings
package atPulumiAwsLib.applicationloadbalancingGetLoadBalancerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLoadBalancerArgs extends js.Object {
  /**
    * The full ARN of the load balancer.
    */
  val arn: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The unique name of the load balancer.
    */
  val name: js.UndefOr[java.lang.String] = js.undefined
  val tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object GetLoadBalancerArgs {
  @scala.inline
  def apply(
    arn: java.lang.String = null,
    name: java.lang.String = null,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): GetLoadBalancerArgs = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (name != null) __obj.updateDynamic("name")(name)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetLoadBalancerArgs]
  }
}

