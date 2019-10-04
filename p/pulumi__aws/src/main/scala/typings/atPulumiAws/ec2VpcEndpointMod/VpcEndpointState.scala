package typings.atPulumiAws.ec2VpcEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.ec2Ns.VpcEndpointDnsEntry
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcEndpointState extends js.Object {
  /**
    * Accept the VPC endpoint (the VPC endpoint and service need to be in the same AWS account).
    */
  val autoAccept: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The list of CIDR blocks for the exposed AWS service. Applicable for endpoints of type `Gateway`.
    */
  val cidrBlocks: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The DNS entries for the VPC Endpoint. Applicable for endpoints of type `Interface`. DNS blocks are documented below.
    */
  val dnsEntries: js.UndefOr[Input[js.Array[Input[VpcEndpointDnsEntry]]]] = js.undefined
  /**
    * One or more network interfaces for the VPC Endpoint. Applicable for endpoints of type `Interface`.
    */
  val networkInterfaceIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The ID of the AWS account that owns the VPC endpoint.
    */
  val ownerId: js.UndefOr[Input[String]] = js.undefined
  /**
    * A policy to attach to the endpoint that controls access to the service. Defaults to full access. All `Gateway` and some `Interface` endpoints support policies - see the [relevant AWS documentation](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints-access.html) for more details.
    */
  val policy: js.UndefOr[Input[String]] = js.undefined
  /**
    * The prefix list ID of the exposed AWS service. Applicable for endpoints of type `Gateway`.
    */
  val prefixListId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Whether or not to associate a private hosted zone with the specified VPC. Applicable for endpoints of type `Interface`.
    * Defaults to `false`.
    */
  val privateDnsEnabled: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Whether or not the VPC Endpoint is being managed by its service - `true` or `false`.
    */
  val requesterManaged: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * One or more route table IDs. Applicable for endpoints of type `Gateway`.
    */
  val routeTableIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The ID of one or more security groups to associate with the network interface. Required for endpoints of type `Interface`.
    */
  val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The service name, in the form `com.amazonaws.region.service` for AWS services.
    */
  val serviceName: js.UndefOr[Input[String]] = js.undefined
  /**
    * The state of the VPC endpoint.
    */
  val state: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ID of one or more subnets in which to create a network interface for the endpoint. Applicable for endpoints of type `Interface`.
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * The VPC endpoint type, `Gateway` or `Interface`. Defaults to `Gateway`.
    */
  val vpcEndpointType: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ID of the VPC in which the endpoint will be used.
    */
  val vpcId: js.UndefOr[Input[String]] = js.undefined
}

object VpcEndpointState {
  @scala.inline
  def apply(
    autoAccept: Input[Boolean] = null,
    cidrBlocks: Input[js.Array[Input[String]]] = null,
    dnsEntries: Input[js.Array[Input[VpcEndpointDnsEntry]]] = null,
    networkInterfaceIds: Input[js.Array[Input[String]]] = null,
    ownerId: Input[String] = null,
    policy: Input[String] = null,
    prefixListId: Input[String] = null,
    privateDnsEnabled: Input[Boolean] = null,
    requesterManaged: Input[Boolean] = null,
    routeTableIds: Input[js.Array[Input[String]]] = null,
    securityGroupIds: Input[js.Array[Input[String]]] = null,
    serviceName: Input[String] = null,
    state: Input[String] = null,
    subnetIds: Input[js.Array[Input[String]]] = null,
    tags: Input[StringDictionary[_]] = null,
    vpcEndpointType: Input[String] = null,
    vpcId: Input[String] = null
  ): VpcEndpointState = {
    val __obj = js.Dynamic.literal()
    if (autoAccept != null) __obj.updateDynamic("autoAccept")(autoAccept.asInstanceOf[js.Any])
    if (cidrBlocks != null) __obj.updateDynamic("cidrBlocks")(cidrBlocks.asInstanceOf[js.Any])
    if (dnsEntries != null) __obj.updateDynamic("dnsEntries")(dnsEntries.asInstanceOf[js.Any])
    if (networkInterfaceIds != null) __obj.updateDynamic("networkInterfaceIds")(networkInterfaceIds.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (prefixListId != null) __obj.updateDynamic("prefixListId")(prefixListId.asInstanceOf[js.Any])
    if (privateDnsEnabled != null) __obj.updateDynamic("privateDnsEnabled")(privateDnsEnabled.asInstanceOf[js.Any])
    if (requesterManaged != null) __obj.updateDynamic("requesterManaged")(requesterManaged.asInstanceOf[js.Any])
    if (routeTableIds != null) __obj.updateDynamic("routeTableIds")(routeTableIds.asInstanceOf[js.Any])
    if (securityGroupIds != null) __obj.updateDynamic("securityGroupIds")(securityGroupIds.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (subnetIds != null) __obj.updateDynamic("subnetIds")(subnetIds.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcEndpointType != null) __obj.updateDynamic("vpcEndpointType")(vpcEndpointType.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcEndpointState]
  }
}

