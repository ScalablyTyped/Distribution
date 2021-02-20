package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetVpcFilter
import typings.pulumiAws.outputMod.ec2.GetVpcCidrBlockAssociation
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getVpcMod {
  
  @JSImport("@pulumi/aws/ec2/getVpc", "getVpc")
  @js.native
  def getVpc(): js.Promise[GetVpcResult] = js.native
  @JSImport("@pulumi/aws/ec2/getVpc", "getVpc")
  @js.native
  def getVpc(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetVpcResult] = js.native
  @JSImport("@pulumi/aws/ec2/getVpc", "getVpc")
  @js.native
  def getVpc(args: GetVpcArgs): js.Promise[GetVpcResult] = js.native
  @JSImport("@pulumi/aws/ec2/getVpc", "getVpc")
  @js.native
  def getVpc(args: GetVpcArgs, opts: InvokeOptions): js.Promise[GetVpcResult] = js.native
  
  @js.native
  trait GetVpcArgs extends StObject {
    
    /**
      * Boolean constraint on whether the desired VPC is
      * the default VPC for the region.
      */
    val default: js.UndefOr[Boolean] = js.native
    
    /**
      * The cidr block of the desired VPC.
      */
    val cidrBlock: js.UndefOr[String] = js.native
    
    /**
      * The DHCP options id of the desired VPC.
      */
    val dhcpOptionsId: js.UndefOr[String] = js.native
    
    /**
      * Custom filter block as described below.
      */
    val filters: js.UndefOr[js.Array[GetVpcFilter]] = js.native
    
    /**
      * The id of the specific VPC to retrieve.
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * The current state of the desired VPC.
      * Can be either `"pending"` or `"available"`.
      */
    val state: js.UndefOr[String] = js.native
    
    /**
      * A map of tags, each pair of which must exactly match
      * a pair on the desired VPC.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetVpcArgs {
    
    @scala.inline
    def apply(): GetVpcArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetVpcArgs]
    }
    
    @scala.inline
    implicit class GetVpcArgsMutableBuilder[Self <: GetVpcArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCidrBlock(value: String): Self = StObject.set(x, "cidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidrBlockUndefined: Self = StObject.set(x, "cidrBlock", js.undefined)
      
      @scala.inline
      def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDhcpOptionsId(value: String): Self = StObject.set(x, "dhcpOptionsId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDhcpOptionsIdUndefined: Self = StObject.set(x, "dhcpOptionsId", js.undefined)
      
      @scala.inline
      def setFilters(value: js.Array[GetVpcFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetVpcFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetVpcResult extends StObject {
    
    val default: Boolean = js.native
    
    /**
      * Amazon Resource Name (ARN) of VPC
      */
    val arn: String = js.native
    
    /**
      * The CIDR block for the association.
      */
    val cidrBlock: String = js.native
    
    val cidrBlockAssociations: js.Array[GetVpcCidrBlockAssociation] = js.native
    
    val dhcpOptionsId: String = js.native
    
    /**
      * Whether or not the VPC has DNS hostname support
      */
    val enableDnsHostnames: Boolean = js.native
    
    /**
      * Whether or not the VPC has DNS support
      */
    val enableDnsSupport: Boolean = js.native
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetVpcFilter]] = js.native
    
    val id: String = js.native
    
    /**
      * The allowed tenancy of instances launched into the
      * selected VPC. May be any of `"default"`, `"dedicated"`, or `"host"`.
      */
    val instanceTenancy: String = js.native
    
    /**
      * The association ID for the IPv6 CIDR block.
      */
    val ipv6AssociationId: String = js.native
    
    /**
      * The IPv6 CIDR block.
      */
    val ipv6CidrBlock: String = js.native
    
    /**
      * The ID of the main route table associated with this VPC.
      */
    val mainRouteTableId: String = js.native
    
    /**
      * The ID of the AWS account that owns the VPC.
      */
    val ownerId: String = js.native
    
    /**
      * The State of the association.
      */
    val state: String = js.native
    
    val tags: StringDictionary[String] = js.native
  }
  object GetVpcResult {
    
    @scala.inline
    def apply(
      arn: String,
      cidrBlock: String,
      cidrBlockAssociations: js.Array[GetVpcCidrBlockAssociation],
      default: Boolean,
      dhcpOptionsId: String,
      enableDnsHostnames: Boolean,
      enableDnsSupport: Boolean,
      id: String,
      instanceTenancy: String,
      ipv6AssociationId: String,
      ipv6CidrBlock: String,
      mainRouteTableId: String,
      ownerId: String,
      state: String,
      tags: StringDictionary[String]
    ): GetVpcResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], cidrBlock = cidrBlock.asInstanceOf[js.Any], cidrBlockAssociations = cidrBlockAssociations.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], dhcpOptionsId = dhcpOptionsId.asInstanceOf[js.Any], enableDnsHostnames = enableDnsHostnames.asInstanceOf[js.Any], enableDnsSupport = enableDnsSupport.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instanceTenancy = instanceTenancy.asInstanceOf[js.Any], ipv6AssociationId = ipv6AssociationId.asInstanceOf[js.Any], ipv6CidrBlock = ipv6CidrBlock.asInstanceOf[js.Any], mainRouteTableId = mainRouteTableId.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetVpcResult]
    }
    
    @scala.inline
    implicit class GetVpcResultMutableBuilder[Self <: GetVpcResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidrBlock(value: String): Self = StObject.set(x, "cidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidrBlockAssociations(value: js.Array[GetVpcCidrBlockAssociation]): Self = StObject.set(x, "cidrBlockAssociations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidrBlockAssociationsVarargs(value: GetVpcCidrBlockAssociation*): Self = StObject.set(x, "cidrBlockAssociations", js.Array(value :_*))
      
      @scala.inline
      def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDhcpOptionsId(value: String): Self = StObject.set(x, "dhcpOptionsId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableDnsHostnames(value: Boolean): Self = StObject.set(x, "enableDnsHostnames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableDnsSupport(value: Boolean): Self = StObject.set(x, "enableDnsSupport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetVpcFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetVpcFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceTenancy(value: String): Self = StObject.set(x, "instanceTenancy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6AssociationId(value: String): Self = StObject.set(x, "ipv6AssociationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6CidrBlock(value: String): Self = StObject.set(x, "ipv6CidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainRouteTableId(value: String): Self = StObject.set(x, "mainRouteTableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
