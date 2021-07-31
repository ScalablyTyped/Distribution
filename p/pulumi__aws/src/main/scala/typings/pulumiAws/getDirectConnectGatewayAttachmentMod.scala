package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2transitgateway.GetDirectConnectGatewayAttachmentFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDirectConnectGatewayAttachmentMod {
  
  @JSImport("@pulumi/aws/ec2transitgateway/getDirectConnectGatewayAttachment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getDirectConnectGatewayAttachment(): js.Promise[GetDirectConnectGatewayAttachmentResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirectConnectGatewayAttachment")().asInstanceOf[js.Promise[GetDirectConnectGatewayAttachmentResult]]
  @scala.inline
  def getDirectConnectGatewayAttachment(args: Unit, opts: InvokeOptions): js.Promise[GetDirectConnectGatewayAttachmentResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDirectConnectGatewayAttachment")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetDirectConnectGatewayAttachmentResult]]
  @scala.inline
  def getDirectConnectGatewayAttachment(args: GetDirectConnectGatewayAttachmentArgs): js.Promise[GetDirectConnectGatewayAttachmentResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirectConnectGatewayAttachment")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetDirectConnectGatewayAttachmentResult]]
  @scala.inline
  def getDirectConnectGatewayAttachment(args: GetDirectConnectGatewayAttachmentArgs, opts: InvokeOptions): js.Promise[GetDirectConnectGatewayAttachmentResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDirectConnectGatewayAttachment")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetDirectConnectGatewayAttachmentResult]]
  
  trait GetDirectConnectGatewayAttachmentArgs extends StObject {
    
    /**
      * Identifier of the Direct Connect Gateway.
      */
    val dxGatewayId: js.UndefOr[String] = js.undefined
    
    /**
      * Configuration block(s) for filtering. Detailed below.
      */
    val filters: js.UndefOr[js.Array[GetDirectConnectGatewayAttachmentFilter]] = js.undefined
    
    /**
      * A map of tags, each pair of which must exactly match a pair on the desired Transit Gateway Direct Connect Gateway Attachment.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Identifier of the EC2 Transit Gateway.
      */
    val transitGatewayId: js.UndefOr[String] = js.undefined
  }
  object GetDirectConnectGatewayAttachmentArgs {
    
    @scala.inline
    def apply(): GetDirectConnectGatewayAttachmentArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetDirectConnectGatewayAttachmentArgs]
    }
    
    @scala.inline
    implicit class GetDirectConnectGatewayAttachmentArgsMutableBuilder[Self <: GetDirectConnectGatewayAttachmentArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDxGatewayId(value: String): Self = StObject.set(x, "dxGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDxGatewayIdUndefined: Self = StObject.set(x, "dxGatewayId", js.undefined)
      
      @scala.inline
      def setFilters(value: js.Array[GetDirectConnectGatewayAttachmentFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetDirectConnectGatewayAttachmentFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTransitGatewayId(value: String): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitGatewayIdUndefined: Self = StObject.set(x, "transitGatewayId", js.undefined)
    }
  }
  
  trait GetDirectConnectGatewayAttachmentResult extends StObject {
    
    val dxGatewayId: js.UndefOr[String] = js.undefined
    
    val filters: js.UndefOr[
        js.Array[
          typings.pulumiAws.outputMod.ec2transitgateway.GetDirectConnectGatewayAttachmentFilter
        ]
      ] = js.undefined
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * Key-value tags for the EC2 Transit Gateway Attachment
      */
    val tags: StringDictionary[String]
    
    val transitGatewayId: js.UndefOr[String] = js.undefined
  }
  object GetDirectConnectGatewayAttachmentResult {
    
    @scala.inline
    def apply(id: String, tags: StringDictionary[String]): GetDirectConnectGatewayAttachmentResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDirectConnectGatewayAttachmentResult]
    }
    
    @scala.inline
    implicit class GetDirectConnectGatewayAttachmentResultMutableBuilder[Self <: GetDirectConnectGatewayAttachmentResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDxGatewayId(value: String): Self = StObject.set(x, "dxGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDxGatewayIdUndefined: Self = StObject.set(x, "dxGatewayId", js.undefined)
      
      @scala.inline
      def setFilters(
        value: js.Array[
              typings.pulumiAws.outputMod.ec2transitgateway.GetDirectConnectGatewayAttachmentFilter
            ]
      ): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2transitgateway.GetDirectConnectGatewayAttachmentFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitGatewayId(value: String): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitGatewayIdUndefined: Self = StObject.set(x, "transitGatewayId", js.undefined)
    }
  }
}
