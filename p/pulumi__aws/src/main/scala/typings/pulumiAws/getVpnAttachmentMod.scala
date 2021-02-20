package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2transitgateway.GetVpnAttachmentFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getVpnAttachmentMod {
  
  @JSImport("@pulumi/aws/ec2transitgateway/getVpnAttachment", "getVpnAttachment")
  @js.native
  def getVpnAttachment(): js.Promise[GetVpnAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway/getVpnAttachment", "getVpnAttachment")
  @js.native
  def getVpnAttachment(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetVpnAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway/getVpnAttachment", "getVpnAttachment")
  @js.native
  def getVpnAttachment(args: GetVpnAttachmentArgs): js.Promise[GetVpnAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway/getVpnAttachment", "getVpnAttachment")
  @js.native
  def getVpnAttachment(args: GetVpnAttachmentArgs, opts: InvokeOptions): js.Promise[GetVpnAttachmentResult] = js.native
  
  @js.native
  trait GetVpnAttachmentArgs extends StObject {
    
    /**
      * Configuration block(s) for filtering. Detailed below.
      */
    val filters: js.UndefOr[js.Array[GetVpnAttachmentFilter]] = js.native
    
    /**
      * A map of tags, each pair of which must exactly match a pair on the desired Transit Gateway VPN Attachment.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * Identifier of the EC2 Transit Gateway.
      */
    val transitGatewayId: js.UndefOr[String] = js.native
    
    /**
      * Identifier of the EC2 VPN Connection.
      */
    val vpnConnectionId: js.UndefOr[String] = js.native
  }
  object GetVpnAttachmentArgs {
    
    @scala.inline
    def apply(): GetVpnAttachmentArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetVpnAttachmentArgs]
    }
    
    @scala.inline
    implicit class GetVpnAttachmentArgsMutableBuilder[Self <: GetVpnAttachmentArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetVpnAttachmentFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetVpnAttachmentFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTransitGatewayId(value: String): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitGatewayIdUndefined: Self = StObject.set(x, "transitGatewayId", js.undefined)
      
      @scala.inline
      def setVpnConnectionId(value: String): Self = StObject.set(x, "vpnConnectionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpnConnectionIdUndefined: Self = StObject.set(x, "vpnConnectionId", js.undefined)
    }
  }
  
  @js.native
  trait GetVpnAttachmentResult extends StObject {
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2transitgateway.GetVpnAttachmentFilter]] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * Key-value tags for the EC2 Transit Gateway VPN Attachment
      */
    val tags: StringDictionary[String] = js.native
    
    val transitGatewayId: js.UndefOr[String] = js.native
    
    val vpnConnectionId: js.UndefOr[String] = js.native
  }
  object GetVpnAttachmentResult {
    
    @scala.inline
    def apply(id: String, tags: StringDictionary[String]): GetVpnAttachmentResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetVpnAttachmentResult]
    }
    
    @scala.inline
    implicit class GetVpnAttachmentResultMutableBuilder[Self <: GetVpnAttachmentResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2transitgateway.GetVpnAttachmentFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2transitgateway.GetVpnAttachmentFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitGatewayId(value: String): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitGatewayIdUndefined: Self = StObject.set(x, "transitGatewayId", js.undefined)
      
      @scala.inline
      def setVpnConnectionId(value: String): Self = StObject.set(x, "vpnConnectionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpnConnectionIdUndefined: Self = StObject.set(x, "vpnConnectionId", js.undefined)
    }
  }
}
