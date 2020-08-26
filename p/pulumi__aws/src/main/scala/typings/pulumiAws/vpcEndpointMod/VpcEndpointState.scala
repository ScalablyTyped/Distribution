package typings.pulumiAws.vpcEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.VpcEndpointDnsEntry
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcEndpointState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the VPC endpoint.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Accept the VPC endpoint (the VPC endpoint and service need to be in the same AWS account).
    */
  val autoAccept: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The list of CIDR blocks for the exposed AWS service. Applicable for endpoints of type `Gateway`.
    */
  val cidrBlocks: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The DNS entries for the VPC Endpoint. Applicable for endpoints of type `Interface`. DNS blocks are documented below.
    */
  val dnsEntries: js.UndefOr[Input[js.Array[Input[VpcEndpointDnsEntry]]]] = js.native
  /**
    * One or more network interfaces for the VPC Endpoint. Applicable for endpoints of type `Interface`.
    */
  val networkInterfaceIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The ID of the AWS account that owns the VPC endpoint.
    */
  val ownerId: js.UndefOr[Input[String]] = js.native
  /**
    * A policy to attach to the endpoint that controls access to the service. Defaults to full access. All `Gateway` and some `Interface` endpoints support policies - see the [relevant AWS documentation](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints-access.html) for more details.
    */
  val policy: js.UndefOr[Input[String]] = js.native
  /**
    * The prefix list ID of the exposed AWS service. Applicable for endpoints of type `Gateway`.
    */
  val prefixListId: js.UndefOr[Input[String]] = js.native
  /**
    * Whether or not to associate a private hosted zone with the specified VPC. Applicable for endpoints of type `Interface`.
    * Defaults to `false`.
    */
  val privateDnsEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Whether or not the VPC Endpoint is being managed by its service - `true` or `false`.
    */
  val requesterManaged: js.UndefOr[Input[Boolean]] = js.native
  /**
    * One or more route table IDs. Applicable for endpoints of type `Gateway`.
    */
  val routeTableIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The ID of one or more security groups to associate with the network interface. Required for endpoints of type `Interface`.
    */
  val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The service name. For AWS services the service name is usually in the form `com.amazonaws.<region>.<service>` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.<region>.notebook`).
    */
  val serviceName: js.UndefOr[Input[String]] = js.native
  /**
    * The state of the VPC endpoint.
    */
  val state: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of one or more subnets in which to create a network interface for the endpoint. Applicable for endpoints of type `Interface`.
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The VPC endpoint type, `Gateway` or `Interface`. Defaults to `Gateway`.
    */
  val vpcEndpointType: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the VPC in which the endpoint will be used.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}

object VpcEndpointState {
  @scala.inline
  def apply(): VpcEndpointState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcEndpointState]
  }
  @scala.inline
  implicit class VpcEndpointStateOps[Self <: VpcEndpointState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setAutoAccept(value: Input[Boolean]): Self = this.set("autoAccept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoAccept: Self = this.set("autoAccept", js.undefined)
    @scala.inline
    def setCidrBlocksVarargs(value: Input[String]*): Self = this.set("cidrBlocks", js.Array(value :_*))
    @scala.inline
    def setCidrBlocks(value: Input[js.Array[Input[String]]]): Self = this.set("cidrBlocks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCidrBlocks: Self = this.set("cidrBlocks", js.undefined)
    @scala.inline
    def setDnsEntriesVarargs(value: Input[VpcEndpointDnsEntry]*): Self = this.set("dnsEntries", js.Array(value :_*))
    @scala.inline
    def setDnsEntries(value: Input[js.Array[Input[VpcEndpointDnsEntry]]]): Self = this.set("dnsEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnsEntries: Self = this.set("dnsEntries", js.undefined)
    @scala.inline
    def setNetworkInterfaceIdsVarargs(value: Input[String]*): Self = this.set("networkInterfaceIds", js.Array(value :_*))
    @scala.inline
    def setNetworkInterfaceIds(value: Input[js.Array[Input[String]]]): Self = this.set("networkInterfaceIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfaceIds: Self = this.set("networkInterfaceIds", js.undefined)
    @scala.inline
    def setOwnerId(value: Input[String]): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerId: Self = this.set("ownerId", js.undefined)
    @scala.inline
    def setPolicy(value: Input[String]): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
    @scala.inline
    def setPrefixListId(value: Input[String]): Self = this.set("prefixListId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixListId: Self = this.set("prefixListId", js.undefined)
    @scala.inline
    def setPrivateDnsEnabled(value: Input[Boolean]): Self = this.set("privateDnsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateDnsEnabled: Self = this.set("privateDnsEnabled", js.undefined)
    @scala.inline
    def setRequesterManaged(value: Input[Boolean]): Self = this.set("requesterManaged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequesterManaged: Self = this.set("requesterManaged", js.undefined)
    @scala.inline
    def setRouteTableIdsVarargs(value: Input[String]*): Self = this.set("routeTableIds", js.Array(value :_*))
    @scala.inline
    def setRouteTableIds(value: Input[js.Array[Input[String]]]): Self = this.set("routeTableIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouteTableIds: Self = this.set("routeTableIds", js.undefined)
    @scala.inline
    def setSecurityGroupIdsVarargs(value: Input[String]*): Self = this.set("securityGroupIds", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("securityGroupIds", js.undefined)
    @scala.inline
    def setServiceName(value: Input[String]): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
    @scala.inline
    def setState(value: Input[String]): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setSubnetIdsVarargs(value: Input[String]*): Self = this.set("subnetIds", js.Array(value :_*))
    @scala.inline
    def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetIds: Self = this.set("subnetIds", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setVpcEndpointType(value: Input[String]): Self = this.set("vpcEndpointType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcEndpointType: Self = this.set("vpcEndpointType", js.undefined)
    @scala.inline
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
  }
  
}

