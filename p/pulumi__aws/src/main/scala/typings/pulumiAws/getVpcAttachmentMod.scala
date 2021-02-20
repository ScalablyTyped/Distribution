package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2transitgateway.GetVpcAttachmentFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getVpcAttachmentMod {
  
  @JSImport("@pulumi/aws/ec2transitgateway/getVpcAttachment", "getVpcAttachment")
  @js.native
  def getVpcAttachment(): js.Promise[GetVpcAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway/getVpcAttachment", "getVpcAttachment")
  @js.native
  def getVpcAttachment(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetVpcAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway/getVpcAttachment", "getVpcAttachment")
  @js.native
  def getVpcAttachment(args: GetVpcAttachmentArgs): js.Promise[GetVpcAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway/getVpcAttachment", "getVpcAttachment")
  @js.native
  def getVpcAttachment(args: GetVpcAttachmentArgs, opts: InvokeOptions): js.Promise[GetVpcAttachmentResult] = js.native
  
  @js.native
  trait GetVpcAttachmentArgs extends StObject {
    
    /**
      * One or more configuration blocks containing name-values filters. Detailed below.
      */
    val filters: js.UndefOr[js.Array[GetVpcAttachmentFilter]] = js.native
    
    /**
      * Identifier of the EC2 Transit Gateway VPC Attachment.
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * Key-value tags for the EC2 Transit Gateway VPC Attachment
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetVpcAttachmentArgs {
    
    @scala.inline
    def apply(): GetVpcAttachmentArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetVpcAttachmentArgs]
    }
    
    @scala.inline
    implicit class GetVpcAttachmentArgsMutableBuilder[Self <: GetVpcAttachmentArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetVpcAttachmentFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetVpcAttachmentFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetVpcAttachmentResult extends StObject {
    
    /**
      * Whether Appliance Mode support is enabled.
      */
    val applianceModeSupport: String = js.native
    
    /**
      * Whether DNS support is enabled.
      */
    val dnsSupport: String = js.native
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2transitgateway.GetVpcAttachmentFilter]] = js.native
    
    /**
      * EC2 Transit Gateway VPC Attachment identifier
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * Whether IPv6 support is enabled.
      */
    val ipv6Support: String = js.native
    
    /**
      * Identifiers of EC2 Subnets.
      */
    val subnetIds: js.Array[String] = js.native
    
    /**
      * Key-value tags for the EC2 Transit Gateway VPC Attachment
      */
    val tags: StringDictionary[String] = js.native
    
    /**
      * EC2 Transit Gateway identifier
      */
    val transitGatewayId: String = js.native
    
    /**
      * Identifier of EC2 VPC.
      */
    val vpcId: String = js.native
    
    /**
      * Identifier of the AWS account that owns the EC2 VPC.
      */
    val vpcOwnerId: String = js.native
  }
  object GetVpcAttachmentResult {
    
    @scala.inline
    def apply(
      applianceModeSupport: String,
      dnsSupport: String,
      ipv6Support: String,
      subnetIds: js.Array[String],
      tags: StringDictionary[String],
      transitGatewayId: String,
      vpcId: String,
      vpcOwnerId: String
    ): GetVpcAttachmentResult = {
      val __obj = js.Dynamic.literal(applianceModeSupport = applianceModeSupport.asInstanceOf[js.Any], dnsSupport = dnsSupport.asInstanceOf[js.Any], ipv6Support = ipv6Support.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], transitGatewayId = transitGatewayId.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any], vpcOwnerId = vpcOwnerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetVpcAttachmentResult]
    }
    
    @scala.inline
    implicit class GetVpcAttachmentResultMutableBuilder[Self <: GetVpcAttachmentResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplianceModeSupport(value: String): Self = StObject.set(x, "applianceModeSupport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnsSupport(value: String): Self = StObject.set(x, "dnsSupport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2transitgateway.GetVpcAttachmentFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2transitgateway.GetVpcAttachmentFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIpv6Support(value: String): Self = StObject.set(x, "ipv6Support", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIds(value: js.Array[String]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitGatewayId(value: String): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcOwnerId(value: String): Self = StObject.set(x, "vpcOwnerId", value.asInstanceOf[js.Any])
    }
  }
}
