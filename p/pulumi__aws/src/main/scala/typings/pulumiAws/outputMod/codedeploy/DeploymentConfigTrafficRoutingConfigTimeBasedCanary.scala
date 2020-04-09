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
  def apply(interval: Int | Double = null, percentage: Int | Double = null): DeploymentConfigTrafficRoutingConfigTimeBasedCanary = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentConfigTrafficRoutingConfigTimeBasedCanary]
  }
}

