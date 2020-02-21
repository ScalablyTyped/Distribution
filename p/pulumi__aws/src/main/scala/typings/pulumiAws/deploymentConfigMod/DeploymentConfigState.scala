package typings.pulumiAws.deploymentConfigMod

import typings.pulumiAws.inputMod.codedeploy.DeploymentConfigMinimumHealthyHosts
import typings.pulumiAws.inputMod.codedeploy.DeploymentConfigTrafficRoutingConfig
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentConfigState extends js.Object {
  /**
    * The compute platform can be `Server`, `Lambda`, or `ECS`. Default is `Server`.
    */
  val computePlatform: js.UndefOr[Input[String]] = js.native
  /**
    * The AWS Assigned deployment config id
    */
  val deploymentConfigId: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the deployment config.
    */
  val deploymentConfigName: js.UndefOr[Input[String]] = js.native
  /**
    * A minimumHealthyHosts block. Required for `Server` compute platform. Minimum Healthy Hosts are documented below.
    */
  val minimumHealthyHosts: js.UndefOr[Input[DeploymentConfigMinimumHealthyHosts]] = js.native
  /**
    * A trafficRoutingConfig block. Traffic Routing Config is documented below.
    */
  val trafficRoutingConfig: js.UndefOr[Input[DeploymentConfigTrafficRoutingConfig]] = js.native
}

object DeploymentConfigState {
  @scala.inline
  def apply(
    computePlatform: Input[String] = null,
    deploymentConfigId: Input[String] = null,
    deploymentConfigName: Input[String] = null,
    minimumHealthyHosts: Input[DeploymentConfigMinimumHealthyHosts] = null,
    trafficRoutingConfig: Input[DeploymentConfigTrafficRoutingConfig] = null
  ): DeploymentConfigState = {
    val __obj = js.Dynamic.literal()
    if (computePlatform != null) __obj.updateDynamic("computePlatform")(computePlatform.asInstanceOf[js.Any])
    if (deploymentConfigId != null) __obj.updateDynamic("deploymentConfigId")(deploymentConfigId.asInstanceOf[js.Any])
    if (deploymentConfigName != null) __obj.updateDynamic("deploymentConfigName")(deploymentConfigName.asInstanceOf[js.Any])
    if (minimumHealthyHosts != null) __obj.updateDynamic("minimumHealthyHosts")(minimumHealthyHosts.asInstanceOf[js.Any])
    if (trafficRoutingConfig != null) __obj.updateDynamic("trafficRoutingConfig")(trafficRoutingConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentConfigState]
  }
}

