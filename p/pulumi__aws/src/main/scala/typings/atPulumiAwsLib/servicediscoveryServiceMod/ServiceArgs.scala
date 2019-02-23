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

