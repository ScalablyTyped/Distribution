package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetSubnetIdsFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSubnetIdsMod {
  
  @JSImport("@pulumi/aws/ec2/getSubnetIds", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getSubnetIds(args: GetSubnetIdsArgs): js.Promise[GetSubnetIdsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSubnetIds")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetSubnetIdsResult]]
  @scala.inline
  def getSubnetIds(args: GetSubnetIdsArgs, opts: InvokeOptions): js.Promise[GetSubnetIdsResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSubnetIds")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSubnetIdsResult]]
  
  trait GetSubnetIdsArgs extends StObject {
    
    /**
      * Custom filter block as described below.
      */
    val filters: js.UndefOr[js.Array[GetSubnetIdsFilter]] = js.undefined
    
    /**
      * A map of tags, each pair of which must exactly match
      * a pair on the desired subnets.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * The VPC ID that you want to filter from.
      */
    val vpcId: String
  }
  object GetSubnetIdsArgs {
    
    @scala.inline
    def apply(vpcId: String): GetSubnetIdsArgs = {
      val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSubnetIdsArgs]
    }
    
    @scala.inline
    implicit class GetSubnetIdsArgsMutableBuilder[Self <: GetSubnetIdsArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetSubnetIdsFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetSubnetIdsFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetSubnetIdsResult extends StObject {
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetSubnetIdsFilter]] = js.undefined
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * A set of all the subnet ids found. This data source will fail if none are found.
      */
    val ids: js.Array[String]
    
    val tags: StringDictionary[String]
    
    val vpcId: String
  }
  object GetSubnetIdsResult {
    
    @scala.inline
    def apply(id: String, ids: js.Array[String], tags: StringDictionary[String], vpcId: String): GetSubnetIdsResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSubnetIdsResult]
    }
    
    @scala.inline
    implicit class GetSubnetIdsResultMutableBuilder[Self <: GetSubnetIdsResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetSubnetIdsFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetSubnetIdsFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
}
