package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetLocalGatewayFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLocalGatewayMod {
  
  @JSImport("@pulumi/aws/ec2/getLocalGateway", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getLocalGateway(): js.Promise[GetLocalGatewayResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGateway")().asInstanceOf[js.Promise[GetLocalGatewayResult]]
  @scala.inline
  def getLocalGateway(args: Unit, opts: InvokeOptions): js.Promise[GetLocalGatewayResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGateway")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetLocalGatewayResult]]
  @scala.inline
  def getLocalGateway(args: GetLocalGatewayArgs): js.Promise[GetLocalGatewayResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGateway")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetLocalGatewayResult]]
  @scala.inline
  def getLocalGateway(args: GetLocalGatewayArgs, opts: InvokeOptions): js.Promise[GetLocalGatewayResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGateway")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetLocalGatewayResult]]
  
  trait GetLocalGatewayArgs extends StObject {
    
    /**
      * Custom filter block as described below.
      */
    val filters: js.UndefOr[js.Array[GetLocalGatewayFilter]] = js.undefined
    
    /**
      * The id of the specific Local Gateway to retrieve.
      */
    val id: js.UndefOr[String] = js.undefined
    
    /**
      * The current state of the desired Local Gateway.
      * Can be either `"pending"` or `"available"`.
      */
    val state: js.UndefOr[String] = js.undefined
    
    /**
      * A mapping of tags, each pair of which must exactly match
      * a pair on the desired Local Gateway.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
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
  
  trait GetLocalGatewayResult extends StObject {
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetLocalGatewayFilter]] = js.undefined
    
    val id: String
    
    /**
      * Amazon Resource Name (ARN) of Outpost
      */
    val outpostArn: String
    
    /**
      * AWS account identifier that owns the Local Gateway.
      */
    val ownerId: String
    
    /**
      * State of the local gateway.
      */
    val state: String
    
    val tags: StringDictionary[String]
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
