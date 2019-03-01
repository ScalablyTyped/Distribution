package typings
package atPulumiAwsLib.servicediscoveryServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceArgs extends js.Object {
  /**
    * The description of the service.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance.
    */
  val dnsConfig: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DnsRecordsNamespaceId]
  /**
    * A complex type that contains settings for an optional health check. Only for Public DNS namespaces.
    */
  val healthCheckConfig: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_FailureThresholdResourcePath]
  ] = js.undefined
  /**
    * A complex type that contains settings for ECS managed health checks.
    */
  val healthCheckCustomConfig: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_FailureThresholdInput]] = js.undefined
  /**
    * The name of the service.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object ServiceArgs {
  @scala.inline
  def apply(
    dnsConfig: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DnsRecordsNamespaceId],
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    healthCheckConfig: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_FailureThresholdResourcePath] = null,
    healthCheckCustomConfig: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_FailureThresholdInput] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): ServiceArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dnsConfig")(dnsConfig.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (healthCheckConfig != null) __obj.updateDynamic("healthCheckConfig")(healthCheckConfig.asInstanceOf[js.Any])
    if (healthCheckCustomConfig != null) __obj.updateDynamic("healthCheckCustomConfig")(healthCheckCustomConfig.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceArgs]
  }
}

