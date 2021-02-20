package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetCoipPoolFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCoipPoolMod {
  
  @JSImport("@pulumi/aws/ec2/getCoipPool", "getCoipPool")
  @js.native
  def getCoipPool(): js.Promise[GetCoipPoolResult] = js.native
  @JSImport("@pulumi/aws/ec2/getCoipPool", "getCoipPool")
  @js.native
  def getCoipPool(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetCoipPoolResult] = js.native
  @JSImport("@pulumi/aws/ec2/getCoipPool", "getCoipPool")
  @js.native
  def getCoipPool(args: GetCoipPoolArgs): js.Promise[GetCoipPoolResult] = js.native
  @JSImport("@pulumi/aws/ec2/getCoipPool", "getCoipPool")
  @js.native
  def getCoipPool(args: GetCoipPoolArgs, opts: InvokeOptions): js.Promise[GetCoipPoolResult] = js.native
  
  @js.native
  trait GetCoipPoolArgs extends StObject {
    
    val filters: js.UndefOr[js.Array[GetCoipPoolFilter]] = js.native
    
    /**
      * Local Gateway Route Table Id assigned to desired COIP Pool
      */
    val localGatewayRouteTableId: js.UndefOr[String] = js.native
    
    /**
      * The id of the specific COIP Pool to retrieve.
      */
    val poolId: js.UndefOr[String] = js.native
    
    /**
      * A mapping of tags, each pair of which must exactly match
      * a pair on the desired COIP Pool.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
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
  
  @js.native
  trait GetCoipPoolResult extends StObject {
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetCoipPoolFilter]] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val localGatewayRouteTableId: String = js.native
    
    /**
      * Set of CIDR blocks in pool
      */
    val poolCidrs: js.Array[String] = js.native
    
    val poolId: String = js.native
    
    val tags: StringDictionary[String] = js.native
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
