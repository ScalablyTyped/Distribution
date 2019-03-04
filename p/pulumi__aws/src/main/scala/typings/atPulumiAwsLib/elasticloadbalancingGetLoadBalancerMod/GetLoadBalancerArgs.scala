package typings
package atPulumiAwsLib.elasticloadbalancingGetLoadBalancerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLoadBalancerArgs extends js.Object {
  /**
    * The unique name of the load balancer.
    */
  val name: java.lang.String
  val tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object GetLoadBalancerArgs {
  @scala.inline
  def apply(name: java.lang.String, tags: org.scalablytyped.runtime.StringDictionary[js.Any] = null): GetLoadBalancerArgs = {
    val __obj = js.Dynamic.literal(name = name)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetLoadBalancerArgs]
  }
}

