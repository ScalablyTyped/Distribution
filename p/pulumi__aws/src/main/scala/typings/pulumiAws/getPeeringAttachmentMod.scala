package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2transitgateway.GetPeeringAttachmentFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPeeringAttachmentMod {
  
  @JSImport("@pulumi/aws/ec2transitgateway/getPeeringAttachment", "getPeeringAttachment")
  @js.native
  def getPeeringAttachment(): js.Promise[GetPeeringAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway/getPeeringAttachment", "getPeeringAttachment")
  @js.native
  def getPeeringAttachment(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetPeeringAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway/getPeeringAttachment", "getPeeringAttachment")
  @js.native
  def getPeeringAttachment(args: GetPeeringAttachmentArgs): js.Promise[GetPeeringAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway/getPeeringAttachment", "getPeeringAttachment")
  @js.native
  def getPeeringAttachment(args: GetPeeringAttachmentArgs, opts: InvokeOptions): js.Promise[GetPeeringAttachmentResult] = js.native
  
  @js.native
  trait GetPeeringAttachmentArgs extends StObject {
    
    /**
      * One or more configuration blocks containing name-values filters. Detailed below.
      */
    val filters: js.UndefOr[js.Array[GetPeeringAttachmentFilter]] = js.native
    
    /**
      * Identifier of the EC2 Transit Gateway Peering Attachment.
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * A mapping of tags, each pair of which must exactly match
      * a pair on the specific EC2 Transit Gateway Peering Attachment to retrieve.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetPeeringAttachmentArgs {
    
    @scala.inline
    def apply(): GetPeeringAttachmentArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetPeeringAttachmentArgs]
    }
    
    @scala.inline
    implicit class GetPeeringAttachmentArgsMutableBuilder[Self <: GetPeeringAttachmentArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetPeeringAttachmentFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetPeeringAttachmentFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
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
  trait GetPeeringAttachmentResult extends StObject {
    
    val filters: js.UndefOr[
        js.Array[typings.pulumiAws.outputMod.ec2transitgateway.GetPeeringAttachmentFilter]
      ] = js.native
    
    val id: js.UndefOr[String] = js.native
    
    /**
      * Identifier of the peer AWS account
      */
    val peerAccountId: String = js.native
    
    /**
      * Identifier of the peer AWS region
      */
    val peerRegion: String = js.native
    
    /**
      * Identifier of the peer EC2 Transit Gateway
      */
    val peerTransitGatewayId: String = js.native
    
    val tags: StringDictionary[String] = js.native
    
    /**
      * Identifier of the local EC2 Transit Gateway
      */
    val transitGatewayId: String = js.native
  }
  object GetPeeringAttachmentResult {
    
    @scala.inline
    def apply(
      peerAccountId: String,
      peerRegion: String,
      peerTransitGatewayId: String,
      tags: StringDictionary[String],
      transitGatewayId: String
    ): GetPeeringAttachmentResult = {
      val __obj = js.Dynamic.literal(peerAccountId = peerAccountId.asInstanceOf[js.Any], peerRegion = peerRegion.asInstanceOf[js.Any], peerTransitGatewayId = peerTransitGatewayId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], transitGatewayId = transitGatewayId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPeeringAttachmentResult]
    }
    
    @scala.inline
    implicit class GetPeeringAttachmentResultMutableBuilder[Self <: GetPeeringAttachmentResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2transitgateway.GetPeeringAttachmentFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2transitgateway.GetPeeringAttachmentFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setPeerAccountId(value: String): Self = StObject.set(x, "peerAccountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerRegion(value: String): Self = StObject.set(x, "peerRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerTransitGatewayId(value: String): Self = StObject.set(x, "peerTransitGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitGatewayId(value: String): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
    }
  }
}
