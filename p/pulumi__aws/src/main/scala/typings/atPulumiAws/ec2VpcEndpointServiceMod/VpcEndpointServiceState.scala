package typings.atPulumiAws.ec2VpcEndpointServiceMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcEndpointServiceState extends js.Object {
  /**
    * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
    */
  val acceptanceRequired: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The ARNs of one or more principals allowed to discover the endpoint service.
    */
  val allowedPrincipals: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The Availability Zones in which the service is available.
    */
  val availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The DNS names for the service.
    */
  val baseEndpointDnsNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Whether or not the service manages its VPC endpoints - `true` or `false`.
    */
  val managesVpcEndpoints: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The ARNs of one or more Network Load Balancers for the endpoint service.
    */
  val networkLoadBalancerArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The private DNS name for the service.
    */
  val privateDnsName: js.UndefOr[Input[String]] = js.native
  /**
    * The service name.
    */
  val serviceName: js.UndefOr[Input[String]] = js.native
  /**
    * The service type, `Gateway` or `Interface`.
    */
  val serviceType: js.UndefOr[Input[String]] = js.native
  /**
    * The state of the VPC endpoint service.
    */
  val state: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object VpcEndpointServiceState {
  @scala.inline
  def apply(
    acceptanceRequired: Input[Boolean] = null,
    allowedPrincipals: Input[js.Array[Input[String]]] = null,
    availabilityZones: Input[js.Array[Input[String]]] = null,
    baseEndpointDnsNames: Input[js.Array[Input[String]]] = null,
    managesVpcEndpoints: Input[Boolean] = null,
    networkLoadBalancerArns: Input[js.Array[Input[String]]] = null,
    privateDnsName: Input[String] = null,
    serviceName: Input[String] = null,
    serviceType: Input[String] = null,
    state: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): VpcEndpointServiceState = {
    val __obj = js.Dynamic.literal()
    if (acceptanceRequired != null) __obj.updateDynamic("acceptanceRequired")(acceptanceRequired.asInstanceOf[js.Any])
    if (allowedPrincipals != null) __obj.updateDynamic("allowedPrincipals")(allowedPrincipals.asInstanceOf[js.Any])
    if (availabilityZones != null) __obj.updateDynamic("availabilityZones")(availabilityZones.asInstanceOf[js.Any])
    if (baseEndpointDnsNames != null) __obj.updateDynamic("baseEndpointDnsNames")(baseEndpointDnsNames.asInstanceOf[js.Any])
    if (managesVpcEndpoints != null) __obj.updateDynamic("managesVpcEndpoints")(managesVpcEndpoints.asInstanceOf[js.Any])
    if (networkLoadBalancerArns != null) __obj.updateDynamic("networkLoadBalancerArns")(networkLoadBalancerArns.asInstanceOf[js.Any])
    if (privateDnsName != null) __obj.updateDynamic("privateDnsName")(privateDnsName.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    if (serviceType != null) __obj.updateDynamic("serviceType")(serviceType.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcEndpointServiceState]
  }
}

