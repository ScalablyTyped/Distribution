package typings.atPulumiAws.elbGetLoadBalancerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLoadBalancerArgs extends js.Object {
  /**
    * The unique name of the load balancer.
    */
  val name: String
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object GetLoadBalancerArgs {
  @scala.inline
  def apply(name: String, tags: StringDictionary[js.Any] = null): GetLoadBalancerArgs = {
    val __obj = js.Dynamic.literal(name = name)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetLoadBalancerArgs]
  }
}

