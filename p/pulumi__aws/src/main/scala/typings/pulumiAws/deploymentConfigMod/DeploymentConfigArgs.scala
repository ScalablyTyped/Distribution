package typings.pulumiAws.deploymentConfigMod

import typings.pulumiAws.inputMod.codedeploy.DeploymentConfigMinimumHealthyHosts
import typings.pulumiAws.inputMod.codedeploy.DeploymentConfigTrafficRoutingConfig
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentConfigArgs extends js.Object {
  /**
    * The compute platform can be `Server`, `Lambda`, or `ECS`. Default is `Server`.
    */
  val computePlatform: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the deployment config.
    */
  val deploymentConfigName: Input[String] = js.native
  /**
    * A minimumHealthyHosts block. Required for `Server` compute platform. Minimum Healthy Hosts are documented below.
    */
  val minimumHealthyHosts: js.UndefOr[Input[DeploymentConfigMinimumHealthyHosts]] = js.native
  /**
    * A trafficRoutingConfig block. Traffic Routing Config is documented below.
    */
  val trafficRoutingConfig: js.UndefOr[Input[DeploymentConfigTrafficRoutingConfig]] = js.native
}

object DeploymentConfigArgs {
  @scala.inline
  def apply(deploymentConfigName: Input[String]): DeploymentConfigArgs = {
    val __obj = js.Dynamic.literal(deploymentConfigName = deploymentConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentConfigArgs]
  }
  @scala.inline
  implicit class DeploymentConfigArgsOps[Self <: DeploymentConfigArgs] (val x: Self) extends AnyVal {
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
    def setDeploymentConfigName(value: Input[String]): Self = this.set("deploymentConfigName", value.asInstanceOf[js.Any])
    @scala.inline
    def setComputePlatform(value: Input[String]): Self = this.set("computePlatform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputePlatform: Self = this.set("computePlatform", js.undefined)
    @scala.inline
    def setMinimumHealthyHosts(value: Input[DeploymentConfigMinimumHealthyHosts]): Self = this.set("minimumHealthyHosts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumHealthyHosts: Self = this.set("minimumHealthyHosts", js.undefined)
    @scala.inline
    def setTrafficRoutingConfig(value: Input[DeploymentConfigTrafficRoutingConfig]): Self = this.set("trafficRoutingConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrafficRoutingConfig: Self = this.set("trafficRoutingConfig", js.undefined)
  }
  
}

