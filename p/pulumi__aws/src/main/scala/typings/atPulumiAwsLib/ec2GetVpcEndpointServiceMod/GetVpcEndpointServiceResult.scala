package typings
package atPulumiAwsLib.ec2GetVpcEndpointServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcEndpointServiceResult extends js.Object {
  /**
    * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
    */
  val acceptanceRequired: scala.Boolean
  /**
    * The Availability Zones in which the service is available.
    */
  val availabilityZones: js.Array[java.lang.String]
  /**
    * The DNS names for the service.
    */
  val baseEndpointDnsNames: js.Array[java.lang.String]
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The AWS account ID of the service owner or `amazon`.
    */
  val owner: java.lang.String
  /**
    * The private DNS name for the service.
    */
  val privateDnsName: java.lang.String
  val service: js.UndefOr[java.lang.String] = js.undefined
  val serviceName: java.lang.String
  /**
    * The service type, `Gateway` or `Interface`.
    */
  val serviceType: java.lang.String
  /**
    * Whether or not the service supports endpoint policies - `true` or `false`.
    */
  val vpcEndpointPolicySupported: scala.Boolean
}

object GetVpcEndpointServiceResult {
  @scala.inline
  def apply(
    acceptanceRequired: scala.Boolean,
    availabilityZones: js.Array[java.lang.String],
    baseEndpointDnsNames: js.Array[java.lang.String],
    id: java.lang.String,
    owner: java.lang.String,
    privateDnsName: java.lang.String,
    serviceName: java.lang.String,
    serviceType: java.lang.String,
    vpcEndpointPolicySupported: scala.Boolean,
    service: java.lang.String = null
  ): GetVpcEndpointServiceResult = {
    val __obj = js.Dynamic.literal(acceptanceRequired = acceptanceRequired, availabilityZones = availabilityZones, baseEndpointDnsNames = baseEndpointDnsNames, id = id, owner = owner, privateDnsName = privateDnsName, serviceName = serviceName, serviceType = serviceType, vpcEndpointPolicySupported = vpcEndpointPolicySupported)
    if (service != null) __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[GetVpcEndpointServiceResult]
  }
}

