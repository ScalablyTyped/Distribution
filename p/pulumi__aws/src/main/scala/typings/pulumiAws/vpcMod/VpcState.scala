package typings.pulumiAws.vpcMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcState extends js.Object {
  
  /**
    * Amazon Resource Name (ARN) of VPC
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Requests an Amazon-provided IPv6 CIDR
    * block with a /56 prefix length for the VPC. You cannot specify the range of IP addresses, or
    * the size of the CIDR block. Default is `false`.
    */
  val assignGeneratedIpv6CidrBlock: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The CIDR block for the VPC.
    */
  val cidrBlock: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the network ACL created by default on VPC creation
    */
  val defaultNetworkAclId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the route table created by default on VPC creation
    */
  val defaultRouteTableId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the security group created by default on VPC creation
    */
  val defaultSecurityGroupId: js.UndefOr[Input[String]] = js.native
  
  val dhcpOptionsId: js.UndefOr[Input[String]] = js.native
  
  /**
    * A boolean flag to enable/disable ClassicLink
    * for the VPC. Only valid in regions and accounts that support EC2 Classic.
    * See the [ClassicLink documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html) for more information. Defaults false.
    */
  val enableClassiclink: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * A boolean flag to enable/disable ClassicLink DNS Support for the VPC.
    * Only valid in regions and accounts that support EC2 Classic.
    */
  val enableClassiclinkDnsSupport: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * A boolean flag to enable/disable DNS hostnames in the VPC. Defaults false.
    */
  val enableDnsHostnames: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * A boolean flag to enable/disable DNS support in the VPC. Defaults true.
    */
  val enableDnsSupport: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * A tenancy option for instances launched into the VPC. Default is `default`, which
    * makes your instances shared on the host. Using either of the other options (`dedicated` or `host`) costs at least $2/hr.
    */
  val instanceTenancy: js.UndefOr[Input[String]] = js.native
  
  /**
    * The association ID for the IPv6 CIDR block.
    */
  val ipv6AssociationId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The IPv6 CIDR block.
    */
  val ipv6CidrBlock: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the main route table associated with
    * this VPC. Note that you can change a VPC's main route table by using an
    * `aws.ec2.MainRouteTableAssociation`.
    */
  val mainRouteTableId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the AWS account that owns the VPC.
    */
  val ownerId: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object VpcState {
  
  @scala.inline
  def apply(): VpcState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcState]
  }
  
  @scala.inline
  implicit class VpcStateOps[Self <: VpcState] (val x: Self) extends AnyVal {
    
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
    def setAssignGeneratedIpv6CidrBlock(value: Input[Boolean]): Self = this.set("assignGeneratedIpv6CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignGeneratedIpv6CidrBlock: Self = this.set("assignGeneratedIpv6CidrBlock", js.undefined)
    
    @scala.inline
    def setCidrBlock(value: Input[String]): Self = this.set("cidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidrBlock: Self = this.set("cidrBlock", js.undefined)
    
    @scala.inline
    def setDefaultNetworkAclId(value: Input[String]): Self = this.set("defaultNetworkAclId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultNetworkAclId: Self = this.set("defaultNetworkAclId", js.undefined)
    
    @scala.inline
    def setDefaultRouteTableId(value: Input[String]): Self = this.set("defaultRouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRouteTableId: Self = this.set("defaultRouteTableId", js.undefined)
    
    @scala.inline
    def setDefaultSecurityGroupId(value: Input[String]): Self = this.set("defaultSecurityGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSecurityGroupId: Self = this.set("defaultSecurityGroupId", js.undefined)
    
    @scala.inline
    def setDhcpOptionsId(value: Input[String]): Self = this.set("dhcpOptionsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDhcpOptionsId: Self = this.set("dhcpOptionsId", js.undefined)
    
    @scala.inline
    def setEnableClassiclink(value: Input[Boolean]): Self = this.set("enableClassiclink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableClassiclink: Self = this.set("enableClassiclink", js.undefined)
    
    @scala.inline
    def setEnableClassiclinkDnsSupport(value: Input[Boolean]): Self = this.set("enableClassiclinkDnsSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableClassiclinkDnsSupport: Self = this.set("enableClassiclinkDnsSupport", js.undefined)
    
    @scala.inline
    def setEnableDnsHostnames(value: Input[Boolean]): Self = this.set("enableDnsHostnames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDnsHostnames: Self = this.set("enableDnsHostnames", js.undefined)
    
    @scala.inline
    def setEnableDnsSupport(value: Input[Boolean]): Self = this.set("enableDnsSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDnsSupport: Self = this.set("enableDnsSupport", js.undefined)
    
    @scala.inline
    def setInstanceTenancy(value: Input[String]): Self = this.set("instanceTenancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceTenancy: Self = this.set("instanceTenancy", js.undefined)
    
    @scala.inline
    def setIpv6AssociationId(value: Input[String]): Self = this.set("ipv6AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv6AssociationId: Self = this.set("ipv6AssociationId", js.undefined)
    
    @scala.inline
    def setIpv6CidrBlock(value: Input[String]): Self = this.set("ipv6CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv6CidrBlock: Self = this.set("ipv6CidrBlock", js.undefined)
    
    @scala.inline
    def setMainRouteTableId(value: Input[String]): Self = this.set("mainRouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainRouteTableId: Self = this.set("mainRouteTableId", js.undefined)
    
    @scala.inline
    def setOwnerId(value: Input[String]): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerId: Self = this.set("ownerId", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
