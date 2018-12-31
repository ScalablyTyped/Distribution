package typings
package atPulumiAwsLib.ec2VpcEndpointServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/vpcEndpointService", "VpcEndpointService")
@js.native
class VpcEndpointService protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a VpcEndpointService resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: VpcEndpointServiceArgs) = this()
  def this(name: java.lang.String, args: VpcEndpointServiceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
    */
  val acceptanceRequired: atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
  /**
    * The ARNs of one or more principals allowed to discover the endpoint service.
    */
  val allowedPrincipals: atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * The Availability Zones in which the service is available.
    */
  val availabilityZones: atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * The DNS names for the service.
    */
  val baseEndpointDnsNames: atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * The ARNs of one or more Network Load Balancers for the endpoint service.
    */
  val networkLoadBalancerArns: atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * The private DNS name for the service.
    */
  val privateDnsName: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The service name.
    */
  val serviceName: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The service type, `Gateway` or `Interface`.
    */
  val serviceType: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The state of the VPC endpoint service.
    */
  val state: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
}

@JSImport("@pulumi/aws/ec2/vpcEndpointService", "VpcEndpointService")
@js.native
object VpcEndpointService extends js.Object {
  /**
    * Get an existing VpcEndpointService resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2VpcEndpointServiceMod.VpcEndpointService = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2VpcEndpointServiceMod.VpcEndpointServiceState
  ): atPulumiAwsLib.ec2VpcEndpointServiceMod.VpcEndpointService = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2VpcEndpointServiceMod.VpcEndpointServiceState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2VpcEndpointServiceMod.VpcEndpointService = js.native
}

