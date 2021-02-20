package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetInternetGatewayFilter
import typings.pulumiAws.outputMod.ec2.GetInternetGatewayAttachment
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getInternetGatewayMod {
  
  @JSImport("@pulumi/aws/ec2/getInternetGateway", "getInternetGateway")
  @js.native
  def getInternetGateway(): js.Promise[GetInternetGatewayResult] = js.native
  @JSImport("@pulumi/aws/ec2/getInternetGateway", "getInternetGateway")
  @js.native
  def getInternetGateway(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetInternetGatewayResult] = js.native
  @JSImport("@pulumi/aws/ec2/getInternetGateway", "getInternetGateway")
  @js.native
  def getInternetGateway(args: GetInternetGatewayArgs): js.Promise[GetInternetGatewayResult] = js.native
  @JSImport("@pulumi/aws/ec2/getInternetGateway", "getInternetGateway")
  @js.native
  def getInternetGateway(args: GetInternetGatewayArgs, opts: InvokeOptions): js.Promise[GetInternetGatewayResult] = js.native
  
  @js.native
  trait GetInternetGatewayArgs extends StObject {
    
    /**
      * Custom filter block as described below.
      */
    val filters: js.UndefOr[js.Array[GetInternetGatewayFilter]] = js.native
    
    /**
      * The id of the specific Internet Gateway to retrieve.
      */
    val internetGatewayId: js.UndefOr[String] = js.native
    
    /**
      * A map of tags, each pair of which must exactly match
      * a pair on the desired Internet Gateway.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetInternetGatewayArgs {
    
    @scala.inline
    def apply(): GetInternetGatewayArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetInternetGatewayArgs]
    }
    
    @scala.inline
    implicit class GetInternetGatewayArgsMutableBuilder[Self <: GetInternetGatewayArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetInternetGatewayFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetInternetGatewayFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setInternetGatewayId(value: String): Self = StObject.set(x, "internetGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternetGatewayIdUndefined: Self = StObject.set(x, "internetGatewayId", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetInternetGatewayResult extends StObject {
    
    /**
      * The ARN of the Internet Gateway.
      */
    val arn: String = js.native
    
    val attachments: js.Array[GetInternetGatewayAttachment] = js.native
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetInternetGatewayFilter]] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val internetGatewayId: String = js.native
    
    /**
      * The ID of the AWS account that owns the internet gateway.
      */
    val ownerId: String = js.native
    
    val tags: StringDictionary[String] = js.native
  }
  object GetInternetGatewayResult {
    
    @scala.inline
    def apply(
      arn: String,
      attachments: js.Array[GetInternetGatewayAttachment],
      id: String,
      internetGatewayId: String,
      ownerId: String,
      tags: StringDictionary[String]
    ): GetInternetGatewayResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], attachments = attachments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], internetGatewayId = internetGatewayId.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetInternetGatewayResult]
    }
    
    @scala.inline
    implicit class GetInternetGatewayResultMutableBuilder[Self <: GetInternetGatewayResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachments(value: js.Array[GetInternetGatewayAttachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachmentsVarargs(value: GetInternetGatewayAttachment*): Self = StObject.set(x, "attachments", js.Array(value :_*))
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetInternetGatewayFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetInternetGatewayFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternetGatewayId(value: String): Self = StObject.set(x, "internetGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
