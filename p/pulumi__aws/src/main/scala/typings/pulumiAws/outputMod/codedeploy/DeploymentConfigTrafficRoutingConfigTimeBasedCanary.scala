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
  def apply(): DeploymentConfigTrafficRoutingConfigTimeBasedCanary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentConfigTrafficRoutingConfigTimeBasedCanary]
  }
  @scala.inline
  implicit class DeploymentConfigTrafficRoutingConfigTimeBasedCanaryOps[Self <: DeploymentConfigTrafficRoutingConfigTimeBasedCanary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setPercentage(value: Double): Self = this.set("percentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercentage: Self = this.set("percentage", js.undefined)
  }
  
}

