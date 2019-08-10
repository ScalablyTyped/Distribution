package typings.atPulumiAws.codedeployDeploymentConfigMod

import typings.atPulumiAws.Anon_TimeBasedCanaryTimeBasedLinear
import typings.atPulumiAws.Anon_TypeValueInput
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
  val minimumHealthyHosts: js.UndefOr[Input[Anon_TypeValueInput]] = js.undefined
  /**
    * A trafficRoutingConfig block. Traffic Routing Config is documented below.
    */
  val trafficRoutingConfig: js.UndefOr[Input[Anon_TimeBasedCanaryTimeBasedLinear]] = js.undefined
}

object DeploymentConfigArgs {
  @scala.inline
  def apply(
    deploymentConfigName: Input[String],
    computePlatform: Input[String] = null,
    minimumHealthyHosts: Input[Anon_TypeValueInput] = null,
    trafficRoutingConfig: Input[Anon_TimeBasedCanaryTimeBasedLinear] = null
  ): DeploymentConfigArgs = {
    val __obj = js.Dynamic.literal(deploymentConfigName = deploymentConfigName.asInstanceOf[js.Any])
    if (computePlatform != null) __obj.updateDynamic("computePlatform")(computePlatform.asInstanceOf[js.Any])
    if (minimumHealthyHosts != null) __obj.updateDynamic("minimumHealthyHosts")(minimumHealthyHosts.asInstanceOf[js.Any])
    if (trafficRoutingConfig != null) __obj.updateDynamic("trafficRoutingConfig")(trafficRoutingConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentConfigArgs]
  }
}

