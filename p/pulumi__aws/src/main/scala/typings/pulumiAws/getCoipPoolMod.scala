package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetCoipPoolFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCoipPoolMod {
  
  @JSImport("@pulumi/aws/ec2/getCoipPool", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getCoipPool(): js.Promise[GetCoipPoolResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCoipPool")().asInstanceOf[js.Promise[GetCoipPoolResult]]
  @scala.inline
  def getCoipPool(args: Unit, opts: InvokeOptions): js.Promise[GetCoipPoolResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCoipPool")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetCoipPoolResult]]
  @scala.inline
  def getCoipPool(args: GetCoipPoolArgs): js.Promise[GetCoipPoolResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCoipPool")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetCoipPoolResult]]
  @scala.inline
  def getCoipPool(args: GetCoipPoolArgs, opts: InvokeOptions): js.Promise[GetCoipPoolResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCoipPool")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetCoipPoolResult]]
  
  trait GetCoipPoolArgs extends StObject {
    
    val filters: js.UndefOr[js.Array[GetCoipPoolFilter]] = js.undefined
    
    /**
      * Local Gateway Route Table Id assigned to desired COIP Pool
      */
    val localGatewayRouteTableId: js.UndefOr[String] = js.undefined
    
    /**
      * The id of the specific COIP Pool to retrieve.
      */
    val poolId: js.UndefOr[String] = js.undefined
    
    /**
      * A mapping of tags, each pair of which must exactly match
      * a pair on the desired COIP Pool.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetCoipPoolArgs {
    
    @scala.inline
    def apply(): GetCoipPoolArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetCoipPoolArgs]
    }
    
    @scala.inline
    implicit class GetCoipPoolArgsMutableBuilder[Self <: GetCoipPoolArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetCoipPoolFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetCoipPoolFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setLocalGatewayRouteTableId(value: String): Self = StObject.set(x, "localGatewayRouteTableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalGatewayRouteTableIdUndefined: Self = StObject.set(x, "localGatewayRouteTableId", js.undefined)
      
      @scala.inline
      def setPoolId(value: String): Self = StObject.set(x, "poolId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoolIdUndefined: Self = StObject.set(x, "poolId", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetCoipPoolResult extends StObject {
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetCoipPoolFilter]] = js.undefined
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val localGatewayRouteTableId: String
    
    /**
      * Set of CIDR blocks in pool
      */
    val poolCidrs: js.Array[String]
    
    val poolId: String
    
    val tags: StringDictionary[String]
  }
  object GetCoipPoolResult {
    
    @scala.inline
    def apply(
      id: String,
      localGatewayRouteTableId: String,
      poolCidrs: js.Array[String],
      poolId: String,
      tags: StringDictionary[String]
    ): GetCoipPoolResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], localGatewayRouteTableId = localGatewayRouteTableId.asInstanceOf[js.Any], poolCidrs = poolCidrs.asInstanceOf[js.Any], poolId = poolId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCoipPoolResult]
    }
    
    @scala.inline
    implicit class GetCoipPoolResultMutableBuilder[Self <: GetCoipPoolResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetCoipPoolFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetCoipPoolFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalGatewayRouteTableId(value: String): Self = StObject.set(x, "localGatewayRouteTableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoolCidrs(value: js.Array[String]): Self = StObject.set(x, "poolCidrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoolCidrsVarargs(value: String*): Self = StObject.set(x, "poolCidrs", js.Array(value :_*))
      
      @scala.inline
      def setPoolId(value: String): Self = StObject.set(x, "poolId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
