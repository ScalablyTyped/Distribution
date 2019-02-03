package typings
package atPulumiAwsLib.servicediscoveryServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/servicediscovery/service", "Service")
@js.native
class Service protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Service resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ServiceArgs) = this()
  def this(name: java.lang.String, args: ServiceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN of the service.
    */
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The description of the service.
    */
  val description: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance.
    */
  val dnsConfig: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiAwsLib.Anon_DnsRecords] = js.native
  /**
    * A complex type that contains settings for an optional health check. Only for Public DNS namespaces.
    */
  val healthCheckConfig: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_FailureThreshold]] = js.native
  /**
    * A complex type that contains settings for ECS managed health checks.
    */
  val healthCheckCustomConfig: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_FailureThresholdNumber]] = js.native
  /**
    * The name of the service.
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/servicediscovery/service", "Service")
@js.native
object Service extends js.Object {
  /**
    * Get an existing Service resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.servicediscoveryServiceMod.Service = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.servicediscoveryServiceMod.ServiceState
  ): atPulumiAwsLib.servicediscoveryServiceMod.Service = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.servicediscoveryServiceMod.ServiceState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.servicediscoveryServiceMod.Service = js.native
}

