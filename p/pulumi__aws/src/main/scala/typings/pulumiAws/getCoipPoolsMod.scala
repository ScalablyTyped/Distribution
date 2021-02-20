package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetCoipPoolsFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCoipPoolsMod {
  
  @JSImport("@pulumi/aws/ec2/getCoipPools", "getCoipPools")
  @js.native
  def getCoipPools(): js.Promise[GetCoipPoolsResult] = js.native
  @JSImport("@pulumi/aws/ec2/getCoipPools", "getCoipPools")
  @js.native
  def getCoipPools(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetCoipPoolsResult] = js.native
  @JSImport("@pulumi/aws/ec2/getCoipPools", "getCoipPools")
  @js.native
  def getCoipPools(args: GetCoipPoolsArgs): js.Promise[GetCoipPoolsResult] = js.native
  @JSImport("@pulumi/aws/ec2/getCoipPools", "getCoipPools")
  @js.native
  def getCoipPools(args: GetCoipPoolsArgs, opts: InvokeOptions): js.Promise[GetCoipPoolsResult] = js.native
  
  @js.native
  trait GetCoipPoolsArgs extends StObject {
    
    /**
      * Custom filter block as described below.
      */
    val filters: js.UndefOr[js.Array[GetCoipPoolsFilter]] = js.native
    
    /**
      * A mapping of tags, each pair of which must exactly match
      * a pair on the desired aws_ec2_coip_pools.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetCoipPoolsArgs {
    
    @scala.inline
    def apply(): GetCoipPoolsArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetCoipPoolsArgs]
    }
    
    @scala.inline
    implicit class GetCoipPoolsArgsMutableBuilder[Self <: GetCoipPoolsArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetCoipPoolsFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetCoipPoolsFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetCoipPoolsResult extends StObject {
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetCoipPoolsFilter]] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * Set of COIP Pool Identifiers
      */
    val poolIds: js.Array[String] = js.native
    
    val tags: StringDictionary[String] = js.native
  }
  object GetCoipPoolsResult {
    
    @scala.inline
    def apply(id: String, poolIds: js.Array[String], tags: StringDictionary[String]): GetCoipPoolsResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], poolIds = poolIds.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCoipPoolsResult]
    }
    
    @scala.inline
    implicit class GetCoipPoolsResultMutableBuilder[Self <: GetCoipPoolsResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetCoipPoolsFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetCoipPoolsFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoolIds(value: js.Array[String]): Self = StObject.set(x, "poolIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoolIdsVarargs(value: String*): Self = StObject.set(x, "poolIds", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
