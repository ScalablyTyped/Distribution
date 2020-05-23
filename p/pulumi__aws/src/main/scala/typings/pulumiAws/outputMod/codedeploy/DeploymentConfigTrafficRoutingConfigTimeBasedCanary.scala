package typings.pulumiAws.outputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentConfigTrafficRoutingConfigTimeBasedCanary extends js.Object {
  /**
    * The number of minutes between the first and second traffic shifts of a `TimeBasedCanary` deployment.
    */
  var interval: js.UndefOr[Double] = js.native
  /**
    * The percentage of traffic to shift in the first increment of a `TimeBasedCanary` deployment.
    */
  var percentage: js.UndefOr[Double] = js.native
}

object DeploymentConfigTrafficRoutingConfigTimeBasedCanary {
  @scala.inline
  def apply(interval: js.UndefOr[Double] = js.undefined, percentage: js.UndefOr[Double] = js.undefined): DeploymentConfigTrafficRoutingConfigTimeBasedCanary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(percentage)) __obj.updateDynamic("percentage")(percentage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentConfigTrafficRoutingConfigTimeBasedCanary]
  }
}

