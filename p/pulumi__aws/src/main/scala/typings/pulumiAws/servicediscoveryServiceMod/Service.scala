package typings.pulumiAws.servicediscoveryServiceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.servicediscovery.ServiceDnsConfig
import typings.pulumiAws.outputMod.servicediscovery.ServiceHealthCheckConfig
import typings.pulumiAws.outputMod.servicediscovery.ServiceHealthCheckCustomConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/servicediscovery/service", "Service")
@js.native
class Service protected () extends CustomResource {
  /**
    * Create a Service resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ServiceArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: ServiceArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the service.
    */
  val arn: Output_[String] = js.native
  /**
    * The description of the service.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance.
    */
  val dnsConfig: Output_[js.UndefOr[ServiceDnsConfig]] = js.native
  /**
    * A complex type that contains settings for an optional health check. Only for Public DNS namespaces.
    */
  val healthCheckConfig: Output_[js.UndefOr[ServiceHealthCheckConfig]] = js.native
  /**
    * A complex type that contains settings for ECS managed health checks.
    */
  val healthCheckCustomConfig: Output_[js.UndefOr[ServiceHealthCheckCustomConfig]] = js.native
  /**
    * The name of the service.
    */
  val name: Output_[String] = js.native
  /**
    * The ID of the namespace to use for DNS configuration.
    */
  val namespaceId: Output_[String] = js.native
  /**
    * A map of tags to assign to the service.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Service = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Service = js.native
  def get(name: String, id: Input[ID], state: ServiceState): Service = js.native
  def get(name: String, id: Input[ID], state: ServiceState, opts: CustomResourceOptions): Service = js.native
  /**
    * Returns true if the given object is an instance of Service.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicediscovery/service.Service */ Boolean = js.native
}

