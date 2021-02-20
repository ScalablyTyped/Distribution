package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetLocalGatewayFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLocalGatewayMod {
  
  @JSImport("@pulumi/aws/ec2/getLocalGateway", "getLocalGateway")
  @js.native
  def getLocalGateway(): js.Promise[GetLocalGatewayResult] = js.native
  @JSImport("@pulumi/aws/ec2/getLocalGateway", "getLocalGateway")
  @js.native
  def getLocalGateway(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetLocalGatewayResult] = js.native
  @JSImport("@pulumi/aws/ec2/getLocalGateway", "getLocalGateway")
  @js.native
  def getLocalGateway(args: GetLocalGatewayArgs): js.Promise[GetLocalGatewayResult] = js.native
  @JSImport("@pulumi/aws/ec2/getLocalGateway", "getLocalGateway")
  @js.native
  def getLocalGateway(args: GetLocalGatewayArgs, opts: InvokeOptions): js.Promise[GetLocalGatewayResult] = js.native
  
  @js.native
  trait GetLocalGatewayArgs extends StObject {
    
    /**
      * Custom filter block as described below.
      */
    val filters: js.UndefOr[js.Array[GetLocalGatewayFilter]] = js.native
    
    /**
      * The id of the specific Local Gateway to retrieve.
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * The current state of the desired Local Gateway.
      * Can be either `"pending"` or `"available"`.
      */
    val state: js.UndefOr[String] = js.native
    
    /**
      * A mapping of tags, each pair of which must exactly match
      * a pair on the desired Local Gateway.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetLocalGatewayArgs {
    
    @scala.inline
    def apply(): GetLocalGatewayArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetLocalGatewayArgs]
    }
    
    @scala.inline
    implicit class GetLocalGatewayArgsMutableBuilder[Self <: GetLocalGatewayArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetLocalGatewayFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetLocalGatewayFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
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
  trait GetLocalGatewayResult extends StObject {
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetLocalGatewayFilter]] = js.native
    
    val id: String = js.native
    
    /**
      * Amazon Resource Name (ARN) of Outpost
      */
    val outpostArn: String = js.native
    
    /**
      * AWS account identifier that owns the Local Gateway.
      */
    val ownerId: String = js.native
    
    /**
      * State of the local gateway.
      */
    val state: String = js.native
    
    val tags: StringDictionary[String] = js.native
  }
  object GetLocalGatewayResult {
    
    @scala.inline
    def apply(id: String, outpostArn: String, ownerId: String, state: String, tags: StringDictionary[String]): GetLocalGatewayResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], outpostArn = outpostArn.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLocalGatewayResult]
    }
    
    @scala.inline
    implicit class GetLocalGatewayResultMutableBuilder[Self <: GetLocalGatewayResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetLocalGatewayFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetLocalGatewayFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutpostArn(value: String): Self = StObject.set(x, "outpostArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
