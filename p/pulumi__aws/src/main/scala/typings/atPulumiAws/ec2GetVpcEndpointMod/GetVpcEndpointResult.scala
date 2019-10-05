package typings.atPulumiAws.ec2GetVpcEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ec2.GetVpcEndpointDnsEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcEndpointResult extends js.Object {
  /**
    * The list of CIDR blocks for the exposed AWS service. Applicable for endpoints of type `Gateway`.
    */
  val cidrBlocks: js.Array[String]
  /**
    * The DNS entries for the VPC Endpoint. Applicable for endpoints of type `Interface`. DNS blocks are documented below.
    */
  val dnsEntries: js.Array[GetVpcEndpointDnsEntry]
  val id: String
  /**
    * One or more network interfaces for the VPC Endpoint. Applicable for endpoints of type `Interface`.
    */
  val networkInterfaceIds: js.Array[String]
  /**
    * The ID of the AWS account that owns the VPC endpoint.
    */
  val ownerId: String
  /**
    * The policy document associated with the VPC Endpoint. Applicable for endpoints of type `Gateway`.
    */
  val policy: String
  /**
    * The prefix list ID of the exposed AWS service. Applicable for endpoints of type `Gateway`.
    */
  val prefixListId: String
  /**
    * Whether or not the VPC is associated with a private hosted zone - `true` or `false`. Applicable for endpoints of type `Interface`.
    */
  val privateDnsEnabled: Boolean
  /**
    * Whether or not the VPC Endpoint is being managed by its service - `true` or `false`.
    */
  val requesterManaged: Boolean
  /**
    * One or more route tables associated with the VPC Endpoint. Applicable for endpoints of type `Gateway`.
    */
  val routeTableIds: js.Array[String]
  /**
    * One or more security groups associated with the network interfaces. Applicable for endpoints of type `Interface`.
    */
  val securityGroupIds: js.Array[String]
  val serviceName: String
  val state: String
  /**
    * One or more subnets in which the VPC Endpoint is located. Applicable for endpoints of type `Interface`.
    */
  val subnetIds: js.Array[String]
  /**
    * A mapping of tags assigned to the resource.
    */
  val tags: StringDictionary[js.Any]
  /**
    * The VPC Endpoint type, `Gateway` or `Interface`.
    */
  val vpcEndpointType: String
  val vpcId: String
}

object GetVpcEndpointResult {
  @scala.inline
  def apply(
    cidrBlocks: js.Array[String],
    dnsEntries: js.Array[GetVpcEndpointDnsEntry],
    id: String,
    networkInterfaceIds: js.Array[String],
    ownerId: String,
    policy: String,
    prefixListId: String,
    privateDnsEnabled: Boolean,
    requesterManaged: Boolean,
    routeTableIds: js.Array[String],
    securityGroupIds: js.Array[String],
    serviceName: String,
    state: String,
    subnetIds: js.Array[String],
    tags: StringDictionary[js.Any],
    vpcEndpointType: String,
    vpcId: String
  ): GetVpcEndpointResult = {
    val __obj = js.Dynamic.literal(cidrBlocks = cidrBlocks, dnsEntries = dnsEntries, id = id, networkInterfaceIds = networkInterfaceIds, ownerId = ownerId, policy = policy, prefixListId = prefixListId, privateDnsEnabled = privateDnsEnabled, requesterManaged = requesterManaged, routeTableIds = routeTableIds, securityGroupIds = securityGroupIds, serviceName = serviceName, state = state, subnetIds = subnetIds, tags = tags, vpcEndpointType = vpcEndpointType, vpcId = vpcId)
  
    __obj.asInstanceOf[GetVpcEndpointResult]
  }
}

