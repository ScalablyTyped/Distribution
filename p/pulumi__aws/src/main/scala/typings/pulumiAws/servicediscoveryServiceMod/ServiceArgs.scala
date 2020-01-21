package typings.pulumiAws.servicediscoveryServiceMod

import typings.pulumiAws.inputMod.servicediscovery.ServiceDnsConfig
import typings.pulumiAws.inputMod.servicediscovery.ServiceHealthCheckConfig
import typings.pulumiAws.inputMod.servicediscovery.ServiceHealthCheckCustomConfig
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceArgs extends js.Object {
  /**
    * The description of the service.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance.
    */
  val dnsConfig: js.UndefOr[Input[ServiceDnsConfig]] = js.native
  /**
    * A complex type that contains settings for an optional health check. Only for Public DNS namespaces.
    */
  val healthCheckConfig: js.UndefOr[Input[ServiceHealthCheckConfig]] = js.native
  /**
    * A complex type that contains settings for ECS managed health checks.
    */
  val healthCheckCustomConfig: js.UndefOr[Input[ServiceHealthCheckCustomConfig]] = js.native
  /**
    * The name of the service.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the namespace to use for DNS configuration.
    */
  val namespaceId: js.UndefOr[Input[String]] = js.native
}

object ServiceArgs {
  @scala.inline
  def apply(
    description: Input[String] = null,
    dnsConfig: Input[ServiceDnsConfig] = null,
    healthCheckConfig: Input[ServiceHealthCheckConfig] = null,
    healthCheckCustomConfig: Input[ServiceHealthCheckCustomConfig] = null,
    name: Input[String] = null,
    namespaceId: Input[String] = null
  ): ServiceArgs = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dnsConfig != null) __obj.updateDynamic("dnsConfig")(dnsConfig.asInstanceOf[js.Any])
    if (healthCheckConfig != null) __obj.updateDynamic("healthCheckConfig")(healthCheckConfig.asInstanceOf[js.Any])
    if (healthCheckCustomConfig != null) __obj.updateDynamic("healthCheckCustomConfig")(healthCheckCustomConfig.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespaceId != null) __obj.updateDynamic("namespaceId")(namespaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceArgs]
  }
}

