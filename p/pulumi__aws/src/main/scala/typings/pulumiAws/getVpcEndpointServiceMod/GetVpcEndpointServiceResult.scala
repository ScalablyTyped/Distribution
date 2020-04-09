package typings.pulumiAws.getVpcEndpointServiceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.GetVpcEndpointServiceFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcEndpointServiceResult extends js.Object {
  /**
    * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
    */
  val acceptanceRequired: Boolean = js.native
  /**
    * The Availability Zones in which the service is available.
    */
  val availabilityZones: js.Array[String] = js.native
  /**
    * The DNS names for the service.
    */
  val baseEndpointDnsNames: js.Array[String] = js.native
  val filters: js.UndefOr[js.Array[GetVpcEndpointServiceFilter]] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Whether or not the service manages its VPC endpoints - `true` or `false`.
    */
  val managesVpcEndpoints: Boolean = js.native
  /**
    * The AWS account ID of the service owner or `amazon`.
    */
  val owner: String = js.native
  /**
    * The private DNS name for the service.
    */
  val privateDnsName: String = js.native
  val service: js.UndefOr[String] = js.native
  /**
    * The ID of the endpoint service.
    */
  val serviceId: String = js.native
  val serviceName: String = js.native
  /**
    * The service type, `Gateway` or `Interface`.
    */
  val serviceType: String = js.native
  /**
    * A mapping of tags assigned to the resource.
    */
  val tags: StringDictionary[js.Any] = js.native
  /**
    * Whether or not the service supports endpoint policies - `true` or `false`.
    */
  val vpcEndpointPolicySupported: Boolean = js.native
}

object GetVpcEndpointServiceResult {
  @scala.inline
  def apply(
    acceptanceRequired: Boolean,
    availabilityZones: js.Array[String],
    baseEndpointDnsNames: js.Array[String],
    id: String,
    managesVpcEndpoints: Boolean,
    owner: String,
    privateDnsName: String,
    serviceId: String,
    serviceName: String,
    serviceType: String,
    tags: StringDictionary[js.Any],
    vpcEndpointPolicySupported: Boolean,
    filters: js.Array[GetVpcEndpointServiceFilter] = null,
    service: String = null
  ): GetVpcEndpointServiceResult = {
    val __obj = js.Dynamic.literal(acceptanceRequired = acceptanceRequired.asInstanceOf[js.Any], availabilityZones = availabilityZones.asInstanceOf[js.Any], baseEndpointDnsNames = baseEndpointDnsNames.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], managesVpcEndpoints = managesVpcEndpoints.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], privateDnsName = privateDnsName.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcEndpointPolicySupported = vpcEndpointPolicySupported.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcEndpointServiceResult]
  }
}

