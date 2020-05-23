package typings.pulumiAws.outputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentConfigTrafficRoutingConfigTimeBasedLinear extends js.Object {
  /**
    * The number of minutes between each incremental traffic shift of a `TimeBasedLinear` deployment.
    */
  var interval: js.UndefOr[Double] = js.native
  /**
    * The percentage of traffic that is shifted at the start of each increment of a `TimeBasedLinear` deployment.
    */
  var percentage: js.UndefOr[Double] = js.native
}

object DeploymentConfigTrafficRoutingConfigTimeBasedLinear {
  @scala.inline
  def apply(interval: js.UndefOr[Double] = js.undefined, percentage: js.UndefOr[Double] = js.undefined): DeploymentConfigTrafficRoutingConfigTimeBasedLinear = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(percentage)) __obj.updateDynamic("percentage")(percentage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentConfigTrafficRoutingConfigTimeBasedLinear]
  }
}

