package typings.atPulumiAws.codedeployDeploymentConfigMod

import typings.atPulumiAws.Anon_TimeBasedCanaryTimeBasedLinear
import typings.atPulumiAws.Anon_TypeValueInput
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentConfigState extends js.Object {
  /**
    * The compute platform can be `Server`, `Lambda`, or `ECS`. Default is `Server`.
    */
  val computePlatform: js.UndefOr[Input[String]] = js.undefined
  /**
    * The AWS Assigned deployment config id
    */
  val deploymentConfigId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the deployment config.
    */
  val deploymentConfigName: js.UndefOr[Input[String]] = js.undefined
  /**
    * A minimum_healthy_hosts block. Minimum Healthy Hosts are documented below.
    */
  val minimumHealthyHosts: js.UndefOr[Input[Anon_TypeValueInput]] = js.undefined
  /**
    * A traffic_routing_config block. Traffic Routing Config is documented below.
    */
  val trafficRoutingConfig: js.UndefOr[Input[Anon_TimeBasedCanaryTimeBasedLinear]] = js.undefined
}

object DeploymentConfigState {
  @scala.inline
  def apply(
    computePlatform: Input[String] = null,
    deploymentConfigId: Input[String] = null,
    deploymentConfigName: Input[String] = null,
    minimumHealthyHosts: Input[Anon_TypeValueInput] = null,
    trafficRoutingConfig: Input[Anon_TimeBasedCanaryTimeBasedLinear] = null
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

