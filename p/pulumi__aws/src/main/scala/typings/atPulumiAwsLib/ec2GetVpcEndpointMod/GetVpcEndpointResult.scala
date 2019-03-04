package typings
package atPulumiAwsLib.ec2GetVpcEndpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcEndpointResult extends js.Object {
  /**
    * The list of CIDR blocks for the exposed AWS service. Applicable for endpoints of type `Gateway`.
    */
  val cidrBlocks: js.Array[java.lang.String]
  /**
    * The DNS entries for the VPC Endpoint. Applicable for endpoints of type `Interface`. DNS blocks are documented below.
    */
  val dnsEntries: js.Array[atPulumiAwsLib.Anon_DnsName]
  val id: java.lang.String
  /**
    * One or more network interfaces for the VPC Endpoint. Applicable for endpoints of type `Interface`.
    */
  val networkInterfaceIds: js.Array[java.lang.String]
  /**
    * The policy document associated with the VPC Endpoint. Applicable for endpoints of type `Gateway`.
    */
  val policy: java.lang.String
  /**
    * The prefix list ID of the exposed AWS service. Applicable for endpoints of type `Gateway`.
    */
  val prefixListId: java.lang.String
  /**
    * Whether or not the VPC is associated with a private hosted zone - `true` or `false`. Applicable for endpoints of type `Interface`.
    */
  val privateDnsEnabled: scala.Boolean
  /**
    * One or more route tables associated with the VPC Endpoint. Applicable for endpoints of type `Gateway`.
    */
  val routeTableIds: js.Array[java.lang.String]
  /**
    * One or more security groups associated with the network interfaces. Applicable for endpoints of type `Interface`.
    */
  val securityGroupIds: js.Array[java.lang.String]
  val serviceName: java.lang.String
  val state: java.lang.String
  /**
    * One or more subnets in which the VPC Endpoint is located. Applicable for endpoints of type `Interface`.
    */
  val subnetIds: js.Array[java.lang.String]
  /**
    * The VPC Endpoint type, `Gateway` or `Interface`.
    */
  val vpcEndpointType: java.lang.String
  val vpcId: java.lang.String
}

object GetVpcEndpointResult {
  @scala.inline
  def apply(
    cidrBlocks: js.Array[java.lang.String],
    dnsEntries: js.Array[atPulumiAwsLib.Anon_DnsName],
    id: java.lang.String,
    networkInterfaceIds: js.Array[java.lang.String],
    policy: java.lang.String,
    prefixListId: java.lang.String,
    privateDnsEnabled: scala.Boolean,
    routeTableIds: js.Array[java.lang.String],
    securityGroupIds: js.Array[java.lang.String],
    serviceName: java.lang.String,
    state: java.lang.String,
    subnetIds: js.Array[java.lang.String],
    vpcEndpointType: java.lang.String,
    vpcId: java.lang.String
  ): GetVpcEndpointResult = {
    val __obj = js.Dynamic.literal(cidrBlocks = cidrBlocks, dnsEntries = dnsEntries, id = id, networkInterfaceIds = networkInterfaceIds, policy = policy, prefixListId = prefixListId, privateDnsEnabled = privateDnsEnabled, routeTableIds = routeTableIds, securityGroupIds = securityGroupIds, serviceName = serviceName, state = state, subnetIds = subnetIds, vpcEndpointType = vpcEndpointType, vpcId = vpcId)
  
    __obj.asInstanceOf[GetVpcEndpointResult]
  }
}

