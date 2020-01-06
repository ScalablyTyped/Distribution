package typings.atPulumiAws.albGetLoadBalancerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLoadBalancerArgs extends js.Object {
  /**
    * The full ARN of the load balancer.
    */
  val arn: js.UndefOr[String] = js.native
  /**
    * The unique name of the load balancer.
    */
  val name: js.UndefOr[String] = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetLoadBalancerArgs {
  @scala.inline
  def apply(arn: String = null, name: String = null, tags: StringDictionary[js.Any] = null): GetLoadBalancerArgs = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoadBalancerArgs]
  }
}

