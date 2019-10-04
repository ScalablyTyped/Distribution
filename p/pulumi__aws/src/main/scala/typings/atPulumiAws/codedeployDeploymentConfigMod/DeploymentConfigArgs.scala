package typings.atPulumiAws.codedeployDeploymentConfigMod

import typings.atPulumiAws.typesInputMod.codedeployNs.DeploymentConfigMinimumHealthyHosts
import typings.atPulumiAws.typesInputMod.codedeployNs.DeploymentConfigTrafficRoutingConfig
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentConfigArgs extends js.Object {
  /**
    * The compute platform can be `Server`, `Lambda`, or `ECS`. Default is `Server`.
    */
  val computePlatform: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the deployment config.
    */
  val deploymentConfigName: Input[String]
  /**
    * A minimumHealthyHosts block. Minimum Healthy Hosts are documented below.
    */
  val minimumHealthyHosts: js.UndefOr[Input[DeploymentConfigMinimumHealthyHosts]] = js.undefined
  /**
    * A trafficRoutingConfig block. Traffic Routing Config is documented below.
    */
  val trafficRoutingConfig: js.UndefOr[Input[DeploymentConfigTrafficRoutingConfig]] = js.undefined
}

object DeploymentConfigArgs {
  @scala.inline
  def apply(
    deploymentConfigName: Input[String],
    computePlatform: Input[String] = null,
    minimumHealthyHosts: Input[DeploymentConfigMinimumHealthyHosts] = null,
    trafficRoutingConfig: Input[DeploymentConfigTrafficRoutingConfig] = null
  ): DeploymentConfigArgs = {
    val __obj = js.Dynamic.literal(deploymentConfigName = deploymentConfigName.asInstanceOf[js.Any])
    if (computePlatform != null) __obj.updateDynamic("computePlatform")(computePlatform.asInstanceOf[js.Any])
    if (minimumHealthyHosts != null) __obj.updateDynamic("minimumHealthyHosts")(minimumHealthyHosts.asInstanceOf[js.Any])
    if (trafficRoutingConfig != null) __obj.updateDynamic("trafficRoutingConfig")(trafficRoutingConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentConfigArgs]
  }
}

