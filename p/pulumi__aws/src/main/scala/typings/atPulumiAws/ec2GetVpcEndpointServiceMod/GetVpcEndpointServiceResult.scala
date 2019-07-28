package typings.atPulumiAws.ec2GetVpcEndpointServiceMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcEndpointServiceResult extends js.Object {
  /**
    * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
    */
  val acceptanceRequired: Boolean
  /**
    * The Availability Zones in which the service is available.
    */
  val availabilityZones: js.Array[String]
  /**
    * The DNS names for the service.
    */
  val baseEndpointDnsNames: js.Array[String]
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * Whether or not the service manages its VPC endpoints - `true` or `false`.
    */
  val managesVpcEndpoints: Boolean
  /**
    * The AWS account ID of the service owner or `amazon`.
    */
  val owner: String
  /**
    * The private DNS name for the service.
    */
  val privateDnsName: String
  val service: js.UndefOr[String] = js.undefined
  /**
    * The ID of the endpoint service.
    */
  val serviceId: String
  val serviceName: String
  /**
    * The service type, `Gateway` or `Interface`.
    */
  val serviceType: String
  /**
    * A mapping of tags assigned to the resource.
    */
  val tags: StringDictionary[js.Any]
  /**
    * Whether or not the service supports endpoint policies - `true` or `false`.
    */
  val vpcEndpointPolicySupported: Boolean
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
    service: String = null
  ): GetVpcEndpointServiceResult = {
    val __obj = js.Dynamic.literal(acceptanceRequired = acceptanceRequired, availabilityZones = availabilityZones, baseEndpointDnsNames = baseEndpointDnsNames, id = id, managesVpcEndpoints = managesVpcEndpoints, owner = owner, privateDnsName = privateDnsName, serviceId = serviceId, serviceName = serviceName, serviceType = serviceType, tags = tags, vpcEndpointPolicySupported = vpcEndpointPolicySupported)
    if (service != null) __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[GetVpcEndpointServiceResult]
  }
}

